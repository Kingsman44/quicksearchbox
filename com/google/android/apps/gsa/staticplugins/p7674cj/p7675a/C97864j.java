package com.google.android.apps.gsa.staticplugins.p7674cj.p7675a;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6622bv.C85028a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cj.a.j */
/* compiled from: PG */
public final class C97864j extends C86734a implements C85028a {

    /* renamed from: a */
    public static final C59071e f273273a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cj.a.j");

    /* renamed from: b */
    public final Context f273274b;

    /* renamed from: c */
    public final C22871g f273275c;

    /* renamed from: f */
    public final C22871g f273276f;

    /* renamed from: g */
    public final C22871g f273277g;

    /* renamed from: h */
    public final C68214a f273278h;

    public C97864j(Context context, C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar) {
        super(C118575h.WORKER_PERSONAL_CONTEXT_BLOCK, "personalcontextblock");
        this.f273274b = context;
        this.f273275c = gVar;
        this.f273276f = gVar2;
        this.f273278h = aVar;
        this.f273277g = gVar3;
    }

    /* renamed from: a */
    public final void mo78660a(long j) {
        C90877ak.m148481o(C60922j.m93045h(this.f273276f.mo28201a("get-account", new C97856b(this)), new C97857c(this, j), C60826bg.f164896a), "PersonalContextWorker", "Successfully called PostVisitBadge remote service.", "Failed to call PostVisitBadge remote service.");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
