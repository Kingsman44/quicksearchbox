package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.adv */
/* compiled from: PG */
public final class adv extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final adv f129073f;

    /* renamed from: h */
    private static volatile C63010eb f129074h;

    /* renamed from: a */
    public int f129075a = 0;

    /* renamed from: b */
    public Object f129076b;

    /* renamed from: c */
    public int f129077c;

    /* renamed from: d */
    public C63088z f129078d = C63088z.f170246b;

    /* renamed from: e */
    public C63088z f129079e = C63088z.f170246b;

    /* renamed from: g */
    private int f129080g;

    static {
        adv adv = new adv();
        f129073f = adv;
        C62942bv.registerDefaultInstance(adv.class, adv);
    }

    private adv() {
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
                return newMessageInfo(f129073f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ြ\u0000", new Object[]{"b", "a", C30325g.f82003a, C45240c.f118157a, adt.f129072a, "d", "e", adp.class});
            case 3:
                return new adv();
            case 4:
                return new C49818ads();
            case 5:
                return f129073f;
            case 6:
                C63010eb ebVar = f129074h;
                if (ebVar == null) {
                    synchronized (adv.class) {
                        ebVar = f129074h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129073f);
                            f129074h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
