package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.os */
/* compiled from: PG */
public final class C7182os implements C7171oh {

    /* renamed from: a */
    private final aee f23368a = new aee(10);

    /* renamed from: b */
    private C7073kr f23369b;

    /* renamed from: c */
    private boolean f23370c;

    /* renamed from: d */
    private long f23371d;

    /* renamed from: e */
    private int f23372e;

    /* renamed from: f */
    private int f23373f;

    /* renamed from: a */
    public final void mo16215a() {
        this.f23370c = false;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        C7073kr ak = kaVar.mo16113ak(pqVar.mo16279b(), 4);
        this.f23369b = ak;
        C6863cx cxVar = new C6863cx();
        cxVar.mo15617S(pqVar.mo16280c());
        cxVar.mo15630ae("application/id3");
        ak.mo16102a(cxVar.mo15625a());
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        if ((i & 4) != 0) {
            this.f23370c = true;
            this.f23371d = j;
            this.f23372e = 0;
            this.f23373f = 0;
        }
    }

    /* renamed from: d */
    public final void mo16218d(aee aee) {
        ary.m19466s(this.f23369b);
        if (this.f23370c) {
            int d = aee.mo14550d();
            int i = this.f23373f;
            if (i < 10) {
                int min = Math.min(d, 10 - i);
                System.arraycopy(aee.mo14555i(), aee.mo14553g(), this.f23368a.mo14555i(), this.f23373f, min);
                if (this.f23373f + min == 10) {
                    this.f23368a.mo14554h(0);
                    if (this.f23368a.mo14560n() == 73 && this.f23368a.mo14560n() == 68 && this.f23368a.mo14560n() == 51) {
                        this.f23368a.mo14557k(3);
                        this.f23372e = this.f23368a.mo14537A() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f23370c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(d, this.f23372e - this.f23373f);
            this.f23369b.mo16105d(aee, min2);
            this.f23373f += min2;
        }
    }

    /* renamed from: e */
    public final void mo16219e() {
        int i;
        ary.m19466s(this.f23369b);
        if (this.f23370c && (i = this.f23372e) != 0 && this.f23373f == i) {
            this.f23369b.mo16103b(this.f23371d, 1, i, 0, (C7072kq) null);
            this.f23370c = false;
        }
    }
}
