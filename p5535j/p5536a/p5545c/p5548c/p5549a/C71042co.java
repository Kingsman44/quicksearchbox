package p5535j.p5536a.p5545c.p5548c.p5549a;

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

/* renamed from: j.a.c.c.a.co */
/* compiled from: PG */
public final class C71042co extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71042co f189463d;

    /* renamed from: e */
    public static final C62940bt f189464e;

    /* renamed from: f */
    private static volatile C63010eb f189465f;

    /* renamed from: a */
    public int f189466a;

    /* renamed from: b */
    public C71082ea f189467b;

    /* renamed from: c */
    public C71023bw f189468c;

    static {
        C71042co coVar = new C71042co();
        f189463d = coVar;
        C62942bv.registerDefaultInstance(C71042co.class, coVar);
        f189464e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, coVar, coVar, (C62958ce) null, 452605855, C63066gd.MESSAGE, C71042co.class);
    }

    private C71042co() {
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
                return newMessageInfo(f189463d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71042co();
            case 4:
                return new C71041cn();
            case 5:
                return f189463d;
            case 6:
                C63010eb ebVar = f189465f;
                if (ebVar == null) {
                    synchronized (C71042co.class) {
                        ebVar = f189465f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189463d);
                            f189465f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
