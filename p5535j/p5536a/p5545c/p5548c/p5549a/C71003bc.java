package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.bc */
/* compiled from: PG */
public final class C71003bc extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C71003bc f189358g;

    /* renamed from: h */
    private static volatile C63010eb f189359h;

    /* renamed from: a */
    public int f189360a;

    /* renamed from: b */
    public C62971cq f189361b = emptyProtobufList();

    /* renamed from: c */
    public int f189362c;

    /* renamed from: d */
    public int f189363d;

    /* renamed from: e */
    public int f189364e;

    /* renamed from: f */
    public int f189365f;

    static {
        C71003bc bcVar = new C71003bc();
        f189358g = bcVar;
        C62942bv.registerDefaultInstance(C71003bc.class, bcVar);
    }

    private C71003bc() {
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
                return newMessageInfo(f189358g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0000\u0001\u001b\u0006င\u0002\u0007င\u0003\bင\u0004\tင\u0005", new Object[]{"a", "b", C71002bb.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C71003bc();
            case 4:
                return new C70999az();
            case 5:
                return f189358g;
            case 6:
                C63010eb ebVar = f189359h;
                if (ebVar == null) {
                    synchronized (C71003bc.class) {
                        ebVar = f189359h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189358g);
                            f189359h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
