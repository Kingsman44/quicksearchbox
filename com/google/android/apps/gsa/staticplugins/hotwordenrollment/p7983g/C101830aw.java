package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.aw */
/* compiled from: PG */
public final /* synthetic */ class C101830aw implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C101832ay f284020a;

    /* renamed from: b */
    public final /* synthetic */ acv f284021b;

    public /* synthetic */ C101830aw(C101832ay ayVar, acv acv) {
        this.f284020a = ayVar;
        this.f284021b = acv;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C101832ay ayVar = this.f284020a;
        acv acv = this.f284021b;
        l lVar = ayVar.f284027g;
        p pVar = new p();
        pVar.b = C58833ax.m90833j(ayVar.f284025e);
        pVar.c(ayVar.f284032l);
        pVar.e(acv);
        pVar.e = C58833ax.m90834k("EnrollmentUtils");
        pVar.a = new C101831ax(cVar);
        lVar.h(pVar.a());
        return "Voice Settings Checker fetchUiVoiceSettings operation";
    }
}
