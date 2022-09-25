package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.a.a.a.a.j */
/* compiled from: PG */
public final class C68117j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68117j f184361b;

    /* renamed from: c */
    private static volatile C63010eb f184362c;

    /* renamed from: a */
    public C62971cq f184363a = emptyProtobufList();

    static {
        C68117j jVar = new C68117j();
        f184361b = jVar;
        C62942bv.registerDefaultInstance(C68117j.class, jVar);
    }

    private C68117j() {
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
                return newMessageInfo(f184361b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C68119l.class});
            case 3:
                return new C68117j();
            case 4:
                return new C68116i();
            case 5:
                return f184361b;
            case 6:
                C63010eb ebVar = f184362c;
                if (ebVar == null) {
                    synchronized (C68117j.class) {
                        ebVar = f184362c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184361b);
                            f184362c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
