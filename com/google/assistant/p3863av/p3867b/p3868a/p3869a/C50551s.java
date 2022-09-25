package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.b.a.a.s */
/* compiled from: PG */
public final class C50551s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50551s f131563c;

    /* renamed from: e */
    private static volatile C63010eb f131564e;

    /* renamed from: a */
    public int f131565a;

    /* renamed from: b */
    public C50540h f131566b;

    /* renamed from: d */
    private byte f131567d = 2;

    static {
        C50551s sVar = new C50551s();
        f131563c = sVar;
        C62942bv.registerDefaultInstance(C50551s.class, sVar);
    }

    private C50551s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131567d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131567d = b;
                return null;
            case 2:
                return newMessageInfo(f131563c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50551s();
            case 4:
                return new C50550r();
            case 5:
                return f131563c;
            case 6:
                C63010eb ebVar = f131564e;
                if (ebVar == null) {
                    synchronized (C50551s.class) {
                        ebVar = f131564e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131563c);
                            f131564e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
