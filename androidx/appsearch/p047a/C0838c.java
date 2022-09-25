package androidx.appsearch.p047a;

import android.util.Log;
import androidx.appsearch.p048b.C0862a;
import androidx.core.p097i.C1968c;
import java.io.IOException;

/* renamed from: androidx.appsearch.a.c */
/* compiled from: PG */
public final class C0838c {

    /* renamed from: a */
    public final int f2816a;

    /* renamed from: b */
    public final Object f2817b;

    /* renamed from: c */
    public final String f2818c;

    public C0838c(int i, Object obj, String str) {
        this.f2816a = i;
        this.f2817b = obj;
        this.f2818c = str;
    }

    /* renamed from: a */
    public static C0838c m2689a(Object obj) {
        return new C0838c(0, obj, (String) null);
    }

    /* renamed from: b */
    public static C0838c m2690b(Throwable th) {
        boolean z = th instanceof C0862a;
        if (!z || ((C0862a) th).f2853a != 6) {
            Log.w("AppSearchResult", "Converting throwable to failed result.", th);
            if (!z) {
                String simpleName = th.getClass().getSimpleName();
                int i = 2;
                if (!(th instanceof IllegalStateException) && !(th instanceof NullPointerException)) {
                    i = th instanceof IllegalArgumentException ? 3 : th instanceof IOException ? 4 : th instanceof SecurityException ? 8 : 1;
                }
                return new C0838c(i, (Object) null, simpleName + ": " + th.getMessage());
            }
        }
        C0862a aVar = (C0862a) th;
        return new C0838c(aVar.f2853a, (Object) null, aVar.getMessage());
    }

    /* renamed from: c */
    public final boolean mo3387c() {
        return this.f2816a == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0838c)) {
            return false;
        }
        C0838c cVar = (C0838c) obj;
        return this.f2816a == cVar.f2816a && C1968c.m5305b(this.f2817b, cVar.f2817b) && C1968c.m5305b(this.f2818c, cVar.f2818c);
    }

    public final int hashCode() {
        return C1968c.m5304a(Integer.valueOf(this.f2816a), this.f2817b, this.f2818c);
    }

    public final String toString() {
        if (mo3387c()) {
            StringBuilder sb = new StringBuilder("[SUCCESS]: ");
            Object obj = this.f2817b;
            sb.append(obj);
            return "[SUCCESS]: ".concat(String.valueOf(obj));
        }
        return "[FAILURE(" + this.f2816a + ")]: " + this.f2818c;
    }
}
