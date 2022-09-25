package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107489o;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107490p;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107491q;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107494t;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hs */
/* compiled from: PG */
final class C109254hs {

    /* renamed from: a */
    final C58833ax f304216a;

    /* renamed from: b */
    boolean f304217b;

    /* renamed from: c */
    final /* synthetic */ C109258hw f304218c;

    public C109254hs(C109258hw hwVar, C58833ax axVar) {
        this.f304218c = hwVar;
        this.f304216a = axVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo97708a(C52070ec ecVar) {
        mo97709b(C60856cj.m92900i(ecVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo97709b(C60870cx cxVar) {
        if (this.f304216a.mo56113h()) {
            C60856cj.m92911t(cxVar, new C109253hr(this), C60826bg.f164896a);
            this.f304217b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo97710c(Exception exc) {
        int i;
        if (this.f304216a.mo56113h()) {
            C107489o oVar = (C107489o) C107494t.f299090e.createBuilder();
            String str = (String) this.f304216a.mo56107c();
            oVar.copyOnWrite();
            C107494t tVar = (C107494t) oVar.instance;
            str.getClass();
            tVar.f299092a |= 1;
            tVar.f299095d = str;
            if (exc instanceof C62974ct) {
                i = 4;
            } else if (exc instanceof C22371a) {
                i = 3;
            } else if (exc instanceof C22534k) {
                i = 5;
            } else {
                i = exc instanceof C22428d ? 2 : 1;
            }
            C107490p pVar = (C107490p) C107491q.f299084d.createBuilder();
            pVar.copyOnWrite();
            C107491q qVar = (C107491q) pVar.instance;
            qVar.f299087b = i - 1;
            qVar.f299086a |= 1;
            if (exc.getMessage() != null) {
                String message = exc.getMessage();
                pVar.copyOnWrite();
                C107491q qVar2 = (C107491q) pVar.instance;
                message.getClass();
                qVar2.f299086a = 2 | qVar2.f299086a;
                qVar2.f299088c = message;
            }
            C107491q qVar3 = (C107491q) pVar.build();
            oVar.copyOnWrite();
            C107494t tVar2 = (C107494t) oVar.instance;
            qVar3.getClass();
            tVar2.f299094c = qVar3;
            tVar2.f299093b = 3;
            this.f304218c.mo97718h((C107494t) oVar.build());
            this.f304217b = true;
        }
    }
}
