package com.google.android.apps.gsa.shared.monet.p7110c;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.shared.monet.c.c */
/* compiled from: PG */
public final class C90307c {
    /* renamed from: a */
    public static C58833ax m146832a(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        Activity activity = (Activity) axVar.mo56107c();
        return C58833ax.m90834k(new C91090a(activity, activity, 10000));
    }

    /* renamed from: b */
    public static C58833ax m146833b(Context context) {
        return context instanceof Activity ? C58833ax.m90834k((Activity) context) : C58836b.f156633a;
    }
}
