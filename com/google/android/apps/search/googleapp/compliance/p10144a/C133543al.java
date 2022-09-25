package com.google.android.apps.search.googleapp.compliance.p10144a;

import android.app.Dialog;
import android.net.Uri;
import com.google.android.apps.search.googleapp.compliance.C133586ak;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61531o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.al */
/* compiled from: PG */
final class C133543al implements C133586ak {

    /* renamed from: a */
    public static final C59071e f363848a = C59071e.m91332i("com.google.android.apps.search.googleapp.compliance.a.al");

    /* renamed from: b */
    public final C42876ab f363849b;

    /* renamed from: c */
    public final C37215b f363850c;

    /* renamed from: d */
    public final C61531o f363851d;

    /* renamed from: e */
    public final List f363852e = new ArrayList();

    /* renamed from: f */
    public final C60950i f363853f;

    /* renamed from: g */
    public final AtomicReference f363854g = new AtomicReference((Object) null);

    /* renamed from: h */
    public final AtomicReference f363855h = new AtomicReference((Object) null);

    /* renamed from: i */
    public final AtomicReference f363856i = new AtomicReference((Object) null);

    /* renamed from: j */
    public final Executor f363857j;

    /* renamed from: k */
    public final Executor f363858k;

    public C133543al(C42876ab abVar, Executor executor, Executor executor2, C37215b bVar, C61531o oVar, C60950i iVar) {
        this.f363849b = abVar;
        this.f363857j = executor;
        this.f363858k = executor2;
        this.f363850c = bVar;
        this.f363851d = oVar;
        this.f363853f = iVar;
    }

    /* renamed from: k */
    public static Uri.Builder m216759k() {
        return Uri.parse("https://www.google.com").buildUpon();
    }

    /* renamed from: m */
    public static C61363ae m216760m(String str, String str2) {
        C61363ae aeVar = new C61363ae();
        aeVar.mo57932a(C61362ad.m93870b("User-Agent"), str);
        aeVar.mo57933b("GET");
        str2.getClass();
        aeVar.f165930a = str2;
        return aeVar;
    }

    /* renamed from: a */
    public final C60870cx mo111245a() {
        return this.f363849b.mo46042d();
    }

    /* renamed from: b */
    public final C60870cx mo111246b() {
        this.f363856i.set(new SettableFuture());
        return (C60870cx) Objects.requireNonNull((SettableFuture) this.f363856i.get());
    }

    /* renamed from: c */
    public final C60870cx mo111247c() {
        return C47633f.m84733g(this.f363849b.mo46042d()).mo51515h(C133537af.f363842a, this.f363858k);
    }

    /* renamed from: e */
    public final C60870cx mo111249e(C133546ao aoVar, C60870cx cxVar) {
        return C47633f.m84733g(this.f363849b.mo46039a(new C133532aa(aoVar), C60826bg.f164896a)).mo51516i(new C133533ab(this, cxVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final String mo111250f() {
        String str = (String) this.f363854g.get();
        this.f363854g.set((Object) null);
        return str;
    }

    /* renamed from: g */
    public final void mo111251g(Dialog dialog) {
        this.f363852e.add(dialog);
    }

    /* renamed from: h */
    public final void mo111252h() {
        if (!this.f363852e.isEmpty()) {
            List list = this.f363852e;
            list.remove(list.size() - 1);
        }
    }

    /* renamed from: i */
    public final void mo111253i() {
        this.f363854g.set((Object) null);
        ((SettableFuture) Objects.requireNonNull((SettableFuture) this.f363856i.get())).mo57356n(false);
    }

    /* renamed from: j */
    public final C60870cx mo111254j(int i, boolean z) {
        if (i - 1 != 0) {
            return this.f363849b.mo46039a(new C133539ah(z), C60826bg.f164896a);
        }
        return this.f363849b.mo46039a(new C133538ag(z), C60826bg.f164896a);
    }

    /* renamed from: l */
    public final C47633f mo111248d(C60870cx cxVar) {
        this.f363850c.mo19974a(C37182a.f98135gw);
        return C47633f.m84733g(cxVar).mo51516i(new C133541aj(this), this.f363857j).mo51516i(new C133542ak(this), this.f363857j).mo51516i(new C133573x(this), this.f363857j).mo51514f(Throwable.class, new C133574y(this), this.f363858k);
    }

    /* renamed from: n */
    public final C61365ag mo111256n(String str) {
        C61363ae m = m216760m((String) Objects.requireNonNull((String) this.f363855h.get()), str);
        m.mo57932a(C61362ad.m93870b("Cookie"), (String) Objects.requireNonNull((String) this.f363854g.get()));
        return new C61365ag(m);
    }
}
