package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.be */
/* compiled from: PG */
public final class C68169be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68169be f184463c;

    /* renamed from: d */
    private static volatile C63010eb f184464d;

    /* renamed from: a */
    public int f184465a;

    /* renamed from: b */
    public int f184466b;

    static {
        C68169be beVar = new C68169be();
        f184463c = beVar;
        C62942bv.registerDefaultInstance(C68169be.class, beVar);
    }

    private C68169be() {
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
                return newMessageInfo(f184463c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C68169be();
            case 4:
                return new C68168bd();
            case 5:
                return f184463c;
            case 6:
                C63010eb ebVar = f184464d;
                if (ebVar == null) {
                    synchronized (C68169be.class) {
                        ebVar = f184464d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184463c);
                            f184464d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
