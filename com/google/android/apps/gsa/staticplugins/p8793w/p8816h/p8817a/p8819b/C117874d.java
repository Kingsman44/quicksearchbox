package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8817a.p8819b;

import android.text.TextUtils;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85728p;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6491a.C84367m;
import com.google.android.apps.gsa.search.core.p6519al.p6630bz.p6631a.C85047b;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.android.libraries.gsa.conversation.p1852f.C22579f;
import com.google.android.libraries.gsa.conversation.p1852f.C22580g;
import com.google.android.libraries.gsa.conversation.p1852f.C22582i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.a.b.d */
/* compiled from: PG */
public final class C117874d implements C22580g {

    /* renamed from: a */
    private final C85596b f327133a;

    /* renamed from: b */
    private final C22871g f327134b;

    /* renamed from: c */
    private final C85728p f327135c;

    /* renamed from: d */
    private final int f327136d;

    /* renamed from: e */
    private final b f327137e;

    /* renamed from: f */
    private final Query f327138f;

    /* renamed from: g */
    private final C85047b f327139g;

    /* renamed from: h */
    private final C113812ca f327140h;

    public C117874d(C85596b bVar, C85047b bVar2, C22871g gVar, C85728p pVar, int i, C113812ca caVar, b bVar3, Query query) {
        this.f327133a = bVar;
        this.f327139g = bVar2;
        this.f327134b = gVar;
        this.f327135c = pVar;
        this.f327136d = i;
        this.f327140h = caVar;
        this.f327137e = bVar3;
        this.f327138f = query;
    }

    /* renamed from: a */
    public final C22579f mo27690a(C52081en enVar, C58833ax axVar, C58833ax axVar2) {
        C60870cx cxVar;
        C60856cj.m92900i(C58836b.f156633a);
        Query query = this.f327138f;
        if (axVar2.mo56113h()) {
            C22582i iVar = (C22582i) axVar2.mo56107c();
            if (iVar instanceof C84367m) {
                query = ((C84367m) iVar).f229625a;
            }
        }
        Query aw = query.mo84245H(0, false, (QueryTriggerType) null).mo84238A().mo84309au().mo84275aL(this.f327140h.f315214a).mo84304ap(enVar.toByteArray()).mo84311aw("android.opa.extra.CONVERSATION_CLIENT_TYPE", this.f327136d);
        if (axVar.mo56113h()) {
            aw = aw.mo84311aw("android.opa.extra.TRIGGERED_BY", 58);
            if (axVar.mo56107c() instanceof C84349ah) {
                Query query2 = ((C84349ah) axVar.mo56107c()).f229566a;
                C58976aa aaVar = C58975e.f156826a;
                if (query2 != null) {
                    if (query2.mo84404ck()) {
                        aw = aw.mo84246I();
                    }
                    if (query2.mo84466dt()) {
                        aw = aw.mo84291ab();
                    }
                    if (query2.mo84363bw("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN")) {
                        aw = aw.mo84302an("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN", true);
                    }
                    String bf = query2.mo84347bf("user-agent-suffix");
                    if (bf != null) {
                        aw = aw.mo84278aO("user-agent-suffix", bf);
                    }
                    amo amo = query2.f252760R;
                    if (amo != null) {
                        aw = aw.mo84272aI(amo);
                    }
                    if (query2.mo84363bw("android.opa.extra.MINI_PLATE_ENABLED")) {
                        aw = aw.mo84302an("android.opa.extra.MINI_PLATE_ENABLED", true);
                    }
                    String bj = query2.mo84351bj();
                    if (!TextUtils.isEmpty(bj)) {
                        aw = aw.mo84278aO("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME", bj);
                    }
                    aw = aw.mo84260X(query2.mo84337bV());
                }
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C84349ah ahVar = new C84349ah(aw);
        if (!this.f327135c.mo79378b() || !this.f327137e.g()) {
            this.f327137e.c();
            cxVar = this.f327133a.mo20302b(enVar);
        } else {
            this.f327137e.d();
            cxVar = this.f327134b.mo28210j(this.f327139g.mo78669a(aw), "[Pop] getResponse()", C117872b.f327130a);
        }
        return new C117873c(cxVar, ahVar);
    }
}
