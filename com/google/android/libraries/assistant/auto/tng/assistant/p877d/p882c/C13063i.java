package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.i */
/* compiled from: PG */
public final class C13063i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13063i f40550c;

    /* renamed from: d */
    private static volatile C63010eb f40551d;

    /* renamed from: a */
    public int f40552a;

    /* renamed from: b */
    public long f40553b;

    static {
        C13063i iVar = new C13063i();
        f40550c = iVar;
        C62942bv.registerDefaultInstance(C13063i.class, iVar);
    }

    private C13063i() {
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
                return newMessageInfo(f40550c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13063i();
            case 4:
                return new C13062h();
            case 5:
                return f40550c;
            case 6:
                C63010eb ebVar = f40551d;
                if (ebVar == null) {
                    synchronized (C13063i.class) {
                        ebVar = f40551d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40550c);
                            f40551d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
