package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.ap */
/* compiled from: PG */
public final class C121833ap extends C62942bv implements C121834aq {

    /* renamed from: b */
    public static final C121833ap f338067b;

    /* renamed from: d */
    private static volatile C63010eb f338068d;

    /* renamed from: a */
    public C34053bp f338069a;

    /* renamed from: c */
    private byte f338070c = 2;

    static {
        C121833ap apVar = new C121833ap();
        f338067b = apVar;
        C62942bv.registerDefaultInstance(C121833ap.class, apVar);
    }

    private C121833ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f338070c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f338070c = b;
                return null;
            case 2:
                return newMessageInfo(f338067b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C121833ap();
            case 4:
                return new C121832ao();
            case 5:
                return f338067b;
            case 6:
                C63010eb ebVar = f338068d;
                if (ebVar == null) {
                    synchronized (C121833ap.class) {
                        ebVar = f338068d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338067b);
                            f338068d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
