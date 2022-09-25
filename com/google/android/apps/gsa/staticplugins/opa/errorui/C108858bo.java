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
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.util.C113760ac;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bo */
/* compiled from: PG */
public final class C108858bo extends C84036z implements C83904bj {

    /* renamed from: c */
    private static final C58974d f302678c = C58974d.m91136j();

    /* renamed from: a */
    public final C113760ac f302679a;

    /* renamed from: b */
    public final C108849bf f302680b;

    /* renamed from: d */
    private final SharedPreferences f302681d;

    /* renamed from: e */
    private final C86124t f302682e;

    /* renamed from: f */
    private final C58833ax f302683f;

    /* renamed from: g */
    private final Context f302684g;

    /* renamed from: h */
    private final C68214a f302685h;

    /* renamed from: i */
    private final C58881cr f302686i;

    /* renamed from: j */
    private final C68214a f302687j;

    /* renamed from: k */
    private final C108934ej f302688k;

    public C108858bo(C113760ac acVar, SharedPreferences sharedPreferences, C86124t tVar, C58833ax axVar, Context context, C68214a aVar, C58881cr crVar, C68214a aVar2, C108849bf bfVar, C108934ej ejVar) {
        this.f302679a = acVar;
        this.f302681d = sharedPreferences;
        this.f302682e = tVar;
        this.f302683f = axVar;
        this.f302684g = context;
        this.f302685h = aVar;
        this.f302686i = crVar;
        this.f302687j = aVar2;
        this.f302680b = bfVar;
        this.f302688k = ejVar;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        if (!super.mo77209c().mo56113h()) {
            if (((Boolean) this.f302686i.mo6453a()).booleanValue()) {
                C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
                e eVar = e.p;
                abVar.copyOnWrite();
                C83614ac acVar = (C83614ac) abVar.instance;
                acVar.f227955c = eVar.ca;
                acVar.f227953a = 2 | acVar.f227953a;
                abVar.copyOnWrite();
                C83614ac acVar2 = (C83614ac) abVar.instance;
                acVar2.f227954b = 1;
                acVar2.f227953a = 1 | acVar2.f227953a;
                ((C107759j) this.f302687j.mo27525b()).mo96272h((C83614ac) abVar.build());
            } else {
                C87565h hVar = new C87565h();
                hVar.f236560f = 2;
                ((C87568k) this.f302683f.mo56107c()).mo81688b(this.f302684g, hVar.mo81685a());
            }
            ((C89859i) this.f302685h.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_RELAUNCH_FROM_ERROR);
        }
        return C83903bi.m133649e(-1, (Intent) null);
    }

    /* renamed from: d */
    public final int mo97231d() {
        return this.f302682e.mo79746e(C90037cp.f248399G) ? 74 : 18;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        this.f302688k.mo97287e();
        this.f302681d.edit().putBoolean("opa_hotword_training_force_seen", false).apply();
        if (this.f302682e.mo79746e(C90037cp.f248611g) || this.f302682e.mo79746e(C90037cp.f248554cc) || this.f302682e.mo79746e(C90037cp.f248612h) || this.f302682e.mo79746e(C90037cp.f248555cd)) {
            boolean g = this.f302688k.mo97289g();
            C59104x b = f302678c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BlockingVMSequence");
            ((C58970a) ((C58970a) b).mo56372aa(24395)).mo56389s("StartupChecker#shouldShowGetMoreForAOL result: %s", Boolean.valueOf(g));
            if (g) {
                if (this.f302682e.mo79746e(C90037cp.f248611g)) {
                    return C58485gu.m89847o(new C108857bn(this), new C108855bl(this));
                }
                if (this.f302682e.mo79746e(C90037cp.f248554cc)) {
                    return C58485gu.m89847o(new C108855bl(this), new C108857bn(this));
                }
                if (this.f302682e.mo79746e(C90037cp.f248612h)) {
                    return C58485gu.m89847o(new C108857bn(this), new C108856bm(this));
                }
                if (this.f302682e.mo79746e(C90037cp.f248555cd)) {
                    return C58485gu.m89847o(new C108856bm(this), new C108857bn(this));
                }
                return C58485gu.m89846n(new C108857bn(this));
            }
        }
        return C58485gu.m89846n(new C108857bn(this));
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return C83903bi.m133649e(1, (Intent) null);
    }
}
