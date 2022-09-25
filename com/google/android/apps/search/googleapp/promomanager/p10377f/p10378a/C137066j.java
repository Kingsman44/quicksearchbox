package com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139322d;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139323e;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139325g;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139326h;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139338t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4900a.C63866h;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.a.j */
/* compiled from: PG */
final class C137066j implements C137057a {

    /* renamed from: a */
    private static final C59071e f373001a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.a.j");

    /* renamed from: b */
    private final Fragment f373002b;

    /* renamed from: c */
    private final AccountId f373003c;

    /* renamed from: d */
    private final C139338t f373004d;

    public C137066j(Fragment fragment, AccountId accountId, C139338t tVar) {
        this.f373002b = fragment;
        this.f373003c = accountId;
        this.f373004d = tVar;
    }

    /* renamed from: a */
    public final boolean mo113483a(C63944h hVar) {
        Object obj;
        C59052c cVar = (C59052c) ((C59052c) f373001a.mo56224b()).mo56372aa(40922);
        C63943g a = C63943g.m96323a(hVar.f172935a);
        if (a == null) {
            a = C63943g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("#executeAction(%s)", a.name());
        C62940bt r0 = C62942bv.checkIsLite(C63866h.f172698d);
        hVar.mo58887l(r0);
        Object l = hVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C63866h hVar2 = (C63866h) obj;
        String str = hVar2.f172700a;
        String str2 = hVar2.f172701b;
        if (!str.isEmpty() && !str2.isEmpty()) {
            C56609a aVar = (C56609a) C56610b.f151140k.createBuilder();
            aVar.copyOnWrite();
            C56610b bVar = (C56610b) aVar.instance;
            str.getClass();
            bVar.f151142a |= 2;
            bVar.f151144c = str;
            aVar.copyOnWrite();
            C56610b bVar2 = (C56610b) aVar.instance;
            str2.getClass();
            bVar2.f151142a |= 1;
            bVar2.f151143b = str2;
            C139323e eVar = (C139323e) C139324f.f378925k.createBuilder();
            eVar.mo114903b((C56610b) aVar.build());
            C139325g gVar = (C139325g) C139326h.f378938c.createBuilder();
            gVar.copyOnWrite();
            C139326h hVar3 = (C139326h) gVar.instance;
            hVar3.f378940a |= 1;
            hVar3.f378941b = true;
            C139326h hVar4 = (C139326h) gVar.build();
            eVar.copyOnWrite();
            C139324f fVar = (C139324f) eVar.instance;
            hVar4.getClass();
            fVar.f378933g = hVar4;
            fVar.f378927a |= 16;
            eVar.copyOnWrite();
            C139324f fVar2 = (C139324f) eVar.instance;
            fVar2.f378927a |= 64;
            fVar2.f378935i = true;
            eVar.copyOnWrite();
            C139324f fVar3 = (C139324f) eVar.instance;
            fVar3.f378932f = 2;
            fVar3.f378927a |= 8;
            try {
                C47709i.m84861a(this.f373002b, this.f373004d.mo114907a((C139324f) eVar.build(), this.f373003c));
                return true;
            } catch (C139322d e) {
                ((C59052c) ((C59052c) ((C59052c) f373001a.mo56225c()).mo56382g(e)).mo56372aa(40923)).mo56386p("Could not open stamp viewer.");
            }
        }
        return false;
    }
}
