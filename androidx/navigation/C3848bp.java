package androidx.navigation;

import android.os.Bundle;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69748a;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.navigation.bp */
/* compiled from: PG */
public final class C3848bp extends C3860ca {
    public C3848bp() {
        super(false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8103a(String str) {
        int i;
        C69664n.m101061g(str, "value");
        if (C69764m.m101234m(str, "0x")) {
            String substring = str.substring(2);
            C69664n.m101060f(substring, "this as java.lang.String).substring(startIndex)");
            C69748a.m101208b(16);
            i = Integer.parseInt(substring, 16);
        } else {
            i = Integer.parseInt(str);
        }
        return Integer.valueOf(i);
    }

    /* renamed from: b */
    public final String mo8104b() {
        return "integer";
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8105c(Bundle bundle, String str, Object obj) {
        int intValue = ((Number) obj).intValue();
        C69664n.m101061g(str, "key");
        bundle.putInt(str, intValue);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        Object obj = bundle.get(str);
        if (obj != null) {
            ((Integer) obj).intValue();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
