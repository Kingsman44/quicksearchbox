package p5304e.p5305a.p5306a.p5340aj.p5341a.p5342a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.aj.a.a.b */
/* compiled from: PG */
public final class C68435b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68435b f184757a;

    /* renamed from: b */
    private static volatile C63010eb f184758b;

    static {
        C68435b bVar = new C68435b();
        f184757a = bVar;
        C62942bv.registerDefaultInstance(C68435b.class, bVar);
    }

    private C68435b() {
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
                return newMessageInfo(f184757a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C68435b();
            case 4:
                return new C68434a();
            case 5:
                return f184757a;
            case 6:
                C63010eb ebVar = f184758b;
                if (ebVar == null) {
                    synchronized (C68435b.class) {
                        ebVar = f184758b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184757a);
                            f184758b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
