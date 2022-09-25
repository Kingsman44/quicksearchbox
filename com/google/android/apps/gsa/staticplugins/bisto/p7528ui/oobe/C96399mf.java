package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.h.s.q;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74543ad;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74553r;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124528i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.p10712d.C142340bs;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mf */
/* compiled from: PG */
public final class C96399mf extends C96363kx {

    /* renamed from: b */
    public C124528i f269691b;

    /* renamed from: c */
    public C68214a f269692c;

    /* renamed from: d */
    public C96094ay f269693d;

    /* renamed from: e */
    public C86124t f269694e;

    /* renamed from: f */
    public C83893b f269695f;

    /* renamed from: g */
    public C89635f f269696g;

    /* renamed from: h */
    public C60105ky f269697h;

    /* renamed from: i */
    public C96089at f269698i;

    /* renamed from: j */
    public C96325jm f269699j;

    /* renamed from: k */
    public Bundle f269700k;

    /* renamed from: l */
    private boolean f269701l = false;

    /* renamed from: m */
    private boolean f269702m;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "VoiceMatch";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        C58976aa aaVar = C58975e.f156826a;
        String str = this.f269693d.f269039a;
        if (str != null) {
            C124548d b = ((C89492cd) this.f269692c.mo27525b()).mo83401b(str);
            if (b == null || b.mo106520r() != C124633az.OOBE_FINISHED) {
                ((C89492cd) this.f269692c.mo27525b()).mo83394aj(str, (C124636bb) null, C124633az.OOBE_IN_PROGRESS);
            }
            if (i == 1321 && i2 == -1) {
                ((C95299e) this.f269603D.mo27525b()).f266647b.mo57066b("VoiceMatch-OK");
                z = true;
            } else {
                ((C95299e) this.f269603D.mo27525b()).f266647b.mo57066b("VoiceMatch-Skip");
                z = false;
            }
            if (this.f269702m) {
                this.f269696g.mo83522f(this.f269695f.mo77278a(), str, z);
            } else {
                this.f269691b.mo90176d(str, z);
            }
            if (z || !C60105ky.ANDROID_OOBE_COMPANION_VOICE_MATCH_ONLY.equals(this.f269697h)) {
                mo77318iT().mo77312a();
                return;
            }
            this.f269698i.mo89938a(3);
            mo77318iT().mo77313b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f269701l = bundle.getBoolean("voice_match_completed");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C124548d b;
        String str = this.f269693d.f269039a;
        if (str != null && ((b = ((C89492cd) this.f269692c.mo27525b()).mo83401b(str)) == null || b.mo106520r() != C124633az.OOBE_FINISHED)) {
            ((C89492cd) this.f269692c.mo27525b()).mo83394aj(str, (C124636bb) null, C124633az.OOBE_EXTERNAL);
        }
        return null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("voice_match_completed", this.f269701l);
    }

    public final void onStart() {
        C124548d dVar;
        ac acVar;
        super.onStart();
        if (!this.f269701l) {
            String str = this.f269693d.f269039a;
            if (str == null) {
                dVar = null;
            } else {
                dVar = ((C89492cd) this.f269692c.mo27525b()).mo83401b(str);
            }
            boolean z = false;
            boolean z2 = dVar != null && dVar.mo106513k() == C124719q.GACS_DEVICE;
            this.f269702m = z2;
            boolean z3 = z2 && dVar.mo106484Y() && dVar.mo106497ak();
            Bundle bundle = this.f269700k;
            boolean z4 = bundle != null && bundle.getBoolean("dark_theme");
            C142340bs bsVar = this.f269699j.f269538a.f269047b.f386119e;
            if (bsVar == null) {
                bsVar = C142340bs.f386174C;
            }
            boolean z5 = bsVar.f386177B;
            if (!z4 && this.f269694e.mo79746e(C90122ft.f250870i)) {
                z = true;
            }
            if (z) {
                acVar = ac.b;
            } else if (z4) {
                acVar = ac.e;
            } else {
                acVar = ac.a;
            }
            C74554t i = C74555u.m120572i();
            i.mo70868b(s.a);
            C74543ad d = C74544ae.m120523d();
            d.mo70851c(af.f);
            q f = C74553r.m120558f();
            f.e(z3);
            f.c(z4);
            f.d(z5);
            f.b(true);
            d.mo70850b(f.a());
            i.mo70872f(d.mo70849a());
            i.mo70869c(C9439b.BISTO_ONBOARDING);
            aa c = C74542ab.m120516c();
            c.c(acVar);
            i.mo70871e(c.a());
            startActivityForResult(i.mo70882h(), 1321);
            this.f269701l = true;
        }
    }
}
