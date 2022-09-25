package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.ak */
/* compiled from: PG */
public final class C68148ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68148ak f184432a;

    /* renamed from: b */
    private static volatile C63010eb f184433b;

    static {
        C68148ak akVar = new C68148ak();
        f184432a = akVar;
        C62942bv.registerDefaultInstance(C68148ak.class, akVar);
    }

    private C68148ak() {
        emptyProtobufList();
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
                return newMessageInfo(f184432a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C68148ak();
            case 4:
                return new C68147aj();
            case 5:
                return f184432a;
            case 6:
                C63010eb ebVar = f184433b;
                if (ebVar == null) {
                    synchronized (C68148ak.class) {
                        ebVar = f184433b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184432a);
                            f184433b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
