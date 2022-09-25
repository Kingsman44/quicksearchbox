package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.x */
/* compiled from: PG */
public final class C71137x extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C71137x f189760g;

    /* renamed from: h */
    private static volatile C63010eb f189761h;

    /* renamed from: a */
    public int f189762a;

    /* renamed from: b */
    public C71139z f189763b;

    /* renamed from: c */
    public boolean f189764c;

    /* renamed from: d */
    public boolean f189765d;

    /* renamed from: e */
    public boolean f189766e;

    /* renamed from: f */
    public boolean f189767f;

    static {
        C71137x xVar = new C71137x();
        f189760g = xVar;
        C62942bv.registerDefaultInstance(C71137x.class, xVar);
    }

    private C71137x() {
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
                return newMessageInfo(f189760g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C71137x();
            case 4:
                return new C71136w();
            case 5:
                return f189760g;
            case 6:
                C63010eb ebVar = f189761h;
                if (ebVar == null) {
                    synchronized (C71137x.class) {
                        ebVar = f189761h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189760g);
                            f189761h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
