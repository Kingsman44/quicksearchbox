package kotlinx.coroutines.android;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p5462h.p5466c.C69553a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class AndroidExceptionPreHandler extends C69553a implements CoroutineExceptionHandler {
    private volatile Object _preHandler = this;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f190535b);
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(C69585o oVar, Throwable th) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(th, "exception");
    }
}
