package com.google.android.apps.gsa.p8889z.p8893c.p8897d;

import com.google.android.apps.gsa.p8889z.p8893c.p8896c.C118872a;
import com.google.android.apps.gsa.shared.speech.p7139a.C90510b;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92263a;
import com.google.common.base.C58833ax;
import com.google.speech.recognizer.p5233a.C67453av;

/* renamed from: com.google.android.apps.gsa.z.c.d.a */
/* compiled from: PG */
public final /* synthetic */ class C118877a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C92263a f331543a;

    /* renamed from: b */
    public final /* synthetic */ C118872a f331544b;

    /* renamed from: c */
    public final /* synthetic */ String f331545c;

    /* renamed from: d */
    public final /* synthetic */ long f331546d;

    /* renamed from: e */
    public final /* synthetic */ C92252n f331547e;

    /* renamed from: f */
    public final /* synthetic */ C58833ax f331548f;

    /* renamed from: g */
    public final /* synthetic */ C67453av f331549g;

    /* renamed from: h */
    public final /* synthetic */ C118889m f331550h;

    public /* synthetic */ C118877a(C92263a aVar, C118872a aVar2, String str, long j, C92252n nVar, C58833ax axVar, C67453av avVar, C118889m mVar) {
        this.f331543a = aVar;
        this.f331544b = aVar2;
        this.f331545c = str;
        this.f331546d = j;
        this.f331547e = nVar;
        this.f331548f = axVar;
        this.f331549g = avVar;
        this.f331550h = mVar;
    }

    public final void run() {
        C92263a aVar = this.f331543a;
        C118872a aVar2 = this.f331544b;
        String str = this.f331545c;
        long j = this.f331546d;
        C92252n nVar = this.f331547e;
        C58833ax axVar = this.f331548f;
        C67453av avVar = this.f331549g;
        C118889m mVar = this.f331550h;
        try {
            aVar.mo86944b(aVar2, str, j, nVar, (C92249k) axVar.mo56111f(), avVar);
        } catch (Throwable th) {
            mVar.mo86946b(new C90510b(th, 458755));
        }
    }
}
