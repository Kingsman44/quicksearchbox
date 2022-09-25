package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.ai */
/* compiled from: PG */
public final class C68146ai extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68146ai f184430a;

    /* renamed from: b */
    private static volatile C63010eb f184431b;

    static {
        C68146ai aiVar = new C68146ai();
        f184430a = aiVar;
        C62942bv.registerDefaultInstance(C68146ai.class, aiVar);
    }

    private C68146ai() {
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
                return newMessageInfo(f184430a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C68146ai();
            case 4:
                return new C68145ah();
            case 5:
                return f184430a;
            case 6:
                C63010eb ebVar = f184431b;
                if (ebVar == null) {
                    synchronized (C68146ai.class) {
                        ebVar = f184431b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184430a);
                            f184431b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
