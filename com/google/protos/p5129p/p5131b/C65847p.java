package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4985f.p5040t.p5041a.C65338d;

/* renamed from: com.google.protos.p.b.p */
/* compiled from: PG */
public final class C65847p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65847p f178997c;

    /* renamed from: d */
    public static final C62940bt f178998d;

    /* renamed from: e */
    private static volatile C63010eb f178999e;

    /* renamed from: a */
    public int f179000a;

    /* renamed from: b */
    public C65338d f179001b;

    static {
        C65847p pVar = new C65847p();
        f178997c = pVar;
        C62942bv.registerDefaultInstance(C65847p.class, pVar);
        f178998d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, pVar, pVar, (C62958ce) null, 17, C63066gd.MESSAGE, C65847p.class);
    }

    private C65847p() {
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
                return newMessageInfo(f178997c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65847p();
            case 4:
                return new C65846o();
            case 5:
                return f178997c;
            case 6:
                C63010eb ebVar = f178999e;
                if (ebVar == null) {
                    synchronized (C65847p.class) {
                        ebVar = f178999e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178997c);
                            f178999e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
