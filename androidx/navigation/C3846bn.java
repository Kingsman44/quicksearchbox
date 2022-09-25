package androidx.navigation;

import android.os.Bundle;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.bn */
/* compiled from: PG */
public final class C3846bn extends C3860ca {
    public C3846bn() {
        super(false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8103a(String str) {
        C69664n.m101061g(str, "value");
        return Float.valueOf(Float.parseFloat(str));
    }

    /* renamed from: b */
    public final String mo8104b() {
        return "float";
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8105c(Bundle bundle, String str, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        C69664n.m101061g(str, "key");
        bundle.putFloat(str, floatValue);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        Object obj = bundle.get(str);
        if (obj != null) {
            ((Float) obj).floatValue();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }
}
