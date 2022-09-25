package androidx.appsearch.p047a;

import androidx.appsearch.p048b.C0862a;
import com.evernote.android.state.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.appsearch.a.u */
/* compiled from: PG */
public final class C0856u {

    /* renamed from: a */
    private static volatile C0856u f2840a;

    /* renamed from: b */
    private final Map f2841b = new HashMap();

    private C0856u() {
    }

    /* renamed from: b */
    public static C0856u m2718b() {
        if (f2840a == null) {
            synchronized (C0856u.class) {
                if (f2840a == null) {
                    f2840a = new C0856u();
                }
            }
        }
        return f2840a;
    }

    /* renamed from: a */
    public final C0855t mo3429a(Class cls) {
        C0855t tVar;
        String str;
        cls.getClass();
        synchronized (this) {
            tVar = (C0855t) this.f2841b.get(cls);
        }
        if (tVar == null) {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (canonicalName != null) {
                if (packageR != null) {
                    str = String.valueOf(packageR.getName()).concat(".");
                    canonicalName = canonicalName.substring(str.length()).replace(".", "$$__");
                } else {
                    str = BuildConfig.FLAVOR;
                }
                String str2 = str + "$$__AppSearch__" + canonicalName;
                try {
                    try {
                        tVar = (C0855t) Class.forName(str2).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        synchronized (this) {
                            C0855t tVar2 = (C0855t) this.f2841b.get(cls);
                            if (tVar2 == null) {
                                this.f2841b.put(cls, tVar);
                            } else {
                                tVar = tVar2;
                            }
                        }
                    } catch (Exception e) {
                        throw new C0862a(2, "Failed to construct document class converter \"" + str2 + "\"", e);
                    }
                } catch (ClassNotFoundException e2) {
                    throw new C0862a(2, "Failed to find document class converter \"" + str2 + "\". Perhaps the annotation processor was not run or the class was proguarded out?", e2);
                }
            } else {
                throw new C0862a(2, "Failed to find simple name for document class \"" + cls + "\". Perhaps it is anonymous?", (Throwable) null);
            }
        }
        return tVar;
    }
}
