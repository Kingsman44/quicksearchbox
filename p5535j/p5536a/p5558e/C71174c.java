package p5535j.p5536a.p5558e;

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

/* renamed from: j.a.e.c */
/* compiled from: PG */
public final class C71174c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71174c f189885e;

    /* renamed from: f */
    public static final C62940bt f189886f;

    /* renamed from: g */
    private static volatile C63010eb f189887g;

    /* renamed from: a */
    public int f189888a;

    /* renamed from: b */
    public int f189889b;

    /* renamed from: c */
    public int f189890c;

    /* renamed from: d */
    public int f189891d;

    static {
        C71174c cVar = new C71174c();
        f189885e = cVar;
        C62942bv.registerDefaultInstance(C71174c.class, cVar);
        f189886f = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, cVar, cVar, (C62958ce) null, 362786962, C63066gd.MESSAGE, C71174c.class);
    }

    private C71174c() {
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
                return newMessageInfo(f189885e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, C71173b.f189884a, "d"});
            case 3:
                return new C71174c();
            case 4:
                return new C71172a();
            case 5:
                return f189885e;
            case 6:
                C63010eb ebVar = f189887g;
                if (ebVar == null) {
                    synchronized (C71174c.class) {
                        ebVar = f189887g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189885e);
                            f189887g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
