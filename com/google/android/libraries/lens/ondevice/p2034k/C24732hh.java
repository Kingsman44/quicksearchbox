package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24273e;
import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62339dh;
import com.google.lens.p4701g.C62341dj;
import com.google.lens.p4701g.C62355r;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.hh */
/* compiled from: PG */
public final class C24732hh extends C68247h {

    /* renamed from: a */
    private final C68283d f67609a;

    /* renamed from: c */
    private final C68283d f67610c;

    /* renamed from: d */
    private final C68283d f67611d;

    /* renamed from: e */
    private final C68283d f67612e;

    public C24732hh(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C24732hh.class), aVar);
        this.f67609a = C68236af.m98549d(dVar);
        this.f67610c = C68236af.m98549d(dVar2);
        this.f67611d = C68236af.m98549d(dVar3);
        this.f67612e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62341dj djVar;
        C62341dj djVar2;
        List list = (List) obj;
        C62339dh dhVar = (C62339dh) list.get(0);
        C24555at atVar = (C24555at) list.get(1);
        C24530h hVar = (C24530h) list.get(2);
        C58833ax a = C24435b.m45508a((C58833ax) list.get(3));
        try {
            C24653ej.m45755b(C24725ha.class, hVar);
            C62355r a2 = atVar.mo29956a(dhVar);
            C24653ej.m45756c(C24725ha.class, hVar, C62355r.f168332e);
            if (a2.f168334a == 11) {
                djVar = (C62341dj) a2.f168335b;
            } else {
                djVar = C62341dj.f168297b;
            }
            djVar.f168299a.size();
            C24435b.m45509b(a);
            if (a2.f168334a == 11) {
                djVar2 = (C62341dj) a2.f168335b;
            } else {
                djVar2 = C62341dj.f168297b;
            }
            return C60856cj.m92900i(djVar2);
        } catch (C24273e | C62974ct | IllegalStateException e) {
            C24653ej.m45754a(C24725ha.class, hVar);
            e.toString();
            C24435b.m45509b(a);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67609a.mo60297gq(), this.f67610c.mo60297gq(), this.f67611d.mo60297gq(), this.f67612e.mo60297gq());
    }
}
