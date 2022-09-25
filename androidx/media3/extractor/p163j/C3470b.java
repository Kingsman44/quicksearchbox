package androidx.media3.extractor.p163j;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.p134c.C2527e;
import androidx.media3.p134c.C2529g;
import androidx.media3.p134c.C2530h;
import androidx.media3.p134c.C2532j;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.extractor.j.b */
/* compiled from: PG */
public abstract class C3470b extends C2532j implements C3486d {
    protected C3470b() {
        super(new C3496f[2], new C3508g[2]);
        C2601a.m6832d(this.f6966d == 2);
        C2529g[] gVarArr = this.f6964b;
        for (int i = 0; i < 2; i++) {
            gVarArr[i].mo5960c(1024);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2527e mo5964f(Throwable th) {
        return new C3493e("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2527e mo5965g(C2529g gVar, C2530h hVar, boolean z) {
        C3496f fVar = (C3496f) gVar;
        try {
            ByteBuffer byteBuffer = fVar.f6955c;
            byteBuffer.getClass();
            ((C3508g) hVar).mo7447e(fVar.f6957e, mo7433l(byteBuffer.array(), byteBuffer.limit(), z), fVar.f10887g);
            hVar.f6941a &= Integer.MAX_VALUE;
            return null;
        } catch (C3493e e) {
            return e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ C2529g mo5966h() {
        return new C3496f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* synthetic */ C2530h mo5967i() {
        return new C3456a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C3482c mo7433l(byte[] bArr, int i, boolean z);

    /* renamed from: r */
    public final void mo7197r(long j) {
    }
}
