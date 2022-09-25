package com.google.android.apps.gsa.staticplugins.chime;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6761u.C85601a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91385o;
import com.google.android.apps.gsa.staticplugins.chime.p7661f.C97700a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.u */
/* compiled from: PG */
public final class C97739u extends C86734a implements C85601a {

    /* renamed from: a */
    public static final C59071e f272902a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.u");

    /* renamed from: b */
    public final Context f272903b;

    /* renamed from: c */
    public final C91385o f272904c;

    /* renamed from: f */
    public final C97700a f272905f;

    /* renamed from: g */
    private final C22871g f272906g;

    /* renamed from: h */
    private final C22871g f272907h;

    public C97739u(Context context, C97700a aVar, C91385o oVar, C22871g gVar, C22871g gVar2) {
        super(C118575h.WORKER_CHIME, "chime");
        this.f272903b = context;
        this.f272905f = aVar;
        this.f272904c = oVar;
        this.f272906g = gVar;
        this.f272907h = gVar2;
    }

    /* renamed from: a */
    public final C60870cx mo79090a(boolean z) {
        return this.f272907h.mo28201a("ChimeWorker#registerUser", new C97736r(this, z));
    }

    /* renamed from: b */
    public final void mo79091b() {
        C60856cj.m92911t(mo79090a(true), C47810es.m84974n(new C97738t()), C60826bg.f164896a);
    }

    /* renamed from: ib */
    public final void mo80350ib() {
        this.f272906g.mo28212l("ChimeWorker#initialize", new C97737s(this));
        mo79090a(true);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
