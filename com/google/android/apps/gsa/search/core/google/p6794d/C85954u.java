package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.android.apps.gsa.search.core.p6513aj.C84548h;
import com.google.android.apps.gsa.search.core.p6513aj.C84553m;
import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.u */
/* compiled from: PG */
public final class C85954u implements C85936c {

    /* renamed from: a */
    private final InputStream f232457a;

    /* renamed from: b */
    private final String f232458b;

    /* renamed from: c */
    private final C85947n f232459c;

    /* renamed from: d */
    private final int f232460d;

    /* renamed from: e */
    private final int f232461e;

    public C85954u(InputStream inputStream, String str, int i, C85947n nVar, int i2) {
        this.f232457a = inputStream;
        this.f232458b = str;
        this.f232459c = nVar;
        this.f232460d = i;
        this.f232461e = i2;
    }

    /* renamed from: a */
    public final void mo79588a(C85935b bVar) {
        this.f232459c.mo79603m(Collections.emptyList());
        this.f232459c.mo79599i();
        this.f232459c.mo79596e(this.f232458b);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = new byte[this.f232461e];
            int i3 = 0;
            while (i3 < this.f232461e) {
                bVar.mo78288b("RawChunkReader required non-closed sink");
                try {
                    int read = this.f232457a.read(bArr, i3, this.f232461e - i3);
                    if (read < 0) {
                        break;
                    }
                    i3 += read;
                } catch (IllegalStateException e) {
                    bVar.mo78287a(e);
                    throw e;
                } catch (IOException e2) {
                    throw new C90457d((Throwable) e2, (int) C89885b.GWS_READ_RAW_STREAM_VALUE);
                }
            }
            i += i3;
            this.f232459c.mo79601k(i);
            if (i3 != 0) {
                int i4 = i2 + 1;
                if (!((C84553m) bVar).mo78284f(new C84548h(bArr, i3, i2))) {
                    throw new C90457d(C89885b.GWS_CHUNK_NOT_ACCEPTED_VALUE);
                } else if (i > this.f232460d) {
                    throw new C90457d(C89885b.GWS_RESPONSE_SIZE_EXCEEDED_VALUE);
                } else if (!Thread.currentThread().isInterrupted()) {
                    ((C86227bj) this.f232459c).mo79858K(true);
                    i2 = i4;
                } else {
                    throw new InterruptedException();
                }
            } else if (i == 0) {
                throw new C90457d(C89885b.GWS_RESPONSE_EMPTY_VALUE);
            } else {
                return;
            }
        }
    }
}
