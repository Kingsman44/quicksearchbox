package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57102q;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57103r;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64229t;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.y */
/* compiled from: PG */
public final class C134424y implements C21312s {

    /* renamed from: a */
    private static final C59071e f366138a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.j.a.y");

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64229t.f173661c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64229t tVar = (C64229t) obj;
        C21248ar e = rVar.mo26735e();
        if (!(e instanceof C40081u)) {
            ((C59052c) ((C59052c) f366138a.mo56226d()).mo56372aa(40329)).mo56386p("Creating a VE logger that did not use an XUiKitElementBuilder. This will break VE logging");
            return C69794a.m101254f(new IllegalArgumentException("CommandHandler requires an XUiKitElementBuilder."));
        }
        C57103r rVar2 = tVar.f173663a;
        if (rVar2 == null) {
            rVar2 = C57103r.f152436d;
        }
        C40027ah ahVar = ((C40081u) e).f105299b;
        C69664n.m101061g(rVar2, "logGraftData");
        if ((rVar2.f152438a & 2) != 0) {
            int a = C57102q.m88260a(rVar2.f152439b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                C57696b bVar = rVar2.f152440c;
                if (bVar == null) {
                    bVar = C57696b.f154137l;
                }
                ((C40025af) ahVar).mo42132f(2, bVar);
            } else if (i == 2) {
                C57696b bVar2 = rVar2.f152440c;
                if (bVar2 == null) {
                    bVar2 = C57696b.f154137l;
                }
                ((C40025af) ahVar).mo42132f(3, bVar2);
            }
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
