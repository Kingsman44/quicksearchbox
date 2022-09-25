package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a;

import android.os.Build;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.a */
/* compiled from: PG */
final class C138153a extends C69665o implements C69615a {

    /* renamed from: a */
    public static final C138153a f375865a = new C138153a();

    public C138153a() {
        super(0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        String str = Build.ID;
        C69664n.m101060f(str, "ID");
        boolean z = true;
        if (!C69764m.m101234m(str, "TP1A")) {
            String str2 = Build.ID;
            C69664n.m101060f(str2, "ID");
            if (!C69764m.m101234m(str2, "TPB")) {
                String str3 = Build.ID;
                C69664n.m101060f(str3, "ID");
                if (!C69764m.m101234m(str3, "TD1A")) {
                    String str4 = Build.ID;
                    C69664n.m101060f(str4, "ID");
                    if (!C69764m.m101234m(str4, "TQ1A")) {
                        z = false;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
