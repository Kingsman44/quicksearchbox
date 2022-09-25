package com.google.android.libraries.search.assistant.p2513e.p2514a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.audio.encoding.LibOggOpusEncoder$encode$1$emitIfNotEmpty$1", mo61344c = "LibOggOpusEncoder.kt", mo61345d = "invokeSuspend", mo61346e = {41})
/* renamed from: com.google.android.libraries.search.assistant.e.a.i */
/* compiled from: PG */
final class C32572i extends C69572j implements C69630p {

    /* renamed from: a */
    int f87222a;

    /* renamed from: b */
    /* synthetic */ Object f87223b;

    /* renamed from: c */
    final /* synthetic */ C71588o f87224c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32572i(C71588o oVar, C69577g gVar) {
        super(2, gVar);
        this.f87224c = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32572i) mo5194c((byte[]) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87222a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            byte[] bArr = (byte[]) this.f87223b;
            if (bArr.length != 0) {
                C71588o oVar = this.f87224c;
                this.f87222a = 1;
                if (oVar.mo20883a(bArr, this) == aVar) {
                    return aVar;
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32572i iVar = new C32572i(this.f87224c, gVar);
        iVar.f87223b = obj;
        return iVar;
    }
}
