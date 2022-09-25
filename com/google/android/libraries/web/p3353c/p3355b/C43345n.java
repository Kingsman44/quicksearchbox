package com.google.android.libraries.web.p3353c.p3355b;

import com.google.android.libraries.web.coordinator.p3400b.C43731a;
import com.google.android.libraries.web.lifecycle.p3426b.C43881c;
import com.google.android.libraries.web.p3428m.C43904a;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69675y;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.libraries.web.c.b.n */
/* compiled from: PG */
public final class C43345n {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f113223a;

    /* renamed from: b */
    public static final String f113224b = "android.libraries.web.data.WebState";

    /* renamed from: c */
    public static final String f113225c = "android.libraries.web.data.WebState.currentUrl";

    /* renamed from: d */
    private static final C43881c f113226d = new C43881c(C43344m.f113222a);

    /* renamed from: e */
    private static final C43881c f113227e = new C43881c(C43340i.f113213a);

    static {
        Class<C43345n> cls = C43345n.class;
        C69675y yVar = new C69675y(cls, "webStateFlow", "getWebStateFlow(Lcom/google/android/libraries/web/coordinator/retained/WebCoordinator;)Lkotlinx/coroutines/flow/StateFlow;", 1);
        int i = C69649af.f186028a;
        f113223a = new C69713k[]{yVar, new C69675y(cls, "mutableWebStateFlow", "getMutableWebStateFlow(Lcom/google/android/libraries/web/window/WebWindow;)Lkotlinx/coroutines/flow/MutableStateFlow;", 1)};
    }

    /* renamed from: a */
    public static final C71548cy m76492a(C43904a aVar) {
        C69664n.m101061g(aVar, "<this>");
        return (C71548cy) f113227e.mo46879a(aVar, f113223a[1]);
    }

    /* renamed from: b */
    public static final C71571du m76493b(C43731a aVar) {
        return (C71571du) f113226d.mo46879a(aVar, f113223a[0]);
    }
}
