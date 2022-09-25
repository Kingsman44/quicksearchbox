package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.bo */
/* compiled from: PG */
public final class C68179bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68179bo f184486c;

    /* renamed from: d */
    private static volatile C63010eb f184487d;

    /* renamed from: a */
    public C62910ar f184488a;

    /* renamed from: b */
    public C62910ar f184489b;

    static {
        C68179bo boVar = new C68179bo();
        f184486c = boVar;
        C62942bv.registerDefaultInstance(C68179bo.class, boVar);
    }

    private C68179bo() {
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
                return newMessageInfo(f184486c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\t\u0004\t", new Object[]{"a", "b"});
            case 3:
                return new C68179bo();
            case 4:
                return new C68178bn();
            case 5:
                return f184486c;
            case 6:
                C63010eb ebVar = f184487d;
                if (ebVar == null) {
                    synchronized (C68179bo.class) {
                        ebVar = f184487d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184486c);
                            f184487d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
