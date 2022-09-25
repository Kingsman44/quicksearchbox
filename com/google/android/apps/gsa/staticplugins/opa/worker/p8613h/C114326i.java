package com.google.android.apps.gsa.staticplugins.opa.worker.p8613h;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.i.h;
import com.google.android.apps.gsa.assistant.shared.k.k;
import com.google.android.apps.gsa.assistant.shared.p5818i.C73875i;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6602bn.C84907a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.chathead.C108135a;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.util.C113880k;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.h.i */
/* compiled from: PG */
public final class C114326i extends C86734a implements C84907a {

    /* renamed from: a */
    public final C108135a f316985a;

    /* renamed from: b */
    private final Context f316986b;

    /* renamed from: c */
    private final C86124t f316987c;

    /* renamed from: f */
    private final C68214a f316988f;

    /* renamed from: g */
    private final Optional f316989g;

    /* renamed from: h */
    private final C60950i f316990h;

    /* renamed from: i */
    private final Optional f316991i;

    public C114326i(Context context, C86124t tVar, C68214a aVar, Optional optional, C60950i iVar, C108135a aVar2, Optional optional2) {
        super(C118575h.WORKER_NUDGE_UI, "nudgeui");
        this.f316986b = context;
        this.f316987c = tVar;
        this.f316988f = aVar;
        this.f316989g = optional;
        this.f316990h = iVar;
        this.f316985a = aVar2;
        this.f316991i = optional2;
    }

    /* renamed from: a */
    public final C60870cx mo78577a(String str) {
        if (this.f316991i.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx g = C60922j.m93044g(((k) ((C68214a) this.f316991i.get()).mo27525b()).g(str), new C114325h(this), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: b */
    public final C60870cx mo78578b(String str) {
        if (!this.f316987c.mo79746e(C90037cp.f248462aq)) {
            return C60866ct.f164955a;
        }
        if (this.f316991i.isEmpty()) {
            return C60866ct.f164955a;
        }
        int identifier = this.f316986b.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier == 0 || this.f316986b.getResources().getInteger(identifier) != 2) {
            return ((k) ((C68214a) this.f316991i.get()).mo27525b()).a(str, false);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo78579c() {
        return ((C73875i) ((C68214a) this.f316989g.get()).mo27525b()).mo65349a();
    }

    /* renamed from: d */
    public final C60870cx mo78580d(String str) {
        if (this.f316991i.isEmpty()) {
            return C118826c.f331423b;
        }
        return ((k) ((C68214a) this.f316991i.get()).mo27525b()).b(str);
    }

    /* renamed from: e */
    public final C60870cx mo78581e(int i, String str) {
        if (this.f316991i.isEmpty()) {
            return C118826c.f331423b;
        }
        return ((k) ((C68214a) this.f316991i.get()).mo27525b()).c(C89849ae.m146281a(i), Duration.ofSeconds(this.f316987c.mo79743a(C90037cp.f248559ch)), str);
    }

    /* renamed from: f */
    public final C60870cx mo78582f(String str, String str2, long j) {
        if (this.f316991i.isEmpty()) {
            return C118826c.f331423b;
        }
        return ((k) ((C68214a) this.f316991i.get()).mo27525b()).d(str, str2, this.f316990h.mo57444a().plusSeconds(j));
    }

    /* renamed from: g */
    public final C60870cx mo78583g() {
        if (!((C113880k) this.f316988f.mo27525b()).mo100740f()) {
            C113880k kVar = (C113880k) this.f316988f.mo27525b();
            if (((C86124t) kVar.f315308c.mo27525b()).mo79746e(C90037cp.f248607dy)) {
                ((h) kVar.f315312g.mo27525b()).a(kVar.mo100740f());
            } else {
                ((C106391p) kVar.f315311f.mo27525b()).mo95498g(kVar.mo100740f());
            }
            return C118826c.f331423b;
        }
        ((C73875i) ((C68214a) this.f316989g.get()).mo27525b()).mo65350b();
        return C118826c.f331423b;
    }

    /* renamed from: h */
    public final void mo78584h() {
        this.f316985a.mo96474g();
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
