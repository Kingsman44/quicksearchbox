package com.google.assistant.p3793ae.p3794a;

import com.google.android.libraries.mdi.C29690f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ae.a.b */
/* compiled from: PG */
public final class C48770b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48770b f126194c;

    /* renamed from: d */
    private static volatile C63010eb f126195d;

    /* renamed from: a */
    public C29690f f126196a;

    /* renamed from: b */
    public C48773e f126197b;

    static {
        C48770b bVar = new C48770b();
        f126194c = bVar;
        C62942bv.registerDefaultInstance(C48770b.class, bVar);
    }

    private C48770b() {
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
                return newMessageInfo(f126194c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C48770b();
            case 4:
                return new C48769a();
            case 5:
                return f126194c;
            case 6:
                C63010eb ebVar = f126195d;
                if (ebVar == null) {
                    synchronized (C48770b.class) {
                        ebVar = f126195d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126194c);
                            f126195d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
