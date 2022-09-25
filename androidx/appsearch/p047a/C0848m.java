package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.appsearch.a.m */
/* compiled from: PG */
public final class C0848m {

    /* renamed from: a */
    private final String f2831a;

    /* renamed from: b */
    private int f2832b = 2;

    public C0848m(String str) {
        this.f2831a = str;
    }

    /* renamed from: a */
    public final C0849n mo3402a() {
        Bundle bundle = new Bundle();
        bundle.putString("name", this.f2831a);
        bundle.putInt("dataType", 2);
        bundle.putInt("cardinality", this.f2832b);
        return new C0849n(bundle);
    }

    /* renamed from: b */
    public final void mo3403b(int i) {
        C1974i.m5316d(i, 1, 3, "cardinality");
        this.f2832b = i;
    }
}
