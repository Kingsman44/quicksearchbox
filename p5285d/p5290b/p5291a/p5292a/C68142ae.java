package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.ae */
/* compiled from: PG */
public final class C68142ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68142ae f184423c;

    /* renamed from: d */
    private static volatile C63010eb f184424d;

    /* renamed from: a */
    public int f184425a = 0;

    /* renamed from: b */
    public Object f184426b;

    static {
        C68142ae aeVar = new C68142ae();
        f184423c = aeVar;
        C62942bv.registerDefaultInstance(C68142ae.class, aeVar);
    }

    private C68142ae() {
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
                return newMessageInfo(f184423c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C68205r.class, C68144ag.class, C68167bc.class, C68193f.class});
            case 3:
                return new C68142ae();
            case 4:
                return new C68141ad();
            case 5:
                return f184423c;
            case 6:
                C63010eb ebVar = f184424d;
                if (ebVar == null) {
                    synchronized (C68142ae.class) {
                        ebVar = f184424d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184423c);
                            f184424d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
