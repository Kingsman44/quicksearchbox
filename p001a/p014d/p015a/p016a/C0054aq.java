package p001a.p014d.p015a.p016a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.aq */
/* compiled from: PG */
public final class C0054aq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C0054aq f141e;

    /* renamed from: f */
    private static volatile C63010eb f142f;

    /* renamed from: a */
    public C62971cq f143a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f144b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f145c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62995dn f146d = C62995dn.f170057a;

    static {
        C0054aq aqVar = new C0054aq();
        f141e = aqVar;
        C62942bv.registerDefaultInstance(C0054aq.class, aqVar);
    }

    private C0054aq() {
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
                return newMessageInfo(f141e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0003\u0000\u0001Ț\u0002Ț\u0003Ț\u00042", new Object[]{"a", "b", C45240c.f118157a, "d", C0053ap.f140a});
            case 3:
                return new C0054aq();
            case 4:
                return new C0052ao();
            case 5:
                return f141e;
            case 6:
                C63010eb ebVar = f142f;
                if (ebVar == null) {
                    synchronized (C0054aq.class) {
                        ebVar = f142f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141e);
                            f142f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
