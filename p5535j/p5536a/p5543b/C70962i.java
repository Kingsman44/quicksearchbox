package p5535j.p5536a.p5543b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.b.i */
/* compiled from: PG */
public final class C70962i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C70962i f189214a;

    /* renamed from: b */
    private static volatile C63010eb f189215b;

    static {
        C70962i iVar = new C70962i();
        f189214a = iVar;
        C62942bv.registerDefaultInstance(C70962i.class, iVar);
    }

    private C70962i() {
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
                return newMessageInfo(f189214a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C70962i();
            case 4:
                return new C70961h();
            case 5:
                return f189214a;
            case 6:
                C63010eb ebVar = f189215b;
                if (ebVar == null) {
                    synchronized (C70962i.class) {
                        ebVar = f189215b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189214a);
                            f189215b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
