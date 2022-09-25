package p5690r.p5691a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: r.a.b */
/* compiled from: PG */
public final class C72768b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C72768b f193459b;

    /* renamed from: c */
    public static final C62940bt f193460c;

    /* renamed from: d */
    private static volatile C63010eb f193461d;

    /* renamed from: a */
    public C62971cq f193462a = emptyProtobufList();

    static {
        C72768b bVar = new C72768b();
        f193459b = bVar;
        C62942bv.registerDefaultInstance(C72768b.class, bVar);
        f193460c = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, bVar, bVar, (C62958ce) null, 425929539, C63066gd.MESSAGE, C72768b.class);
    }

    private C72768b() {
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
                return newMessageInfo(f193459b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", C72770d.class});
            case 3:
                return new C72768b();
            case 4:
                return new C72767a();
            case 5:
                return f193459b;
            case 6:
                C63010eb ebVar = f193461d;
                if (ebVar == null) {
                    synchronized (C72768b.class) {
                        ebVar = f193461d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193459b);
                            f193461d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
