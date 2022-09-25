package p5535j.p5536a.p5562i.p5563a.p5564a.p5565a;

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

/* renamed from: j.a.i.a.a.a.b */
/* compiled from: PG */
public final class C71183b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71183b f189922d;

    /* renamed from: e */
    public static final C62940bt f189923e;

    /* renamed from: f */
    private static volatile C63010eb f189924f;

    /* renamed from: a */
    public int f189925a;

    /* renamed from: b */
    public long f189926b;

    /* renamed from: c */
    public long f189927c;

    static {
        C71183b bVar = new C71183b();
        f189922d = bVar;
        C62942bv.registerDefaultInstance(C71183b.class, bVar);
        f189923e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, bVar, bVar, (C62958ce) null, 465529016, C63066gd.MESSAGE, C71183b.class);
    }

    private C71183b() {
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
                return newMessageInfo(f189922d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71183b();
            case 4:
                return new C71182a();
            case 5:
                return f189922d;
            case 6:
                C63010eb ebVar = f189924f;
                if (ebVar == null) {
                    synchronized (C71183b.class) {
                        ebVar = f189924f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189922d);
                            f189924f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
