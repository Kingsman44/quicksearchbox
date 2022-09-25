package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.n */
/* compiled from: PG */
public final class C69449n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C69449n f185849b;

    /* renamed from: c */
    private static volatile C63010eb f185850c;

    /* renamed from: a */
    public C62971cq f185851a = emptyProtobufList();

    static {
        C69449n nVar = new C69449n();
        f185849b = nVar;
        C62942bv.registerDefaultInstance(C69449n.class, nVar);
    }

    private C69449n() {
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
                return newMessageInfo(f185849b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C69448m.class});
            case 3:
                return new C69449n();
            case 4:
                return new C69443h();
            case 5:
                return f185849b;
            case 6:
                C63010eb ebVar = f185850c;
                if (ebVar == null) {
                    synchronized (C69449n.class) {
                        ebVar = f185850c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185849b);
                            f185850c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
