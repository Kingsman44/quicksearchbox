package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2511d.p2512a.C32510c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.dq */
/* compiled from: PG */
public final class C119876dq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119876dq f333846c;

    /* renamed from: d */
    public static final C62940bt f333847d;

    /* renamed from: e */
    private static volatile C63010eb f333848e;

    /* renamed from: a */
    public int f333849a = 0;

    /* renamed from: b */
    public Object f333850b;

    static {
        C119876dq dqVar = new C119876dq();
        f333846c = dqVar;
        C62942bv.registerDefaultInstance(C119876dq.class, dqVar);
        f333847d = C62942bv.newSingularGeneratedExtension(C32510c.f87086e, dqVar, dqVar, (C62958ce) null, 421835928, C63066gd.MESSAGE, C119876dq.class);
    }

    private C119876dq() {
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
                return newMessageInfo(f333846c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C32796ar.class, C119816bk.class});
            case 3:
                return new C119876dq();
            case 4:
                return new C119875dp();
            case 5:
                return f333846c;
            case 6:
                C63010eb ebVar = f333848e;
                if (ebVar == null) {
                    synchronized (C119876dq.class) {
                        ebVar = f333848e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333846c);
                            f333848e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
