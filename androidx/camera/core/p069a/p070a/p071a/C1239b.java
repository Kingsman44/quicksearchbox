package androidx.camera.core.p069a.p070a.p071a;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.camera.core.a.a.a.b */
/* compiled from: PG */
final class C1239b extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return C1247j.m3414a();
        }
        if (Looper.myLooper() == null) {
            return null;
        }
        return new C1244g(new Handler(Looper.myLooper()));
    }
}
