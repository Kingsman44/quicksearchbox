package p5682q.p5683a.p5684a.p5685a.p5686a.p5687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: q.a.a.a.a.a.m */
/* compiled from: PG */
public final class C72765m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C72765m f193452f;

    /* renamed from: g */
    private static volatile C63010eb f193453g;

    /* renamed from: a */
    public C62995dn f193454a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f193455b = C62995dn.f170057a;

    /* renamed from: c */
    public C62971cq f193456c = emptyProtobufList();

    /* renamed from: d */
    public C62961ch f193457d = emptyIntList();

    /* renamed from: e */
    public C62971cq f193458e = emptyProtobufList();

    static {
        C72765m mVar = new C72765m();
        f193452f = mVar;
        C62942bv.registerDefaultInstance(C72765m.class, mVar);
    }

    private C72765m() {
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
                return newMessageInfo(f193452f, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u00012\u00022\u0003\u001b\u0004'\u0005\u001b", new Object[]{"a", C72763k.f193450a, "b", C72764l.f193451a, C45240c.f118157a, C72761i.class, "d", "e", C72757e.class});
            case 3:
                return new C72765m();
            case 4:
                return new C72762j();
            case 5:
                return f193452f;
            case 6:
                C63010eb ebVar = f193453g;
                if (ebVar == null) {
                    synchronized (C72765m.class) {
                        ebVar = f193453g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193452f);
                            f193453g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
