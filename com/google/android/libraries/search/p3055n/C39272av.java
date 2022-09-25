package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.n.av */
/* compiled from: PG */
public final class C39272av extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C39272av f103446b;

    /* renamed from: c */
    public static final C62940bt f103447c;

    /* renamed from: d */
    public static final C62940bt f103448d;

    /* renamed from: f */
    private static volatile C63010eb f103449f;

    /* renamed from: a */
    public boolean f103450a;

    /* renamed from: e */
    private int f103451e;

    static {
        C39272av avVar = new C39272av();
        f103446b = avVar;
        C62942bv.registerDefaultInstance(C39272av.class, avVar);
        C39272av avVar2 = avVar;
        C39272av avVar3 = avVar;
        f103447c = C62942bv.newSingularGeneratedExtension(C39655ci.f104377j, avVar2, avVar3, (C62958ce) null, 468335583, C63066gd.MESSAGE, C39272av.class);
        f103448d = C62942bv.newSingularGeneratedExtension(C39666ct.f104415e, avVar2, avVar3, (C62958ce) null, 467073568, C63066gd.MESSAGE, C39272av.class);
    }

    private C39272av() {
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
                return newMessageInfo(f103446b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"e", "a"});
            case 3:
                return new C39272av();
            case 4:
                return new C39271au();
            case 5:
                return f103446b;
            case 6:
                C63010eb ebVar = f103449f;
                if (ebVar == null) {
                    synchronized (C39272av.class) {
                        ebVar = f103449f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103446b);
                            f103449f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
