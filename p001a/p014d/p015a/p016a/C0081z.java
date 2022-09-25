package p001a.p014d.p015a.p016a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.z */
/* compiled from: PG */
public final class C0081z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0081z f222d;

    /* renamed from: e */
    private static volatile C63010eb f223e;

    /* renamed from: a */
    public int f224a;

    /* renamed from: b */
    public String f225b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f226c = C62942bv.emptyProtobufList();

    static {
        C0081z zVar = new C0081z();
        f222d = zVar;
        C62942bv.registerDefaultInstance(C0081z.class, zVar);
    }

    private C0081z() {
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
                return newMessageInfo(f222d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003Ț", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C0081z();
            case 4:
                return new C0079x();
            case 5:
                return f222d;
            case 6:
                C63010eb ebVar = f223e;
                if (ebVar == null) {
                    synchronized (C0081z.class) {
                        ebVar = f223e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222d);
                            f223e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
