package p5535j.p5536a.p5537a.p5539b.p5540a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.b.a.m */
/* compiled from: PG */
public final class C70928m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C70928m f189132a;

    /* renamed from: b */
    private static volatile C63010eb f189133b;

    static {
        C70928m mVar = new C70928m();
        f189132a = mVar;
        C62942bv.registerDefaultInstance(C70928m.class, mVar);
    }

    private C70928m() {
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
                return newMessageInfo(f189132a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C70928m();
            case 4:
                return new C70927l();
            case 5:
                return f189132a;
            case 6:
                C63010eb ebVar = f189133b;
                if (ebVar == null) {
                    synchronized (C70928m.class) {
                        ebVar = f189133b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189132a);
                            f189133b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
