package androidx.media3.exoplayer.p151k;

import androidx.media3.common.C2599az;
import androidx.media3.p132b.C2483ab;
import androidx.media3.p132b.C2486ae;
import androidx.media3.p132b.C2506j;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.k.k */
/* compiled from: PG */
public final class C3245k {
    public C3245k() {
    }

    public C3245k(byte[] bArr) {
    }

    /* renamed from: a */
    public static final C3247m m9466a(C3246l lVar, C3248n nVar) {
        int i;
        IOException iOException = nVar.f9770a;
        if (!(iOException instanceof C2486ae) || ((i = ((C2486ae) iOException).f6832d) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (lVar.mo7242a(1)) {
            return new C3247m(1, 300000);
        }
        if (lVar.mo7242a(2)) {
            return new C3247m(2, 60000);
        }
        return null;
    }

    /* renamed from: b */
    public static final int m9467b(int i) {
        return i == 7 ? 6 : 3;
    }

    /* renamed from: c */
    public static final long m9468c(C3248n nVar) {
        Throwable th = nVar.f9770a;
        if ((th instanceof C2599az) || (th instanceof FileNotFoundException) || (th instanceof C2483ab) || (th instanceof C3255u)) {
            return -9223372036854775807L;
        }
        while (th != null) {
            if ((th instanceof C2506j) && ((C2506j) th).f6884a == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return (long) Math.min((nVar.f9771b - 1) * 1000, 5000);
    }
}
