package com.google.android.libraries.performance.primes.metrics.p2406c;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Debug;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71198ah;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71199ai;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71201ak;

/* renamed from: com.google.android.libraries.performance.primes.metrics.c.h */
/* compiled from: PG */
final class C31330h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C31331i f84352a;

    /* renamed from: b */
    private final long f84353b;

    public C31330h(C31331i iVar, long j) {
        this.f84352a = iVar;
        this.f84353b = j;
    }

    public final void run() {
        C31324b bVar = (C31324b) this.f84352a.f84358e.mo27525b();
        long e = this.f84353b + ((long) bVar.mo37030e());
        long b = this.f84352a.f84360g.mo26870b();
        if (e <= b) {
            this.f84352a.mo37041d(false);
            return;
        }
        C31331i iVar = this.f84352a;
        Intent registerReceiver = iVar.f84356c.registerReceiver((BroadcastReceiver) null, iVar.f84359f);
        C31331i iVar2 = this.f84352a;
        C71198ah ahVar = (C71198ah) C71199ai.f190036e.createBuilder();
        C71201ak b2 = iVar2.mo37040b(registerReceiver);
        ahVar.copyOnWrite();
        C71199ai aiVar = (C71199ai) ahVar.instance;
        b2.getClass();
        aiVar.f190039b = b2;
        aiVar.f190038a |= 1;
        C71199ai aiVar2 = (C71199ai) ahVar.build();
        C58833ax axVar = (C58833ax) this.f84352a.f84362i.mo6453a();
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) C31331i.f84354a.mo56226d()).mo56372aa(50370)).mo56386p("Can't create file, aborting method sampling");
            return;
        }
        File file = (File) axVar.mo56107c();
        C31331i.m58411c(file);
        Debug.startMethodTracingSampling(file.getAbsolutePath(), bVar.mo37029d(), bVar.mo37033g());
        C31331i iVar3 = this.f84352a;
        iVar3.f84357d.mo29164d(new C31329g(iVar3, file, aiVar2, Float.valueOf(C31331i.m58412e(registerReceiver)), e, b), e - b, TimeUnit.MILLISECONDS);
    }
}
