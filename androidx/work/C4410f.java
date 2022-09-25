package androidx.work;

import android.net.Uri;
import androidx.work.impl.utils.C4599f;
import java.util.LinkedHashSet;
import java.util.Set;
import p3186j$.time.Duration;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.f */
/* compiled from: PG */
public final class C4410f {

    /* renamed from: a */
    public boolean f14071a;

    /* renamed from: b */
    public boolean f14072b;

    /* renamed from: c */
    public boolean f14073c;

    /* renamed from: d */
    public boolean f14074d;

    /* renamed from: e */
    private C4381ae f14075e = C4381ae.NOT_REQUIRED;

    /* renamed from: f */
    private long f14076f = -1;

    /* renamed from: g */
    private final Set f14077g = new LinkedHashSet();

    /* renamed from: a */
    public final C4412h mo9349a() {
        Set ab = C69540x.m100846ab(this.f14077g);
        long j = this.f14076f;
        return new C4412h(this.f14075e, this.f14071a, this.f14072b, this.f14073c, this.f14074d, -1, j, ab);
    }

    /* renamed from: b */
    public final void mo9350b(Uri uri, boolean z) {
        C69664n.m101061g(uri, "uri");
        this.f14077g.add(new C4411g(uri, z));
    }

    /* renamed from: c */
    public final void mo9351c(C4381ae aeVar) {
        C69664n.m101061g(aeVar, "networkType");
        this.f14075e = aeVar;
    }

    /* renamed from: d */
    public final void mo9352d(Duration duration) {
        C69664n.m101061g(duration, "duration");
        this.f14076f = C4599f.m12995a(duration);
    }
}
