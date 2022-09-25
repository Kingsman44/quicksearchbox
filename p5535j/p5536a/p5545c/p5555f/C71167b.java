package p5535j.p5536a.p5545c.p5555f;

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

/* renamed from: j.a.c.f.b */
/* compiled from: PG */
public final class C71167b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71167b f189861d;

    /* renamed from: e */
    public static final C62940bt f189862e;

    /* renamed from: f */
    private static volatile C63010eb f189863f;

    /* renamed from: a */
    public int f189864a;

    /* renamed from: b */
    public long f189865b;

    /* renamed from: c */
    public boolean f189866c = true;

    static {
        C71167b bVar = new C71167b();
        f189861d = bVar;
        C62942bv.registerDefaultInstance(C71167b.class, bVar);
        f189862e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, bVar, bVar, (C62958ce) null, 346433645, C63066gd.MESSAGE, C71167b.class);
    }

    private C71167b() {
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
                return newMessageInfo(f189861d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71167b();
            case 4:
                return new C71166a();
            case 5:
                return f189861d;
            case 6:
                C63010eb ebVar = f189863f;
                if (ebVar == null) {
                    synchronized (C71167b.class) {
                        ebVar = f189863f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189861d);
                            f189863f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
