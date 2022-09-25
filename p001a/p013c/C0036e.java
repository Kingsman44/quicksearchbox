package p001a.p013c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.c.e */
/* compiled from: PG */
public final class C0036e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C0036e f101b;

    /* renamed from: c */
    private static volatile C63010eb f102c;

    /* renamed from: a */
    public float f103a;

    static {
        C0036e eVar = new C0036e();
        f101b = eVar;
        C62942bv.registerDefaultInstance(C0036e.class, eVar);
    }

    private C0036e() {
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
                return newMessageInfo(f101b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"a"});
            case 3:
                return new C0036e();
            case 4:
                return new C0035d();
            case 5:
                return f101b;
            case 6:
                C63010eb ebVar = f102c;
                if (ebVar == null) {
                    synchronized (C0036e.class) {
                        ebVar = f102c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101b);
                            f102c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
