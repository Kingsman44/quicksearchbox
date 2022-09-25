package com.google.android.apps.gsa.shared.p7148ui.p7155g;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90071dw;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.b */
/* compiled from: PG */
public final class C90685b {

    /* renamed from: a */
    private static final C59071e f253604a = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.g.b");

    /* renamed from: a */
    public static boolean m148053a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    public static boolean m148054b(Context context, C90021c cVar) {
        if (cVar == null) {
            try {
                return context.getApplicationContext().getResources().getBoolean(R.bool.is_tablet);
            } catch (Resources.NotFoundException unused) {
                ((C59052c) ((C59052c) f253604a.mo56225c()).mo56372aa(11287)).mo56387q("Resource not found: R.bool.is_tablet = %d", R.bool.is_tablet);
                return false;
            }
        } else if ((cVar.mo79746e(C90071dw.f249760e) || context.getApplicationContext().getResources().getBoolean(R.bool.is_tablet)) && !cVar.mo79746e(C90071dw.f249759d)) {
            return true;
        } else {
            return false;
        }
    }
}
