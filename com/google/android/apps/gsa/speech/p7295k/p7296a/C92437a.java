package com.google.android.apps.gsa.speech.p7295k.p7296a;

import com.google.android.apps.gsa.p6487s3.producers.C84314m;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.shared.speech.p7139a.C90520l;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.android.libraries.p590as.p591a.C10772f;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.speech.k.a.a */
/* compiled from: PG */
public class C92437a implements C84314m {

    /* renamed from: a */
    private final InputStream f257792a;

    /* renamed from: b */
    private final byte[] f257793b;

    /* renamed from: c */
    private C90747d f257794c;

    /* renamed from: d */
    private boolean f257795d;

    public C92437a(InputStream inputStream, C67451at atVar) {
        int i;
        C10772f fVar = new C10772f();
        fVar.mo19257g(atVar);
        InputStream e = C10771e.m25768e(inputStream, fVar.mo19268j());
        C67451at atVar2 = C67451at.LINEAR16;
        int ordinal = atVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                i = 384;
                this.f257792a = e;
                this.f257793b = new byte[i];
            } else if (ordinal != 9) {
                throw new RuntimeException("Unsupported AMR encoding:".concat(String.valueOf(String.valueOf(atVar))));
            }
        }
        i = 224;
        this.f257792a = e;
        this.f257793b = new byte[i];
    }

    /* renamed from: c */
    private final void m151884c() {
        if (!this.f257795d) {
            this.f257795d = true;
            C59337t.m92221a(this.f257792a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C66607ce mo87115a(byte[] bArr, int i) {
        return C118919a.m197404b(bArr, i);
    }

    /* renamed from: b */
    public final boolean mo77850b() {
        return true;
    }

    public final void close() {
        C90747d dVar = this.f257794c;
        if (dVar != null) {
            dVar.mo85091a();
        }
        m151884c();
    }

    /* renamed from: hj */
    public final C66607ce mo77855hj() {
        C90747d dVar = this.f257794c;
        if (dVar == null) {
            this.f257794c = C90748e.m148223a(false);
        } else {
            dVar.mo85091a();
        }
        try {
            if (this.f257795d) {
                return null;
            }
            InputStream inputStream = this.f257792a;
            byte[] bArr = this.f257793b;
            int a = C59332o.m92210a(inputStream, bArr, 0, bArr.length);
            if (a > 0) {
                return mo87115a(this.f257793b, a);
            }
            m151884c();
            return null;
        } catch (IOException e) {
            m151884c();
            throw new C90520l(e);
        }
    }
}
