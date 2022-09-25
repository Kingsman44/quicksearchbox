package com.google.android.libraries.p10908a.p10911c.p10913b;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4816ai.p4820d.p4821a.C63213e;
import com.google.protos.p4816ai.p4820d.p4821a.C63216h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.a.c.b.o */
/* compiled from: PG */
public final class C146639o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C146642r f396043a;

    /* renamed from: b */
    final /* synthetic */ Context f396044b;

    /* renamed from: c */
    final /* synthetic */ int f396045c;

    public C146639o(C146642r rVar, Context context, int i) {
        this.f396043a = rVar;
        this.f396044b = context;
        this.f396045c = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        int i = this.f396045c;
        Log.e("LoggingAppWdgtPrvdrDlgt", "Failed to add widget ID " + i + ".", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C146642r rVar = this.f396043a;
            Context context = this.f396044b;
            C63213e eVar = (C63213e) C63216h.f170786f.createBuilder();
            eVar.copyOnWrite();
            C63216h hVar = (C63216h) eVar.instance;
            hVar.f170789b = 2;
            hVar.f170788a |= 1;
            C146640p.m238878b(rVar, context, eVar);
            return;
        }
        Log.d("LoggingAppWdgtPrvdrDlgt", "Not adding widget ID " + this.f396045c + ". ID already exists.");
    }
}
