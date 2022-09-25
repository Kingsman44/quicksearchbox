package androidx.p182p.p185c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.c.j */
/* compiled from: PG */
public final class C3948j implements Comparable {

    /* renamed from: a */
    public final int f12626a;

    /* renamed from: b */
    public final String f12627b;

    /* renamed from: c */
    public final String f12628c;

    /* renamed from: d */
    private final int f12629d;

    public C3948j(int i, int i2, String str, String str2) {
        C69664n.m101061g(str, "from");
        C69664n.m101061g(str2, "to");
        this.f12626a = i;
        this.f12629d = i2;
        this.f12627b = str;
        this.f12628c = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C3948j jVar = (C3948j) obj;
        C69664n.m101061g(jVar, "other");
        int i = this.f12626a - jVar.f12626a;
        return i == 0 ? this.f12629d - jVar.f12629d : i;
    }
}
