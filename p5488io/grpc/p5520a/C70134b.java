package p5488io.grpc.p5520a;

import com.google.p4651h.C61648b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.grpc.a.b */
/* compiled from: PG */
final class C70134b {

    /* renamed from: a */
    public final Class f186950a;

    /* renamed from: b */
    public final Method f186951b;

    /* renamed from: c */
    public final Method f186952c;

    /* renamed from: d */
    public final Method f186953d;

    /* renamed from: e */
    public final List f186954e;

    public C70134b(Class cls, ClassLoader classLoader) {
        Class<? extends U> asSubclass = cls.asSubclass(C61648b.class);
        this.f186950a = asSubclass;
        this.f186953d = asSubclass.getMethod("getScopes", new Class[0]);
        Method declaredMethod = Class.forName("com.google.auth.oauth2.ServiceAccountJwtAccessCredentials", false, classLoader).asSubclass(C61648b.class).getDeclaredMethod("newBuilder", new Class[0]);
        this.f186951b = declaredMethod;
        Class<?> returnType = declaredMethod.getReturnType();
        this.f186952c = returnType.getMethod("build", new Class[0]);
        ArrayList arrayList = new ArrayList();
        this.f186954e = arrayList;
        Method method = asSubclass.getMethod("getClientId", new Class[0]);
        arrayList.add(new C70135c(method, returnType.getMethod("setClientId", new Class[]{method.getReturnType()})));
        Method method2 = asSubclass.getMethod("getClientEmail", new Class[0]);
        arrayList.add(new C70135c(method2, returnType.getMethod("setClientEmail", new Class[]{method2.getReturnType()})));
        Method method3 = asSubclass.getMethod("getPrivateKey", new Class[0]);
        arrayList.add(new C70135c(method3, returnType.getMethod("setPrivateKey", new Class[]{method3.getReturnType()})));
        Method method4 = asSubclass.getMethod("getPrivateKeyId", new Class[0]);
        arrayList.add(new C70135c(method4, returnType.getMethod("setPrivateKeyId", new Class[]{method4.getReturnType()})));
        Method method5 = asSubclass.getMethod("getQuotaProjectId", new Class[0]);
        arrayList.add(new C70135c(method5, returnType.getMethod("setQuotaProjectId", new Class[]{method5.getReturnType()})));
    }
}
