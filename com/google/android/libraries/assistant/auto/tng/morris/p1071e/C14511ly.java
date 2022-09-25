package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ly */
/* compiled from: PG */
public final class C14511ly extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14511ly f43880b;

    /* renamed from: c */
    private static volatile C63010eb f43881c;

    /* renamed from: a */
    public int f43882a;

    static {
        C14511ly lyVar = new C14511ly();
        f43880b = lyVar;
        C62942bv.registerDefaultInstance(C14511ly.class, lyVar);
    }

    private C14511ly() {
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
                return newMessageInfo(f43880b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14511ly();
            case 4:
                return new C14510lx();
            case 5:
                return f43880b;
            case 6:
                C63010eb ebVar = f43881c;
                if (ebVar == null) {
                    synchronized (C14511ly.class) {
                        ebVar = f43881c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43880b);
                            f43881c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
