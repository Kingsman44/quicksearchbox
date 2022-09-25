package p5285d.p5290b.p5291a.p5292a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.bh */
/* compiled from: PG */
public final class C68172bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C68172bh f184473d;

    /* renamed from: e */
    private static volatile C63010eb f184474e;

    /* renamed from: a */
    public int f184475a;

    /* renamed from: b */
    public C68169be f184476b;

    /* renamed from: c */
    public int f184477c;

    static {
        C68172bh bhVar = new C68172bh();
        f184473d = bhVar;
        C62942bv.registerDefaultInstance(C68172bh.class, bhVar);
    }

    private C68172bh() {
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
                return newMessageInfo(f184473d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C68172bh();
            case 4:
                return new C68171bg();
            case 5:
                return f184473d;
            case 6:
                C63010eb ebVar = f184474e;
                if (ebVar == null) {
                    synchronized (C68172bh.class) {
                        ebVar = f184474e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184473d);
                            f184474e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
