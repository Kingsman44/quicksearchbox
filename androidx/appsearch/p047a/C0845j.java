package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.appsearch.a.j */
/* compiled from: PG */
public final class C0845j {

    /* renamed from: a */
    private final String f2828a;

    /* renamed from: b */
    private final String f2829b;

    /* renamed from: c */
    private int f2830c = 2;

    public C0845j(String str, String str2) {
        this.f2828a = str;
        this.f2829b = str2;
    }

    /* renamed from: a */
    public final C0846k mo3398a() {
        Bundle bundle = new Bundle();
        bundle.putString("name", this.f2828a);
        bundle.putInt("dataType", 6);
        bundle.putInt("cardinality", this.f2830c);
        bundle.putBoolean("indexNestedProperties", false);
        bundle.putString("schemaType", this.f2829b);
        return new C0846k(bundle);
    }

    /* renamed from: b */
    public final void mo3399b(int i) {
        C1974i.m5316d(i, 1, 3, "cardinality");
        this.f2830c = i;
    }
}
