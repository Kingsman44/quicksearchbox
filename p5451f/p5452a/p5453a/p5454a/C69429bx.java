package p5451f.p5452a.p5453a.p5454a;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.bx */
/* compiled from: PG */
public final class C69429bx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C69429bx f185773e;

    /* renamed from: g */
    private static volatile C63010eb f185774g;

    /* renamed from: a */
    public int f185775a;

    /* renamed from: b */
    public C69455t f185776b;

    /* renamed from: c */
    public int f185777c;

    /* renamed from: d */
    public int f185778d;

    /* renamed from: f */
    private int f185779f;

    static {
        C69429bx bxVar = new C69429bx();
        f185773e = bxVar;
        C62942bv.registerDefaultInstance(C69429bx.class, bxVar);
    }

    private C69429bx() {
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
                return newMessageInfo(f185773e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004ဌ\u0002\u0006င\u0004", new Object[]{C10662f.f35572a, "a", C69428bw.m100755b(), "b", C45240c.f118157a, C90208n.m146768b(), "d"});
            case 3:
                return new C69429bx();
            case 4:
                return new C69426bu();
            case 5:
                return f185773e;
            case 6:
                C63010eb ebVar = f185774g;
                if (ebVar == null) {
                    synchronized (C69429bx.class) {
                        ebVar = f185774g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185773e);
                            f185774g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
