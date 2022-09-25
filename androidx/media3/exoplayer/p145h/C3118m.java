package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2683a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.h.m */
/* compiled from: PG */
final class C3118m extends C2683a {

    /* renamed from: a */
    private final int f9136a;

    /* renamed from: b */
    private final int f9137b;

    /* renamed from: d */
    private final int[] f9138d;

    /* renamed from: e */
    private final int[] f9139e;

    /* renamed from: f */
    private final C2651bm[] f9140f;

    /* renamed from: g */
    private final Object[] f9141g;

    /* renamed from: h */
    private final HashMap f9142h = new HashMap();

    public C3118m(Collection collection, C3098ci ciVar) {
        super(ciVar);
        int size = collection.size();
        this.f9138d = new int[size];
        this.f9139e = new int[size];
        this.f9140f = new C2651bm[size];
        this.f9141g = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C3121p pVar = (C3121p) it.next();
            C2651bm[] bmVarArr = this.f9140f;
            C3029al alVar = pVar.f9143a.f8786a;
            bmVarArr[i3] = alVar;
            this.f9139e[i3] = i;
            this.f9138d[i3] = i2;
            i += alVar.f8765a.mo6022c();
            i2 += this.f9140f[i3].mo6021b();
            Object[] objArr = this.f9141g;
            Object obj = pVar.f9144b;
            objArr[i3] = obj;
            this.f9142h.put(obj, Integer.valueOf(i3));
            i3++;
        }
        this.f9136a = i;
        this.f9137b = i2;
    }

    /* renamed from: b */
    public final int mo6021b() {
        return this.f9137b;
    }

    /* renamed from: c */
    public final int mo6022c() {
        return this.f9136a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo6365p(Object obj) {
        Integer num = (Integer) this.f9142h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo6366q(int i) {
        return C2612ak.m6978c(this.f9138d, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo6367r(int i) {
        return C2612ak.m6978c(this.f9139e, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo6368s(int i) {
        return this.f9138d[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo6369t(int i) {
        return this.f9139e[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C2651bm mo6370u(int i) {
        return this.f9140f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo6371v(int i) {
        return this.f9141g[i];
    }
}
