package com.google.android.apps.gsa.staticplugins.p7614bx.p7626g;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7624f.C97463a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.g.d */
/* compiled from: PG */
public final class C97472d extends C86734a implements C97463a {

    /* renamed from: a */
    public final Context f272167a;

    /* renamed from: b */
    public final C68214a f272168b;

    /* renamed from: c */
    private final C22871g f272169c;

    /* renamed from: f */
    private final C42876ab f272170f;

    public C97472d(Context context, C22871g gVar, C68214a aVar, C42876ab abVar) {
        super(C118575h.WORKER_MENU, "menu");
        this.f272167a = context;
        this.f272169c = gVar;
        this.f272168b = aVar;
        this.f272170f = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo90722a() {
        return this.f272170f.mo46042d();
    }

    /* renamed from: b */
    public final C60870cx mo90723b() {
        return this.f272169c.mo28201a("Try get incognito search intent", new C97471c(this));
    }

    /* renamed from: c */
    public final C60870cx mo90724c(boolean z) {
        return this.f272170f.mo46039a(new C97469a(z), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo90725d() {
        return this.f272170f.mo46039a(new C97470b(), C60826bg.f164896a);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
