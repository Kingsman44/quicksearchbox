package com.google.android.apps.search.transcription.voiceime;

import com.google.android.apps.search.transcription.p10670f.p10673b.C141832x;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.transcription.voiceime.v */
/* compiled from: PG */
public final /* synthetic */ class C142042v implements C46464p {

    /* renamed from: a */
    public final /* synthetic */ C141972ak f385389a;

    /* renamed from: b */
    public final /* synthetic */ long f385390b;

    public /* synthetic */ C142042v(C141972ak akVar, long j) {
        this.f385389a = akVar;
        this.f385390b = j;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        C141832x xVar;
        C141971aj ajVar = (C141971aj) this.f385389a.f385246k.get(Long.valueOf(this.f385390b));
        if (ajVar == null) {
            xVar = C141832x.m230155k().mo116762a();
        } else {
            xVar = ajVar.f385234a;
        }
        return new C46463o(new C60817ay(C60856cj.m92900i(xVar)));
    }
}
