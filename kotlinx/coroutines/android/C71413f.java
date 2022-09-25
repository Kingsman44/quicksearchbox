package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import p5462h.C69692j;
import p5462h.C69714l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.android.f */
/* compiled from: PG */
public final class C71413f {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            Object mainLooper = Looper.getMainLooper();
            C69664n.m101061g(mainLooper, "<this>");
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{mainLooper});
            C69664n.m101059e(invoke, "null cannot be cast to non-null type android.os.Handler");
            obj = new C71411d((Handler) invoke, (String) null);
        } catch (Throwable th) {
            obj = C69714l.m101133a(th);
        }
        if (true != (obj instanceof C69692j)) {
            obj2 = obj;
        }
        C71412e eVar = (C71412e) obj2;
    }

    /* renamed from: a */
    public static final C71412e m104184a(Handler handler) {
        C69664n.m101061g(handler, "<this>");
        return new C71411d(handler, "main");
    }
}
