package androidx.emoji.p108a;

import androidx.p191s.p192a.p193a.C4080a;
import androidx.p191s.p192a.p193a.C4081b;

/* renamed from: androidx.emoji.a.k */
/* compiled from: PG */
public final class C2201k {

    /* renamed from: d */
    private static final ThreadLocal f6231d = new ThreadLocal();

    /* renamed from: a */
    public final int f6232a;

    /* renamed from: b */
    public final C2215y f6233b;

    /* renamed from: c */
    public volatile int f6234c = 0;

    public C2201k(C2215y yVar, int i) {
        this.f6233b = yVar;
        this.f6232a = i;
    }

    /* renamed from: a */
    public final C4080a mo5518a() {
        ThreadLocal threadLocal = f6231d;
        C4080a aVar = (C4080a) threadLocal.get();
        if (aVar == null) {
            aVar = new C4080a();
            threadLocal.set(aVar);
        }
        C4081b bVar = this.f6233b.f6265a;
        int i = this.f6232a;
        int e = bVar.mo8580e(6);
        if (e != 0) {
            int f = bVar.mo8581f(e) + (i * 4);
            aVar.mo8583h(f + bVar.f13069b.getInt(f), bVar.f13069b);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo5518a().mo8577c()));
        sb.append(", codepoints:");
        int b = mo5518a().mo8576b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(mo5518a().mo8575a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
