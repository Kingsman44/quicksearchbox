package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10166a.C133998l;
import com.google.android.apps.search.googleapp.discover.p10166a.C134002p;
import com.google.android.apps.search.googleapp.discover.p10244v.C135182c;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57091f;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62971cq;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64219j;
import com.google.protos.youtube.elements.C66059au;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.t */
/* compiled from: PG */
public final class C134419t implements C21312s {

    /* renamed from: a */
    private static final C59071e f366131a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.j.a.t");

    /* renamed from: b */
    private final C133939b f366132b;

    public C134419t(C133939b bVar) {
        this.f366132b = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64219j.f173637c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64219j jVar = (C64219j) obj;
        C21248ar e = rVar.mo26735e();
        if (!(e instanceof C40081u)) {
            ((C59052c) ((C59052c) f366131a.mo56226d()).mo56372aa(40327)).mo56386p("CommitDismissCommand requires an XUiKitElementBuilder.");
            return C69794a.m101254f(new IllegalArgumentException("CommitDismissCommand requires an XUiKitElementBuilder."));
        }
        C133939b bVar = this.f366132b;
        C57091f fVar = jVar.f173639a;
        if (fVar == null) {
            fVar = C57091f.f152411b;
        }
        C40027ah ahVar = ((C40081u) e).f105299b;
        C69664n.m101061g(fVar, "commitDismissData");
        C134002p pVar = bVar.f364799h;
        C69664n.m101061g(fVar, "commitDismissData");
        C135182c a = pVar.f365014b.mo111511a();
        if (a != null) {
            C46459k.m82829b(C71663i.m104692e(pVar.f365019g, (C71424ay) null, new C133998l(pVar, a, (C69577g) null), 3), "Failed to commit dismiss.", new Object[0]);
        }
        C62971cq<C57696b> cqVar = fVar.f152413a;
        C69664n.m101060f(cqVar, "commitDismissData.vePropertiesHideGraftList");
        for (C57696b f : cqVar) {
            ((C40025af) ahVar).mo42132f(3, f);
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
