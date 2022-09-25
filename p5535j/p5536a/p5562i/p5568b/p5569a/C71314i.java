package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.i */
/* compiled from: PG */
public final class C71314i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C71314i f190452b;

    /* renamed from: c */
    private static volatile C63010eb f190453c;

    /* renamed from: a */
    public C62961ch f190454a = emptyIntList();

    static {
        C71314i iVar = new C71314i();
        f190452b = iVar;
        C62942bv.registerDefaultInstance(C71314i.class, iVar);
    }

    private C71314i() {
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
                return newMessageInfo(f190452b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C71244c.f190203a});
            case 3:
                return new C71314i();
            case 4:
                return new C71313h();
            case 5:
                return f190452b;
            case 6:
                C63010eb ebVar = f190453c;
                if (ebVar == null) {
                    synchronized (C71314i.class) {
                        ebVar = f190453c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190452b);
                            f190453c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
