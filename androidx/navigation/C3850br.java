package androidx.navigation;

import android.os.Bundle;
import com.android.launcher3.LauncherBackupAgentHelper;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69748a;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.navigation.br */
/* compiled from: PG */
public final class C3850br extends C3860ca {
    public C3850br() {
        super(false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8103a(String str) {
        String str2;
        long j;
        C69664n.m101061g(str, "value");
        if (C69764m.m101230i(str, LauncherBackupAgentHelper.LAUNCHER_DATA_PREFIX)) {
            str2 = str.substring(0, str.length() - 1);
            C69664n.m101060f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str2 = str;
        }
        if (C69764m.m101234m(str, "0x")) {
            String substring = str2.substring(2);
            C69664n.m101060f(substring, "this as java.lang.String).substring(startIndex)");
            C69748a.m101208b(16);
            j = Long.parseLong(substring, 16);
        } else {
            j = Long.parseLong(str2);
        }
        return Long.valueOf(j);
    }

    /* renamed from: b */
    public final String mo8104b() {
        return "long";
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8105c(Bundle bundle, String str, Object obj) {
        long longValue = ((Number) obj).longValue();
        C69664n.m101061g(str, "key");
        bundle.putLong(str, longValue);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        Object obj = bundle.get(str);
        if (obj != null) {
            ((Long) obj).longValue();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }
}
