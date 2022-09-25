package p5451f.p5452a.p5453a.p5454a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.x */
/* compiled from: PG */
public final class C69459x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69459x f185869c;

    /* renamed from: e */
    private static volatile C63010eb f185870e;

    /* renamed from: a */
    public int f185871a;

    /* renamed from: b */
    public boolean f185872b;

    /* renamed from: d */
    private int f185873d;

    static {
        C69459x xVar = new C69459x();
        f185869c = xVar;
        C62942bv.registerDefaultInstance(C69459x.class, xVar);
    }

    private C69459x() {
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
                return newMessageInfo(f185869c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", C90208n.m146768b(), "b"});
            case 3:
                return new C69459x();
            case 4:
                return new C69458w();
            case 5:
                return f185869c;
            case 6:
                C63010eb ebVar = f185870e;
                if (ebVar == null) {
                    synchronized (C69459x.class) {
                        ebVar = f185870e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185869c);
                            f185870e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
