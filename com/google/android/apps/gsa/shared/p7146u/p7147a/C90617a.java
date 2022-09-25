package com.google.android.apps.gsa.shared.p7146u.p7147a;

import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.u.a.a */
/* compiled from: PG */
public final class C90617a {
    /* renamed from: b */
    public static String m147869b(Resources resources, int i) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    i2 = R.string.google_play_services_enable_required;
                } else if (i == 9) {
                    i2 = R.string.google_play_services_unsupported;
                } else if (i != 18) {
                    i2 = i != 19 ? R.string.google_play_services_unknown_issue : R.string.google_play_services_missing_permissions;
                }
            }
            i2 = R.string.google_play_services_update_required;
        } else {
            i2 = R.string.google_play_services_install_required;
        }
        return resources.getString(i2);
    }

    /* renamed from: a */
    public static String m147868a(Resources resources, int i) {
        if (i == 1) {
            return resources.getString(R.string.google_play_services_install_button);
        }
        if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.google_play_services_enable_button);
            }
            if (i != 18) {
                if (i != 19) {
                    return resources.getString(R.string.google_play_services_action_fallback_string);
                }
                return resources.getString(R.string.google_play_services_change_permissions_button);
            }
        }
        return resources.getString(R.string.google_play_services_update_button);
    }
}
