package com.google.android.apps.search.googleapp.search.suggest.p10449b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.i */
/* compiled from: PG */
public final class C138052i {

    /* renamed from: a */
    private static final int[] f375619a;

    /* renamed from: b */
    private static final int f375620b;

    /* renamed from: c */
    private final Object f375621c = new Object();

    /* renamed from: d */
    private int f375622d;

    /* renamed from: e */
    private int[] f375623e = new int[(f375620b + 1)];

    /* renamed from: f */
    private int f375624f;

    static {
        int[] iArr = {0, 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
        f375619a = iArr;
        f375620b = iArr[19] + 1;
    }

    /* renamed from: a */
    public final C138051h mo114097a() {
        C138036a aVar;
        synchronized (this.f375621c) {
            int i = this.f375624f;
            int i2 = this.f375622d;
            int[] iArr = this.f375623e;
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == 0) {
                    i3++;
                } else {
                    if (sb.length() > 0) {
                        sb.append("j");
                    }
                    if (i3 == 1) {
                        sb.append("0j");
                    } else if (i3 > 1) {
                        sb.append(i4);
                        sb.append("-");
                    }
                    sb.append(i5);
                    i3 = 0;
                }
            }
            aVar = new C138036a(i, i2, sb.toString());
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo114098b(int i) {
        if (i >= 0) {
            synchronized (this.f375621c) {
                this.f375624f += i;
                if (i > this.f375622d) {
                    this.f375622d = i;
                }
                if (((long) i) <= 1999) {
                    int i2 = f375619a[i / 100];
                    int[] iArr = this.f375623e;
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    int[] iArr2 = this.f375623e;
                    int i3 = f375620b;
                    iArr2[i3] = iArr2[i3] + 1;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo114099c() {
        synchronized (this.f375621c) {
            this.f375622d = 0;
            this.f375623e = new int[(f375620b + 1)];
            this.f375624f = 0;
        }
    }
}
