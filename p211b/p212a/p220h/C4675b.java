package p211b.p212a.p220h;

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

/* renamed from: b.a.h.b */
/* compiled from: PG */
public final class C4675b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C4675b f14657e;

    /* renamed from: f */
    public static final C62940bt f14658f;

    /* renamed from: h */
    private static volatile C63010eb f14659h;

    /* renamed from: a */
    public int f14660a;

    /* renamed from: b */
    public C56425d f14661b;

    /* renamed from: c */
    public C56425d f14662c;

    /* renamed from: d */
    public C4689b f14663d;

    /* renamed from: g */
    private byte f14664g = 2;

    static {
        C4675b bVar = new C4675b();
        f14657e = bVar;
        C62942bv.registerDefaultInstance(C4675b.class, bVar);
        f14658f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194529288, C63066gd.MESSAGE, C4675b.class);
    }

    private C4675b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f14664g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f14664g = b;
                return null;
            case 2:
                return newMessageInfo(f14657e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C4675b();
            case 4:
                return new C4674a();
            case 5:
                return f14657e;
            case 6:
                C63010eb ebVar = f14659h;
                if (ebVar == null) {
                    synchronized (C4675b.class) {
                        ebVar = f14659h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14657e);
                            f14659h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
