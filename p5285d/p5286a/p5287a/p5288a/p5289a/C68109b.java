package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.a.a.a.a.b */
/* compiled from: PG */
public final class C68109b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68109b f184343b;

    /* renamed from: c */
    private static volatile C63010eb f184344c;

    /* renamed from: a */
    public boolean f184345a;

    static {
        C68109b bVar = new C68109b();
        f184343b = bVar;
        C62942bv.registerDefaultInstance(C68109b.class, bVar);
    }

    private C68109b() {
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
                return newMessageInfo(f184343b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C68109b();
            case 4:
                return new C68108a();
            case 5:
                return f184343b;
            case 6:
                C63010eb ebVar = f184344c;
                if (ebVar == null) {
                    synchronized (C68109b.class) {
                        ebVar = f184344c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184343b);
                            f184344c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
