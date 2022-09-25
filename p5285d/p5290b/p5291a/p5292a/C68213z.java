package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.z */
/* compiled from: PG */
public final class C68213z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68213z f184572c;

    /* renamed from: d */
    private static volatile C63010eb f184573d;

    /* renamed from: a */
    public boolean f184574a;

    /* renamed from: b */
    public boolean f184575b;

    static {
        C68213z zVar = new C68213z();
        f184572c = zVar;
        C62942bv.registerDefaultInstance(C68213z.class, zVar);
    }

    private C68213z() {
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
                return newMessageInfo(f184572c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C68213z();
            case 4:
                return new C68212y();
            case 5:
                return f184572c;
            case 6:
                C63010eb ebVar = f184573d;
                if (ebVar == null) {
                    synchronized (C68213z.class) {
                        ebVar = f184573d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184572c);
                            f184573d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
