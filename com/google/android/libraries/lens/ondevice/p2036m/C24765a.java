package com.google.android.libraries.lens.ondevice.p2036m;

import com.google.android.libraries.lens.ondevice.p2026f.C24483l;
import com.google.android.libraries.lens.ondevice.p2026f.C24484m;
import com.google.android.libraries.lens.ondevice.p2026f.C24491t;
import com.google.android.libraries.lens.ondevice.p2037n.C24797h;
import com.google.android.libraries.lens.ondevice.p2037n.C24801l;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62971cq;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.m.a */
/* compiled from: PG */
public final class C24765a extends C68247h {

    /* renamed from: a */
    private final C68283d f67670a;

    /* renamed from: c */
    private final C68283d f67671c;

    public C24765a(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24765a.class), aVar);
        this.f67670a = C68236af.m98549d(dVar);
        this.f67671c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C24491t tVar = (C24491t) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C24803n.f67770c);
        }
        C24797h hVar = ((C24801l) axVar.mo56107c()).f67769b;
        if (hVar == null) {
            hVar = C24797h.f67760b;
        }
        C62971cq cqVar = hVar.f67762a;
        if (cqVar.isEmpty()) {
            return C60856cj.m92900i(C24803n.f67770c);
        }
        return C60922j.m93044g(C60922j.m93044g(C60838bs.m92859i(tVar.mo29919h(cqVar, false)), C24483l.f67000a, C60826bg.f164896a), new C24484m(tVar), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67670a.mo60297gq(), this.f67671c.mo60297gq());
    }
}
