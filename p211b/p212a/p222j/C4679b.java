package p211b.p212a.p222j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import p211b.p212a.p227o.C4689b;

/* renamed from: b.a.j.b */
/* compiled from: PG */
public final class C4679b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C4679b f14675d;

    /* renamed from: e */
    public static final C62940bt f14676e;

    /* renamed from: g */
    private static volatile C63010eb f14677g;

    /* renamed from: a */
    public int f14678a;

    /* renamed from: b */
    public C56425d f14679b;

    /* renamed from: c */
    public C4689b f14680c;

    /* renamed from: f */
    private byte f14681f = 2;

    static {
        C4679b bVar = new C4679b();
        f14675d = bVar;
        C62942bv.registerDefaultInstance(C4679b.class, bVar);
        f14676e = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194783618, C63066gd.MESSAGE, C4679b.class);
    }

    private C4679b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f14681f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f14681f = b;
                return null;
            case 2:
                return newMessageInfo(f14675d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C4679b();
            case 4:
                return new C4678a();
            case 5:
                return f14675d;
            case 6:
                C63010eb ebVar = f14677g;
                if (ebVar == null) {
                    synchronized (C4679b.class) {
                        ebVar = f14677g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14675d);
                            f14677g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
