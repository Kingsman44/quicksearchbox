package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xg */
/* compiled from: PG */
public final class C7413xg implements C7073kr {

    /* renamed from: a */
    final /* synthetic */ C7414xh f24274a;

    /* renamed from: b */
    private final C7353va f24275b;

    /* renamed from: c */
    private final C6865cz f24276c = new C6865cz();

    /* renamed from: d */
    private final C7024iw f24277d = new C7024iw();

    public C7413xg(C7414xh xhVar, acc acc) {
        this.f24274a = xhVar;
        this.f24275b = new C7353va(acc, xhVar.f24280c.getLooper(), C7036jh.f22541a, new C7033je());
    }

    /* renamed from: a */
    public final void mo16102a(C6864cy cyVar) {
        this.f24275b.mo16102a(cyVar);
    }

    /* renamed from: b */
    public final void mo16103b(long j, int i, int i2, int i3, C7072kq kqVar) {
        C7024iw iwVar;
        long j2;
        this.f24275b.mo16103b(j, i, i2, i3, kqVar);
        while (this.f24275b.mo16636y(false)) {
            this.f24277d.mo16030a();
            if (this.f24275b.mo16637z(this.f24276c, this.f24277d, false, false) == -4) {
                this.f24277d.mo16045l();
                iwVar = this.f24277d;
            } else {
                iwVar = null;
            }
            if (iwVar != null) {
                long j3 = iwVar.f22517d;
                C7243qz a = this.f24274a.f24279b.mo16355a(iwVar);
                if (a != null) {
                    C7247rc rcVar = (C7247rc) a.mo16342b(0);
                    String str = rcVar.f23682a;
                    String str2 = rcVar.f23683b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = aeu.m18495M(aeu.m18553w(rcVar.f23686e));
                        } catch (C6886dt unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            this.f24274a.f24280c.sendMessage(this.f24274a.f24280c.obtainMessage(1, new C7411xe(j3, j2)));
                        }
                    }
                }
            }
        }
        this.f24275b.mo16611F();
    }

    /* renamed from: c */
    public final int mo16104c(abu abu, int i, boolean z) {
        return atv.m19625q(this, abu, i, z);
    }

    /* renamed from: d */
    public final void mo16105d(aee aee, int i) {
        atv.m19626r(this, aee, i);
    }

    /* renamed from: e */
    public final int mo16106e(abu abu, int i, boolean z) {
        return atv.m19625q(this.f24275b, abu, i, z);
    }

    /* renamed from: f */
    public final void mo16107f(aee aee, int i) {
        atv.m19626r(this.f24275b, aee, i);
    }

    /* renamed from: g */
    public final void mo16753g() {
        this.f24275b.mo16618g();
    }
}
