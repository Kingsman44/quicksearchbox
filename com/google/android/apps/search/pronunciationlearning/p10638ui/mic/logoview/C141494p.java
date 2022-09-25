package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import android.animation.TimeAnimator;
import android.os.Build;
import android.util.SparseArray;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.C141469e;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.p */
/* compiled from: PG */
public final class C141494p implements TimeAnimator.TimeListener {

    /* renamed from: a */
    public final TimeAnimator f384070a;

    /* renamed from: b */
    public final C141477b f384071b;

    /* renamed from: c */
    public final C141495q f384072c;

    /* renamed from: d */
    public final ArrayDeque f384073d = new ArrayDeque();

    /* renamed from: e */
    public final SparseArray f384074e = new SparseArray();

    /* renamed from: f */
    public C141493o f384075f;

    /* renamed from: g */
    public long f384076g;

    /* renamed from: h */
    public long f384077h;

    /* renamed from: i */
    public C141492n f384078i;

    /* renamed from: j */
    public int f384079j;

    /* renamed from: k */
    public int f384080k;

    /* renamed from: l */
    public boolean f384081l;

    /* renamed from: m */
    private final float[] f384082m = new float[4];

    public C141494p(C141477b bVar, TimeAnimator timeAnimator, C141493o oVar, C141495q qVar) {
        C141492n nVar = C141492n.f384061a;
        this.f384071b = bVar;
        this.f384070a = timeAnimator;
        this.f384075f = oVar;
        this.f384072c = qVar;
        this.f384079j = 0;
        this.f384078i = nVar;
        timeAnimator.setTimeListener(this);
    }

    /* renamed from: d */
    private final void m229660d() {
        if (!Build.FINGERPRINT.startsWith("robolectric")) {
            this.f384070a.start();
        }
    }

    /* renamed from: a */
    public final Deque mo116505a(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (i != 3) {
            arrayDeque.addFirst(Integer.valueOf(i));
            i = 3;
        }
        return arrayDeque;
    }

    /* renamed from: b */
    public final void mo116506b() {
        if (this.f384070a.isStarted()) {
            this.f384070a.resume();
        } else {
            m229660d();
        }
    }

    /* renamed from: c */
    public final void mo116507c(C141492n nVar) {
        this.f384078i.mo116502b(this.f384071b);
        if (nVar == null) {
            this.f384070a.end();
        } else {
            this.f384078i = nVar;
            int i = this.f384080k;
            if (!(i == 0 || i == this.f384079j)) {
                C141492n a = C141495q.m229664a(C141495q.m229666c(i));
                C141492n b = C141495q.m229665b(this.f384080k);
                C141492n nVar2 = this.f384078i;
                if (nVar2 == a || nVar2 == b) {
                    this.f384070a.isStarted();
                    int i2 = this.f384080k;
                    this.f384079j = i2;
                    this.f384080k = 0;
                    C141469e eVar = (C141469e) this.f384074e.get(i2);
                    if (eVar != null) {
                        eVar.mo116464a();
                    }
                }
            }
            this.f384078i.mo116501a(this.f384071b);
            this.f384077h = this.f384076g;
        }
        C141493o oVar = this.f384075f;
        if (oVar != null) {
            oVar.mo116493c();
        }
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        int i = 0;
        if (this.f384081l) {
            this.f384081l = false;
            mo116507c((C141492n) this.f384073d.pollFirst());
        }
        if (this.f384070a.isStarted()) {
            this.f384076g = j;
            C141469e eVar = (C141469e) this.f384074e.get(this.f384079j);
            if (eVar != null) {
                float[] fArr = this.f384082m;
                float[] fArr2 = eVar.f383986a;
                int i2 = eVar.f383989d;
                float f = ((float) eVar.f383990e.f383981a.f383983b) / 100.0f;
                fArr2[i2] = f;
                int i3 = (i2 + 3) & 3;
                int i4 = (i2 + 2) & 3;
                float f2 = ((f + fArr2[i3]) + fArr2[i4]) / 3.0f;
                float f3 = eVar.f383988c;
                float f4 = f2 > f3 ? f3 + ((f2 - f3) * 0.3f) : f3 * 0.92f;
                eVar.f383988c = f4;
                fArr[0] = f4;
                float[] fArr3 = eVar.f383987b;
                fArr[1] = fArr3[i3];
                fArr[2] = fArr3[i4];
                int i5 = (i2 + 1) & 3;
                fArr[3] = fArr3[i5];
                fArr3[i2] = f4;
                eVar.f383989d = i5;
                C141477b bVar = this.f384071b;
                while (i < 4 && i < bVar.f384021a.size()) {
                    (i != 0 ? i != 1 ? i != 2 ? bVar.f384025e : bVar.f384024d : bVar.f384023c : bVar.f384022b).f384020k = fArr[i];
                    i++;
                }
            }
            boolean c = this.f384078i.mo116503c(this.f384077h, this.f384076g, this.f384071b);
            C141493o oVar = this.f384075f;
            if (oVar != null) {
                oVar.mo116493c();
            }
            if (!c) {
                this.f384081l = true;
                if (!this.f384070a.isStarted()) {
                    this.f384076g = 0;
                    m229660d();
                }
            }
        }
    }
}
