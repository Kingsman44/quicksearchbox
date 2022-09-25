package com.google.android.apps.gsa.sidekick.shared.monet.p7252h;

import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91765a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91770f;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91775k;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.h.d */
/* compiled from: PG */
public final class C91845d {

    /* renamed from: a */
    public boolean f256138a;

    /* renamed from: b */
    private final C21370a f256139b;

    /* renamed from: c */
    private final String f256140c;

    /* renamed from: d */
    private final C91770f f256141d;

    /* renamed from: e */
    private final List f256142e = new ArrayList();

    /* renamed from: f */
    private int f256143f;

    /* renamed from: g */
    private int f256144g;

    /* renamed from: h */
    private boolean f256145h;

    /* renamed from: i */
    private int f256146i;

    /* renamed from: j */
    private int f256147j;

    /* renamed from: k */
    private int f256148k;

    /* renamed from: l */
    private int f256149l;

    /* renamed from: m */
    private List f256150m;

    /* renamed from: n */
    private long f256151n;

    public C91845d(C21370a aVar, String str, C91770f fVar) {
        this.f256139b = aVar;
        this.f256140c = str;
        this.f256141d = fVar;
    }

    /* renamed from: a */
    public final void mo86330a(int i, int i2, boolean z) {
        this.f256143f = i;
        this.f256144g = i2;
        this.f256145h = z;
        this.f256146i = this.f256141d.mo86267h();
        this.f256147j = this.f256141d.mo86264e();
        this.f256148k = this.f256141d.mo86269iZ();
        this.f256149l = this.f256141d.mo86265f();
        this.f256150m = this.f256141d.mo86270j();
        this.f256151n = this.f256139b.mo26870b();
        this.f256138a = true;
    }

    /* renamed from: b */
    public final void mo86331b(C91857e eVar, boolean z, C91775k kVar) {
        C91857e eVar2 = eVar;
        if (this.f256138a) {
            long b = this.f256139b.mo26870b();
            long j = this.f256151n;
            long j2 = b - j;
            boolean z2 = this.f256145h;
            int i = this.f256146i;
            int i2 = this.f256147j;
            int i3 = this.f256148k;
            int i4 = this.f256149l;
            int i5 = i4;
            C91842a aVar = new C91842a(j, j2, z2, i, i2, i3, i5, C58485gu.m89842j(this.f256150m), this.f256143f, this.f256144g, this.f256140c);
            if (this.f256147j != -2147483647) {
                aVar.mo86329n(eVar2, -2147483647, -2147483647);
            } else {
                this.f256142e.add(aVar);
            }
            this.f256138a = false;
        }
        if (z && !this.f256142e.isEmpty()) {
            int e = this.f256141d.mo86264e();
            if (e == -2147483647) {
                C91770f fVar = this.f256141d;
                if (fVar instanceof C91765a) {
                    ((C91765a) fVar).mo86263c(kVar);
                    e = this.f256141d.mo86264e();
                } else {
                    e = -2147483647;
                }
            }
            for (C91844c cVar : this.f256142e) {
                int c = cVar.mo86314c();
                C58485gu k = cVar.mo86324k();
                if (!k.isEmpty() && !k.isEmpty()) {
                    Iterator it = k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Integer) it.next()).intValue() != 0) {
                                break;
                            }
                        } else {
                            c = this.f256141d.mo86266g(c, k, 0);
                            break;
                        }
                    }
                }
                cVar.mo86329n(eVar2, cVar.mo86312a() == -2147483647 ? e : -2147483647, c);
            }
            this.f256142e.clear();
        }
    }

    /* renamed from: c */
    public final boolean mo86332c() {
        return !this.f256142e.isEmpty() || this.f256138a;
    }
}
