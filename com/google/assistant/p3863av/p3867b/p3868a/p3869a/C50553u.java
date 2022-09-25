package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.b.a.a.u */
/* compiled from: PG */
public final class C50553u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50553u f131568c;

    /* renamed from: d */
    private static volatile C63010eb f131569d;

    /* renamed from: a */
    public int f131570a;

    /* renamed from: b */
    public boolean f131571b;

    static {
        C50553u uVar = new C50553u();
        f131568c = uVar;
        C62942bv.registerDefaultInstance(C50553u.class, uVar);
    }

    private C50553u() {
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
                return newMessageInfo(f131568c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50553u();
            case 4:
                return new C50552t();
            case 5:
                return f131568c;
            case 6:
                C63010eb ebVar = f131569d;
                if (ebVar == null) {
                    synchronized (C50553u.class) {
                        ebVar = f131569d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131568c);
                            f131569d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
