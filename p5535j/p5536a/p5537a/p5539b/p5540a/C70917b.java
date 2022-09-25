package p5535j.p5536a.p5537a.p5539b.p5540a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.b.a.b */
/* compiled from: PG */
public final class C70917b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C70917b f189111a;

    /* renamed from: b */
    private static volatile C63010eb f189112b;

    static {
        C70917b bVar = new C70917b();
        f189111a = bVar;
        C62942bv.registerDefaultInstance(C70917b.class, bVar);
    }

    private C70917b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f189111a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C70917b();
            case 4:
                return new C70916a();
            case 5:
                return f189111a;
            case 6:
                C63010eb ebVar = f189112b;
                if (ebVar == null) {
                    synchronized (C70917b.class) {
                        ebVar = f189112b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189111a);
                            f189112b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
