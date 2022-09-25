package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.cast.framework.media.v */
/* compiled from: PG */
public final class C143535v {

    /* renamed from: a */
    public final C143566ae f389213a = new C143566ae("MediaQueue");

    /* renamed from: b */
    long f389214b;

    /* renamed from: c */
    public final C143500bf f389215c;

    /* renamed from: d */
    public List f389216d;

    /* renamed from: e */
    final SparseIntArray f389217e;

    /* renamed from: f */
    final LruCache f389218f;

    /* renamed from: g */
    final List f389219g;

    /* renamed from: h */
    final Deque f389220h;

    /* renamed from: i */
    public C143854z f389221i;

    /* renamed from: j */
    public C143854z f389222j;

    /* renamed from: k */
    public final Set f389223k = Collections.synchronizedSet(new HashSet());

    /* renamed from: l */
    private final Handler f389224l;

    /* renamed from: m */
    private final TimerTask f389225m;

    public C143535v(C143500bf bfVar) {
        this.f389215c = bfVar;
        Math.max(20, 1);
        this.f389216d = new ArrayList();
        this.f389217e = new SparseIntArray();
        this.f389219g = new ArrayList();
        this.f389220h = new ArrayDeque(20);
        this.f389224l = new C144861c(Looper.getMainLooper());
        this.f389225m = new C143531r(this);
        bfVar.mo118786n(new C143534u(this));
        this.f389218f = new C143532s(this);
        this.f389214b = mo118830a();
        mo118836g();
    }

    /* renamed from: j */
    private final void m233090j() {
        this.f389224l.removeCallbacks(this.f389225m);
    }

    /* renamed from: k */
    private final void m233091k() {
        C143854z zVar = this.f389222j;
        if (zVar != null) {
            zVar.mo117320e();
            this.f389222j = null;
        }
    }

    /* renamed from: l */
    private final void m233092l() {
        C143854z zVar = this.f389221i;
        if (zVar != null) {
            zVar.mo117320e();
            this.f389221i = null;
        }
    }

    /* renamed from: a */
    public final long mo118830a() {
        MediaStatus i = this.f389215c.mo118781i();
        if (i == null) {
            return 0;
        }
        MediaInfo mediaInfo = i.f388699a;
        if (MediaStatus.m232574f(i.f388703e, i.f388704f, i.f388710l, mediaInfo == null ? -1 : mediaInfo.f388635b)) {
            return 0;
        }
        return i.f388700b;
    }

    /* renamed from: b */
    public final void mo118831b() {
        mo118834e();
        this.f389216d.clear();
        this.f389217e.clear();
        this.f389218f.evictAll();
        this.f389219g.clear();
        m233090j();
        this.f389220h.clear();
        m233091k();
        m233092l();
        mo118833d();
        mo118832c();
    }

    /* renamed from: c */
    public final void mo118832c() {
        synchronized (this.f389223k) {
            Iterator it = this.f389223k.iterator();
            if (it.hasNext()) {
                C143533t tVar = (C143533t) it.next();
                throw null;
            }
        }
    }

    /* renamed from: d */
    public final void mo118833d() {
        synchronized (this.f389223k) {
            Iterator it = this.f389223k.iterator();
            if (it.hasNext()) {
                C143533t tVar = (C143533t) it.next();
                throw null;
            }
        }
    }

    /* renamed from: e */
    public final void mo118834e() {
        synchronized (this.f389223k) {
            Iterator it = this.f389223k.iterator();
            if (it.hasNext()) {
                C143533t tVar = (C143533t) it.next();
                throw null;
            }
        }
    }

    /* renamed from: f */
    public final void mo118835f() {
        this.f389217e.clear();
        for (int i = 0; i < this.f389216d.size(); i++) {
            this.f389217e.put(((Integer) this.f389216d.get(i)).intValue(), i);
        }
    }

    /* renamed from: g */
    public final void mo118836g() {
        C143477aj ajVar;
        C143919bh.m233964g("Must be called from the main thread.");
        if (this.f389214b != 0 && this.f389222j == null) {
            m233091k();
            m233092l();
            C143500bf bfVar = this.f389215c;
            C143919bh.m233964g("Must be called from the main thread.");
            if (!bfVar.mo118792t()) {
                ajVar = C143500bf.m232974D();
            } else {
                C143477aj ajVar2 = new C143477aj(bfVar);
                bfVar.mo118765E(ajVar2);
                ajVar = ajVar2;
            }
            this.f389222j = ajVar;
            ajVar.mo117321f(new C143529p(this));
        }
    }

    /* renamed from: h */
    public final void mo118837h() {
        m233090j();
        this.f389224l.postDelayed(this.f389225m, 500);
    }

    /* renamed from: i */
    public final void mo118838i() {
        synchronized (this.f389223k) {
            Iterator it = this.f389223k.iterator();
            if (it.hasNext()) {
                C143533t tVar = (C143533t) it.next();
                throw null;
            }
        }
    }
}
