package com.google.android.libraries.p10923ac.p10925b.p10942i;

import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97255k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58838bb;
import com.google.common.base.C58885cv;
import dagger.C68214a;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.android.libraries.ac.b.i.ar */
/* compiled from: PG */
public final class C147073ar {

    /* renamed from: a */
    final ReadWriteLock f397111a = new ReentrantReadWriteLock(true);

    /* renamed from: b */
    public final C68214a f397112b;

    /* renamed from: c */
    public final ThreadFactory f397113c;

    /* renamed from: d */
    public volatile boolean f397114d;

    /* renamed from: e */
    public final C68214a f397115e;

    /* renamed from: f */
    public final C147091n f397116f;

    public C147073ar(C68214a aVar, C147091n nVar, ThreadFactory threadFactory, C68214a aVar2) {
        this.f397112b = aVar;
        this.f397116f = nVar;
        this.f397113c = threadFactory;
        this.f397115e = aVar2;
    }

    /* renamed from: a */
    public final C147077av mo123903a() {
        C147064ai aiVar = new C147064ai(this);
        C58838bb.m90884s(!aiVar.f397093h.f397114d, "Transaction manager is closed");
        if (C147266a.m240135f()) {
            aiVar.f397093h.f397111a.readLock().lock();
        }
        aiVar.f397090e = aiVar.f397093h.f397116f.mo123913a();
        return aiVar;
    }

    /* renamed from: b */
    public final C147078aw mo123904b() {
        if (((Boolean) ((C58885cv) C97255k.m160960a()).f156729a).booleanValue()) {
            C147072aq aqVar = new C147072aq(this);
            C58838bb.m90884s(!aqVar.f397108i.f397114d, "Transaction manager is closed");
            aqVar.f397108i.f397111a.writeLock().lock();
            aqVar.f397107h = Thread.currentThread().getId();
            aqVar.f397090e = aqVar.f397108i.f397116f.mo123914b();
            return aqVar;
        }
        C147069an anVar = new C147069an(this);
        C58838bb.m90884s(!anVar.f397106k.f397114d, "Transaction manager is closed");
        anVar.f397106k.f397111a.writeLock().lock();
        anVar.f397090e = anVar.f397106k.f397116f.mo123914b();
        anVar.f397104i = Executors.newSingleThreadExecutor(anVar.f397106k.f397113c);
        return anVar;
    }
}
