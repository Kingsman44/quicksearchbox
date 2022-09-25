package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.bj */
/* compiled from: PG */
public final class C69415bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69415bj f185728c;

    /* renamed from: f */
    private static volatile C63010eb f185729f;

    /* renamed from: a */
    public int f185730a;

    /* renamed from: b */
    public C62971cq f185731b = emptyProtobufList();

    /* renamed from: d */
    private int f185732d;

    /* renamed from: e */
    private byte f185733e = 2;

    static {
        C69415bj bjVar = new C69415bj();
        f185728c = bjVar;
        C62942bv.registerDefaultInstance(C69415bj.class, bjVar);
    }

    private C69415bj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f185733e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f185733e = b;
                return null;
            case 2:
                return newMessageInfo(f185728c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л", new Object[]{"d", "a", C69416bk.f185734a, "b", C69411bf.class});
            case 3:
                return new C69415bj();
            case 4:
                return new C69414bi();
            case 5:
                return f185728c;
            case 6:
                C63010eb ebVar = f185729f;
                if (ebVar == null) {
                    synchronized (C69415bj.class) {
                        ebVar = f185729f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185728c);
                            f185729f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
