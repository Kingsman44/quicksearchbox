package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.h */
/* compiled from: PG */
final class C5715h implements C5719l, C5929d {

    /* renamed from: a */
    private final List f17208a;

    /* renamed from: b */
    private final C5720m f17209b;

    /* renamed from: c */
    private final C5718k f17210c;

    /* renamed from: d */
    private int f17211d = -1;

    /* renamed from: e */
    private C5955n f17212e;

    /* renamed from: f */
    private List f17213f;

    /* renamed from: g */
    private int f17214g;

    /* renamed from: h */
    private volatile C5763ao f17215h;

    /* renamed from: i */
    private File f17216i;

    public C5715h(List list, C5720m mVar, C5718k kVar) {
        this.f17208a = list;
        this.f17209b = mVar;
        this.f17210c = kVar;
    }

    /* renamed from: c */
    private final boolean m14796c() {
        return this.f17214g < this.f17213f.size();
    }

    /* renamed from: a */
    public final void mo12181a() {
        C5763ao aoVar = this.f17215h;
        if (aoVar != null) {
            aoVar.f17348c.mo11923c();
        }
    }

    /* renamed from: b */
    public final boolean mo12182b() {
        while (true) {
            boolean z = false;
            if (this.f17213f != null) {
                if (m14796c()) {
                    this.f17215h = null;
                    while (!z && m14796c()) {
                        List list = this.f17213f;
                        int i = this.f17214g;
                        this.f17214g = i + 1;
                        File file = this.f17216i;
                        C5720m mVar = this.f17209b;
                        this.f17215h = ((C5764ap) list.get(i)).mo11928a(file, mVar.f17226e, mVar.f17227f, mVar.f17229h);
                        if (this.f17215h != null && this.f17209b.mo12231f(this.f17215h.f17348c.mo11922b())) {
                            this.f17215h.f17348c.mo11925e(this.f17209b.f17235n, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f17211d + 1;
            this.f17211d = i2;
            if (i2 >= this.f17208a.size()) {
                return false;
            }
            C5955n nVar = (C5955n) this.f17208a.get(this.f17211d);
            C5720m mVar2 = this.f17209b;
            File a = mVar2.f17239r.mo12137a().mo12190a(new C5716i(nVar, mVar2.f17234m));
            this.f17216i = a;
            if (a != null) {
                this.f17212e = nVar;
                this.f17213f = this.f17209b.mo12230e(a);
                this.f17214g = 0;
            }
        }
    }

    /* renamed from: f */
    public final void mo12183f(Object obj) {
        this.f17210c.mo12200d(this.f17212e, obj, this.f17215h.f17348c, C5637a.DATA_DISK_CACHE, this.f17212e);
    }

    /* renamed from: g */
    public final void mo12184g(Exception exc) {
        this.f17210c.mo12199c(this.f17212e, exc, this.f17215h.f17348c, C5637a.DATA_DISK_CACHE);
    }
}
