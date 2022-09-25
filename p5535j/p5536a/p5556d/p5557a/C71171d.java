package p5535j.p5536a.p5556d.p5557a;

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

/* renamed from: j.a.d.a.d */
/* compiled from: PG */
public final class C71171d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71171d f189878d;

    /* renamed from: e */
    public static final C62940bt f189879e;

    /* renamed from: f */
    private static volatile C63010eb f189880f;

    /* renamed from: a */
    public int f189881a;

    /* renamed from: b */
    public int f189882b;

    /* renamed from: c */
    public int f189883c;

    static {
        C71171d dVar = new C71171d();
        f189878d = dVar;
        C62942bv.registerDefaultInstance(C71171d.class, dVar);
        f189879e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, dVar, dVar, (C62958ce) null, 365783184, C63066gd.MESSAGE, C71171d.class);
    }

    private C71171d() {
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
                return newMessageInfo(f189878d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", C71170c.m103903b(), C45240c.f118157a});
            case 3:
                return new C71171d();
            case 4:
                return new C71168a();
            case 5:
                return f189878d;
            case 6:
                C63010eb ebVar = f189880f;
                if (ebVar == null) {
                    synchronized (C71171d.class) {
                        ebVar = f189880f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189878d);
                            f189880f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
