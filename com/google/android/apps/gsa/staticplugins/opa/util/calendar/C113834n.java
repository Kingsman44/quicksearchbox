package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.content.Context;
import android.content.Intent;
import com.google.android.enterprise.connectedapps.C142555ao;
import com.google.android.enterprise.connectedapps.C142563c;
import com.google.android.enterprise.connectedapps.C142570e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.n */
/* compiled from: PG */
public final class C113834n extends C113825e {

    /* renamed from: b */
    private final C113829i f315240b;

    /* renamed from: c */
    private final C113828h f315241c;

    /* renamed from: d */
    private final C142570e f315242d;

    public C113834n(C113829i iVar, C113828h hVar, C142570e eVar) {
        this.f315240b = iVar;
        this.f315241c = hVar;
        this.f315242d = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo100681b(OpenCalendarEventIntentData openCalendarEventIntentData) {
        return mo100685f(mo100680a(openCalendarEventIntentData), mo100684e(openCalendarEventIntentData));
    }

    /* renamed from: c */
    public final C60870cx mo100682c(OpenCalendarEventIntentData openCalendarEventIntentData) {
        C113819ad adVar;
        C113829i iVar = this.f315240b;
        if (mo100684e(openCalendarEventIntentData).mo117171a()) {
            Context context = ((C142563c) iVar.f315236a).f386843a;
            C113817ab abVar = C113817ab.f315222a;
            adVar = new C113846z(C113817ab.m188424a(((C142563c) iVar.f315236a).f386843a));
        } else {
            adVar = new C113818ac(iVar.f315236a);
        }
        return C60922j.m93045h(adVar.mo100675a(openCalendarEventIntentData), new C113833m(this, openCalendarEventIntentData), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final boolean mo100683d(OpenCalendarEventIntentData openCalendarEventIntentData) {
        return Objects.equals(mo100684e(openCalendarEventIntentData), C142570e.f386860a);
    }

    /* renamed from: e */
    public final C142555ao mo100684e(OpenCalendarEventIntentData openCalendarEventIntentData) {
        return openCalendarEventIntentData.f315219d == 2 ? this.f315242d.mo117186b() : C142570e.f386860a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C60870cx mo100685f(Intent intent, C142555ao aoVar) {
        C113842v vVar;
        C113828h hVar = this.f315241c;
        if (aoVar.mo117171a()) {
            Context context = ((C142563c) hVar.f315235a).f386843a;
            C113840t tVar = C113840t.f315245a;
            vVar = new C113838r(C113840t.m188446a(((C142563c) hVar.f315235a).f386843a));
        } else {
            vVar = new C113841u(hVar.f315235a);
        }
        return vVar.mo100691a(intent);
    }
}
