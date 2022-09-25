package androidx.media3.extractor.p172k;

import android.util.SparseArray;
import androidx.media3.extractor.C3345at;
import androidx.media3.extractor.C3346au;
import androidx.media3.extractor.C3349ax;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.q */
/* compiled from: PG */
final class C3564q {

    /* renamed from: a */
    public final C3368bf f11259a;

    /* renamed from: b */
    public final boolean f11260b;

    /* renamed from: c */
    public final boolean f11261c;

    /* renamed from: d */
    public final SparseArray f11262d = new SparseArray();

    /* renamed from: e */
    public final SparseArray f11263e = new SparseArray();

    /* renamed from: f */
    public final C3349ax f11264f = new C3349ax(this.f11265g, 0, 0);

    /* renamed from: g */
    public byte[] f11265g = new byte[128];

    /* renamed from: h */
    public int f11266h;

    /* renamed from: i */
    public int f11267i;

    /* renamed from: j */
    public long f11268j;

    /* renamed from: k */
    public boolean f11269k;

    /* renamed from: l */
    public long f11270l;

    /* renamed from: m */
    public C3563p f11271m = new C3563p();

    /* renamed from: n */
    public C3563p f11272n = new C3563p();

    /* renamed from: o */
    public boolean f11273o;

    /* renamed from: p */
    public long f11274p;

    /* renamed from: q */
    public long f11275q;

    /* renamed from: r */
    public boolean f11276r;

    public C3564q(C3368bf bfVar, boolean z, boolean z2) {
        this.f11259a = bfVar;
        this.f11260b = z;
        this.f11261c = z2;
        mo7478c();
    }

    /* renamed from: a */
    public final void mo7476a(C3345at atVar) {
        this.f11263e.append(atVar.f10098a, atVar);
    }

    /* renamed from: b */
    public final void mo7477b(C3346au auVar) {
        this.f11262d.append(auVar.f10104d, auVar);
    }

    /* renamed from: c */
    public final void mo7478c() {
        this.f11269k = false;
        this.f11273o = false;
        this.f11272n.mo7475a();
    }
}
