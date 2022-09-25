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

/* renamed from: j.a.c.c.a.i */
/* compiled from: PG */
public final class C71122i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71122i f189727e;

    /* renamed from: f */
    public static final C62940bt f189728f;

    /* renamed from: g */
    private static volatile C63010eb f189729g;

    /* renamed from: a */
    public int f189730a;

    /* renamed from: b */
    public C71128o f189731b;

    /* renamed from: c */
    public C71130q f189732c;

    /* renamed from: d */
    public C71125l f189733d;

    static {
        C71122i iVar = new C71122i();
        f189727e = iVar;
        C62942bv.registerDefaultInstance(C71122i.class, iVar);
        f189728f = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, iVar, iVar, (C62958ce) null, 413271556, C63066gd.MESSAGE, C71122i.class);
    }

    private C71122i() {
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
                return newMessageInfo(f189727e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71122i();
            case 4:
                return new C71121h();
            case 5:
                return f189727e;
            case 6:
                C63010eb ebVar = f189729g;
                if (ebVar == null) {
                    synchronized (C71122i.class) {
                        ebVar = f189729g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189727e);
                            f189729g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
