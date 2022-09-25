package com.android.launcher3;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;

/* compiled from: PG */
public final class Partner {
    private static Partner sPartner = null;
    private static boolean sSearched = false;
    public final String mPackageName;
    public final Resources mResources;

    private Partner(String str, Resources resources) {
        this.mPackageName = str;
        this.mResources = resources;
    }

    public static synchronized Partner get(PackageManager packageManager) {
        Partner partner;
        synchronized (Partner.class) {
            if (!sSearched) {
                Pair findSystemApk = Utilities.findSystemApk("com.android.launcher3.action.PARTNER_CUSTOMIZATION", packageManager);
                if (findSystemApk != null) {
                    sPartner = new Partner((String) findSystemApk.first, (Resources) findSystemApk.second);
                }
                sSearched = true;
            }
            partner = sPartner;
        }
        return partner;
    }

    public final void applyInvariantDeviceProfileOverrides(InvariantDeviceProfile invariantDeviceProfile, DisplayMetrics displayMetrics) {
        try {
            int identifier = this.mResources.getIdentifier("grid_num_rows", "integer", this.mPackageName);
            int i = -1;
            int integer = identifier > 0 ? this.mResources.getInteger(identifier) : -1;
            int identifier2 = this.mResources.getIdentifier("grid_num_columns", "integer", this.mPackageName);
            if (identifier2 > 0) {
                i = this.mResources.getInteger(identifier2);
            }
            int identifier3 = this.mResources.getIdentifier("grid_icon_size_dp", "dimen", this.mPackageName);
            float dpiFromPx = identifier3 > 0 ? Utilities.dpiFromPx(this.mResources.getDimensionPixelSize(identifier3), displayMetrics) : -1.0f;
            if (integer > 0 && i > 0) {
                invariantDeviceProfile.numRows = integer;
                invariantDeviceProfile.numColumns = i;
            }
            if (dpiFromPx > 0.0f) {
                invariantDeviceProfile.iconSize = dpiFromPx;
            }
        } catch (Resources.NotFoundException e) {
            Log.e("Launcher.Partner", "Invalid Partner grid resource!", e);
        }
    }
}
