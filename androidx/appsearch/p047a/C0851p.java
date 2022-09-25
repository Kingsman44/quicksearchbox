package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.appsearch.a.p */
/* compiled from: PG */
public final class C0851p {

    /* renamed from: a */
    private final String f2835a;

    /* renamed from: b */
    private int f2836b = 2;

    /* renamed from: c */
    private int f2837c = 0;

    /* renamed from: d */
    private int f2838d = 0;

    public C0851p(String str) {
        this.f2835a = str;
    }

    /* renamed from: a */
    public final C0852q mo3411a() {
        boolean z = false;
        if (this.f2838d == 0) {
            if (this.f2837c == 0) {
                z = true;
            }
            C1974i.m5315c(z, "Cannot set TOKENIZER_TYPE_NONE with an indexing type other than INDEXING_TYPE_NONE.");
        } else {
            if (this.f2837c != 0) {
                z = true;
            }
            C1974i.m5315c(z, "Cannot set TOKENIZER_TYPE_PLAIN  with INDEXING_TYPE_NONE.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("name", this.f2835a);
        bundle.putInt("dataType", 1);
        bundle.putInt("cardinality", this.f2836b);
        bundle.putInt("indexingType", this.f2837c);
        bundle.putInt("tokenizerType", this.f2838d);
        return new C0852q(bundle);
    }

    /* renamed from: b */
    public final void mo3412b(int i) {
        C1974i.m5316d(i, 1, 3, "cardinality");
        this.f2836b = i;
    }

    /* renamed from: c */
    public final void mo3413c(int i) {
        C1974i.m5316d(i, 0, 2, "indexingType");
        this.f2837c = i;
    }

    /* renamed from: d */
    public final void mo3414d(int i) {
        C1974i.m5316d(i, 0, 1, "tokenizerType");
        this.f2838d = i;
    }
}
