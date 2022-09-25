package com.google.android.apps.gsa.p6487s3;

import com.google.android.libraries.gsa.p1833c.p1834a.C22229ba;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.s3.i */
/* compiled from: PG */
public final /* synthetic */ class C84291i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f229390a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f229391b;

    public /* synthetic */ C84291i(C58833ax axVar, C58833ax axVar2) {
        this.f229390a = axVar;
        this.f229391b = axVar2;
    }

    public final Object apply(Object obj) {
        C58833ax axVar = this.f229390a;
        C58833ax axVar2 = this.f229391b;
        C22229ba baVar = (C22229ba) obj;
        C59071e eVar = C84292j.f229392a;
        C70334de deVar = new C70334de();
        String str = "com.google.android.googlequicksearchbox";
        String str2 = (String) axVar2.mo56109e(str);
        String str3 = (String) C84292j.f229396e.get(str2);
        if (str3 == null) {
            C59104x d = C84292j.f229392a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GrpcS3Connection");
            ((C59052c) ((C59052c) d).mo56372aa(7162)).mo56389s("Unexpected gsaPackageName %s", str2);
            str3 = "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU";
        } else {
            str = str2;
        }
        deVar.mo62033h(C84292j.f229394c, str);
        deVar.mo62033h(C84292j.f229393b, str3);
        if (axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            deVar.mo62033h(C84292j.f229395d, (String) axVar.mo56107c());
        } else {
            C59104x c = C84292j.f229392a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GrpcS3Connection");
            ((C59052c) ((C59052c) c).mo56372aa(7160)).mo56386p("Certificate required but not present.");
        }
        baVar.f61374b = deVar;
        return baVar;
    }
}
