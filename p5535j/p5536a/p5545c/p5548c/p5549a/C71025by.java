package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.a.by */
/* compiled from: PG */
public final class C71025by extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C71025by f189420b;

    /* renamed from: c */
    public static final C62940bt f189421c;

    /* renamed from: d */
    private static volatile C63010eb f189422d;

    /* renamed from: a */
    public C62971cq f189423a = emptyProtobufList();

    static {
        C71025by byVar = new C71025by();
        f189420b = byVar;
        C62942bv.registerDefaultInstance(C71025by.class, byVar);
        f189421c = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, byVar, byVar, (C62958ce) null, 459750834, C63066gd.MESSAGE, C71025by.class);
    }

    private C71025by() {
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
                return newMessageInfo(f189420b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C71033cf.class});
            case 3:
                return new C71025by();
            case 4:
                return new C71024bx();
            case 5:
                return f189420b;
            case 6:
                C63010eb ebVar = f189422d;
                if (ebVar == null) {
                    synchronized (C71025by.class) {
                        ebVar = f189422d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189420b);
                            f189422d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
