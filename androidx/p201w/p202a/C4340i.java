package androidx.p201w.p202a;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.w.a.i */
/* compiled from: PG */
public abstract class C4340i implements C4350s {

    /* renamed from: a */
    public static final Set f13958a = new HashSet();

    /* renamed from: b */
    private final String f13959b;

    /* renamed from: c */
    private final String f13960c;

    public C4340i(String str, String str2) {
        this.f13959b = str;
        this.f13960c = str2;
        f13958a.add(this);
    }

    /* renamed from: a */
    public abstract boolean mo9274a();

    /* renamed from: b */
    public final String mo9275b() {
        return this.f13959b;
    }

    /* renamed from: c */
    public final boolean mo9276c() {
        return mo9274a() || mo9267d();
    }

    /* renamed from: d */
    public boolean mo9267d() {
        Set set = C4323a.f13947a;
        String str = this.f13960c;
        if (set.contains(str)) {
            return true;
        }
        if (("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) && set.contains(str.concat(":dev"))) {
            return true;
        }
        return false;
    }
}
