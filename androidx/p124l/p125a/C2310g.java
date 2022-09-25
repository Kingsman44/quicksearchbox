package androidx.p124l.p125a;

import android.util.Log;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2391v;

/* renamed from: androidx.l.a.g */
/* compiled from: PG */
public final class C2310g extends C2305b {

    /* renamed from: a */
    public final C2391v f6462a;

    /* renamed from: b */
    public final C2309f f6463b;

    public C2310g(C2391v vVar, C2370br brVar) {
        this.f6462a = vVar;
        this.f6463b = (C2309f) new C2368bp(brVar, C2309f.f6459a).mo5770a(C2309f.class);
    }

    /* renamed from: b */
    public static boolean m6251b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.f6462a.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f6462a)));
        sb.append("}}");
        return sb.toString();
    }
}
