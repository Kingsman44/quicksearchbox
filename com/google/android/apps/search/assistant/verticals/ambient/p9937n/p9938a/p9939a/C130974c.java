package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9938a.p9939a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131090m;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C130974c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C130984m f358341a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f358342b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f358343c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f358344d;

    public /* synthetic */ C130974c(C130984m mVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f358341a = mVar;
        this.f358342b = cxVar;
        this.f358343c = cxVar2;
        this.f358344d = cxVar3;
    }

    public final Object call() {
        C58485gu guVar;
        C130984m mVar = this.f358341a;
        C60870cx cxVar = this.f358342b;
        C60870cx cxVar2 = this.f358343c;
        C60870cx cxVar3 = this.f358344d;
        C131090m mVar2 = (C131090m) C60856cj.m92909r(cxVar);
        C58485gu b = mVar2.mo110067b();
        C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar2);
        double sum = Collection.EL.stream(guVar2).mapToDouble(C130978g.f358350a).sum();
        if (sum == C59203do.f157270a) {
            ((C58970a) ((C58970a) mVar.f358365i.mo56226d()).mo56372aa(39010)).mo56386p("Sum of media apps scores is 0");
            guVar = C58485gu.m89845m();
        } else {
            C58485gu guVar3 = (C58485gu) Collection.EL.stream(guVar2).filter(new C130979h(mVar, sum)).collect(C58370cn.f155946a);
            ((C58970a) ((C58970a) mVar.f358365i.mo56224b()).mo56372aa(39009)).mo56393w("Filtered suggestion by threshold. Initial suggestion count: %d, final suggestions count: %d", guVar2.size(), guVar3.size());
            guVar = guVar3;
        }
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        ((C58970a) ((C58970a) mVar.f358365i.mo56224b()).mo56372aa(39013)).mo56359L("PR and Waa enabled: %b, on-device suggestions: %s; habits profile suggestions: %s", Boolean.valueOf(booleanValue), Collection.EL.stream(b).map(C130982k.f358355a).collect(Collectors.joining(", ")), Collection.EL.stream(guVar).map(C130982k.f358355a).collect(Collectors.joining(", ")));
        boolean isEmpty = guVar.isEmpty();
        boolean isEmpty2 = b.isEmpty();
        C58485gu a = mVar.mo110016a(guVar);
        boolean isEmpty3 = a.isEmpty();
        C58485gu a2 = mVar.mo110016a(b);
        mVar.f358371o.mo109946s(!isEmpty, !isEmpty2, !isEmpty3, !a2.isEmpty(), C130984m.m213531d(b, guVar), C130984m.m213531d(a2, a), true);
        mVar.f358371o.mo109937j(guVar.size(), (int) Collection.EL.stream(guVar).filter(new C130981j(mVar)).count());
        if (!mVar.f358363g || !booleanValue || mVar2.mo110066a() <= 0) {
            ((C58970a) ((C58970a) mVar.f358365i.mo56224b()).mo56372aa(39014)).mo56386p("Sending suggestion from habits profile.");
            C58485gu b2 = mVar.mo110017b(guVar);
            ((C58970a) ((C58970a) mVar.f358365i.mo56224b()).mo56372aa(39011)).mo56354G("Filtered for habits installed apps. pre-filtered: %s filtered: %s", guVar, b2);
            return b2;
        }
        C58485gu guVar4 = (C58485gu) Collection.EL.stream(b).filter(new C130975d(mVar)).filter(new C130976e(mVar)).collect(C58370cn.f155946a);
        C58485gu b3 = mVar.mo110017b(guVar4);
        ((C58970a) ((C58970a) mVar.f358365i.mo56224b()).mo56372aa(39012)).mo56360M("On device apps before score filtering:\n%s\nOn device app after score filtering:\n%s\nOn device apps after filtering installed apps:\n%s\nSending %d suggestions from on device model.", b, guVar4, b3, Integer.valueOf(b3.size()));
        return guVar4;
    }
}
