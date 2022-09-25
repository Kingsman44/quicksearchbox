package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.assistant.p1467d.p1471b.C17825k;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.av */
/* compiled from: PG */
public final class C17892av extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C17892av f51261f;

    /* renamed from: g */
    private static volatile C63010eb f51262g;

    /* renamed from: a */
    public int f51263a;

    /* renamed from: b */
    public int f51264b;

    /* renamed from: c */
    public int f51265c;

    /* renamed from: d */
    public boolean f51266d;

    /* renamed from: e */
    public boolean f51267e;

    static {
        C17892av avVar = new C17892av();
        f51261f = avVar;
        C62942bv.registerDefaultInstance(C17892av.class, avVar);
    }

    private C17892av() {
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
                return newMessageInfo(f51261f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C17823i.m35070b(), C45240c.f118157a, C17825k.m35072b(), "d", "e"});
            case 3:
                return new C17892av();
            case 4:
                return new C17891au();
            case 5:
                return f51261f;
            case 6:
                C63010eb ebVar = f51262g;
                if (ebVar == null) {
                    synchronized (C17892av.class) {
                        ebVar = f51262g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51261f);
                            f51262g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
