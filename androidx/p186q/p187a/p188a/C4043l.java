package androidx.p186q.p187a.p188a;

import android.content.Context;
import androidx.p186q.p187a.C4048c;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4050e;
import androidx.p186q.p187a.C4054i;
import p5462h.C69613f;
import p5462h.C69747m;

/* renamed from: androidx.q.a.a.l */
/* compiled from: PG */
public final class C4043l implements C4054i {

    /* renamed from: a */
    public final Context f12922a;

    /* renamed from: b */
    public final String f12923b;

    /* renamed from: c */
    public final C4050e f12924c;

    /* renamed from: d */
    public final boolean f12925d;

    /* renamed from: e */
    public final boolean f12926e;

    /* renamed from: f */
    public boolean f12927f;

    /* renamed from: g */
    private final C69613f f12928g;

    /* renamed from: h */
    private final C69613f f12929h;

    public C4043l(Context context, String str, C4050e eVar, boolean z, boolean z2) {
        this.f12922a = context;
        this.f12923b = str;
        this.f12924c = eVar;
        this.f12925d = z;
        this.f12926e = z2;
        C69747m mVar = new C69747m(new C4042k(this));
        this.f12928g = mVar;
        this.f12929h = mVar;
    }

    /* renamed from: b */
    private final C4041j m11571b() {
        return (C4041j) this.f12929h.mo5768a();
    }

    /* renamed from: a */
    public final C4049d mo8208a() {
        return m11571b().mo8484b();
    }

    /* renamed from: c */
    public final void mo8210c(boolean z) {
        if (this.f12928g.mo5769b()) {
            C4048c.m11584a(m11571b(), z);
        }
        this.f12927f = z;
    }

    public final void close() {
        if (this.f12928g.mo5769b()) {
            m11571b().close();
        }
    }
}
