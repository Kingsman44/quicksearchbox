package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f;

import android.accounts.Account;
import com.google.android.apps.gsa.staticplugins.p7611bv.C97300w;
import com.google.android.libraries.p10923ac.p10924a.C146765h;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146800g;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146811h;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146852av;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax;
import com.google.android.libraries.p10923ac.p10925b.p10940g.C147052a;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147111h;
import com.google.android.libraries.p10923ac.p10947c.C147201c;
import com.google.android.libraries.p10923ac.p10947c.C147208j;
import com.google.android.libraries.p10923ac.p10947c.C147209k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10959c.p10960a.C147240a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a.C147271a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a.C147272b;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a.C147273c;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a.C147274d;
import com.google.android.libraries.p10923ac.p10971e.p10972a.C147331a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C64066dv;
import com.google.protos.p4895aw.p4902b.C64094l;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.q */
/* compiled from: PG */
public final class C147291q implements C147209k {

    /* renamed from: a */
    final AtomicReference f397557a = new AtomicReference();

    /* renamed from: b */
    private final Executor f397558b;

    /* renamed from: c */
    private final C147111h f397559c;

    /* renamed from: d */
    private final C147272b f397560d;

    /* renamed from: e */
    private final C147274d f397561e;

    /* renamed from: f */
    private final String f397562f;

    /* renamed from: g */
    private final Account f397563g;

    /* renamed from: h */
    private final C62917ay f397564h;

    /* renamed from: i */
    private final WeakHashMap f397565i = new WeakHashMap();

    /* renamed from: j */
    private final C64098p f397566j;

    /* renamed from: k */
    private final Object f397567k = new Object();

    public C147291q(Executor executor, C147111h hVar, C147272b bVar, C147274d dVar, String str, Account account, int i, int i2, C62917ay ayVar) {
        this.f397558b = executor;
        this.f397559c = hVar;
        this.f397560d = bVar;
        this.f397561e = dVar;
        this.f397562f = str;
        this.f397563g = account;
        this.f397564h = ayVar;
        this.f397566j = C146854ax.m239334d(i, i2, C63978ao.SYNC_FULL_SNAPSHOT);
    }

    /* renamed from: e */
    private final C60870cx m240178e(C147052a aVar, Executor executor) {
        C60870cx cxVar = (C60870cx) this.f397557a.get();
        C147331a aVar2 = new C147331a(aVar);
        if (cxVar == null) {
            executor.execute(aVar2);
        } else {
            cxVar.mo4106b(aVar2, executor);
        }
        return aVar2.f397716a;
    }

    /* renamed from: f */
    private final C147290p m240179f(C97300w wVar) {
        C147290p pVar;
        synchronized (this.f397565i) {
            pVar = (C147290p) this.f397565i.get(wVar);
            if (pVar == null) {
                pVar = new C147290p(this.f397558b);
                this.f397565i.put(wVar, pVar);
            }
        }
        return pVar;
    }

    /* renamed from: a */
    public final C60870cx mo124037a(C146765h hVar, C147208j jVar) {
        SettableFuture settableFuture;
        synchronized (this.f397567k) {
            C147111h hVar2 = this.f397559c;
            C146800g b = C147240a.m240096b(hVar);
            String str = this.f397562f;
            Account account = this.f397563g;
            C64098p pVar = this.f397566j;
            C146811h hVar3 = new C146811h(((C147201c) jVar).f397417a, ((C147201c) jVar).f397418b, ((C147201c) jVar).f397419c);
            C64094l lVar = (C64094l) C64095m.f173283c.createBuilder();
            C64066dv f = C146854ax.m239336f(hVar3);
            lVar.copyOnWrite();
            C64095m mVar = (C64095m) lVar.instance;
            f.getClass();
            mVar.f173286b = f;
            mVar.f173285a = 2;
            C60870cx e = m240178e(hVar2.mo123942a(b, str, account, pVar, (C64095m) lVar.build()), this.f397558b);
            settableFuture = new SettableFuture();
            settableFuture.mo57358p(C60922j.m93044g(e, new C147289o(this, settableFuture), C60826bg.f164896a));
            this.f397557a.set(settableFuture);
        }
        return settableFuture;
    }

    /* renamed from: b */
    public final C60870cx mo124038b() {
        return mo124037a(C146765h.f396299g, C147208j.m240058d(0, (Long) null, (Long) null));
    }

    /* renamed from: c */
    public final C60870cx mo124039c(C97300w wVar) {
        C147290p f = m240179f(wVar);
        C147272b bVar = this.f397560d;
        C64098p pVar = this.f397566j;
        Account account = this.f397563g;
        String str = this.f397562f;
        C147294t a = f.mo124081a(wVar, this.f397564h);
        C146852av avVar = (C146852av) bVar.f397515a.mo17428b();
        avVar.getClass();
        pVar.getClass();
        return m240178e(new C147271a(avVar, pVar, account, str, a), f.f397555a);
    }

    /* renamed from: d */
    public final void mo124040d(C97300w wVar) {
        C147290p f = m240179f(wVar);
        C147274d dVar = this.f397561e;
        C64098p pVar = this.f397566j;
        Account account = this.f397563g;
        C147294t a = f.mo124081a(wVar, this.f397564h);
        C146852av avVar = (C146852av) dVar.f397520a.mo17428b();
        avVar.getClass();
        pVar.getClass();
        m240178e(new C147273c(avVar, pVar, account, a), f.f397555a);
    }
}
