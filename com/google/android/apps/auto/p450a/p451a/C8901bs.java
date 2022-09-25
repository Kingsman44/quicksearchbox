package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.auto.a.a.bs */
/* compiled from: PG */
public final class C8901bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8901bs f30901c;

    /* renamed from: d */
    public static final C62940bt f30902d;

    /* renamed from: e */
    private static volatile C63010eb f30903e;

    /* renamed from: a */
    public int f30904a;

    /* renamed from: b */
    public C8913f f30905b;

    static {
        C8901bs bsVar = new C8901bs();
        f30901c = bsVar;
        C62942bv.registerDefaultInstance(C8901bs.class, bsVar);
        f30902d = C62942bv.newSingularGeneratedExtension(C8884bb.f30842c, bsVar, bsVar, (C62958ce) null, 101, C63066gd.MESSAGE, C8901bs.class);
    }

    private C8901bs() {
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
                return newMessageInfo(f30901c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8901bs();
            case 4:
                return new C8900br();
            case 5:
                return f30901c;
            case 6:
                C63010eb ebVar = f30903e;
                if (ebVar == null) {
                    synchronized (C8901bs.class) {
                        ebVar = f30903e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30901c);
                            f30903e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
