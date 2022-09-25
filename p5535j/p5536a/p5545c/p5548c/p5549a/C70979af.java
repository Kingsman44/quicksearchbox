package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.af */
/* compiled from: PG */
public final class C70979af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70979af f189273c;

    /* renamed from: d */
    private static volatile C63010eb f189274d;

    /* renamed from: a */
    public int f189275a;

    /* renamed from: b */
    public int f189276b;

    static {
        C70979af afVar = new C70979af();
        f189273c = afVar;
        C62942bv.registerDefaultInstance(C70979af.class, afVar);
    }

    private C70979af() {
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
                return newMessageInfo(f189273c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C70979af();
            case 4:
                return new C70978ae();
            case 5:
                return f189273c;
            case 6:
                C63010eb ebVar = f189274d;
                if (ebVar == null) {
                    synchronized (C70979af.class) {
                        ebVar = f189274d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189273c);
                            f189274d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
