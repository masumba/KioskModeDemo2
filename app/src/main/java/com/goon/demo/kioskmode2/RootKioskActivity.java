package com.goon.demo.kioskmode2;

import android.content.ComponentName;
import android.content.pm.PackageManager;

public class RootKioskActivity extends KioskActivity {
    @Override
    protected void onDestroy() {
        ComponentName cn = new ComponentName(getPackageName(), this.getClass().getName());
        getPackageManager().setComponentEnabledSetting(cn, PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);
        super.onDestroy();
    }
}
