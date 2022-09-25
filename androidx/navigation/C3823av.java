package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69734n;

/* renamed from: androidx.navigation.av */
/* compiled from: PG */
public final class C3823av {
    /* renamed from: a */
    public static final String m11043a(String str) {
        return str != null ? "android-app://androidx.navigation/".concat(str) : BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public static final String m11044b(Context context, int i) {
        String str;
        C69664n.m101061g(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            str = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            str = String.valueOf(i);
        }
        C69664n.m101060f(str, "try {\n                co….toString()\n            }");
        return str;
    }

    /* renamed from: c */
    public static final C69731k m11045c(C3825ax axVar) {
        C69664n.m101061g(axVar, "<this>");
        return C69734n.m101178d(axVar, C3822au.f12346a);
    }
}
