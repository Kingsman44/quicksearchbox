package com.google.assistant.p3741aa.p3742a.p3743a.p3744a;

import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.a.o */
/* compiled from: PG */
public final class C48146o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48146o f124579c;

    /* renamed from: e */
    private static volatile C63010eb f124580e;

    /* renamed from: a */
    public C51594nm f124581a;

    /* renamed from: b */
    public C51527l f124582b;

    /* renamed from: d */
    private byte f124583d = 2;

    static {
        C48146o oVar = new C48146o();
        f124579c = oVar;
        C62942bv.registerDefaultInstance(C48146o.class, oVar);
    }

    private C48146o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124583d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124583d = b;
                return null;
            case 2:
                return newMessageInfo(f124579c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\t\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C48146o();
            case 4:
                return new C48145n();
            case 5:
                return f124579c;
            case 6:
                C63010eb ebVar = f124580e;
                if (ebVar == null) {
                    synchronized (C48146o.class) {
                        ebVar = f124580e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124579c);
                            f124580e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
