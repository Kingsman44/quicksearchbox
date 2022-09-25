package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48277ce;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.a.ad */
/* compiled from: PG */
public final class C70977ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C70977ad f189266e;

    /* renamed from: f */
    public static final C62940bt f189267f;

    /* renamed from: g */
    private static volatile C63010eb f189268g;

    /* renamed from: a */
    public int f189269a;

    /* renamed from: b */
    public C70975ab f189270b;

    /* renamed from: c */
    public C70979af f189271c;

    /* renamed from: d */
    public C48277ce f189272d;

    static {
        C70977ad adVar = new C70977ad();
        f189266e = adVar;
        C62942bv.registerDefaultInstance(C70977ad.class, adVar);
        f189267f = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, adVar, adVar, (C62958ce) null, 416671902, C63066gd.MESSAGE, C70977ad.class);
    }

    private C70977ad() {
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
                return newMessageInfo(f189266e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C70977ad();
            case 4:
                return new C70976ac();
            case 5:
                return f189266e;
            case 6:
                C63010eb ebVar = f189268g;
                if (ebVar == null) {
                    synchronized (C70977ad.class) {
                        ebVar = f189268g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189266e);
                            f189268g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
