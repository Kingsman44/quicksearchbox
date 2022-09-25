package com.google.p375ai.p378b;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bb */
/* compiled from: PG */
public final class C7548bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7548bb f26117c;

    /* renamed from: e */
    private static volatile C63010eb f26118e;

    /* renamed from: a */
    public int f26119a;

    /* renamed from: b */
    public C57315dp f26120b;

    /* renamed from: d */
    private byte f26121d = 2;

    static {
        C7548bb bbVar = new C7548bb();
        f26117c = bbVar;
        C62942bv.registerDefaultInstance(C7548bb.class, bbVar);
    }

    private C7548bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26121d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26121d = b;
                return null;
            case 2:
                return newMessageInfo(f26117c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7548bb();
            case 4:
                return new C7547ba();
            case 5:
                return f26117c;
            case 6:
                C63010eb ebVar = f26118e;
                if (ebVar == null) {
                    synchronized (C7548bb.class) {
                        ebVar = f26118e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26117c);
                            f26118e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
