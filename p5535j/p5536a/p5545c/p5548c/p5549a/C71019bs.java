package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.apps.gsa.nga.engine.dictation.j;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.bs */
/* compiled from: PG */
public final class C71019bs extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71019bs f189393e;

    /* renamed from: f */
    private static volatile C63010eb f189394f;

    /* renamed from: a */
    public int f189395a;

    /* renamed from: b */
    public int f189396b;

    /* renamed from: c */
    public int f189397c;

    /* renamed from: d */
    public int f189398d;

    static {
        C71019bs bsVar = new C71019bs();
        f189393e = bsVar;
        C62942bv.registerDefaultInstance(C71019bs.class, bsVar);
    }

    private C71019bs() {
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
                return newMessageInfo(f189393e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C71018br.f189392a, C45240c.f118157a, C71017bq.f189391a, "d", j.a});
            case 3:
                return new C71019bs();
            case 4:
                return new C71016bp();
            case 5:
                return f189393e;
            case 6:
                C63010eb ebVar = f189394f;
                if (ebVar == null) {
                    synchronized (C71019bs.class) {
                        ebVar = f189394f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189393e);
                            f189394f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
