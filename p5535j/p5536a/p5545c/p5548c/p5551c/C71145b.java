package p5535j.p5536a.p5545c.p5548c.p5551c;

import com.google.common.p4552o.apd;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.c.b */
/* compiled from: PG */
public final class C71145b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71145b f189786c;

    /* renamed from: d */
    public static final C62940bt f189787d;

    /* renamed from: e */
    private static volatile C63010eb f189788e;

    /* renamed from: a */
    public int f189789a;

    /* renamed from: b */
    public apd f189790b;

    static {
        C71145b bVar = new C71145b();
        f189786c = bVar;
        C62942bv.registerDefaultInstance(C71145b.class, bVar);
        f189787d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, bVar, bVar, (C62958ce) null, 335590418, C63066gd.MESSAGE, C71145b.class);
    }

    private C71145b() {
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
                return newMessageInfo(f189786c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71145b();
            case 4:
                return new C71144a();
            case 5:
                return f189786c;
            case 6:
                C63010eb ebVar = f189788e;
                if (ebVar == null) {
                    synchronized (C71145b.class) {
                        ebVar = f189788e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189786c);
                            f189788e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
