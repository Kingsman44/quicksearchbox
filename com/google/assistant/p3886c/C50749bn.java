package com.google.assistant.p3886c;

import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.bn */
/* compiled from: PG */
public final class C50749bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50749bn f132063c;

    /* renamed from: d */
    public static final C62940bt f132064d;

    /* renamed from: e */
    private static volatile C63010eb f132065e;

    /* renamed from: a */
    public int f132066a = 0;

    /* renamed from: b */
    public Object f132067b;

    static {
        C50749bn bnVar = new C50749bn();
        f132063c = bnVar;
        C62942bv.registerDefaultInstance(C50749bn.class, bnVar);
        f132064d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, bnVar, bnVar, (C62958ce) null, 356758406, C63066gd.MESSAGE, C50749bn.class);
    }

    private C50749bn() {
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
                return newMessageInfo(f132063c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C89776h.class, C123787p.class});
            case 3:
                return new C50749bn();
            case 4:
                return new C50747bl();
            case 5:
                return f132063c;
            case 6:
                C63010eb ebVar = f132065e;
                if (ebVar == null) {
                    synchronized (C50749bn.class) {
                        ebVar = f132065e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132063c);
                            f132065e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
