package androidx.p201w.p202a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.p5648a.C72563b;

/* renamed from: androidx.w.a.ad */
/* compiled from: PG */
public final class C4327ad {

    /* renamed from: a */
    public static final C4328ae f13952a;

    static {
        C4328ae aeVar;
        try {
            aeVar = new C4329af((WebViewProviderFactoryBoundaryInterface) C72563b.m107251a(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, C4347p.m12481c()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0])));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (ClassNotFoundException unused) {
            aeVar = new C4352u();
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
        f13952a = aeVar;
    }
}
