package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ka */
/* compiled from: PG */
public final class C14460ka extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14460ka f43729b;

    /* renamed from: c */
    private static volatile C63010eb f43730c;

    /* renamed from: a */
    public int f43731a;

    static {
        C14460ka kaVar = new C14460ka();
        f43729b = kaVar;
        C62942bv.registerDefaultInstance(C14460ka.class, kaVar);
    }

    private C14460ka() {
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
                return newMessageInfo(f43729b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14460ka();
            case 4:
                return new C14458jz();
            case 5:
                return f43729b;
            case 6:
                C63010eb ebVar = f43730c;
                if (ebVar == null) {
                    synchronized (C14460ka.class) {
                        ebVar = f43730c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43729b);
                            f43730c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
