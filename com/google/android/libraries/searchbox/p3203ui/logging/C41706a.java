package com.google.android.libraries.searchbox.p3203ui.logging;

/* renamed from: com.google.android.libraries.searchbox.ui.logging.a */
/* compiled from: PG */
public final class C41706a extends C41708c {

    /* renamed from: a */
    private int[] f109082a;

    /* renamed from: b */
    private int f109083b;

    /* renamed from: c */
    private int f109084c;

    /* renamed from: d */
    private byte f109085d;

    /* renamed from: a */
    public final ParcelableQueryBuilderTap mo44305a() {
        int[] iArr;
        if (this.f109085d == 3 && (iArr = this.f109082a) != null) {
            return new AutoValue_ParcelableQueryBuilderTap(iArr, this.f109083b, this.f109084c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f109082a == null) {
            sb.append(" subtypes");
        }
        if ((this.f109085d & 1) == 0) {
            sb.append(" savedChars");
        }
        if ((this.f109085d & 2) == 0) {
            sb.append(" index");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo44306b(int i) {
        this.f109084c = i;
        this.f109085d = (byte) (this.f109085d | 2);
    }

    /* renamed from: c */
    public final void mo44307c(int i) {
        this.f109083b = i;
        this.f109085d = (byte) (this.f109085d | 1);
    }

    /* renamed from: d */
    public final void mo44308d(int[] iArr) {
        if (iArr != null) {
            this.f109082a = iArr;
            return;
        }
        throw new NullPointerException("Null subtypes");
    }
}
