package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57105t;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62971cq;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64231v;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.z */
/* compiled from: PG */
public final class C134425z implements C21312s {

    /* renamed from: a */
    private static final C59071e f366139a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.j.a.z");

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64231v.f173667c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64231v vVar = (C64231v) obj;
        C21248ar e = rVar.mo26735e();
        if (!(e instanceof C40081u)) {
            ((C59052c) ((C59052c) f366139a.mo56226d()).mo56372aa(40330)).mo56386p("Creating a VE logger that did not use an XUiKitElementBuilder. This will break VE logging");
            return C69794a.m101254f(new IllegalArgumentException("CommandHandler requires an XUiKitElementBuilder."));
        }
        C57105t tVar = vVar.f173669a;
        if (tVar == null) {
            tVar = C57105t.f152442b;
        }
        C40027ah ahVar = ((C40081u) e).f105299b;
        C69664n.m101061g(tVar, "logInteractionData");
        C62971cq<C57696b> cqVar = tVar.f152444a;
        C69664n.m101060f(cqVar, "logInteractionData.clientLoggingPropertiesList");
        for (C57696b c : cqVar) {
            ahVar.mo42130c(c);
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
