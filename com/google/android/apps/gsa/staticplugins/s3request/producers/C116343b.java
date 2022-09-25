package com.google.android.apps.gsa.staticplugins.s3request.producers;

import com.google.android.apps.gsa.p6487s3.producers.C84314m;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.p590as.p591a.C10769c;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.speech.p5208h.C66607ce;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.b */
/* compiled from: PG */
public final class C116343b implements C84314m {

    /* renamed from: a */
    final InputStream f322555a;

    /* renamed from: b */
    InputStream f322556b;

    /* renamed from: c */
    public int f322557c = 0;

    /* renamed from: d */
    private final String f322558d;

    /* renamed from: e */
    private final int f322559e;

    /* renamed from: f */
    private final int f322560f;

    /* renamed from: g */
    private final int f322561g;

    /* renamed from: h */
    private final int f322562h;

    /* renamed from: i */
    private final int f322563i;

    /* renamed from: j */
    private final byte[] f322564j;

    /* renamed from: k */
    private final C90747d f322565k;

    /* renamed from: l */
    private boolean f322566l;

    public C116343b(InputStream inputStream, int i) {
        this.f322555a = new C116342a(this, inputStream);
        this.f322558d = "audio/mp4a-latm";
        this.f322559e = i;
        this.f322560f = 1;
        this.f322561g = 2048;
        this.f322562h = 40000;
        this.f322563i = 15;
        this.f322564j = new byte[2048];
        this.f322565k = C90748e.m148223a(false);
    }

    /* renamed from: a */
    private final void m192963a() {
        if (!this.f322566l) {
            this.f322566l = true;
            C59337t.m92221a(this.f322556b);
        }
    }

    /* renamed from: b */
    public final boolean mo77850b() {
        return true;
    }

    public final void close() {
        this.f322565k.mo85091a();
        m192963a();
    }

    /* renamed from: hj */
    public final C66607ce mo77855hj() {
        this.f322565k.mo85091a();
        try {
            if (!this.f322566l) {
                if (this.f322556b == null) {
                    this.f322556b = new C10769c(this.f322555a, this.f322558d, this.f322559e, this.f322561g, this.f322562h, this.f322560f);
                }
                int i = this.f322563i;
                if (i > 0) {
                    int i2 = this.f322557c;
                    int i3 = this.f322559e;
                    if (i2 > (i3 + i3) * i) {
                        m192963a();
                        return null;
                    }
                }
                InputStream inputStream = this.f322556b;
                byte[] bArr = this.f322564j;
                int length = bArr.length;
                int a = C59332o.m92210a(inputStream, bArr, 0, 2048);
                if (a > 0) {
                    return C118919a.m197404b(this.f322564j, a);
                }
                m192963a();
            }
            return null;
        } catch (Exception e) {
            m192963a();
            throw new C90523o((Throwable) e, (int) C89885b.S3REQUEST_BUILD_AAC_AUDIO_DATA_FAILED_VALUE);
        }
    }
}
