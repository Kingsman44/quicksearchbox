package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.v */
/* compiled from: PG */
public final class C69457v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C69457v f185865b;

    /* renamed from: d */
    private static volatile C63010eb f185866d;

    /* renamed from: a */
    public C62971cq f185867a;

    /* renamed from: c */
    private byte f185868c = 2;

    static {
        C69457v vVar = new C69457v();
        f185865b = vVar;
        C62942bv.registerDefaultInstance(C69457v.class, vVar);
    }

    private C69457v() {
        emptyIntList();
        this.f185867a = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f185868c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f185868c = b;
                return null;
            case 2:
                return newMessageInfo(f185865b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C69396ar.class});
            case 3:
                return new C69457v();
            case 4:
                return new C69456u();
            case 5:
                return f185865b;
            case 6:
                C63010eb ebVar = f185866d;
                if (ebVar == null) {
                    synchronized (C69457v.class) {
                        ebVar = f185866d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185865b);
                            f185866d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
