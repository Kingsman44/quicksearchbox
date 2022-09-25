package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131090m;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.i */
/* compiled from: PG */
public final /* synthetic */ class C106955i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106959m f297912a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297913b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f297914c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f297915d;

    /* renamed from: e */
    public final /* synthetic */ boolean f297916e;

    public /* synthetic */ C106955i(C106959m mVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, boolean z) {
        this.f297912a = mVar;
        this.f297913b = cxVar;
        this.f297914c = cxVar2;
        this.f297915d = cxVar3;
        this.f297916e = z;
    }

    public final Object call() {
        C58485gu guVar;
        C106959m mVar = this.f297912a;
        C60870cx cxVar = this.f297913b;
        C60870cx cxVar2 = this.f297914c;
        C60870cx cxVar3 = this.f297915d;
        boolean z = this.f297916e;
        C131090m mVar2 = (C131090m) C60856cj.m92909r(cxVar);
        C58485gu b = mVar2.mo110067b();
        C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar2);
        double m = mVar.f297920a.mo79747m(C90017bw.f247986bv);
        double sum = Collection.EL.stream(guVar2).mapToDouble(C106865a.f297759a).sum();
        if (sum == C59203do.f157270a) {
            ((C58970a) ((C58970a) mVar.f297925f.mo56226d()).mo56372aa(23338)).mo56386p("Sum of media apps scores is 0");
            guVar = C58485gu.m89845m();
        } else {
            C58485gu guVar3 = (C58485gu) Collection.EL.stream(guVar2).filter(new C106946d(sum, m)).collect(C58370cn.f155946a);
            ((C58970a) ((C58970a) mVar.f297925f.mo56224b()).mo56372aa(23337)).mo56393w("Filtered suggestion by threshold. Initial suggestion count: %d, final suggestions count: %d", guVar2.size(), guVar3.size());
            guVar = guVar3;
        }
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        ((C58970a) ((C58970a) mVar.f297925f.mo56224b()).mo56372aa(23341)).mo56359L("PR and Waa enabled: %b, on-device suggestions: %s; habits profile suggestions: %s", Boolean.valueOf(booleanValue), Collection.EL.stream(b).map(C106956j.f297917a).collect(Collectors.joining(", ")), Collection.EL.stream(guVar).map(C106956j.f297917a).collect(Collectors.joining(", ")));
        if (z) {
            boolean isEmpty = guVar.isEmpty();
            boolean isEmpty2 = b.isEmpty();
            C58485gu a = mVar.mo95719a(guVar);
            boolean isEmpty3 = a.isEmpty();
            C58485gu a2 = mVar.mo95719a(b);
            mVar.f297926g.mo109946s(!isEmpty, !isEmpty2, !isEmpty3, !a2.isEmpty(), C106959m.m177674d(b, guVar), C106959m.m177674d(a2, a), mVar.f297920a.mo79746e(C90017bw.f247900aO));
        }
        mVar.f297926g.mo109937j(guVar.size(), (int) Collection.EL.stream(guVar).filter(new C106892b(mVar.f297920a.mo79745c(C90069du.f249747y))).count());
        if (!mVar.f297920a.mo79746e(C90017bw.f247901aP) || !z || !booleanValue || mVar2.mo110066a() <= 0) {
            ((C58970a) ((C58970a) mVar.f297925f.mo56224b()).mo56372aa(23342)).mo56386p("Sending suggestion from habits profile.");
            C58485gu b2 = mVar.mo95720b(guVar);
            ((C58970a) ((C58970a) mVar.f297925f.mo56224b()).mo56372aa(23339)).mo56354G("Filtered for habits installed apps. pre-filtered: %s filtered: %s", guVar, b2);
            return b2;
        }
        C58485gu guVar4 = (C58485gu) Collection.EL.stream(b).filter(new C106957k(mVar.f297920a.mo79747m(C90017bw.f247964bZ))).filter(new C106958l(Duration.ofMinutes(mVar.f297920a.mo79743a(C90017bw.f247963bY)))).collect(C58370cn.f155946a);
        C58485gu b3 = mVar.mo95720b(guVar4);
        ((C58970a) ((C58970a) mVar.f297925f.mo56224b()).mo56372aa(23340)).mo56360M("On device apps before score filtering:\n%s\nOn device app after score filtering:\n%s\nOn device apps after filtering installed apps:\n%s\nSending %d suggestions from on device model.", b, guVar4, b3, Integer.valueOf(b3.size()));
        return guVar4;
    }
}
