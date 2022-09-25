package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.ab */
/* compiled from: PG */
public final class C104485ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C104485ab f290588c;

    /* renamed from: d */
    private static volatile C63010eb f290589d;

    /* renamed from: a */
    public int f290590a;

    /* renamed from: b */
    public boolean f290591b;

    static {
        C104485ab abVar = new C104485ab();
        f290588c = abVar;
        C62942bv.registerDefaultInstance(C104485ab.class, abVar);
    }

    private C104485ab() {
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
                return newMessageInfo(f290588c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C104485ab();
            case 4:
                return new C104484aa();
            case 5:
                return f290588c;
            case 6:
                C63010eb ebVar = f290589d;
                if (ebVar == null) {
                    synchronized (C104485ab.class) {
                        ebVar = f290589d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290588c);
                            f290589d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
