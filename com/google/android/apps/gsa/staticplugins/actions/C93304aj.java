package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.shared.actions.C87500v;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88207tc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88209te;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.aj */
/* compiled from: PG */
public final class C93304aj {

    /* renamed from: a */
    public final C68214a f260195a;

    /* renamed from: b */
    public final C86610af f260196b;

    /* renamed from: c */
    public final C93298ad f260197c;

    /* renamed from: d */
    public final C90931ca f260198d;

    /* renamed from: e */
    public C87500v f260199e;

    /* renamed from: f */
    public boolean f260200f = false;

    public C93304aj(C86610af afVar, C68214a aVar, C93298ad adVar, C90931ca caVar) {
        this.f260196b = afVar;
        this.f260195a = aVar;
        this.f260197c = adVar;
        this.f260198d = caVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87626a(C88209te teVar) {
        C86610af afVar = this.f260196b;
        C87684al alVar = new C87684al(C88244um.REMOTE_ACTION_RESPONSE);
        alVar.mo81965b(C88207tc.f238430a, teVar);
        afVar.mo80228i(alVar.mo81964a());
        this.f260200f = false;
    }
}
