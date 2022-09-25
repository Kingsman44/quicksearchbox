package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.o */
/* compiled from: PG */
public final class C68202o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68202o f184551c;

    /* renamed from: d */
    private static volatile C63010eb f184552d;

    /* renamed from: a */
    public int f184553a;

    /* renamed from: b */
    public int f184554b;

    static {
        C68202o oVar = new C68202o();
        f184551c = oVar;
        C62942bv.registerDefaultInstance(C68202o.class, oVar);
    }

    private C68202o() {
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
                return newMessageInfo(f184551c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C68202o();
            case 4:
                return new C68201n();
            case 5:
                return f184551c;
            case 6:
                C63010eb ebVar = f184552d;
                if (ebVar == null) {
                    synchronized (C68202o.class) {
                        ebVar = f184552d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184551c);
                            f184552d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
