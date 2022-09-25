package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.activity.result.C0816c;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.h.s.q;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74543ad;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74553r;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124673cl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124690db;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142340bs;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46854h;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cs */
/* compiled from: PG */
public final class C124894cs implements C46851e, C46852f {

    /* renamed from: a */
    public static final C59071e f344596a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cs");

    /* renamed from: b */
    public final VoiceMatchEnrollmentFragment f344597b;

    /* renamed from: c */
    public final C124848bs f344598c;

    /* renamed from: d */
    public final C124921r f344599d;

    /* renamed from: e */
    public C0816c f344600e;

    /* renamed from: f */
    public final C124669ch f344601f;

    /* renamed from: g */
    public final C46439e f344602g;

    /* renamed from: h */
    public final C46855i f344603h;

    /* renamed from: i */
    public OobeActivityViewModel f344604i;

    /* renamed from: j */
    public C46854h f344605j;

    /* renamed from: k */
    public C142324bc f344606k = C142324bc.f386113s;

    /* renamed from: l */
    public boolean f344607l = false;

    /* renamed from: m */
    public final C46440f f344608m = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x c = C124894cs.f344596a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceMatchFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36353)).mo56386p("VoiceMatch update failed");
            C124894cs.this.mo106710c();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C58976aa aaVar = C58975e.f156826a;
            C124894cs.this.mo106710c();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: n */
    public int f344609n = 1;

    /* renamed from: o */
    private final C46485f f344610o;

    public C124894cs(VoiceMatchEnrollmentFragment voiceMatchEnrollmentFragment, C124848bs bsVar, C46485f fVar, C124921r rVar, C124669ch chVar, C46439e eVar, C46855i iVar) {
        this.f344597b = voiceMatchEnrollmentFragment;
        this.f344598c = bsVar;
        this.f344610o = fVar;
        this.f344599d = rVar;
        this.f344601f = chVar;
        this.f344602g = eVar;
        this.f344603h = iVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        return new C46885y("assistant.bisto.VoiceMatch");
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C124669ch chVar = this.f344601f;
        return C70876o.m103760a(chVar.f189039a.mo39510a(C124673cl.m204364b(), chVar.f189040b), C62912at.f169862a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo106710c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f344610o.mo50482c(this.f344597b).mo50509e(R.id.assistant_bisto_oobe_next, this.f344598c);
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = f344596a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceMatchFragment");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36357)).mo56386p("VMDisabledByAdmin check failed");
        mo106710c();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C124690db dbVar = (C124690db) obj;
        C59104x b = f344596a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceMatchFragment");
        ((C59052c) ((C59052c) b).mo56372aa(36358)).mo56387q("VMDisabledByAdmin: %d", dbVar.f343995b);
        int i = dbVar.f343995b;
        if (i == 0 || i == 3 || i == 4 || i == 5) {
            C124844bo boVar = this.f344598c.f344439b;
            if (boVar == null) {
                boVar = C124844bo.f344417m;
            }
            boolean z = boVar.f344429k;
            ac acVar = ac.d;
            if (z) {
                acVar = ac.e;
            }
            this.f344604i.mo106637a().mo106662b("VoiceMatch");
            C0816c cVar = this.f344600e;
            C74554t i2 = C74555u.m120572i();
            i2.mo70868b(s.a);
            C74543ad d = C74544ae.m120523d();
            d.mo70851c(af.f);
            q f = C74553r.m120558f();
            f.e(this.f344606k.f386131q);
            f.c(z);
            C142340bs bsVar = this.f344606k.f386119e;
            if (bsVar == null) {
                bsVar = C142340bs.f386174C;
            }
            f.d(bsVar.f386177B);
            f.b(true);
            d.mo70850b(f.a());
            i2.mo70872f(d.mo70849a());
            i2.mo70869c(C9439b.BISTO_ONBOARDING);
            aa c = C74542ab.m120516c();
            c.c(acVar);
            i2.mo70871e(c.a());
            cVar.mo526b(i2.mo70882h());
            this.f344597b.requireActivity().overridePendingTransition(0, 0);
            return;
        }
        mo106710c();
    }
}
