package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.assistant.p3745ab.C48237aw;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.a.dy */
/* compiled from: PG */
public final class C71079dy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71079dy f189554c;

    /* renamed from: d */
    public static final C62940bt f189555d;

    /* renamed from: e */
    private static volatile C63010eb f189556e;

    /* renamed from: a */
    public int f189557a;

    /* renamed from: b */
    public int f189558b;

    static {
        C71079dy dyVar = new C71079dy();
        f189554c = dyVar;
        C62942bv.registerDefaultInstance(C71079dy.class, dyVar);
        f189555d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, dyVar, dyVar, (C62958ce) null, 457536546, C63066gd.MESSAGE, C71079dy.class);
    }

    private C71079dy() {
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
                return newMessageInfo(f189554c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C48237aw.f124794a});
            case 3:
                return new C71079dy();
            case 4:
                return new C71078dx();
            case 5:
                return f189554c;
            case 6:
                C63010eb ebVar = f189556e;
                if (ebVar == null) {
                    synchronized (C71079dy.class) {
                        ebVar = f189556e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189554c);
                            f189556e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
