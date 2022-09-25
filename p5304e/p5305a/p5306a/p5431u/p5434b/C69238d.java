package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.d */
/* compiled from: PG */
public final class C69238d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C69238d f185335e;

    /* renamed from: g */
    private static volatile C63010eb f185336g;

    /* renamed from: a */
    public boolean f185337a;

    /* renamed from: b */
    public C62971cq f185338b = emptyProtobufList();

    /* renamed from: c */
    public C62961ch f185339c = emptyIntList();

    /* renamed from: d */
    public boolean f185340d;

    /* renamed from: f */
    private int f185341f;

    static {
        C69238d dVar = new C69238d();
        f185335e = dVar;
        C62942bv.registerDefaultInstance(C69238d.class, dVar);
    }

    private C69238d() {
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
                return newMessageInfo(f185335e, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0002\u0000\u0002ဇ\u0000\u0004\u001b\u0005\u0016\u0006ဇ\u0002", new Object[]{C10662f.f35572a, "a", "b", C69236b.class, C45240c.f118157a, "d"});
            case 3:
                return new C69238d();
            case 4:
                return new C69237c();
            case 5:
                return f185335e;
            case 6:
                C63010eb ebVar = f185336g;
                if (ebVar == null) {
                    synchronized (C69238d.class) {
                        ebVar = f185336g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185335e);
                            f185336g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
