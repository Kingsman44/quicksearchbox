package com.google.android.libraries.p10908a.p10911c.p10913b;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4816ai.p4820d.p4821a.C63213e;
import com.google.protos.p4816ai.p4820d.p4821a.C63216h;
import com.google.protos.p4816ai.p4820d.p4821a.C63218j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.a.c.b.n */
/* compiled from: PG */
public final class C146638n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f396038a;

    /* renamed from: b */
    final /* synthetic */ long f396039b;

    /* renamed from: c */
    final /* synthetic */ C146642r f396040c;

    /* renamed from: d */
    final /* synthetic */ Context f396041d;

    /* renamed from: e */
    private final C63213e f396042e;

    public C146638n(int i, long j, C146642r rVar, Context context) {
        this.f396038a = i;
        this.f396039b = j;
        this.f396040c = rVar;
        this.f396041d = context;
        C63213e eVar = (C63213e) C63216h.f170786f.createBuilder();
        eVar.copyOnWrite();
        C63216h hVar = (C63216h) eVar.instance;
        hVar.f170789b = 3;
        hVar.f170788a |= 1;
        this.f396042e = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        int i = this.f396038a;
        Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to remove widget " + i + ".", th);
        C146640p.m238878b(this.f396040c, this.f396041d, this.f396042e);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C63218j jVar = (C63218j) obj;
        if (jVar == null) {
            Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to remove widget " + this.f396038a + ". ID does not exist.");
        } else {
            long j = jVar.f170797c;
            long j2 = 0;
            if (j > 0) {
                long j3 = this.f396039b - j;
                C63213e eVar = this.f396042e;
                if (j3 >= 0) {
                    j2 = j3;
                }
                eVar.copyOnWrite();
                C63216h hVar = (C63216h) eVar.instance;
                C63216h hVar2 = C63216h.f170786f;
                hVar.f170788a |= 8;
                hVar.f170792e = j2;
            } else if (j == 0) {
                Log.d("LoggingAppWdgtPrvdrDlgt", "Not logging duration. Installation timestamp was unset.");
            } else {
                Log.e("LoggingAppWdgtPrvdrDlgt", "Not logging duration. Installation timestamp was negative: " + j);
            }
        }
        C146640p.m238878b(this.f396040c, this.f396041d, this.f396042e);
    }
}
