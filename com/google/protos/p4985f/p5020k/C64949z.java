package com.google.protos.p4985f.p5020k;

import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.z */
/* compiled from: PG */
public final class C64949z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64949z f175894c;

    /* renamed from: e */
    private static volatile C63010eb f175895e;

    /* renamed from: a */
    public int f175896a;

    /* renamed from: b */
    public C51450id f175897b;

    /* renamed from: d */
    private byte f175898d = 2;

    static {
        C64949z zVar = new C64949z();
        f175894c = zVar;
        C62942bv.registerDefaultInstance(C64949z.class, zVar);
    }

    private C64949z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175898d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175898d = b;
                return null;
            case 2:
                return newMessageInfo(f175894c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64949z();
            case 4:
                return new C64948y();
            case 5:
                return f175894c;
            case 6:
                C63010eb ebVar = f175895e;
                if (ebVar == null) {
                    synchronized (C64949z.class) {
                        ebVar = f175895e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175894c);
                            f175895e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
