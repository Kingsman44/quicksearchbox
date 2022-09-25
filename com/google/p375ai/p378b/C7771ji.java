package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ji */
/* compiled from: PG */
public final class C7771ji extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7771ji f27210c;

    /* renamed from: e */
    private static volatile C63010eb f27211e;

    /* renamed from: a */
    public int f27212a;

    /* renamed from: b */
    public C7661fg f27213b;

    /* renamed from: d */
    private byte f27214d = 2;

    static {
        C7771ji jiVar = new C7771ji();
        f27210c = jiVar;
        C62942bv.registerDefaultInstance(C7771ji.class, jiVar);
    }

    private C7771ji() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27214d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27214d = b;
                return null;
            case 2:
                return newMessageInfo(f27210c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7771ji();
            case 4:
                return new C7770jh();
            case 5:
                return f27210c;
            case 6:
                C63010eb ebVar = f27211e;
                if (ebVar == null) {
                    synchronized (C7771ji.class) {
                        ebVar = f27211e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27210c);
                            f27211e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
