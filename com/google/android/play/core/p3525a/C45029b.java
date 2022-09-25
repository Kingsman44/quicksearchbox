package com.google.android.play.core.p3525a;

import android.content.Context;
import com.google.android.play.core.p3542h.C45192a;

/* renamed from: com.google.android.play.core.a.b */
/* compiled from: PG */
public final class C45029b {

    /* renamed from: a */
    private static C45048u f117653a;

    /* renamed from: a */
    public static synchronized C45048u m80173a(Context context) {
        C45048u uVar;
        synchronized (C45029b.class) {
            if (f117653a == null) {
                f117653a = new C45048u(new C45035h(C45192a.m80471a(context)));
            }
            uVar = f117653a;
        }
        return uVar;
    }
}
