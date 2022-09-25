package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.da */
/* compiled from: PG */
public final class C71055da extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71055da f189501e;

    /* renamed from: f */
    private static volatile C63010eb f189502f;

    /* renamed from: a */
    public int f189503a;

    /* renamed from: b */
    public String f189504b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f189505c;

    /* renamed from: d */
    public C62971cq f189506d = emptyProtobufList();

    static {
        C71055da daVar = new C71055da();
        f189501e = daVar;
        C62942bv.registerDefaultInstance(C71055da.class, daVar);
    }

    private C71055da() {
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
                return newMessageInfo(f189501e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C71047ct.class});
            case 3:
                return new C71055da();
            case 4:
                return new C71053cz();
            case 5:
                return f189501e;
            case 6:
                C63010eb ebVar = f189502f;
                if (ebVar == null) {
                    synchronized (C71055da.class) {
                        ebVar = f189502f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189501e);
                            f189502f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
