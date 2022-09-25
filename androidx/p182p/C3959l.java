package androidx.p182p;

import androidx.p186q.p187a.C4057l;
import java.util.ArrayList;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.l */
/* compiled from: PG */
final class C3959l implements C4057l {

    /* renamed from: a */
    public final String f12647a;

    /* renamed from: b */
    public final ArrayList f12648b = new ArrayList();

    /* renamed from: c */
    private final C3938c f12649c;

    public C3959l(String str, C3938c cVar) {
        C69664n.m101061g(str, "sql");
        this.f12647a = str;
        this.f12649c = cVar;
    }

    /* renamed from: h */
    private final Object m11321h(C69626l lVar) {
        return this.f12649c.mo8222b(new C3957j(this, lVar));
    }

    /* renamed from: i */
    private final void m11322i(int i, Object obj) {
        int size;
        int i2 = i - 1;
        if (i2 >= this.f12648b.size() && (size = this.f12648b.size()) <= i2) {
            while (true) {
                this.f12648b.add((Object) null);
                if (size == i2) {
                    break;
                }
                size++;
            }
        }
        this.f12648b.set(i2, obj);
    }

    /* renamed from: a */
    public final int mo8256a() {
        return ((Number) m11321h(C3958k.f12646a)).intValue();
    }

    /* renamed from: b */
    public final long mo8257b() {
        return ((Number) m11321h(C3956i.f12643a)).longValue();
    }

    /* renamed from: c */
    public final void mo8201c(int i, byte[] bArr) {
        C69664n.m101061g(bArr, "value");
        m11322i(i, bArr);
    }

    public final void close() {
    }

    /* renamed from: d */
    public final void mo8203d(int i, double d) {
        m11322i(i, Double.valueOf(d));
    }

    /* renamed from: e */
    public final void mo8204e(int i, long j) {
        m11322i(i, Long.valueOf(j));
    }

    /* renamed from: f */
    public final void mo8205f(int i) {
        m11322i(i, (Object) null);
    }

    /* renamed from: g */
    public final void mo8206g(int i, String str) {
        C69664n.m101061g(str, "value");
        m11322i(i, str);
    }
}
