package androidx.p124l.p126b;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.p124l.p125a.C2306c;
import androidx.p124l.p125a.C2310g;

/* renamed from: androidx.l.b.c */
/* compiled from: PG */
public class C2313c {

    /* renamed from: c */
    public int f6469c;

    /* renamed from: d */
    public final Context f6470d;

    /* renamed from: e */
    public boolean f6471e = false;

    /* renamed from: f */
    public boolean f6472f = false;

    /* renamed from: g */
    public boolean f6473g = true;

    /* renamed from: h */
    public boolean f6474h = false;

    /* renamed from: i */
    public C2306c f6475i;

    public C2313c(Context context) {
        this.f6470d = context.getApplicationContext();
    }

    /* renamed from: f */
    public static final String m6258f(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public void mo5693c() {
    }

    /* renamed from: d */
    public void mo5694d(Object obj) {
        C2306c cVar = this.f6475i;
        if (cVar != null) {
            if (C2310g.m6251b(2)) {
                new StringBuilder("onLoadComplete: ").append(cVar);
                Log.v("LoaderManager", "onLoadComplete: ".concat(cVar.toString()));
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                cVar.mo5708l(obj);
                return;
            }
            if (C2310g.m6251b(4)) {
                Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            cVar.mo5706i(obj);
        }
    }

    /* renamed from: e */
    public void mo5695e() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.f6469c);
        sb.append("}");
        return sb.toString();
    }
}
