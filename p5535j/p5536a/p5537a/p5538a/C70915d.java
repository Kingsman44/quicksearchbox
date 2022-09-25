package p5535j.p5536a.p5537a.p5538a;

import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.a.a.d */
/* compiled from: PG */
public final class C70915d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70915d f189106c;

    /* renamed from: d */
    public static final C62940bt f189107d;

    /* renamed from: e */
    private static volatile C63010eb f189108e;

    /* renamed from: a */
    public int f189109a;

    /* renamed from: b */
    public C70914c f189110b;

    static {
        C70915d dVar = new C70915d();
        f189106c = dVar;
        C62942bv.registerDefaultInstance(C70915d.class, dVar);
        f189107d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, dVar, dVar, (C62958ce) null, 391786244, C63066gd.MESSAGE, C70915d.class);
    }

    private C70915d() {
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
                return newMessageInfo(f189106c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C70915d();
            case 4:
                return new C70912a();
            case 5:
                return f189106c;
            case 6:
                C63010eb ebVar = f189108e;
                if (ebVar == null) {
                    synchronized (C70915d.class) {
                        ebVar = f189108e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189106c);
                            f189108e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
