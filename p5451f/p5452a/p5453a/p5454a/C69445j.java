package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.j */
/* compiled from: PG */
public final class C69445j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69445j f185821c;

    /* renamed from: e */
    private static volatile C63010eb f185822e;

    /* renamed from: a */
    public int f185823a;

    /* renamed from: b */
    public int f185824b;

    /* renamed from: d */
    private int f185825d;

    static {
        C69445j jVar = new C69445j();
        f185821c = jVar;
        C62942bv.registerDefaultInstance(C69445j.class, jVar);
    }

    private C69445j() {
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
                return newMessageInfo(f185821c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C69445j();
            case 4:
                return new C69444i();
            case 5:
                return f185821c;
            case 6:
                C63010eb ebVar = f185822e;
                if (ebVar == null) {
                    synchronized (C69445j.class) {
                        ebVar = f185822e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185821c);
                            f185822e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
