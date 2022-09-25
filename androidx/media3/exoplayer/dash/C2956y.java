package androidx.media3.exoplayer.dash;

import android.os.Handler;
import androidx.media3.common.C2599az;
import androidx.media3.common.C2671o;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2874cc;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p145h.C3094ce;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.extractor.C3366bd;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.metadata.C3585b;
import androidx.media3.extractor.metadata.emsg.EventMessage;

/* renamed from: androidx.media3.exoplayer.dash.y */
/* compiled from: PG */
public final class C2956y implements C3368bf {

    /* renamed from: a */
    public final C3094ce f8486a;

    /* renamed from: b */
    public long f8487b = -9223372036854775807L;

    /* renamed from: c */
    public final /* synthetic */ C2957z f8488c;

    /* renamed from: d */
    private final C2874cc f8489d = new C2874cc();

    /* renamed from: e */
    private final C3585b f8490e = new C3585b();

    public C2956y(C2957z zVar, C3241g gVar) {
        this.f8488c = zVar;
        this.f8486a = new C3094ce(gVar, (C2868k) null);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo6849a(C2671o oVar, int i, boolean z) {
        return C3366bd.m9743a(this.f8486a, oVar, i, z);
    }

    /* renamed from: b */
    public final void mo6850b(C2680x xVar) {
        this.f8486a.mo6850b(xVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6851c(C2604ac acVar, int i) {
        C3366bd.m9744b(this.f8486a, acVar, i);
    }

    /* renamed from: d */
    public final void mo6852d(long j, int i, int i2, int i3, C3367be beVar) {
        C3585b bVar;
        long j2;
        this.f8486a.mo6852d(j, i, i2, i3, beVar);
        while (this.f8486a.mo7068A(false)) {
            this.f8490e.mo5953fg();
            if (this.f8486a.mo7074j(this.f8489d, this.f8490e, 0, false) == -4) {
                this.f8490e.mo5961d();
                bVar = this.f8490e;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                long j3 = bVar.f6957e;
                Metadata a = this.f8488c.f8491a.mo7491a(bVar);
                if (a != null) {
                    EventMessage eventMessage = (EventMessage) a.f7056a[0];
                    String str = eventMessage.f11428a;
                    String str2 = eventMessage.f11429b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = C2612ak.m6999x(C2612ak.m6929L(eventMessage.f11432e));
                        } catch (C2599az unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            C2955x xVar = new C2955x(j3, j2);
                            Handler handler = this.f8488c.f8492b;
                            handler.sendMessage(handler.obtainMessage(1, xVar));
                        }
                    }
                }
            }
        }
        C3094ce ceVar = this.f8486a;
        ceVar.f9040b.mo7066d(ceVar.mo7075k());
    }

    /* renamed from: e */
    public final int mo6853e(C2671o oVar, int i, boolean z) {
        throw null;
    }

    /* renamed from: f */
    public final void mo6854f(C2604ac acVar, int i) {
        this.f8486a.mo6854f(acVar, i);
    }
}
