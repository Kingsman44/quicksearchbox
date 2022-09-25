package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import android.animation.TimeAnimator;
import android.util.SparseArray;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138768e;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138771h;
import java.util.ArrayDeque;
import java.util.Deque;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.ag */
/* compiled from: PG */
public final class C138820ag implements TimeAnimator.TimeListener {

    /* renamed from: a */
    public final TimeAnimator f377621a;

    /* renamed from: b */
    public final C138824b f377622b;

    /* renamed from: c */
    public final C138821ah f377623c;

    /* renamed from: d */
    public final ArrayDeque f377624d = new ArrayDeque();

    /* renamed from: e */
    public C138819af f377625e;

    /* renamed from: f */
    public long f377626f;

    /* renamed from: g */
    public long f377627g;

    /* renamed from: h */
    public C138817ad f377628h = C138817ad.f377597b;

    /* renamed from: i */
    public final SparseArray f377629i = new SparseArray();

    /* renamed from: j */
    public int f377630j;

    /* renamed from: k */
    public int f377631k;

    /* renamed from: l */
    public boolean f377632l;

    /* renamed from: m */
    private final float[] f377633m = new float[4];

    public C138820ag(C138824b bVar, TimeAnimator timeAnimator, C138819af afVar, C138821ah ahVar) {
        this.f377622b = bVar;
        this.f377621a = timeAnimator;
        this.f377625e = afVar;
        this.f377623c = ahVar;
        this.f377630j = 0;
        this.f377628h = C138817ad.f377597b;
        timeAnimator.setTimeListener(this);
    }

    /* renamed from: a */
    public final Deque mo114570a(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (i != 8) {
            arrayDeque.addFirst(Integer.valueOf(i));
            i = i != 6 ? 8 : 5;
        }
        return arrayDeque;
    }

    /* renamed from: b */
    public final void mo114571b(C138817ad adVar) {
        C138833f fVar;
        this.f377628h.mo114567b(this.f377622b);
        if (adVar == null) {
            this.f377621a.end();
        } else {
            this.f377628h = adVar;
            int i = this.f377631k;
            if (!(i == 0 || i == this.f377630j)) {
                C138817ad a = C138821ah.m225501a(C138821ah.m225504d(i));
                C138817ad c = C138821ah.m225503c(this.f377631k);
                C138817ad adVar2 = this.f377628h;
                if (adVar2 == a || adVar2 == c) {
                    this.f377621a.isStarted();
                    int i2 = this.f377631k;
                    this.f377630j = i2;
                    this.f377631k = 0;
                    C138819af afVar = this.f377625e;
                    if (!(afVar == null || (fVar = ((LogoView) afVar).f377574b) == null)) {
                        fVar.mo114475a(i2);
                    }
                    C138835h hVar = (C138835h) this.f377629i.get(this.f377630j);
                    if (hVar != null) {
                        hVar.mo114600a();
                    }
                }
            }
            this.f377628h.mo114566a(this.f377622b);
            this.f377627g = this.f377626f;
        }
        C138819af afVar2 = this.f377625e;
        if (afVar2 != null) {
            afVar2.mo114545b();
        }
    }

    /* renamed from: c */
    public final void mo114572c() {
        this.f377632l = true;
        if (!this.f377621a.isStarted()) {
            this.f377626f = 0;
            this.f377621a.start();
        }
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        int i = 0;
        if (this.f377632l) {
            this.f377632l = false;
            mo114571b((C138817ad) this.f377624d.pollFirst());
        }
        if (this.f377621a.isStarted()) {
            this.f377626f = j;
            C138835h hVar = (C138835h) this.f377629i.get(this.f377630j);
            if (hVar != null) {
                float[] fArr = this.f377633m;
                C138771h hVar2 = hVar.f377682e;
                if (hVar2 != null) {
                    hVar.f377678a[hVar.f377681d] = ((float) ((Integer) Optional.ofNullable(hVar2.f377456a.f377459c).map(C138768e.f377453a).orElse(0)).intValue()) / 100.0f;
                    float[] fArr2 = hVar.f377678a;
                    int i2 = hVar.f377681d;
                    float a = C138834g.m225530a(hVar.f377680c, ((fArr2[i2] + fArr2[(i2 + 3) & 3]) + fArr2[(i2 + 2) & 3]) / 3.0f);
                    hVar.f377680c = a;
                    fArr[0] = a;
                    float[] fArr3 = hVar.f377679b;
                    int i3 = hVar.f377681d;
                    fArr[1] = fArr3[(i3 + 3) & 3];
                    fArr[2] = fArr3[(i3 + 2) & 3];
                    fArr[3] = fArr3[(i3 + 1) & 3];
                }
                float[] fArr4 = hVar.f377679b;
                int i4 = hVar.f377681d;
                fArr4[i4] = hVar.f377680c;
                hVar.f377681d = (i4 + 1) & 3;
                C138824b bVar = this.f377622b;
                float[] fArr5 = this.f377633m;
                while (i < 4 && i < bVar.f377645a.size()) {
                    (i != 0 ? i != 1 ? i != 2 ? bVar.f377654j ? bVar.f377650f : bVar.f377649e : bVar.f377648d : bVar.f377647c : bVar.f377646b).f377644k = fArr5[i];
                    i++;
                }
            }
            boolean c = this.f377628h.mo114568c(this.f377627g, this.f377626f, this.f377622b);
            C138819af afVar = this.f377625e;
            if (afVar != null) {
                afVar.mo114545b();
            }
            if (!c) {
                mo114572c();
            }
        }
    }
}
