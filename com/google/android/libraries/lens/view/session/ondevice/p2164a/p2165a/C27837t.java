package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4709l.p4710a.C62614b;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.t */
/* compiled from: PG */
public final class C27837t {

    /* renamed from: a */
    private final C58495hd f75905a;

    /* renamed from: b */
    private final C27835r f75906b;

    public C27837t(C27835r rVar, String str, String str2, String str3) {
        this.f75906b = rVar;
        C58490gz gzVar = new C58490gz(4);
        if (!str.isEmpty()) {
            gzVar.mo55429h(C62614b.LOTS_FEATURE_TEXT, str);
        }
        if (!str2.isEmpty()) {
            gzVar.mo55429h(C62614b.LOTS_FEATURE_HYBRID_TRANSLATE, str2);
            gzVar.mo55429h(C62614b.LOTS_FEATURE_HYBRID_GANSLATE, str2);
        }
        if (!str3.isEmpty()) {
            gzVar.mo55429h(C62614b.LOTS_FEATURE_OFFLINE_TRANSLATE, str3);
        }
        this.f75905a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final C58833ax mo33326a(C58495hd hdVar, C62614b bVar) {
        C58833ax j = C58833ax.m90833j((String) this.f75905a.get(bVar));
        return j.mo56113h() ? C58833ax.m90833j((C27830m) hdVar.get(j.mo56107c())) : C58836b.f156633a;
    }

    /* renamed from: b */
    public final C60870cx mo33327b() {
        C58495hd hdVar = (C58495hd) Collection.EL.stream(C58528ij.m90006F(this.f75905a.values())).collect(C58370cn.m89403c(C27831n.f75899a, new C27832o(this.f75906b), C27833p.f75901a));
        return C47638k.m84750a(hdVar.values()).mo51520a(new C27834q(hdVar), C60826bg.f164896a);
    }
}
