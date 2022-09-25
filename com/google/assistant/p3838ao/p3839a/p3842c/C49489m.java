package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.assistant.p3838ao.p3839a.C49444c;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49536at;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.assistant.ao.a.c.m */
/* compiled from: PG */
public final class C49489m implements C49486j {

    /* renamed from: a */
    private static final C58974d f127711a = C58974d.m91136j();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C58485gu mo53273a(C49692r rVar, Object obj) {
        C49536at atVar = (C49536at) obj;
        String str = atVar.f127816b;
        double d = (atVar.f127815a & 2) != 0 ? atVar.f127817c : 1.0E-10d;
        if (str.isEmpty()) {
            ((C58970a) ((C58970a) f127711a.mo56226d()).mo56372aa(54844)).mo56386p("Could not create bundle candidate with empty display text.");
            return C58485gu.m89845m();
        }
        C49444c cVar = new C49444c(str);
        cVar.f127723d = d;
        return C58485gu.m89846n(cVar);
    }
}
