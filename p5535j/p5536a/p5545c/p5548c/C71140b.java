package p5535j.p5536a.p5545c.p5548c;

import com.google.common.p4552o.C60421pp;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.b */
/* compiled from: PG */
public final class C71140b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71140b f189775c;

    /* renamed from: d */
    public static final C62940bt f189776d;

    /* renamed from: e */
    private static volatile C63010eb f189777e;

    /* renamed from: a */
    public int f189778a;

    /* renamed from: b */
    public C60421pp f189779b;

    static {
        C71140b bVar = new C71140b();
        f189775c = bVar;
        C62942bv.registerDefaultInstance(C71140b.class, bVar);
        f189776d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, bVar, bVar, (C62958ce) null, 349640801, C63066gd.MESSAGE, C71140b.class);
    }

    private C71140b() {
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
                return newMessageInfo(f189775c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C71140b();
            case 4:
                return new C70972a();
            case 5:
                return f189775c;
            case 6:
                C63010eb ebVar = f189777e;
                if (ebVar == null) {
                    synchronized (C71140b.class) {
                        ebVar = f189777e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189775c);
                            f189777e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
