package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.am */
/* compiled from: PG */
public final class C68150am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68150am f184434c;

    /* renamed from: d */
    private static volatile C63010eb f184435d;

    /* renamed from: a */
    public int f184436a;

    /* renamed from: b */
    public int f184437b;

    static {
        C68150am amVar = new C68150am();
        f184434c = amVar;
        C62942bv.registerDefaultInstance(C68150am.class, amVar);
    }

    private C68150am() {
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
                return newMessageInfo(f184434c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C68150am();
            case 4:
                return new C68149al();
            case 5:
                return f184434c;
            case 6:
                C63010eb ebVar = f184435d;
                if (ebVar == null) {
                    synchronized (C68150am.class) {
                        ebVar = f184435d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184434c);
                            f184435d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
