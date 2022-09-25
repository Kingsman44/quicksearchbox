package com.google.protos.p4816ai.p4820d.p4826d.p4827a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4701g.C62250a;
import com.google.lens.p4701g.C62331d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.d.a.j */
/* compiled from: PG */
public final class C63237j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63237j f170851f;

    /* renamed from: g */
    private static volatile C63010eb f170852g;

    /* renamed from: a */
    public int f170853a;

    /* renamed from: b */
    public int f170854b;

    /* renamed from: c */
    public int f170855c;

    /* renamed from: d */
    public C63235h f170856d;

    /* renamed from: e */
    public C63240m f170857e;

    static {
        C63237j jVar = new C63237j();
        f170851f = jVar;
        C62942bv.registerDefaultInstance(C63237j.class, jVar);
    }

    private C63237j() {
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
                return newMessageInfo(f170851f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C62331d.m94768b(), C45240c.f118157a, C62250a.f168059a, "d", "e"});
            case 3:
                return new C63237j();
            case 4:
                return new C63236i();
            case 5:
                return f170851f;
            case 6:
                C63010eb ebVar = f170852g;
                if (ebVar == null) {
                    synchronized (C63237j.class) {
                        ebVar = f170852g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170851f);
                            f170852g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
