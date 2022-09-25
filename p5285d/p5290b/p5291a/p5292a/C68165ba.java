package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.ba */
/* compiled from: PG */
public final class C68165ba extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68165ba f184455a;

    /* renamed from: b */
    private static volatile C63010eb f184456b;

    static {
        C68165ba baVar = new C68165ba();
        f184455a = baVar;
        C62942bv.registerDefaultInstance(C68165ba.class, baVar);
    }

    private C68165ba() {
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
                return newMessageInfo(f184455a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C68165ba();
            case 4:
                return new C68163az();
            case 5:
                return f184455a;
            case 6:
                C63010eb ebVar = f184456b;
                if (ebVar == null) {
                    synchronized (C68165ba.class) {
                        ebVar = f184456b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184455a);
                            f184456b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
