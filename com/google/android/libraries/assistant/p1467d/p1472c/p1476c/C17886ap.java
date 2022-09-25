package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.android.libraries.assistant.p1467d.p1471b.C17815a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.ap */
/* compiled from: PG */
public final class C17886ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17886ap f51251c;

    /* renamed from: d */
    private static volatile C63010eb f51252d;

    /* renamed from: a */
    public int f51253a;

    /* renamed from: b */
    public int f51254b;

    static {
        C17886ap apVar = new C17886ap();
        f51251c = apVar;
        C62942bv.registerDefaultInstance(C17886ap.class, apVar);
    }

    private C17886ap() {
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
                return newMessageInfo(f51251c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C17815a.f51118a});
            case 3:
                return new C17886ap();
            case 4:
                return new C17885ao();
            case 5:
                return f51251c;
            case 6:
                C63010eb ebVar = f51252d;
                if (ebVar == null) {
                    synchronized (C17886ap.class) {
                        ebVar = f51252d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51251c);
                            f51252d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
