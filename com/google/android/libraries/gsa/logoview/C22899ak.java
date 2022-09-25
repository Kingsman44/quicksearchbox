package com.google.android.libraries.gsa.logoview;

import android.animation.TimeAnimator;
import android.util.SparseArray;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.libraries.gsa.logoview.ak */
/* compiled from: PG */
public final class C22899ak implements TimeAnimator.TimeListener {

    /* renamed from: a */
    public final TimeAnimator f63051a;

    /* renamed from: b */
    public final C22904b f63052b;

    /* renamed from: c */
    public final C22900al f63053c;

    /* renamed from: d */
    public final ArrayDeque f63054d = new ArrayDeque();

    /* renamed from: e */
    public C22898aj f63055e;

    /* renamed from: f */
    public C22901am f63056f;

    /* renamed from: g */
    public long f63057g;

    /* renamed from: h */
    public long f63058h;

    /* renamed from: i */
    public C22897ai f63059i = C22897ai.f63025b;

    /* renamed from: j */
    public int f63060j;

    /* renamed from: k */
    public int f63061k;

    /* renamed from: l */
    public boolean f63062l;

    /* renamed from: m */
    private final float[] f63063m = new float[4];

    /* renamed from: n */
    private final SparseArray f63064n = new SparseArray();

    public C22899ak(C22904b bVar, TimeAnimator timeAnimator, C22898aj ajVar, C22900al alVar) {
        this.f63052b = bVar;
        this.f63051a = timeAnimator;
        this.f63055e = ajVar;
        this.f63053c = alVar;
        this.f63060j = 0;
        this.f63059i = C22897ai.f63025b;
        timeAnimator.setTimeListener(this);
    }

    /* renamed from: a */
    public final Deque mo28245a(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (i != 8) {
            arrayDeque.addFirst(Integer.valueOf(i));
            i = i != 6 ? 8 : 5;
        }
        return arrayDeque;
    }

    /* renamed from: b */
    public final void mo28246b() {
        if (this.f63051a.isStarted()) {
            this.f63051a.resume();
        } else {
            this.f63051a.start();
        }
    }

    /* renamed from: c */
    public final void mo28247c(C22885a aVar, int i) {
        this.f63064n.put(i, aVar);
        if (i == this.f63060j && aVar != null) {
            aVar.mo24646a();
        }
    }

    /* renamed from: d */
    public final void mo28248d(C22897ai aiVar) {
        this.f63059i.mo28242b(this.f63052b);
        if (!(aiVar == null || this.f63056f == null)) {
            int d = C22900al.m42824d(this.f63060j);
            if (d == C22900al.m42824d(this.f63061k)) {
                this.f63056f.mo28251i(this.f63060j);
                C58976aa aaVar = C58975e.f156826a;
            } else if (this.f63059i == C22900al.m42822b(d)) {
                C58976aa aaVar2 = C58975e.f156826a;
            } else if (this.f63059i == C22900al.m42821a(d)) {
                C58976aa aaVar3 = C58975e.f156826a;
            }
        }
        if (aiVar == null) {
            this.f63051a.end();
        } else {
            this.f63059i = aiVar;
            int i = this.f63061k;
            if (!(i == 0 || i == this.f63060j)) {
                C22897ai a = C22900al.m42821a(C22900al.m42824d(i));
                C22897ai c = C22900al.m42823c(this.f63061k);
                C22897ai aiVar2 = this.f63059i;
                if (aiVar2 == a || aiVar2 == c) {
                    this.f63051a.isStarted();
                    int i2 = this.f63061k;
                    this.f63060j = i2;
                    this.f63061k = 0;
                    C22885a aVar = (C22885a) this.f63064n.get(i2);
                    if (aVar != null) {
                        aVar.mo24646a();
                    }
                }
            }
            this.f63059i.mo28241a(this.f63052b);
            if (this.f63056f != null) {
                int d2 = C22900al.m42824d(this.f63060j);
                if (d2 == C22900al.m42824d(this.f63061k)) {
                    this.f63056f.mo28252j(this.f63060j);
                    C58976aa aaVar4 = C58975e.f156826a;
                } else if (this.f63059i == C22900al.m42822b(d2)) {
                    this.f63056f.mo28251i(this.f63060j);
                } else if (this.f63059i == C22900al.m42821a(d2)) {
                    this.f63056f.mo28252j(this.f63060j);
                }
            }
            this.f63058h = this.f63057g;
        }
        C22898aj ajVar = this.f63055e;
        if (ajVar != null) {
            ajVar.mo28222b();
        }
    }

    /* renamed from: e */
    public final void mo28249e() {
        this.f63062l = true;
        if (!this.f63051a.isStarted()) {
            this.f63057g = 0;
            this.f63051a.start();
        }
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        int i = 0;
        if (this.f63062l) {
            this.f63062l = false;
            mo28248d((C22897ai) this.f63054d.pollFirst());
        }
        if (this.f63051a.isStarted()) {
            this.f63057g = j;
            C22885a aVar = (C22885a) this.f63064n.get(this.f63060j);
            if (aVar != null) {
                aVar.mo24647b(this.f63057g, this.f63063m);
                C22904b bVar = this.f63052b;
                float[] fArr = this.f63063m;
                while (i < 4 && i < bVar.f63076a.size()) {
                    (i != 0 ? i != 1 ? i != 2 ? bVar.f63085j ? bVar.f63081f : bVar.f63080e : bVar.f63079d : bVar.f63078c : bVar.f63077b).f63075k = fArr[i];
                    i++;
                }
            }
            boolean c = this.f63059i.mo28243c(this.f63058h, this.f63057g, this.f63052b);
            C22898aj ajVar = this.f63055e;
            if (ajVar != null) {
                ajVar.mo28222b();
            }
            if (!c) {
                mo28249e();
            }
        }
    }
}
