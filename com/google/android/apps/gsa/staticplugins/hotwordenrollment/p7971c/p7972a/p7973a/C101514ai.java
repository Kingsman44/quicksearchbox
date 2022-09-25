package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.assistant.shared.l;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3897e.p3929l.p3930a.C52710bp;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.ai */
/* compiled from: PG */
final class C101514ai implements C58839bc {

    /* renamed from: a */
    final /* synthetic */ l f283308a;

    public C101514ai(l lVar) {
        this.f283308a = lVar;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo5941a(Object obj) {
        l lVar = this.f283308a;
        C52710bp a = C101515aj.m167884a((act) obj, lVar);
        String d = lVar.d();
        if (a == C52710bp.VOICE_ENROLLMENT_FAILURE) {
            ((C59052c) ((C59052c) C101515aj.f283310b.mo56224b()).mo56372aa(20328)).mo56389s("VoiceEnrollmentStatus is fail %s", d);
            return false;
        } else if (a == C52710bp.VOICE_ENROLLMENT_SUCCESS) {
            return false;
        } else {
            ((C59052c) ((C59052c) C101515aj.f283310b.mo56224b()).mo56372aa(20327)).mo56389s("Retry VoiceEnrollmentStatus is not SUCCESS %s", d);
            return true;
        }
    }
}
