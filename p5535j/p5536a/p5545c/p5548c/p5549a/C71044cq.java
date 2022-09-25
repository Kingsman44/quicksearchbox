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

/* renamed from: j.a.c.c.a.cq */
/* compiled from: PG */
public final class C71044cq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71044cq f189469d;

    /* renamed from: e */
    public static final C62940bt f189470e;

    /* renamed from: f */
    private static volatile C63010eb f189471f;

    /* renamed from: a */
    public int f189472a;

    /* renamed from: b */
    public C71040cm f189473b;

    /* renamed from: c */
    public C71037cj f189474c;

    static {
        C71044cq cqVar = new C71044cq();
        f189469d = cqVar;
        C62942bv.registerDefaultInstance(C71044cq.class, cqVar);
        f189470e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, cqVar, cqVar, (C62958ce) null, 411820081, C63066gd.MESSAGE, C71044cq.class);
    }

    private C71044cq() {
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
                return newMessageInfo(f189469d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71044cq();
            case 4:
                return new C71043cp();
            case 5:
                return f189469d;
            case 6:
                C63010eb ebVar = f189471f;
                if (ebVar == null) {
                    synchronized (C71044cq.class) {
                        ebVar = f189471f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189469d);
                            f189471f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
