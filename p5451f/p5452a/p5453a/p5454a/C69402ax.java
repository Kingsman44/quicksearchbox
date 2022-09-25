package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.ax */
/* compiled from: PG */
public final class C69402ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69402ax f185702c;

    /* renamed from: d */
    private static volatile C63010eb f185703d;

    /* renamed from: a */
    public C62971cq f185704a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f185705b = emptyProtobufList();

    static {
        C69402ax axVar = new C69402ax();
        f185702c = axVar;
        C62942bv.registerDefaultInstance(C69402ax.class, axVar);
    }

    private C69402ax() {
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
                return newMessageInfo(f185702c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C69434cb.class, "b", C69404az.class});
            case 3:
                return new C69402ax();
            case 4:
                return new C69401aw();
            case 5:
                return f185702c;
            case 6:
                C63010eb ebVar = f185703d;
                if (ebVar == null) {
                    synchronized (C69402ax.class) {
                        ebVar = f185703d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185702c);
                            f185703d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
