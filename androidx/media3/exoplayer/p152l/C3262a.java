package androidx.media3.exoplayer.p152l;

import androidx.media3.exoplayer.dash.C2939h;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3250p;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3256v;
import java.io.IOException;
import java.util.ConcurrentModificationException;

/* renamed from: androidx.media3.exoplayer.l.a */
/* compiled from: PG */
public final class C3262a implements C3249o {

    /* renamed from: a */
    private final C2939h f9798a;

    public C3262a(C2939h hVar) {
        this.f9798a = hVar;
    }

    /* renamed from: eX */
    public final void mo6825eX(C3252r rVar, boolean z) {
    }

    /* renamed from: fb */
    public final void mo6826fb(C3252r rVar, long j, long j2) {
        if (!C3264c.m9497b()) {
            C2939h hVar = this.f9798a;
            hVar.f8437a.mo6748d(new IOException(new ConcurrentModificationException()));
            return;
        }
        this.f9798a.mo6824a();
    }

    /* renamed from: fe */
    public final C3250p mo6827fe(C3252r rVar, IOException iOException, int i) {
        this.f9798a.f8437a.mo6748d(iOException);
        return C3256v.f9786b;
    }
}
