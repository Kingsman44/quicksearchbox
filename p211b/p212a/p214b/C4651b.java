package p211b.p212a.p214b;

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

/* renamed from: b.a.b.b */
/* compiled from: PG */
public final class C4651b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C4651b f14578f;

    /* renamed from: g */
    public static final C62940bt f14579g;

    /* renamed from: i */
    private static volatile C63010eb f14580i;

    /* renamed from: a */
    public int f14581a;

    /* renamed from: b */
    public C62971cq f14582b = emptyProtobufList();

    /* renamed from: c */
    public boolean f14583c;

    /* renamed from: d */
    public int f14584d = 4;

    /* renamed from: e */
    public int f14585e;

    /* renamed from: h */
    private byte f14586h = 2;

    static {
        C4651b bVar = new C4651b();
        f14578f = bVar;
        C62942bv.registerDefaultInstance(C4651b.class, bVar);
        f14579g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194769475, C63066gd.MESSAGE, C4651b.class);
    }

    private C4651b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f14586h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f14586h = b;
                return null;
            case 2:
                return newMessageInfo(f14578f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000\u0004င\u0001\u0005င\u0002", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C4651b();
            case 4:
                return new C4650a();
            case 5:
                return f14578f;
            case 6:
                C63010eb ebVar = f14580i;
                if (ebVar == null) {
                    synchronized (C4651b.class) {
                        ebVar = f14580i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14578f);
                            f14580i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
