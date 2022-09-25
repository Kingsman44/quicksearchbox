package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.appsearch.a.h */
/* compiled from: PG */
public final class C0843h {

    /* renamed from: a */
    private final String f2826a;

    /* renamed from: b */
    private int f2827b = 2;

    public C0843h(String str) {
        this.f2826a = str;
    }

    /* renamed from: a */
    public final C0844i mo3396a() {
        Bundle bundle = new Bundle();
        bundle.putString("name", this.f2826a);
        bundle.putInt("dataType", 5);
        bundle.putInt("cardinality", this.f2827b);
        return new C0844i(bundle);
    }

    /* renamed from: b */
    public final void mo3397b() {
        C1974i.m5316d(2, 1, 3, "cardinality");
        this.f2827b = 2;
    }
}
