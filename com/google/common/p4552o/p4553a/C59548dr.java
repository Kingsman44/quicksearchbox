package com.google.common.p4552o.p4553a;

import com.google.android.apps.gsa.assistant.shared.q.a.d;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.a.dr */
/* compiled from: PG */
public final class C59548dr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59548dr f158013c;

    /* renamed from: d */
    public static final C62940bt f158014d;

    /* renamed from: e */
    private static volatile C63010eb f158015e;

    /* renamed from: a */
    public int f158016a;

    /* renamed from: b */
    public int f158017b;

    static {
        C59548dr drVar = new C59548dr();
        f158013c = drVar;
        C62942bv.registerDefaultInstance(C59548dr.class, drVar);
        f158014d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, drVar, drVar, (C62958ce) null, 657, C63066gd.MESSAGE, C59548dr.class);
    }

    private C59548dr() {
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
                return newMessageInfo(f158013c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", d.a});
            case 3:
                return new C59548dr();
            case 4:
                return new C59547dq();
            case 5:
                return f158013c;
            case 6:
                C63010eb ebVar = f158015e;
                if (ebVar == null) {
                    synchronized (C59548dr.class) {
                        ebVar = f158015e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158013c);
                            f158015e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
