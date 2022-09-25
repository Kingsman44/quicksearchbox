package androidx.media3.exoplayer;

import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.C3098ci;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.cu */
/* compiled from: PG */
final class C2892cu extends C2683a {

    /* renamed from: a */
    public final int f8194a;

    /* renamed from: b */
    public final C2651bm[] f8195b;

    /* renamed from: d */
    private final int f8196d;

    /* renamed from: e */
    private final int[] f8197e;

    /* renamed from: f */
    private final int[] f8198f;

    /* renamed from: g */
    private final Object[] f8199g;

    /* renamed from: h */
    private final HashMap f8200h = new HashMap();

    public C2892cu(Collection collection, C3098ci ciVar) {
        super(ciVar);
        int size = collection.size();
        this.f8197e = new int[size];
        this.f8198f = new int[size];
        this.f8195b = new C2651bm[size];
        this.f8199g = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C2881cj cjVar = (C2881cj) it.next();
            this.f8195b[i3] = cjVar.mo6583a();
            this.f8198f[i3] = i;
            this.f8197e[i3] = i2;
            i += this.f8195b[i3].mo6022c();
            i2 += this.f8195b[i3].mo6021b();
            this.f8199g[i3] = cjVar.mo6584b();
            this.f8200h.put(this.f8199g[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f8194a = i;
        this.f8196d = i2;
    }

    /* renamed from: b */
    public final int mo6021b() {
        return this.f8196d;
    }

    /* renamed from: c */
    public final int mo6022c() {
        return this.f8194a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo6365p(Object obj) {
        Integer num = (Integer) this.f8200h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo6366q(int i) {
        return C2612ak.m6978c(this.f8197e, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo6367r(int i) {
        return C2612ak.m6978c(this.f8198f, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo6368s(int i) {
        return this.f8197e[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo6369t(int i) {
        return this.f8198f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C2651bm mo6370u(int i) {
        return this.f8195b[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo6371v(int i) {
        return this.f8199g[i];
    }
}
