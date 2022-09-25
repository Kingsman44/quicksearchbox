package p5535j.p5536a.p5545c.p5554e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.e.b */
/* compiled from: PG */
public final class C71165b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71165b f189854e;

    /* renamed from: f */
    public static final C62940bt f189855f;

    /* renamed from: g */
    private static volatile C63010eb f189856g;

    /* renamed from: a */
    public int f189857a;

    /* renamed from: b */
    public int f189858b;

    /* renamed from: c */
    public int f189859c;

    /* renamed from: d */
    public boolean f189860d;

    static {
        C71165b bVar = new C71165b();
        f189854e = bVar;
        C62942bv.registerDefaultInstance(C71165b.class, bVar);
        f189855f = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, bVar, bVar, (C62958ce) null, 337978630, C63066gd.MESSAGE, C71165b.class);
    }

    private C71165b() {
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
                return newMessageInfo(f189854e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71165b();
            case 4:
                return new C71164a();
            case 5:
                return f189854e;
            case 6:
                C63010eb ebVar = f189856g;
                if (ebVar == null) {
                    synchronized (C71165b.class) {
                        ebVar = f189856g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189854e);
                            f189856g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
