package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.an */
/* compiled from: PG */
public final class C16340an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f48109b = new C16336aj();

    /* renamed from: c */
    public static final C16340an f48110c;

    /* renamed from: d */
    private static volatile C63010eb f48111d;

    /* renamed from: a */
    public C62961ch f48112a = emptyIntList();

    static {
        C16340an anVar = new C16340an();
        f48110c = anVar;
        C62942bv.registerDefaultInstance(C16340an.class, anVar);
    }

    private C16340an() {
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
                return newMessageInfo(f48110c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C16338al.m33336b()});
            case 3:
                return new C16340an();
            case 4:
                return new C16339am();
            case 5:
                return f48110c;
            case 6:
                C63010eb ebVar = f48111d;
                if (ebVar == null) {
                    synchronized (C16340an.class) {
                        ebVar = f48111d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48110c);
                            f48111d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
