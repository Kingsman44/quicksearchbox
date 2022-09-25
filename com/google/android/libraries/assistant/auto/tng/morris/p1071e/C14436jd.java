package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jd */
/* compiled from: PG */
public final class C14436jd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f43670b = new C14434jb();

    /* renamed from: c */
    public static final C14436jd f43671c;

    /* renamed from: d */
    private static volatile C63010eb f43672d;

    /* renamed from: a */
    public C62961ch f43673a = emptyIntList();

    static {
        C14436jd jdVar = new C14436jd();
        f43671c = jdVar;
        C62942bv.registerDefaultInstance(C14436jd.class, jdVar);
    }

    private C14436jd() {
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
                return newMessageInfo(f43671c, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            case 3:
                return new C14436jd();
            case 4:
                return new C14435jc();
            case 5:
                return f43671c;
            case 6:
                C63010eb ebVar = f43672d;
                if (ebVar == null) {
                    synchronized (C14436jd.class) {
                        ebVar = f43672d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43671c);
                            f43672d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
