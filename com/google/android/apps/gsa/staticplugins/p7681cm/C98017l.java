package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6502ae.C84464e;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86293ai;
import com.google.android.apps.gsa.search.core.preferences.C86321l;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.l */
/* compiled from: PG */
public final class C98017l implements C86321l {

    /* renamed from: a */
    private final C97987bk f273684a;

    /* renamed from: b */
    private final C98024s f273685b;

    /* renamed from: c */
    private final C98006cc f273686c;

    /* renamed from: d */
    private final C97941ab f273687d;

    /* renamed from: e */
    private final C69464a f273688e;

    /* renamed from: f */
    private final C69464a f273689f;

    public C98017l(C97987bk bkVar, C98024s sVar, C98006cc ccVar, C97941ab abVar, C69464a aVar, C69464a aVar2) {
        this.f273684a = bkVar;
        this.f273685b = sVar;
        this.f273686c = ccVar;
        this.f273687d = abVar;
        this.f273688e = aVar;
        this.f273689f = aVar2;
    }

    /* renamed from: a */
    public final C88990e mo80042a(Activity activity, boolean z, boolean z2) {
        C98024s sVar = this.f273685b;
        C97986bj a = this.f273684a.mo90864a(activity, z, z2);
        C98006cc ccVar = this.f273686c;
        activity.getClass();
        C86293ai aiVar = (C86293ai) ccVar.f273660a.mo17428b();
        aiVar.getClass();
        C22871g gVar = (C22871g) ccVar.f273661b.mo17428b();
        gVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) ccVar.f273662c).f184585a);
        a2.getClass();
        C98005cb cbVar = new C98005cb(activity, aiVar, gVar, a2);
        activity.getClass();
        C84418a aVar = (C84418a) sVar.f273713a.mo17428b();
        aVar.getClass();
        C84464e eVar = (C84464e) sVar.f273714b.mo17428b();
        eVar.getClass();
        ((C84515a) sVar.f273715c.mo17428b()).getClass();
        C86127w wVar = (C86127w) sVar.f273716d.mo17428b();
        wVar.getClass();
        C98020o oVar = (C98020o) sVar.f273717e.mo17428b();
        oVar.getClass();
        C86124t tVar = (C86124t) sVar.f273718f.mo17428b();
        tVar.getClass();
        C98007cd cdVar = (C98007cd) sVar.f273719g.mo17428b();
        cdVar.getClass();
        return new C98023r(activity, aVar, eVar, wVar, a, oVar, cbVar, tVar, cdVar);
    }

    /* renamed from: b */
    public final C88990e mo80043b(Context context) {
        C97941ab abVar = this.f273687d;
        context.getClass();
        C97964ax axVar = (C97964ax) abVar.f273481a.mo17428b();
        axVar.getClass();
        return new C97940aa(context, axVar);
    }

    /* renamed from: c */
    public final C88990e mo80044c(Activity activity, C90932cb cbVar, C90931ca caVar) {
        return new C97980bd(activity, activity.getContentResolver(), cbVar, caVar);
    }

    /* renamed from: d */
    public final C88990e mo80045d() {
        return (C88990e) this.f273688e.mo17428b();
    }

    /* renamed from: e */
    public final C88990e mo80046e(Activity activity, boolean z, boolean z2) {
        return this.f273684a.mo90864a(activity, z, z2);
    }

    /* renamed from: f */
    public final C88990e mo80047f() {
        return (C88990e) this.f273689f.mo17428b();
    }

    /* renamed from: g */
    public final C88990e mo80048g(Context context, C84418a aVar, C84464e eVar, C86127w wVar, C86124t tVar) {
        return new C98000bx(context, aVar, eVar, wVar, tVar);
    }

    /* renamed from: h */
    public final C88990e mo80049h() {
        return new C97997bu();
    }
}
