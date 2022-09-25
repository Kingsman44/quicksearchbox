package p001a.p007b.p008a.p009a.p010a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.a.a.a.t */
/* compiled from: PG */
public final class C0024t extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C0024t f67i;

    /* renamed from: j */
    private static volatile C63010eb f68j;

    /* renamed from: a */
    public int f69a;

    /* renamed from: b */
    public C0015k f70b;

    /* renamed from: c */
    public C0013i f71c;

    /* renamed from: d */
    public C0007c f72d;

    /* renamed from: e */
    public C0011g f73e;

    /* renamed from: f */
    public C0023s f74f;

    /* renamed from: g */
    public long f75g;

    /* renamed from: h */
    public int f76h;

    static {
        C0024t tVar = new C0024t();
        f67i = tVar;
        C62942bv.registerDefaultInstance(C0024t.class, tVar);
    }

    private C0024t() {
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
                return newMessageInfo(f67i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဂ\u0005\u0007င\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C0024t();
            case 4:
                return new C0009e();
            case 5:
                return f67i;
            case 6:
                C63010eb ebVar = f68j;
                if (ebVar == null) {
                    synchronized (C0024t.class) {
                        ebVar = f68j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67i);
                            f68j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
