package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.a.s */
/* compiled from: PG */
public final class C71132s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71132s f189749c;

    /* renamed from: d */
    public static final C62940bt f189750d;

    /* renamed from: e */
    private static volatile C63010eb f189751e;

    /* renamed from: a */
    public int f189752a;

    /* renamed from: b */
    public C71135v f189753b;

    static {
        C71132s sVar = new C71132s();
        f189749c = sVar;
        C62942bv.registerDefaultInstance(C71132s.class, sVar);
        f189750d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, sVar, sVar, (C62958ce) null, 384946538, C63066gd.MESSAGE, C71132s.class);
    }

    private C71132s() {
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
                return newMessageInfo(f189749c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71132s();
            case 4:
                return new C71131r();
            case 5:
                return f189749c;
            case 6:
                C63010eb ebVar = f189751e;
                if (ebVar == null) {
                    synchronized (C71132s.class) {
                        ebVar = f189751e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189749c);
                            f189751e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
