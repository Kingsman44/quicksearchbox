package p5488io.grpc.p5527g.p5528a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: io.grpc.g.a.o */
/* compiled from: PG */
final class C70802o implements InvocationHandler {

    /* renamed from: c */
    public static final /* synthetic */ int f188811c = 0;

    /* renamed from: a */
    public boolean f188812a;

    /* renamed from: b */
    public String f188813b;

    /* renamed from: d */
    private final List f188814d;

    public C70802o(List list) {
        this.f188814d = list;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = C70806s.f188832a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f188812a = true;
            return null;
        } else if (name.equals("protocols") && objArr.length == 0) {
            return this.f188814d;
        } else {
            if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f188814d.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f188813b = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f188814d.get(0);
                    this.f188813b = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f188813b = (String) objArr[0];
            return null;
        }
    }
}
