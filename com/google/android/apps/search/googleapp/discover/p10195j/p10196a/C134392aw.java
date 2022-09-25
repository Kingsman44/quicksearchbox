package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10189g.C134331b;
import com.google.android.apps.search.googleapp.discover.p10189g.C134332c;
import com.google.android.apps.search.googleapp.discover.p10189g.C134333d;
import com.google.android.apps.search.googleapp.discover.p10189g.C134337h;
import com.google.android.apps.search.googleapp.discover.p10189g.C134345p;
import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57080av;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64200av;
import com.google.protos.youtube.elements.C66059au;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.aw */
/* compiled from: PG */
public final class C134392aw implements C21312s {

    /* renamed from: a */
    private static final C59071e f366097a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.j.a.aw");

    /* renamed from: b */
    private final C133939b f366098b;

    public C134392aw(C133939b bVar) {
        this.f366098b = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64200av.f173587c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        Object obj2;
        C64200av avVar = (C64200av) obj;
        C21248ar e = rVar.mo26735e();
        if (!(e instanceof C40081u)) {
            ((C59052c) ((C59052c) f366097a.mo56226d()).mo56372aa(40335)).mo56386p("Creating a VE logger that did not use an XUiKitElementBuilder. This will break VE logging");
            return C69794a.m101254f(new IllegalArgumentException("CommandHandler requires an XUiKitElementBuilder."));
        }
        C40081u uVar = (C40081u) e;
        C40306b b = uVar.f105300c.mo42110b();
        C62940bt r1 = C62942bv.checkIsLite(C134589g.f366529e);
        b.mo58887l(r1);
        Object l = b.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj2 = r1.f169969b;
        } else {
            obj2 = r1.mo58889c(l);
        }
        C134589g gVar = (C134589g) obj2;
        C133939b bVar = this.f366098b;
        C57080av avVar2 = avVar.f173589a;
        if (avVar2 == null) {
            avVar2 = C57080av.f152377b;
        }
        C40027ah ahVar = uVar.f105299b;
        C69664n.m101061g(avVar2, "showBottomSheetData");
        C69664n.m101061g(gVar, "clientContext");
        C134345p pVar = bVar.f364795d;
        C69664n.m101061g(avVar2, "showBottomSheetData");
        C69664n.m101061g(gVar, "clientContext");
        C57784p pVar2 = avVar2.f152379a;
        if (pVar2 == null) {
            pVar2 = C57784p.f154382f;
        }
        if ((pVar2.f154384a & 1) != 0) {
            C135200t tVar = pVar.f365941e;
            String str = gVar.f366532b;
            C69664n.m101060f(str, "clientContext.sessionId");
            tVar.mo112158f(str, pVar.f365944h.f366954c);
            pVar.mo111749c();
            AccountId accountId = pVar.f365942f;
            C134332c cVar = (C134332c) C134333d.f365899d.createBuilder();
            cVar.copyOnWrite();
            C134333d dVar = (C134333d) cVar.instance;
            avVar2.getClass();
            dVar.f365902b = avVar2;
            dVar.f365901a |= 1;
            cVar.copyOnWrite();
            C134333d dVar2 = (C134333d) cVar.instance;
            gVar.getClass();
            dVar2.f365903c = gVar;
            dVar2.f365901a |= 2;
            C134331b bVar2 = new C134331b();
            C68324h.m98669f(bVar2);
            C47247a.m84047b(bVar2, accountId);
            C47243l.m84039a(bVar2, (C134333d) cVar.build());
            bVar2.showNow(pVar.f365938b.getChildFragmentManager(), "BottomSheetDialogFragment");
            C134337h a = bVar2.mo17754z();
            Object b2 = pVar.f365939c.mo17428b();
            C69664n.m101060f(b2, "xUiKitProvider.get()");
            String str2 = gVar.f366532b;
            C69664n.m101060f(str2, "clientContext.sessionId");
            a.mo111740a(ahVar, (C40305b) b2, str2, pVar.f365944h);
        } else {
            C59052c cVar2 = (C59052c) C134345p.f365937a.mo56226d();
            cVar2.mo56379ah(new C59094n(40304));
            cVar2.mo56386p("No ElementTree to display. Skipping.");
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar3 = C70101a.f186847o;
        return aVar;
    }
}
