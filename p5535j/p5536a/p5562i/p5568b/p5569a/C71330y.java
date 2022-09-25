package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.y */
/* compiled from: PG */
public final class C71330y extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C71330y f190501i;

    /* renamed from: j */
    private static volatile C63010eb f190502j;

    /* renamed from: a */
    public int f190503a;

    /* renamed from: b */
    public long f190504b;

    /* renamed from: c */
    public long f190505c;

    /* renamed from: d */
    public long f190506d;

    /* renamed from: e */
    public long f190507e;

    /* renamed from: f */
    public long f190508f;

    /* renamed from: g */
    public long f190509g;

    /* renamed from: h */
    public C71324s f190510h;

    static {
        C71330y yVar = new C71330y();
        f190501i = yVar;
        C62942bv.registerDefaultInstance(C71330y.class, yVar);
    }

    private C71330y() {
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
                return newMessageInfo(f190501i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C71330y();
            case 4:
                return new C71329x();
            case 5:
                return f190501i;
            case 6:
                C63010eb ebVar = f190502j;
                if (ebVar == null) {
                    synchronized (C71330y.class) {
                        ebVar = f190502j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190501i);
                            f190502j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
