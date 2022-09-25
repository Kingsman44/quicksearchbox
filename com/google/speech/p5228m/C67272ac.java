package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.ac */
/* compiled from: PG */
public final class C67272ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67272ac f182865c;

    /* renamed from: e */
    private static volatile C63010eb f182866e;

    /* renamed from: a */
    public int f182867a;

    /* renamed from: b */
    public C67355s f182868b;

    /* renamed from: d */
    private byte f182869d = 2;

    static {
        C67272ac acVar = new C67272ac();
        f182865c = acVar;
        C62942bv.registerDefaultInstance(C67272ac.class, acVar);
    }

    private C67272ac() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182869d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182869d = b;
                return null;
            case 2:
                return newMessageInfo(f182865c, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0001\tᐉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C67272ac();
            case 4:
                return new C67271ab();
            case 5:
                return f182865c;
            case 6:
                C63010eb ebVar = f182866e;
                if (ebVar == null) {
                    synchronized (C67272ac.class) {
                        ebVar = f182866e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182865c);
                            f182866e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
