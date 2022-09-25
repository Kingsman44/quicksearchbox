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

/* renamed from: j.a.c.c.a.ei */
/* compiled from: PG */
public final class C71090ei extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71090ei f189598c;

    /* renamed from: d */
    public static final C62940bt f189599d;

    /* renamed from: e */
    private static volatile C63010eb f189600e;

    /* renamed from: a */
    public int f189601a;

    /* renamed from: b */
    public C71088eg f189602b;

    static {
        C71090ei eiVar = new C71090ei();
        f189598c = eiVar;
        C62942bv.registerDefaultInstance(C71090ei.class, eiVar);
        f189599d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, eiVar, eiVar, (C62958ce) null, 468299263, C63066gd.MESSAGE, C71090ei.class);
    }

    private C71090ei() {
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
                return newMessageInfo(f189598c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71090ei();
            case 4:
                return new C71089eh();
            case 5:
                return f189598c;
            case 6:
                C63010eb ebVar = f189600e;
                if (ebVar == null) {
                    synchronized (C71090ei.class) {
                        ebVar = f189600e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189598c);
                            f189600e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
