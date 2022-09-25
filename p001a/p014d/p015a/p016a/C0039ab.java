package p001a.p014d.p015a.p016a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.ab */
/* compiled from: PG */
public final class C0039ab extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C0039ab f104e;

    /* renamed from: f */
    private static volatile C63010eb f105f;

    /* renamed from: a */
    public C62971cq f106a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f107b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f108c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f109d = C62942bv.emptyProtobufList();

    static {
        C0039ab abVar = new C0039ab();
        f104e = abVar;
        C62942bv.registerDefaultInstance(C0039ab.class, abVar);
    }

    private C0039ab() {
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
                return newMessageInfo(f104e, "\u0000\u0004\u0000\u0000\u0002\u0013\u0004\u0000\u0004\u0000\u0002\u001b\u0003\u001b\u0004Ț\u0013\u001b", new Object[]{"b", C0081z.class, C45240c.f118157a, C0081z.class, "d", "a", C0081z.class});
            case 3:
                return new C0039ab();
            case 4:
                return new C0038aa();
            case 5:
                return f104e;
            case 6:
                C63010eb ebVar = f105f;
                if (ebVar == null) {
                    synchronized (C0039ab.class) {
                        ebVar = f105f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104e);
                            f105f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
