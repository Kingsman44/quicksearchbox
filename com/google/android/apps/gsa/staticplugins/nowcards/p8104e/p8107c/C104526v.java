package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62955cb;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.v */
/* compiled from: PG */
public final class C104526v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C104526v f290731b;

    /* renamed from: c */
    private static volatile C63010eb f290732c;

    /* renamed from: a */
    public C62955cb f290733a = emptyBooleanList();

    static {
        C104526v vVar = new C104526v();
        f290731b = vVar;
        C62942bv.registerDefaultInstance(C104526v.class, vVar);
    }

    private C104526v() {
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
                return newMessageInfo(f290731b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0019", new Object[]{"a"});
            case 3:
                return new C104526v();
            case 4:
                return new C104525u();
            case 5:
                return f290731b;
            case 6:
                C63010eb ebVar = f290732c;
                if (ebVar == null) {
                    synchronized (C104526v.class) {
                        ebVar = f290732c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290731b);
                            f290732c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
