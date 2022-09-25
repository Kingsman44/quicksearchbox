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
import com.google.protobuf.C63088z;

/* renamed from: j.a.i.b.a.ag */
/* compiled from: PG */
public final class C71197ag extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C71197ag f190026i;

    /* renamed from: j */
    private static volatile C63010eb f190027j;

    /* renamed from: a */
    public int f190028a;

    /* renamed from: b */
    public C63088z f190029b = C63088z.f170246b;

    /* renamed from: c */
    public C71199ai f190030c;

    /* renamed from: d */
    public double f190031d;

    /* renamed from: e */
    public int f190032e;

    /* renamed from: f */
    public int f190033f;

    /* renamed from: g */
    public int f190034g;

    /* renamed from: h */
    public int f190035h;

    static {
        C71197ag agVar = new C71197ag();
        f190026i = agVar;
        C62942bv.registerDefaultInstance(C71197ag.class, agVar);
    }

    private C71197ag() {
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
                return newMessageInfo(f190026i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003က\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C71197ag();
            case 4:
                return new C71196af();
            case 5:
                return f190026i;
            case 6:
                C63010eb ebVar = f190027j;
                if (ebVar == null) {
                    synchronized (C71197ag.class) {
                        ebVar = f190027j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190026i);
                            f190027j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
