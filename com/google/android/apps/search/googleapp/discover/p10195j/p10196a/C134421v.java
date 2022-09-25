package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10166a.C134000n;
import com.google.android.apps.search.googleapp.discover.p10166a.C134001o;
import com.google.android.apps.search.googleapp.discover.p10166a.C134002p;
import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57093h;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57134ar;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64223n;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.v */
/* compiled from: PG */
public final class C134421v implements C21312s {

    /* renamed from: a */
    private static final C59071e f366134a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.j.a.v");

    /* renamed from: b */
    private final C133939b f366135b;

    public C134421v(C133939b bVar) {
        this.f366135b = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64223n.f173646c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        Object obj2;
        Object obj3;
        C64223n nVar = (C64223n) obj;
        C21248ar e = rVar.mo26735e();
        if (!(e instanceof C40081u)) {
            ((C59052c) ((C59052c) f366134a.mo56226d()).mo56372aa(40328)).mo56386p("DismissCommand requires an XUiKitElementBuilder.");
            return C69794a.m101254f(new IllegalArgumentException("DismissCommand requires an XUiKitElementBuilder."));
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
        String str = ((C134589g) obj2).f366532b;
        C133939b bVar = this.f366135b;
        C57093h hVar = nVar.f173648a;
        if (hVar == null) {
            hVar = C57093h.f152415c;
        }
        C69664n.m101061g(hVar, "dismissData");
        C69664n.m101061g(str, "sessionId");
        C69664n.m101061g(uVar, "xUiKitElementBuilder");
        C134002p pVar = bVar.f364799h;
        C69664n.m101061g(hVar, "dismissData");
        C69664n.m101061g(str, "sessionId");
        C69664n.m101061g(uVar, "xUiKitElementBuilder");
        C62971cq cqVar = hVar.f152417a;
        C69664n.m101060f(cqVar, "dismissData.dataOperationsList");
        C62940bt r12 = C62942bv.checkIsLite(C57134ar.f152506d);
        hVar.mo58887l(r12);
        Object l2 = hVar.f169962ag.mo58854l(r12.f169971d);
        if (l2 == null) {
            obj3 = r12.f169969b;
        } else {
            obj3 = r12.mo58889c(l2);
        }
        C69664n.m101060f(obj3, "dismissData.getExtension(Snackbar.snackbar)");
        C57134ar arVar = (C57134ar) obj3;
        if ((arVar.f152508a & 1) != 0) {
            CommandOuterClass$Command commandOuterClass$Command = arVar.f152509b;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
            CommandOuterClass$Command commandOuterClass$Command2 = commandOuterClass$Command;
            C69664n.m101060f(commandOuterClass$Command2, "snackbar.showSnackbarCommand");
            C21309p k = C21311r.m40252k();
            ((C21230a) k).f59564e = uVar;
            C46459k.m82829b(C71663i.m104692e(pVar.f365019g, (C71424ay) null, new C134001o(pVar, str, cqVar, commandOuterClass$Command2, k.mo26698a(), (C69577g) null), 3), "Failed when trying to commit dismiss.", new Object[0]);
        } else {
            C46459k.m82829b(C71663i.m104692e(pVar.f365019g, (C71424ay) null, new C134000n(pVar, str, cqVar, (C69577g) null), 3), "Failed when trying to commit dismiss.", new Object[0]);
            C40027ah ahVar = uVar.f105299b;
            C62971cq<C57696b> cqVar2 = hVar.f152418b;
            C69664n.m101060f(cqVar2, "dismissData.vePropertiesHideGraftList");
            for (C57696b f : cqVar2) {
                ((C40025af) ahVar).mo42132f(3, f);
            }
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
