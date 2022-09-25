package p5451f.p5452a.p5453a.p5454a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.m */
/* compiled from: PG */
public final class C69448m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C69448m f185842e;

    /* renamed from: g */
    private static volatile C63010eb f185843g;

    /* renamed from: a */
    public C62961ch f185844a = emptyIntList();

    /* renamed from: b */
    public C62971cq f185845b = emptyProtobufList();

    /* renamed from: c */
    public int f185846c;

    /* renamed from: d */
    public C62961ch f185847d = emptyIntList();

    /* renamed from: f */
    private int f185848f;

    static {
        C69448m mVar = new C69448m();
        f185842e = mVar;
        C62942bv.registerDefaultInstance(C69448m.class, mVar);
    }

    private C69448m() {
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
                return newMessageInfo(f185842e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u0016\u0002င\u0000\u0003\u0016\u0004\u001b", new Object[]{C10662f.f35572a, "a", C45240c.f118157a, "d", "b", C69445j.class});
            case 3:
                return new C69448m();
            case 4:
                return new C69446k();
            case 5:
                return f185842e;
            case 6:
                C63010eb ebVar = f185843g;
                if (ebVar == null) {
                    synchronized (C69448m.class) {
                        ebVar = f185843g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185842e);
                            f185843g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
