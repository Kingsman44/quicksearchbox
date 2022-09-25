package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.ae */
/* compiled from: PG */
public final class C13017ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13017ae f40434c;

    /* renamed from: e */
    private static volatile C63010eb f40435e;

    /* renamed from: a */
    public int f40436a;

    /* renamed from: b */
    public C16662b f40437b;

    /* renamed from: d */
    private byte f40438d = 2;

    static {
        C13017ae aeVar = new C13017ae();
        f40434c = aeVar;
        C62942bv.registerDefaultInstance(C13017ae.class, aeVar);
    }

    private C13017ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40438d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40438d = b;
                return null;
            case 2:
                return newMessageInfo(f40434c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13017ae();
            case 4:
                return new C13016ad();
            case 5:
                return f40434c;
            case 6:
                C63010eb ebVar = f40435e;
                if (ebVar == null) {
                    synchronized (C13017ae.class) {
                        ebVar = f40435e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40434c);
                            f40435e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
