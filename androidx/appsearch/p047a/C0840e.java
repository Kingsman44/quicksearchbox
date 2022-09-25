package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.appsearch.a.e */
/* compiled from: PG */
public final class C0840e {

    /* renamed from: a */
    private final String f2820a;

    /* renamed from: b */
    private int f2821b = 2;

    public C0840e(String str) {
        this.f2820a = str;
    }

    /* renamed from: a */
    public final C0841f mo3392a() {
        Bundle bundle = new Bundle();
        bundle.putString("name", this.f2820a);
        bundle.putInt("dataType", 4);
        bundle.putInt("cardinality", this.f2821b);
        return new C0841f(bundle);
    }

    /* renamed from: b */
    public final void mo3393b() {
        C1974i.m5316d(2, 1, 3, "cardinality");
        this.f2821b = 2;
    }
}
