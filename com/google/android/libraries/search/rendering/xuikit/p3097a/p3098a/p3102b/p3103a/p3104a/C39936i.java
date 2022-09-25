package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3103a.p3104a;

import com.google.common.base.C58838bb;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64137f;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64141j;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64145n;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64155x;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C39936i implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C64155x f104980a;

    public /* synthetic */ C39936i(C64155x xVar) {
        this.f104980a = xVar;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C64155x xVar = this.f104980a;
        C69803b bVar = (C69803b) obj;
        boolean z = true;
        C58838bb.m90869d(1 == (xVar.f173455a & 1), "No xuikit_query_id specified");
        C58838bb.m90869d((xVar.f173455a & 2) != 0, "No xuikit_result_id specified");
        int i = xVar.f173456b;
        if (i == 3) {
            C64145n nVar = (C64145n) xVar.f173457c;
            C58838bb.m90869d(1 == (nVar.f173428a & 1), "No scheme in MothershipParams specified");
            C58838bb.m90869d((nVar.f173428a & 2) != 0, "No authority in MothershipParams specified");
            C58838bb.m90869d((nVar.f173428a & 4) != 0, "No service_name in MothershipParams specified");
            if ((nVar.f173428a & 8) == 0) {
                z = false;
            }
            C58838bb.m90869d(z, "No method_name in MothershipParams specified");
        } else if (i == 4) {
            C64141j jVar = (C64141j) xVar.f173457c;
            C58838bb.m90869d((jVar.f173421a & 4) != 0, "No path in HttpMappingParams specified");
            C58838bb.m90869d(1 == (jVar.f173421a & 1), "No scheme in HttpMappingParams specified");
            if ((jVar.f173421a & 2) == 0) {
                z = false;
            }
            C58838bb.m90869d(z, "No authority in HttpMappingParams specified");
        } else if (i == 5) {
            C64137f fVar = (C64137f) xVar.f173457c;
            C58838bb.m90869d((fVar.f173404a & 4) != 0, "No path in GenericHttpParams specified");
            C58838bb.m90869d(1 == (fVar.f173404a & 1), "No scheme in GenericHttpParams specified");
            C58838bb.m90869d((fVar.f173404a & 2) != 0, "No authority in GenericHttpParams specified");
            if (fVar.f173405b == 101) {
                if ((fVar.f173404a & 8) == 0) {
                    z = false;
                }
                C58838bb.m90869d(z, "No httpMethod in GenericHttpParams specified");
            }
        }
    }
}
