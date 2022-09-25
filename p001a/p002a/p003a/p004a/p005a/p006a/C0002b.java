package p001a.p002a.p003a.p004a.p005a.p006a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.a.a.a.a.a.b */
/* compiled from: PG */
public final class C0002b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C0002b f0f;

    /* renamed from: g */
    private static volatile C63010eb f1g;

    /* renamed from: a */
    public int f2a;

    /* renamed from: b */
    public float f3b;

    /* renamed from: c */
    public float f4c;

    /* renamed from: d */
    public float f5d;

    /* renamed from: e */
    public float f6e;

    static {
        C0002b bVar = new C0002b();
        f0f = bVar;
        C62942bv.registerDefaultInstance(C0002b.class, bVar);
    }

    private C0002b() {
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
                return newMessageInfo(f0f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C0002b();
            case 4:
                return new C0001a();
            case 5:
                return f0f;
            case 6:
                C63010eb ebVar = f1g;
                if (ebVar == null) {
                    synchronized (C0002b.class) {
                        ebVar = f1g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f0f);
                            f1g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
