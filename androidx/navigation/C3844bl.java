package androidx.navigation;

import android.os.Bundle;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.bl */
/* compiled from: PG */
public final class C3844bl extends C3860ca {
    public C3844bl() {
        super(false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8103a(String str) {
        boolean z;
        C69664n.m101061g(str, "value");
        if (C69664n.m101066l(str, "true")) {
            z = true;
        } else if (C69664n.m101066l(str, "false")) {
            z = false;
        } else {
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final String mo8104b() {
        return "boolean";
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8105c(Bundle bundle, String str, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C69664n.m101061g(str, "key");
        bundle.putBoolean(str, booleanValue);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        Boolean bool = (Boolean) bundle.get(str);
    }
}
