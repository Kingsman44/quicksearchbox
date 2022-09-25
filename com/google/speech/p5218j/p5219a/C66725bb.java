package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.bb */
/* compiled from: PG */
public final class C66725bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66725bb f181502c;

    /* renamed from: e */
    private static volatile C63010eb f181503e;

    /* renamed from: a */
    public int f181504a;

    /* renamed from: b */
    public C66722az f181505b;

    /* renamed from: d */
    private byte f181506d = 2;

    static {
        C66725bb bbVar = new C66725bb();
        f181502c = bbVar;
        C62942bv.registerDefaultInstance(C66725bb.class, bbVar);
    }

    private C66725bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181506d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181506d = b;
                return null;
            case 2:
                return newMessageInfo(f181502c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66725bb();
            case 4:
                return new C66724ba();
            case 5:
                return f181502c;
            case 6:
                C63010eb ebVar = f181503e;
                if (ebVar == null) {
                    synchronized (C66725bb.class) {
                        ebVar = f181503e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181502c);
                            f181503e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
