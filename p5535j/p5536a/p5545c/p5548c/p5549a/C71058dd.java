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

/* renamed from: j.a.c.c.a.dd */
/* compiled from: PG */
public final class C71058dd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71058dd f189512c;

    /* renamed from: d */
    public static final C62940bt f189513d;

    /* renamed from: e */
    private static volatile C63010eb f189514e;

    /* renamed from: a */
    public int f189515a;

    /* renamed from: b */
    public C71066dl f189516b;

    static {
        C71058dd ddVar = new C71058dd();
        f189512c = ddVar;
        C62942bv.registerDefaultInstance(C71058dd.class, ddVar);
        f189513d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, ddVar, ddVar, (C62958ce) null, 422812098, C63066gd.MESSAGE, C71058dd.class);
    }

    private C71058dd() {
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
                return newMessageInfo(f189512c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C71058dd();
            case 4:
                return new C71057dc();
            case 5:
                return f189512c;
            case 6:
                C63010eb ebVar = f189514e;
                if (ebVar == null) {
                    synchronized (C71058dd.class) {
                        ebVar = f189514e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189512c);
                            f189514e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
