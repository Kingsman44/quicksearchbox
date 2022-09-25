package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2590aq;
import androidx.media3.exoplayer.p139c.C2859b;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.extractor.C3331af;
import androidx.media3.extractor.C3632v;
import androidx.media3.p132b.C2504h;

/* renamed from: androidx.media3.exoplayer.h.bx */
/* compiled from: PG */
public final class C3086bx implements C3035ar {

    /* renamed from: a */
    private final C2504h f8999a;

    /* renamed from: b */
    private int f9000b;

    /* renamed from: c */
    private C3085bw f9001c;

    /* renamed from: d */
    private C3245k f9002d;

    /* renamed from: e */
    private C2859b f9003e;

    public C3086bx(C2504h hVar) {
        this(hVar, new C3632v());
    }

    public C3086bx(C2504h hVar, C3331af afVar) {
        C3085bw bwVar = new C3085bw(afVar);
        C2859b bVar = new C2859b();
        C3245k kVar = new C3245k((byte[]) null);
        this.f8999a = hVar;
        this.f9001c = bwVar;
        this.f9003e = bVar;
        this.f9002d = kVar;
        this.f9000b = 1048576;
    }

    /* renamed from: a */
    public final C3087by mo6760b(C2590aq aqVar) {
        aqVar.f7154c.getClass();
        return new C3087by(aqVar, this.f8999a, this.f9001c, C2859b.m7902a(aqVar), this.f9000b);
    }
}
