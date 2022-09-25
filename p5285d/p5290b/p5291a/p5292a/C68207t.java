package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.t */
/* compiled from: PG */
public final class C68207t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68207t f184558b;

    /* renamed from: c */
    private static volatile C63010eb f184559c;

    /* renamed from: a */
    public C68139ab f184560a;

    static {
        C68207t tVar = new C68207t();
        f184558b = tVar;
        C62942bv.registerDefaultInstance(C68207t.class, tVar);
    }

    private C68207t() {
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
                return newMessageInfo(f184558b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C68207t();
            case 4:
                return new C68206s();
            case 5:
                return f184558b;
            case 6:
                C63010eb ebVar = f184559c;
                if (ebVar == null) {
                    synchronized (C68207t.class) {
                        ebVar = f184559c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184558b);
                            f184559c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
