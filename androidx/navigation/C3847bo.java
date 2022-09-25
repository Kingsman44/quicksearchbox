package androidx.navigation;

import android.os.Bundle;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.bo */
/* compiled from: PG */
public final class C3847bo extends C3860ca {
    public C3847bo() {
        super(true);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8103a(String str) {
        C69664n.m101061g(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* renamed from: b */
    public final String mo8104b() {
        return "integer[]";
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8105c(Bundle bundle, String str, Object obj) {
        C69664n.m101061g(str, "key");
        bundle.putIntArray(str, (int[]) obj);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        int[] iArr = (int[]) bundle.get(str);
    }
}
