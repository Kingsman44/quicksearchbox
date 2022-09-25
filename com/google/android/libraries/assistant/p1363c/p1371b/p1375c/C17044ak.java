package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.ak */
/* compiled from: PG */
public final class C17044ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17044ak f49650c;

    /* renamed from: e */
    private static volatile C63010eb f49651e;

    /* renamed from: a */
    public int f49652a;

    /* renamed from: b */
    public C17036ac f49653b;

    /* renamed from: d */
    private byte f49654d = 2;

    static {
        C17044ak akVar = new C17044ak();
        f49650c = akVar;
        C62942bv.registerDefaultInstance(C17044ak.class, akVar);
    }

    private C17044ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49654d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49654d = b;
                return null;
            case 2:
                return newMessageInfo(f49650c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17044ak();
            case 4:
                return new C17043aj();
            case 5:
                return f49650c;
            case 6:
                C63010eb ebVar = f49651e;
                if (ebVar == null) {
                    synchronized (C17044ak.class) {
                        ebVar = f49651e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49650c);
                            f49651e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
