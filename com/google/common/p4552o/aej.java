package com.google.common.p4552o;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14631u;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aej */
/* compiled from: PG */
public final class aej extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aej f158460c;

    /* renamed from: d */
    private static volatile C63010eb f158461d;

    /* renamed from: a */
    public int f158462a = 0;

    /* renamed from: b */
    public Object f158463b;

    static {
        aej aej = new aej();
        f158460c = aej;
        C62942bv.registerDefaultInstance(aej.class, aej);
    }

    private aej() {
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
                return newMessageInfo(f158460c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C14350fz.m30612b(), C14631u.f44217a});
            case 3:
                return new aej();
            case 4:
                return new aei();
            case 5:
                return f158460c;
            case 6:
                C63010eb ebVar = f158461d;
                if (ebVar == null) {
                    synchronized (aej.class) {
                        ebVar = f158461d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158460c);
                            f158461d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
