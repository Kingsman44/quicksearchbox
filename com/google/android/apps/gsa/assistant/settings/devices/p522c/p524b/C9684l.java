package com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b;

import android.accounts.Account;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51756ci;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65797ca;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65806cj;
import dagger.C68214a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.b.l */
/* compiled from: PG */
public final class C9684l implements C21851cg {

    /* renamed from: a */
    public static final C58974d f33469a = C58974d.m91136j();

    /* renamed from: f */
    private static final C65753ak f33470f = C65753ak.PRIVACY_SETTINGS;

    /* renamed from: g */
    private static final String f33471g = C65806cj.PERSONAL_RESULTS.name();

    /* renamed from: b */
    public final C22871g f33472b;

    /* renamed from: c */
    public final Map f33473c;

    /* renamed from: d */
    public final Optional f33474d;

    /* renamed from: e */
    public boolean f33475e = false;

    /* renamed from: h */
    private final C22871g f33476h;

    /* renamed from: i */
    private final C68214a f33477i;

    /* renamed from: j */
    private final i f33478j;

    /* renamed from: k */
    private final u f33479k;

    /* renamed from: l */
    private C60870cx f33480l = C60866ct.f164955a;

    /* renamed from: m */
    private final C91123v f33481m;

    public C9684l(C86054o oVar, C90821bm bmVar, C91123v vVar, C68214a aVar, i iVar, u uVar, C22871g gVar, Optional optional) {
        C22871g a = bmVar.mo85163a(C9683k.class);
        this.f33472b = a;
        this.f33473c = new ConcurrentHashMap();
        this.f33481m = vVar;
        this.f33477i = aVar;
        this.f33478j = iVar;
        this.f33479k = uVar;
        this.f33476h = gVar;
        this.f33474d = optional;
        this.f33480l = a.mo28202b("initPersonalResponseAllowed", new C9678f(this, oVar));
    }

    /* renamed from: a */
    public final C60870cx mo17952a(Account account) {
        return C60856cj.m92893b(this.f33480l).mo57334a(new C9676d(this, account), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo17953b(String str) {
        return this.f33476h.mo28209i(this.f33478j.a(str, f33470f, f33471g, C63662ac.f172144a, C65798cb.f178854e), "readPersonalResponseStatusFromGeller", C9677e.f33458a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Boolean mo17954c(Account account) {
        try {
            C60856cj.m92909r(this.f33480l);
        } catch (CancellationException | ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f33469a.mo56226d()).mo56382g(e)).mo56372aa(476)).mo56386p("Failed to read PersonalResponse data");
        }
        Boolean bool = (Boolean) this.f33473c.get(account.name);
        return bool == null ? Boolean.valueOf(mo17958g()) : bool;
    }

    /* renamed from: d */
    public final void mo17955d(String str, boolean z) {
        for (C9685m a : (Set) this.f33477i.mo27525b()) {
            a.mo17961a(str, z);
        }
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar == C65753ak.PRIVACY_SETTINGS && account != null) {
            ((C58970a) ((C58970a) f33469a.mo56224b()).mo56372aa(479)).mo56386p("PR status onSyncCompleted called");
            this.f33472b.mo28209i(mo17953b(account.name), "updatePersonalResponseAllowed", new C9681i(this, account));
        }
    }

    /* renamed from: f */
    public final void mo17957f(Account account, boolean z) {
        C51756ci ciVar;
        Account account2 = account;
        boolean z2 = z;
        long currentTimeMillis = System.currentTimeMillis();
        C59104x b = f33469a.mo56224b();
        Boolean valueOf = Boolean.valueOf(z);
        ((C58970a) ((C58970a) b).mo56372aa(480)).mo56389s("PR status to %s", valueOf);
        Boolean bool = (Boolean) this.f33473c.put(account2.name, valueOf);
        this.f33475e = true;
        C22871g gVar = this.f33472b;
        u uVar = this.f33479k;
        String str = account2.name;
        C65753ak akVar = f33470f;
        C65797ca caVar = (C65797ca) C65798cb.f178854e.createBuilder();
        C65806cj cjVar = C65806cj.PERSONAL_RESULTS;
        caVar.copyOnWrite();
        C65798cb cbVar = (C65798cb) caVar.instance;
        cbVar.f178859d = cjVar.f178896v;
        cbVar.f178856a |= 1;
        if (z2) {
            ciVar = C51756ci.ALL_PERSONAL_DATA;
        } else {
            ciVar = C51756ci.NO_PERSONAL_DATA;
        }
        caVar.copyOnWrite();
        C65798cb cbVar2 = (C65798cb) caVar.instance;
        cbVar2.f178858c = Integer.valueOf(ciVar.f135790e);
        cbVar2.f178857b = 2;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        String str2 = f33471g;
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        str2.getClass();
        azVar.f178795a |= 4;
        azVar.f178798d = str2;
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(currentTimeMillis);
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = micros;
        cVar.copyOnWrite();
        C65139d dVar2 = (C65139d) cVar.instance;
        dVar2.f176309a |= 2;
        dVar2.f176311c = 0;
        cVar.copyOnWrite();
        C65139d dVar3 = (C65139d) cVar.instance;
        dVar3.f176309a |= 4;
        dVar3.f176312d = 0;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C65139d dVar4 = (C65139d) cVar.build();
        dVar4.getClass();
        azVar2.f178796b = dVar4;
        azVar2.f178795a |= 1;
        C63062g gVar2 = (C63062g) C63070h.f170215c.createBuilder();
        gVar2.copyOnWrite();
        ((C63070h) gVar2.instance).f170217a = "type.googleapis.com/geller.oneplatform.PrivacySettingsState";
        C63088z byteString = ((C65798cb) caVar.build()).toByteString();
        gVar2.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar2.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar3 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar2.build();
        hVar.getClass();
        azVar3.f178799e = hVar;
        azVar3.f178795a |= 8;
        gVar.mo28211k(uVar.d(str, akVar, (C65768az) ayVar.build(), true), "setPersonalResponseAllowed", new C9682j(this, z2, bool, account2));
    }

    /* renamed from: g */
    public final boolean mo17958g() {
        return !this.f33481m.mo85390b();
    }

    @Deprecated
    /* renamed from: h */
    public final boolean mo17959h(Account account) {
        if (!this.f33480l.isDone()) {
            C91018d.m148680c();
            try {
                this.f33480l.get();
            } catch (InterruptedException | ExecutionException e) {
                ((C58970a) ((C58970a) ((C58970a) f33469a.mo56226d()).mo56382g(e)).mo56372aa(482)).mo56386p("Failed to read PersonalResponse data");
            }
        }
        Boolean bool = (Boolean) this.f33473c.get(account.name);
        if (bool != null) {
            return bool.booleanValue();
        }
        ((C58970a) ((C58970a) f33469a.mo56224b()).mo56372aa(481)).mo56386p("PR status returns the default value");
        return mo17958g();
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
