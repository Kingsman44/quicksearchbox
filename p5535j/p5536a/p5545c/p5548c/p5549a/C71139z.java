package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.z */
/* compiled from: PG */
public final class C71139z extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71139z f189768f;

    /* renamed from: g */
    private static volatile C63010eb f189769g;

    /* renamed from: a */
    public int f189770a;

    /* renamed from: b */
    public boolean f189771b;

    /* renamed from: c */
    public boolean f189772c;

    /* renamed from: d */
    public boolean f189773d;

    /* renamed from: e */
    public boolean f189774e;

    static {
        C71139z zVar = new C71139z();
        f189768f = zVar;
        C62942bv.registerDefaultInstance(C71139z.class, zVar);
    }

    private C71139z() {
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
                return newMessageInfo(f189768f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C71139z();
            case 4:
                return new C71138y();
            case 5:
                return f189768f;
            case 6:
                C63010eb ebVar = f189769g;
                if (ebVar == null) {
                    synchronized (C71139z.class) {
                        ebVar = f189769g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189768f);
                            f189769g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
