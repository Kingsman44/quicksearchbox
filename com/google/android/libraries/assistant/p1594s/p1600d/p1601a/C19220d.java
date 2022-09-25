package com.google.android.libraries.assistant.p1594s.p1600d.p1601a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.d.a.d */
/* compiled from: PG */
public final class C19220d extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C19220d f53813c;

    /* renamed from: e */
    private static volatile C63010eb f53814e;

    /* renamed from: a */
    public int f53815a;

    /* renamed from: b */
    public int f53816b;

    /* renamed from: d */
    private byte f53817d = 2;

    static {
        C19220d dVar = new C19220d();
        f53813c = dVar;
        C62942bv.registerDefaultInstance(C19220d.class, dVar);
    }

    private C19220d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53817d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53817d = b;
                return null;
            case 2:
                return newMessageInfo(f53813c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C19218b.f53812a});
            case 3:
                return new C19220d();
            case 4:
                return new C19217a();
            case 5:
                return f53813c;
            case 6:
                C63010eb ebVar = f53814e;
                if (ebVar == null) {
                    synchronized (C19220d.class) {
                        ebVar = f53814e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53813c);
                            f53814e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
