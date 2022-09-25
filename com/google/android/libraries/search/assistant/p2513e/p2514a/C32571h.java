package com.google.android.libraries.search.assistant.p2513e.p2514a;

import com.google.audio.hearing.common.OggOpusEncoder;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.e.a.h */
/* compiled from: PG */
final class C32571h implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C69630p f87220a;

    /* renamed from: b */
    final /* synthetic */ OggOpusEncoder f87221b;

    public C32571h(C69630p pVar, OggOpusEncoder oggOpusEncoder) {
        this.f87220a = pVar;
        this.f87221b = oggOpusEncoder;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        byte[] bArr = (byte[]) obj;
        C69630p pVar = this.f87220a;
        byte[] c = this.f87221b.mo54138c(bArr, bArr.length);
        C69664n.m101060f(c, "encoder.processAudioByte…/ 0, /*length=*/ it.size)");
        Object a = pVar.mo5192a(c, gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
