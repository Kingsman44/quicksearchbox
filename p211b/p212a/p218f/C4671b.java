package p211b.p212a.p218f;

import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import p211b.p212a.p216d.C4665l;

/* renamed from: b.a.f.b */
/* compiled from: PG */
public final class C4671b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C4671b f14642b;

    /* renamed from: c */
    public static final C62940bt f14643c;

    /* renamed from: e */
    private static volatile C63010eb f14644e;

    /* renamed from: a */
    public C4665l f14645a;

    /* renamed from: d */
    private int f14646d;

    static {
        C4671b bVar = new C4671b();
        f14642b = bVar;
        C62942bv.registerDefaultInstance(C4671b.class, bVar);
        f14643c = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 195955263, C63066gd.MESSAGE, C4671b.class);
    }

    private C4671b() {
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
                return newMessageInfo(f14642b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C4671b();
            case 4:
                return new C4670a();
            case 5:
                return f14642b;
            case 6:
                C63010eb ebVar = f14644e;
                if (ebVar == null) {
                    synchronized (C4671b.class) {
                        ebVar = f14644e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14642b);
                            f14644e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
