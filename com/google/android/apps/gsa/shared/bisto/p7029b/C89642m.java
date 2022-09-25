package com.google.android.apps.gsa.shared.bisto.p7029b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.m */
/* compiled from: PG */
public final class C89642m {
    /* renamed from: a */
    public static int m145915a(C124719q qVar) {
        C124719q qVar2 = C124719q.UNKNOWN_DEVICE_CATEGORY;
        int ordinal = qVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return R.string.assistant_bisto_oobe_exit_setup_early;
        }
        return ordinal != 2 ? R.string.assistant_bisto_oobe_exit_setup_early_watches : R.string.disable_assistant_confirm_message_car;
    }
}
