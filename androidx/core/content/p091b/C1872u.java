package androidx.core.content.p091b;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.core.content.b.u */
/* compiled from: PG */
public abstract class C1872u {
    /* renamed from: c */
    public static Handler m5098c(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    /* renamed from: a */
    public abstract void mo2566a(int i);

    /* renamed from: b */
    public abstract void mo2567b(Typeface typeface);

    /* renamed from: d */
    public final void mo5042d(int i, Handler handler) {
        m5098c(handler).post(new C1871t(this, i));
    }

    /* renamed from: e */
    public final void mo5043e(Typeface typeface, Handler handler) {
        m5098c(handler).post(new C1870s(this, typeface));
    }
}
