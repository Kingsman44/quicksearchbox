package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.ct */
/* compiled from: PG */
public final class C71047ct extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C71047ct f189475h;

    /* renamed from: i */
    private static volatile C63010eb f189476i;

    /* renamed from: a */
    public int f189477a;

    /* renamed from: b */
    public boolean f189478b;

    /* renamed from: c */
    public boolean f189479c;

    /* renamed from: d */
    public int f189480d;

    /* renamed from: e */
    public boolean f189481e;

    /* renamed from: f */
    public int f189482f;

    /* renamed from: g */
    public int f189483g;

    static {
        C71047ct ctVar = new C71047ct();
        f189475h = ctVar;
        C62942bv.registerDefaultInstance(C71047ct.class, ctVar);
    }

    private C71047ct() {
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
                return newMessageInfo(f189475h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C71048cu.f189484a, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C71047ct();
            case 4:
                return new C71046cs();
            case 5:
                return f189475h;
            case 6:
                C63010eb ebVar = f189476i;
                if (ebVar == null) {
                    synchronized (C71047ct.class) {
                        ebVar = f189476i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189475h);
                            f189476i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
