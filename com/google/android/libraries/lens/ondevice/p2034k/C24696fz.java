package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4695b.C62160f;
import com.google.lens.p4701g.C62336de;
import com.google.lens.p4701g.C62337df;
import com.google.lens.p4701g.C62340di;
import com.google.lens.p4701g.C62341dj;
import com.google.lens.p4701g.C62355r;
import com.google.p4017at.p4056g.p4057a.p4058a.C54042cw;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.fz */
/* compiled from: PG */
public final class C24696fz extends C68247h {

    /* renamed from: a */
    private final C68283d f67539a;

    /* renamed from: c */
    private final C68283d f67540c;

    /* renamed from: d */
    private final C68283d f67541d;

    public C24696fz(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C24696fz.class), aVar);
        this.f67539a = C68236af.m98549d(dVar);
        this.f67540c = C68236af.m98549d(dVar2);
        this.f67541d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C54042cw cwVar = (C54042cw) list.get(0);
        C24530h hVar = (C24530h) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C62340di diVar = (C62340di) C62341dj.f168297b.createBuilder();
        for (C62160f fVar : cwVar.f141798c) {
            C62336de deVar = (C62336de) C62337df.f168289d.createBuilder();
            String str = fVar.f167806a;
            deVar.copyOnWrite();
            C62337df dfVar = (C62337df) deVar.instance;
            str.getClass();
            dfVar.f168291a |= 2;
            dfVar.f168293c = str;
            String str2 = fVar.f167807b;
            deVar.copyOnWrite();
            C62337df dfVar2 = (C62337df) deVar.instance;
            str2.getClass();
            dfVar2.f168291a |= 1;
            dfVar2.f168292b = str2;
            C62337df dfVar3 = (C62337df) deVar.build();
            diVar.copyOnWrite();
            C62341dj djVar = (C62341dj) diVar.instance;
            dfVar3.getClass();
            C62971cq cqVar = djVar.f168299a;
            if (!cqVar.mo58948c()) {
                djVar.f168299a = C62942bv.mutableCopy(cqVar);
            }
            djVar.f168299a.add(dfVar3);
        }
        C24653ej.m45756c(C24692fv.class, hVar, C62355r.f168332e);
        C58833ax a = C24435b.m45508a(axVar);
        cwVar.f141798c.size();
        C24435b.m45509b(a);
        return C60856cj.m92900i((C62341dj) diVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67539a.mo60297gq(), this.f67540c.mo60297gq(), this.f67541d.mo60297gq());
    }
}
