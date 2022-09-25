package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fa */
/* compiled from: PG */
public final class C108952fa extends C84036z implements C83904bj {

    /* renamed from: a */
    private final SharedPreferences f302980a;

    /* renamed from: b */
    private final C58833ax f302981b;

    /* renamed from: c */
    private final Context f302982c;

    /* renamed from: d */
    private final C68214a f302983d;

    /* renamed from: e */
    private final C58881cr f302984e;

    /* renamed from: f */
    private final C68214a f302985f;

    public C108952fa(SharedPreferences sharedPreferences, C58833ax axVar, Context context, C68214a aVar, C58881cr crVar, C68214a aVar2) {
        this.f302980a = sharedPreferences;
        this.f302981b = axVar;
        this.f302982c = context;
        this.f302983d = aVar;
        this.f302984e = crVar;
        this.f302985f = aVar2;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        if (((Boolean) this.f302984e.mo6453a()).booleanValue()) {
            C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
            e eVar = e.ax;
            abVar.copyOnWrite();
            C83614ac acVar = (C83614ac) abVar.instance;
            acVar.f227955c = eVar.ca;
            acVar.f227953a = 2 | acVar.f227953a;
            abVar.copyOnWrite();
            C83614ac acVar2 = (C83614ac) abVar.instance;
            acVar2.f227954b = 1;
            acVar2.f227953a = 1 | acVar2.f227953a;
            ((C107759j) this.f302985f.mo27525b()).mo96272h((C83614ac) abVar.build());
        } else {
            C87565h hVar = new C87565h();
            hVar.f236560f = 2;
            ((C87568k) this.f302981b.mo56107c()).mo81688b(this.f302982c, hVar.mo81685a());
        }
        ((C89859i) this.f302983d.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_RELAUNCH_FROM_ERROR);
        return C83903bi.m133649e(-1, (Intent) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        this.f302980a.edit().putInt("opa_nga_swipe_demo_seen_count", this.f302980a.getInt("opa_nga_swipe_demo_seen_count", 0) + 1).apply();
        return C58485gu.m89846n(new C108950ez());
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return C83903bi.m133649e(1, (Intent) null);
    }
}
