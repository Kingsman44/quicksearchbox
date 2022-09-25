package com.google.android.apps.gsa.speech.p7295k.p7296a;

import android.content.Context;
import com.google.android.apps.gsa.p6487s3.producers.C84314m;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.shared.speech.p7139a.C90520l;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.p590as.p591a.C10778l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.speech.p5208h.C66607ce;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.speech.k.a.b */
/* compiled from: PG */
public final class C92438b implements C84314m {

    /* renamed from: c */
    private static final C59071e f257796c = C59071e.m91332i("com.google.android.apps.gsa.speech.k.a.b");

    /* renamed from: a */
    protected byte[] f257797a;

    /* renamed from: b */
    protected InputStream f257798b;

    /* renamed from: d */
    private boolean f257799d;

    /* renamed from: e */
    private final int f257800e;

    /* renamed from: f */
    private final int f257801f;

    /* renamed from: g */
    private final int f257802g;

    /* renamed from: h */
    private final InputStream f257803h;

    /* renamed from: i */
    private final int f257804i;

    /* renamed from: j */
    private C90747d f257805j;

    /* renamed from: k */
    private final Context f257806k;

    /* renamed from: l */
    private final int f257807l;

    public C92438b(Context context, InputStream inputStream, int i, int i2, int i3, int i4, int i5) {
        this.f257806k = context;
        this.f257807l = i5;
        this.f257800e = i3;
        this.f257801f = i;
        this.f257802g = i4;
        this.f257803h = inputStream;
        this.f257804i = i2;
    }

    /* renamed from: a */
    private final void m151888a() {
        if (!this.f257799d) {
            this.f257799d = true;
            C59337t.m92221a(this.f257798b);
        }
    }

    /* renamed from: b */
    public final boolean mo77850b() {
        return true;
    }

    public final void close() {
        C90747d dVar = this.f257805j;
        if (dVar != null) {
            dVar.mo85091a();
        }
        m151888a();
    }

    /* renamed from: hj */
    public final C66607ce mo77855hj() {
        C90747d dVar = this.f257805j;
        if (dVar == null) {
            this.f257805j = C90748e.m148223a(false);
        } else {
            dVar.mo85091a();
        }
        try {
            if (!this.f257799d) {
                C10778l.m25802a(this.f257806k);
                if (this.f257798b == null) {
                    this.f257797a = new byte[224];
                    this.f257798b = new C10778l(this.f257803h, this.f257804i, this.f257800e, this.f257802g, this.f257801f);
                }
                ((C59052c) ((C59052c) f257796c.mo56224b()).mo56372aa(12770)).mo56386p("Reading S3 stream");
                InputStream inputStream = this.f257798b;
                byte[] bArr = this.f257797a;
                int length = bArr.length;
                int a = C59332o.m92210a(inputStream, bArr, 0, 224);
                if (a > 0) {
                    int i = this.f257807l;
                    if (i == 1) {
                        return C118919a.m197404b(this.f257797a, a);
                    }
                    if (i == 2) {
                        return C118919a.m197406d(this.f257797a, a);
                    }
                    throw new RuntimeException("Unsupported AudioType");
                }
                m151888a();
            }
            return null;
        } catch (Exception e) {
            m151888a();
            throw new C90520l(e);
        }
    }
}
