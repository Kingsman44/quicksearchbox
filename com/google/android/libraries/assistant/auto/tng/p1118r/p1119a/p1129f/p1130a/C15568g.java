package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1129f.p1130a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1133h.C15580a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.f.a.g */
/* compiled from: PG */
public final class C15568g extends C68247h {

    /* renamed from: a */
    private final C68283d f46575a;

    /* renamed from: c */
    private final C68283d f46576c;

    /* renamed from: d */
    private final C68283d f46577d;

    /* renamed from: e */
    private final C68283d f46578e;

    public C15568g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C15568g.class), aVar);
        this.f46575a = C68236af.m98549d(dVar);
        this.f46576c = C68236af.m98549d(dVar2);
        this.f46577d = C68236af.m98549d(dVar3);
        this.f46578e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C15580a aVar = (C15580a) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        C122472a aVar2 = (C122472a) list.get(2);
        C15481g gVar = (C15481g) list.get(3);
        if (booleanValue) {
            return aVar.mo22403a();
        }
        gVar.mo22352b(C37179a.f97644eD);
        return C60856cj.m92900i(C58833ax.m90834k(aVar2.mo105629a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f46575a.mo60297gq(), this.f46576c.mo60297gq(), this.f46577d.mo60297gq(), this.f46578e.mo60297gq());
    }
}
