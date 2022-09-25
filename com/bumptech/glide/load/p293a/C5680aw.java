package com.bumptech.glide.load.p293a;

import com.bumptech.glide.C6003v;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.bumptech.glide.p286e.C5552e;
import com.bumptech.glide.p291h.C5629p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.aw */
/* compiled from: PG */
final class C5680aw implements C5719l, C5929d {

    /* renamed from: a */
    private final C5718k f17129a;

    /* renamed from: b */
    private final C5720m f17130b;

    /* renamed from: c */
    private int f17131c;

    /* renamed from: d */
    private int f17132d = -1;

    /* renamed from: e */
    private C5955n f17133e;

    /* renamed from: f */
    private List f17134f;

    /* renamed from: g */
    private int f17135g;

    /* renamed from: h */
    private volatile C5763ao f17136h;

    /* renamed from: i */
    private File f17137i;

    /* renamed from: j */
    private C5681ax f17138j;

    public C5680aw(C5720m mVar, C5718k kVar) {
        this.f17130b = mVar;
        this.f17129a = kVar;
    }

    /* renamed from: c */
    private final boolean m14750c() {
        return this.f17135g < this.f17134f.size();
    }

    /* renamed from: a */
    public final void mo12181a() {
        C5763ao aoVar = this.f17136h;
        if (aoVar != null) {
            aoVar.f17348c.mo11923c();
        }
    }

    /* renamed from: b */
    public final boolean mo12182b() {
        List list;
        List c = this.f17130b.mo12228c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        C5720m mVar = this.f17130b;
        C6003v a = mVar.f17224c.mo12092a();
        Class<?> cls = mVar.f17225d.getClass();
        Class cls2 = mVar.f17228g;
        Class cls3 = mVar.f17231j;
        C5552e eVar = a.f17687h;
        C5629p pVar = (C5629p) eVar.f16803a.getAndSet((Object) null);
        if (pVar == null) {
            pVar = new C5629p(cls, cls2, cls3);
        } else {
            pVar.mo12088a(cls, cls2, cls3);
        }
        synchronized (eVar.f16804b) {
            list = (List) eVar.f16804b.get(pVar);
        }
        eVar.f16803a.set(pVar);
        if (list == null) {
            list = new ArrayList();
            for (Class b : a.f17680a.mo12271a(cls)) {
                for (Class cls4 : a.f17682c.mo11942b(b, cls2)) {
                    if (!a.f17685f.mo12374b(cls4, cls3).isEmpty() && !list.contains(cls4)) {
                        list.add(cls4);
                    }
                }
            }
            C5552e eVar2 = a.f17687h;
            List unmodifiableList = Collections.unmodifiableList(list);
            synchronized (eVar2.f16804b) {
                eVar2.f16804b.put(new C5629p(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (!list.isEmpty()) {
            while (true) {
                if (this.f17134f != null) {
                    if (m14750c()) {
                        this.f17136h = null;
                        while (!z && m14750c()) {
                            List list2 = this.f17134f;
                            int i = this.f17135g;
                            this.f17135g = i + 1;
                            File file = this.f17137i;
                            C5720m mVar2 = this.f17130b;
                            this.f17136h = ((C5764ap) list2.get(i)).mo11928a(file, mVar2.f17226e, mVar2.f17227f, mVar2.f17229h);
                            if (this.f17136h != null && this.f17130b.mo12231f(this.f17136h.f17348c.mo11922b())) {
                                this.f17136h.f17348c.mo11925e(this.f17130b.f17235n, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i2 = this.f17132d + 1;
                this.f17132d = i2;
                if (i2 >= list.size()) {
                    int i3 = this.f17131c + 1;
                    this.f17131c = i3;
                    if (i3 >= c.size()) {
                        return false;
                    }
                    this.f17132d = 0;
                }
                C5955n nVar = (C5955n) c.get(this.f17131c);
                Class cls5 = (Class) list.get(this.f17132d);
                C5964w a2 = this.f17130b.mo12226a(cls5);
                C5720m mVar3 = this.f17130b;
                this.f17138j = new C5681ax(mVar3.f17224c.f16993b, nVar, mVar3.f17234m, mVar3.f17226e, mVar3.f17227f, a2, cls5, mVar3.f17229h);
                File a3 = mVar3.f17239r.mo12137a().mo12190a(this.f17138j);
                this.f17137i = a3;
                if (a3 != null) {
                    this.f17133e = nVar;
                    this.f17134f = this.f17130b.mo12230e(a3);
                    this.f17135g = 0;
                }
            }
        } else if (File.class.equals(this.f17130b.f17231j)) {
            return false;
        } else {
            String valueOf = String.valueOf(this.f17130b.f17225d.getClass());
            String valueOf2 = String.valueOf(this.f17130b.f17231j);
            throw new IllegalStateException("Failed to find any load path from " + valueOf + " to " + valueOf2);
        }
    }

    /* renamed from: f */
    public final void mo12183f(Object obj) {
        this.f17129a.mo12200d(this.f17133e, obj, this.f17136h.f17348c, C5637a.RESOURCE_DISK_CACHE, this.f17138j);
    }

    /* renamed from: g */
    public final void mo12184g(Exception exc) {
        this.f17129a.mo12199c(this.f17138j, exc, this.f17136h.f17348c, C5637a.RESOURCE_DISK_CACHE);
    }
}
