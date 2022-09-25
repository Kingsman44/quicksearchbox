package com.google.assistant.p3861at;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pe */
/* compiled from: PG */
public final class C50225pe extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50225pe f130591c;

    /* renamed from: e */
    private static volatile C63010eb f130592e;

    /* renamed from: a */
    public int f130593a;

    /* renamed from: b */
    public C45632al f130594b;

    /* renamed from: d */
    private byte f130595d = 2;

    static {
        C50225pe peVar = new C50225pe();
        f130591c = peVar;
        C62942bv.registerDefaultInstance(C50225pe.class, peVar);
    }

    private C50225pe() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f130595d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f130595d = b;
                return null;
            case 2:
                return newMessageInfo(f130591c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50225pe();
            case 4:
                return new C50224pd();
            case 5:
                return f130591c;
            case 6:
                C63010eb ebVar = f130592e;
                if (ebVar == null) {
                    synchronized (C50225pe.class) {
                        ebVar = f130592e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130591c);
                            f130592e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
