package p211b.p212a.p223k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import p211b.p212a.p216d.C4665l;

/* renamed from: b.a.k.b */
/* compiled from: PG */
public final class C4681b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C4681b f14682e;

    /* renamed from: f */
    public static final C62940bt f14683f;

    /* renamed from: h */
    private static volatile C63010eb f14684h;

    /* renamed from: a */
    public int f14685a;

    /* renamed from: b */
    public C4665l f14686b;

    /* renamed from: c */
    public C62971cq f14687c = emptyProtobufList();

    /* renamed from: d */
    public double f14688d;

    /* renamed from: g */
    private byte f14689g = 2;

    static {
        C4681b bVar = new C4681b();
        f14682e = bVar;
        C62942bv.registerDefaultInstance(C4681b.class, bVar);
        f14683f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194782351, C63066gd.MESSAGE, C4681b.class);
    }

    private C4681b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f14689g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f14689g = b;
                return null;
            case 2:
                return newMessageInfo(f14682e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003က\u0001", new Object[]{"a", "b", C45240c.f118157a, C56425d.class, "d"});
            case 3:
                return new C4681b();
            case 4:
                return new C4680a();
            case 5:
                return f14682e;
            case 6:
                C63010eb ebVar = f14684h;
                if (ebVar == null) {
                    synchronized (C4681b.class) {
                        ebVar = f14684h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14682e);
                            f14684h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
