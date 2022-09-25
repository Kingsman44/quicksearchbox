package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13058d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.o */
/* compiled from: PG */
public final class C12997o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12997o f40400c;

    /* renamed from: d */
    private static volatile C63010eb f40401d;

    /* renamed from: a */
    public int f40402a;

    /* renamed from: b */
    public C13058d f40403b;

    static {
        C12997o oVar = new C12997o();
        f40400c = oVar;
        C62942bv.registerDefaultInstance(C12997o.class, oVar);
    }

    private C12997o() {
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
                return newMessageInfo(f40400c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C12997o();
            case 4:
                return new C12996n();
            case 5:
                return f40400c;
            case 6:
                C63010eb ebVar = f40401d;
                if (ebVar == null) {
                    synchronized (C12997o.class) {
                        ebVar = f40401d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40400c);
                            f40401d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
