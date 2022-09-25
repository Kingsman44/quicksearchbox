package com.google.android.libraries.p3332u.p3333a.p3335b;

import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.gms.gmscompliance.p10800a.C144265e;
import com.google.android.gms.tasks.C146042v;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2993e.C38304c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.u.a.b.f */
/* compiled from: PG */
final class C43193f implements C146042v {

    /* renamed from: a */
    final /* synthetic */ Instant f112908a;

    /* renamed from: b */
    final /* synthetic */ C43195h f112909b;

    /* renamed from: c */
    final /* synthetic */ C69615a f112910c;

    /* renamed from: d */
    final /* synthetic */ C69615a f112911d;

    public C43193f(Instant instant, C43195h hVar, C69615a aVar, C69615a aVar2) {
        this.f112908a = instant;
        this.f112909b = hVar;
        this.f112910c = aVar;
        this.f112911d = aVar2;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo18632e(Object obj) {
        Duration between = Duration.between(this.f112908a, this.f112909b.f112915d.mo57444a());
        C59052c cVar = (C59052c) C43196i.f112918a.mo56224b();
        long millis = between.toMillis();
        cVar.mo56379ah(new C59094n(48156));
        cVar.mo56388r("Device Compliance Fetch time taken = %sms", millis);
        if (!((C144265e) obj).mo119794b()) {
            C59052c cVar2 = (C59052c) C43196i.f112918a.mo56224b();
            cVar2.mo56379ah(new C59094n(48157));
            cVar2.mo56386p("Device is compliant!");
            C69664n.m101060f(between, "complianceResponseFetchDuration");
            if (Math.random() < 0.001d) {
                C89949q.m146523g(1525);
            }
            if (this.f112909b.f112914c.mo46267b()) {
                C59052c cVar3 = (C59052c) C43196i.f112918a.mo56224b();
                cVar3.mo56379ah(new C59094n(48159));
                cVar3.mo56386p("Not invoking \"compliant\" action because Components-reset is pending.");
                C43195h hVar = this.f112909b;
                C43196i.m76179b(hVar.f112912a, hVar.f112914c);
                return;
            }
            C59052c cVar4 = (C59052c) C43196i.f112918a.mo56224b();
            cVar4.mo56379ah(new C59094n(48158));
            cVar4.mo56386p("Invoking \"compliant\" action...");
            this.f112911d.mo5672a();
            return;
        }
        C59052c cVar5 = (C59052c) C43196i.f112918a.mo56224b();
        cVar5.mo56379ah(new C59094n(48160));
        cVar5.mo56386p("Device is NOT compliant!");
        C69664n.m101060f(between, "complianceResponseFetchDuration");
        C89949q.m146523g(1524);
        C95883aa.m158983d(C38304c.f101473a.mo56226d(), "Device is not compliant!", 53086, C38505d.f101864b, 178805868);
        C59052c cVar6 = (C59052c) C43196i.f112918a.mo56224b();
        cVar6.mo56379ah(new C59094n(48161));
        cVar6.mo56386p("Dismissing all notifications.");
        new C1800aq(this.f112909b.f112912a).f5622a.cancelAll();
        C43195h hVar2 = this.f112909b;
        C43196i.m76180c(hVar2.f112912a, true, hVar2.f112913b.f112920b);
        this.f112909b.f112914c.mo46266a(true);
        C59052c cVar7 = (C59052c) C43196i.f112918a.mo56224b();
        cVar7.mo56379ah(new C59094n(48162));
        cVar7.mo56386p("Invoking \"not-compliant\" action...");
        this.f112910c.mo5672a();
    }
}
