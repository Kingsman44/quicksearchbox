package androidx.media3.extractor.p172k;

import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.k.ap */
/* compiled from: PG */
public final class C3543ap {

    /* renamed from: a */
    public final int f11104a;

    /* renamed from: b */
    public final String f11105b;

    /* renamed from: c */
    public final List f11106c;

    /* renamed from: d */
    public final byte[] f11107d;

    public C3543ap(int i, String str, List list, byte[] bArr) {
        List list2;
        this.f11104a = i;
        this.f11105b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f11106c = list2;
        this.f11107d = bArr;
    }
}
