package com.google.android.play.core.p3538g;

import android.content.Context;
import com.google.android.play.core.p3542h.C45192a;

/* renamed from: com.google.android.play.core.g.r */
/* compiled from: PG */
public final class C45183r {

    /* renamed from: a */
    private static C45177l f117926a;

    /* renamed from: a */
    public static synchronized C45177l m80442a(Context context) {
        C45177l lVar;
        synchronized (C45183r.class) {
            if (f117926a == null) {
                f117926a = new C45141b(new C45115aa(C45192a.m80471a(context)));
            }
            lVar = f117926a;
        }
        return lVar;
    }
}
