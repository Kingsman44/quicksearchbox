package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.ad */
/* compiled from: PG */
public final class C12241ad extends C68247h {

    /* renamed from: a */
    private final C68283d f38983a;

    /* renamed from: c */
    private final C68283d f38984c;

    /* renamed from: d */
    private final C68283d f38985d;

    /* renamed from: e */
    private final C68283d f38986e;

    public C12241ad(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C12241ad.class), aVar);
        this.f38983a = C68236af.m98549d(dVar);
        this.f38984c = C68236af.m98549d(dVar2);
        this.f38985d = C68236af.m98549d(dVar3);
        this.f38986e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C15666r rVar = (C15666r) list.get(0);
        C15593a aVar = (C15593a) list.get(1);
        boolean booleanValue = ((Boolean) list.get(2)).booleanValue();
        C37215b bVar = (C37215b) list.get(3);
        if (booleanValue) {
            bVar.mo19974a(C37179a.f97560cZ);
            C15668t a = aVar.mo22414a(rVar);
            C60870cx a2 = a.mo22492a();
            C12271x xVar = new C12271x(bVar);
            C60856cj.m92911t(a2, C47810es.m84974n(xVar), C60826bg.f164896a);
            obj2 = C58833ax.m90834k(a);
        } else {
            obj2 = C58836b.f156633a;
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f38983a.mo60297gq(), this.f38984c.mo60297gq(), this.f38985d.mo60297gq(), this.f38986e.mo60297gq());
    }
}
