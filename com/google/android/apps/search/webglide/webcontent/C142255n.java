package com.google.android.apps.search.webglide.webcontent;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.search.webglide.p10699b.C142176g;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.apps.search.webglide.p10701d.C142201a;
import com.google.android.apps.search.webglide.p10702e.p10703a.C142218b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.webglide.webcontent.n */
/* compiled from: PG */
public final class C142255n {

    /* renamed from: a */
    public final AccountId f385923a;

    /* renamed from: b */
    public final C43377v f385924b;

    /* renamed from: c */
    public final Activity f385925c;

    /* renamed from: d */
    public final C142249h f385926d;

    /* renamed from: e */
    public final C28306ab f385927e;

    /* renamed from: f */
    public final C28443m f385928f;

    /* renamed from: g */
    public final C47770dh f385929g;

    /* renamed from: h */
    public final boolean f385930h;

    /* renamed from: i */
    public final C142185p f385931i;

    /* renamed from: j */
    public final C47449e f385932j;

    /* renamed from: k */
    public final C142176g f385933k;

    /* renamed from: l */
    public final C142201a f385934l;

    public C142255n(AccountId accountId, C43377v vVar, Activity activity, C142249h hVar, C28306ab abVar, C28443m mVar, C47770dh dhVar, boolean z, C142185p pVar, C47449e eVar, C142176g gVar, C142201a aVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(activity, "activity");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(gVar, "webglideExperimentFlags");
        this.f385923a = accountId;
        this.f385924b = vVar;
        this.f385925c = activity;
        this.f385926d = hVar;
        this.f385927e = abVar;
        this.f385928f = mVar;
        this.f385929g = dhVar;
        this.f385930h = z;
        this.f385931i = pVar;
        this.f385932j = eVar;
        this.f385933k = gVar;
        this.f385934l = aVar;
    }

    /* renamed from: a */
    public final void mo117094a(View view) {
        C28443m mVar = this.f385928f;
        C28440j h = C28442l.m53142h();
        h.mo33895b(C142218b.m230876a(this.f385924b.mo46468a().f113329b));
        mVar.mo33853c(h.mo33894a(), C28485y.m53234a(view));
    }
}
