package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90068dt;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101771k;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101862c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102169bm;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102170bn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aj */
/* compiled from: PG */
public final class C101646aj implements C101771k {

    /* renamed from: a */
    public static final C58485gu f283629a = C58485gu.m89853v(C101773m.UNICORN_GET_YOUR_PARENT_SCREEN, C101773m.PARENT_SELECTOR, C101773m.PARENT_REAUTH_PERMISSION, C101773m.STRUCTURE_LEVEL_ASSISTANT_VOICE_MATCH_SCREEN, C101773m.FRESH_ENROLL_SCREEN, C101773m.PROGRESS_UPDATE_SCREEN, C101773m.HANDBACK_TO_PARENT_SCREEN, C101773m.VAA_CONSENT_SCREEN);

    /* renamed from: b */
    public static final C59071e f283630b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aj");

    /* renamed from: c */
    public final C74555u f283631c;

    /* renamed from: d */
    public final C68214a f283632d;

    /* renamed from: e */
    public final C101860a f283633e;

    /* renamed from: f */
    public final C101862c f283634f;

    /* renamed from: g */
    public final C68214a f283635g;

    /* renamed from: h */
    public final ei f283636h;

    /* renamed from: i */
    public final C101636a f283637i;

    /* renamed from: j */
    public final C101497ae f283638j;

    /* renamed from: k */
    final ArrayDeque f283639k = new ArrayDeque();

    /* renamed from: l */
    private final C86124t f283640l;

    /* renamed from: m */
    private final C102170bn f283641m;

    public C101646aj(C68214a aVar, C74555u uVar, C101860a aVar2, C101862c cVar, C68214a aVar3, C86124t tVar, ei eiVar, C101636a aVar4, C101497ae aeVar, C102170bn bnVar) {
        this.f283631c = uVar;
        this.f283632d = aVar;
        this.f283633e = aVar2;
        this.f283634f = cVar;
        this.f283640l = tVar;
        this.f283635g = aVar3;
        this.f283636h = eiVar;
        this.f283637i = aVar4;
        this.f283638j = aeVar;
        this.f283641m = bnVar;
    }

    /* renamed from: a */
    public final C101773m mo92457a() {
        if (this.f283639k.isEmpty()) {
            return null;
        }
        return (C101773m) this.f283639k.removeFirst();
    }

    /* renamed from: b */
    public final void mo92458b() {
        if (this.f283631c.mo70888f().mo70866c() != 1) {
            ArrayDeque clone = this.f283639k.clone();
            clone.remove(C101773m.STRUCTURE_LEVEL_ASSISTANT_ALREADY_ENABLED_SCREEN);
            if (!clone.isEmpty()) {
                C59104x b = f283630b.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SLAFlow");
                ((C59052c) ((C59052c) b).mo56372aa(20402)).mo56386p("Adding confirmation screen");
                this.f283639k.addLast(C101773m.STRUCTURE_LEVEL_ASSISTANT_CONFIRMATION_SCREEN);
            }
        }
    }

    /* renamed from: c */
    public final void mo92459c() {
        this.f283639k.addAll(f283629a);
        if (this.f283640l.mo79746e(C90068dt.f249706a)) {
            this.f283639k.remove(C101773m.PARENT_SELECTOR);
        } else {
            this.f283639k.remove(C101773m.PARENT_REAUTH_PERMISSION);
        }
        if (!this.f283638j.mo92334g()) {
            this.f283639k.remove(C101773m.UNICORN_GET_YOUR_PARENT_SCREEN);
            this.f283639k.remove(C101773m.PARENT_REAUTH_PERMISSION);
            this.f283639k.remove(C101773m.PARENT_SELECTOR);
            this.f283639k.remove(C101773m.HANDBACK_TO_PARENT_SCREEN);
        }
        if (this.f283638j.mo92331d()) {
            this.f283639k.remove(C101773m.UNICORN_GET_YOUR_PARENT_SCREEN);
            this.f283639k.remove(C101773m.PARENT_REAUTH_PERMISSION);
            this.f283639k.remove(C101773m.PARENT_SELECTOR);
        }
        if (this.f283633e.f284134a.get()) {
            this.f283639k.remove(C101773m.FRESH_ENROLL_SCREEN);
            if (this.f283638j.mo92334g()) {
                this.f283639k.remove(C101773m.HANDBACK_TO_PARENT_SCREEN);
            }
        }
        if (this.f283641m.mo92922a() == C102169bm.NONE) {
            this.f283639k.remove(C101773m.VAA_CONSENT_SCREEN);
        }
    }
}
