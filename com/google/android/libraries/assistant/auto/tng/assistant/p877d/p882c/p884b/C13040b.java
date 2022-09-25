package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.b */
/* compiled from: PG */
public final class C13040b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13040b f40476c;

    /* renamed from: d */
    private static volatile C63010eb f40477d;

    /* renamed from: a */
    public int f40478a;

    /* renamed from: b */
    public long f40479b;

    static {
        C13040b bVar = new C13040b();
        f40476c = bVar;
        C62942bv.registerDefaultInstance(C13040b.class, bVar);
    }

    private C13040b() {
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
                return newMessageInfo(f40476c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13040b();
            case 4:
                return new C13039a();
            case 5:
                return f40476c;
            case 6:
                C63010eb ebVar = f40477d;
                if (ebVar == null) {
                    synchronized (C13040b.class) {
                        ebVar = f40477d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40476c);
                            f40477d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
