package org.p5623b.p5624a;

/* renamed from: org.b.a.cg */
/* compiled from: PG */
public final class C72089cg {

    /* renamed from: a */
    public int f191909a = 0;

    /* renamed from: b */
    private final String f191910b;

    public C72089cg(String str) {
        this.f191910b = str;
    }

    /* renamed from: a */
    public final String mo63277a() {
        int i = this.f191909a;
        if (i == -1) {
            return null;
        }
        int indexOf = this.f191910b.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.f191910b.substring(this.f191909a);
            this.f191909a = -1;
            return substring;
        }
        String substring2 = this.f191910b.substring(this.f191909a, indexOf);
        this.f191909a = indexOf + 1;
        return substring2;
    }
}
