package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.b */
/* compiled from: PG */
public final class C68164b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68164b f184452b;

    /* renamed from: c */
    private static volatile C63010eb f184453c;

    /* renamed from: a */
    public int f184454a;

    static {
        C68164b bVar = new C68164b();
        f184452b = bVar;
        C62942bv.registerDefaultInstance(C68164b.class, bVar);
    }

    private C68164b() {
        emptyIntList();
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
                return newMessageInfo(f184452b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\f", new Object[]{"a"});
            case 3:
                return new C68164b();
            case 4:
                return new C68130a();
            case 5:
                return f184452b;
            case 6:
                C63010eb ebVar = f184453c;
                if (ebVar == null) {
                    synchronized (C68164b.class) {
                        ebVar = f184453c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184452b);
                            f184453c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
