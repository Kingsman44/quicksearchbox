package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.content.Context;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.EnrollmentHelper;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92379c;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101888e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101890g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.n */
/* compiled from: PG */
public final class C102214n {

    /* renamed from: a */
    public static final C59071e f285205a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.n");

    /* renamed from: a */
    public static final int m169389a(Context context, C74555u uVar, C89994f fVar, C92371d dVar, C101860a aVar, C92486a aVar2, EnrollmentHelper enrollmentHelper, C92380d dVar2, boolean z, C101497ae aeVar, C58833ax axVar, C101888e eVar, C101890g gVar, C90584f fVar2, C101610b bVar) {
        return m169399k(uVar, dVar, aVar, dVar2, aeVar, eVar, bVar) ? R.string.hotword_enrollment_voice_match_next : R.string.hotword_enrollment_voice_match_allow;
    }

    /* renamed from: b */
    public static final String m169390b(C101860a aVar, C92486a aVar2, C90584f fVar) {
        String str;
        if (fVar.equals(C90584f.OK_HEY_GOOGLE)) {
            str = aVar2.mo87227A(C90584f.OK_HEY_GOOGLE, aVar.mo92638c(), 2, 1);
        } else {
            str = aVar2.mo87230d();
        }
        return str.replace(' ', 160);
    }

    /* renamed from: c */
    public static final boolean m169391c(C92380d dVar) {
        int a = C92379c.m151713a(dVar.f257603b);
        return a != 0 && a == 3;
    }

    /* renamed from: d */
    public static final boolean m169392d(C101860a aVar) {
        List list = aVar.f284135b;
        if (!aVar.f284134a.get()) {
            return list != null && !list.isEmpty();
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m169393e(C74555u uVar) {
        return uVar.mo70885c().mo70898b() == z.c;
    }

    /* renamed from: f */
    public static final boolean m169394f(C74555u uVar, C92371d dVar, C101860a aVar) {
        return C92408n.m151745g(uVar.mo70891j(), aVar.f284137d.get(), dVar);
    }

    /* renamed from: g */
    public static final boolean m169395g(C74555u uVar, C101497ae aeVar) {
        if (aeVar.mo92338k()) {
            return true;
        }
        if (uVar.mo70887e().mo70857f()) {
            return aeVar.mo92328a().f228593b;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m169396h(C74555u uVar, C92380d dVar) {
        return !uVar.mo70891j() && m169391c(dVar);
    }

    /* renamed from: i */
    public static final boolean m169397i(C74555u uVar, C92380d dVar, C101610b bVar) {
        return bVar.mo92421b() ? uVar.mo70892k() && !uVar.mo70887e().mo70853a().mo70878b() : uVar.mo70891j() || m169391c(dVar);
    }

    /* renamed from: j */
    public static final boolean m169398j(C74555u uVar, C89994f fVar, C92371d dVar, C101860a aVar, C92380d dVar2, boolean z) {
        if (fVar.mo83852O() || !z) {
            return false;
        }
        return (uVar.mo70891j() || m169391c(dVar2)) && !m169394f(uVar, dVar, aVar);
    }

    /* renamed from: k */
    public static final boolean m169399k(C74555u uVar, C92371d dVar, C101860a aVar, C92380d dVar2, C101497ae aeVar, C101888e eVar, C101610b bVar) {
        if (bVar.mo92421b() || eVar.mo92669c() || m169394f(uVar, dVar, aVar) || uVar.mo70886d().mo70847a().d() == 2) {
            return false;
        }
        if (uVar.mo70891j() || m169391c(dVar2) || aeVar.mo92337j()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m169400l(C74555u uVar, C101497ae aeVar, C101888e eVar, C101610b bVar) {
        if (eVar.mo92669c()) {
            return false;
        }
        if (m169395g(uVar, aeVar) || uVar.mo70886d().mo70847a().d() == 2 || bVar.mo92421b()) {
            return true;
        }
        return false;
    }
}
