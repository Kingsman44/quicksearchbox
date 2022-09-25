package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c;

import android.content.Context;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33725a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b;
import com.google.android.libraries.search.assistant.invocation.p2634i.p2635a.C33887b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71553dc;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.c.n */
/* compiled from: PG */
public final class C33747n implements C33725a {

    /* renamed from: a */
    private static final C59071e f90130a = C59071e.m91331h();

    /* renamed from: b */
    private final Context f90131b;

    /* renamed from: c */
    private final C33746m f90132c;

    /* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.c.n$a */
    /* compiled from: PG */
    public interface C33748a {
        /* renamed from: oa */
        C33887b mo39059oa();
    }

    public C33747n(Context context, C33746m mVar) {
        C69664n.m101061g(context, "context");
        this.f90131b = context;
        this.f90132c = mVar;
    }

    /* renamed from: a */
    public final Object mo39041a(C33729b bVar, C34053bp bpVar, C33514d dVar, C69577g gVar) {
        C59052c cVar = (C59052c) f90130a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.Earcon.Strategy");
        cVar.mo56379ah(new C59094n(51278));
        cVar.mo56386p("Acquiring Earcon resource.");
        C33887b oa = ((C33748a) C47245e.m84045a(this.f90131b, C33748a.class, bVar.f90080a.f90870b)).mo39059oa();
        C33746m mVar = this.f90132c;
        C34043bf bfVar = bVar.f90081b;
        C62971cq cqVar = bVar.f90084e.f90779h;
        C71422aw awVar = (C71422aw) mVar.f90128a.mo17428b();
        awVar.getClass();
        C71553dc dcVar = (C71553dc) mVar.f90129b.mo17428b();
        dcVar.getClass();
        oa.getClass();
        bfVar.getClass();
        bpVar.getClass();
        cqVar.getClass();
        return new C33745l(awVar, dcVar, oa, bfVar, bpVar, cqVar);
    }
}
