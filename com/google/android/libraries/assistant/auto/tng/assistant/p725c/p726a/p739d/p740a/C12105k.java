package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.p740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.d.a.k */
/* compiled from: PG */
public final class C12105k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12105k f38709c;

    /* renamed from: d */
    private static volatile C63010eb f38710d;

    /* renamed from: a */
    public int f38711a;

    /* renamed from: b */
    public long f38712b;

    static {
        C12105k kVar = new C12105k();
        f38709c = kVar;
        C62942bv.registerDefaultInstance(C12105k.class, kVar);
    }

    private C12105k() {
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
                return newMessageInfo(f38709c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C12105k();
            case 4:
                return new C12104j();
            case 5:
                return f38709c;
            case 6:
                C63010eb ebVar = f38710d;
                if (ebVar == null) {
                    synchronized (C12105k.class) {
                        ebVar = f38710d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38709c);
                            f38710d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
