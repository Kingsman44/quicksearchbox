package com.google.p4160bf.p4164b.p4165a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.i */
/* compiled from: PG */
public final class C55669i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55669i f146884e;

    /* renamed from: f */
    private static volatile C63010eb f146885f;

    /* renamed from: a */
    public int f146886a = 0;

    /* renamed from: b */
    public Object f146887b;

    /* renamed from: c */
    public int f146888c = 0;

    /* renamed from: d */
    public Object f146889d;

    static {
        C55669i iVar = new C55669i();
        f146884e = iVar;
        C62942bv.registerDefaultInstance(C55669i.class, iVar);
    }

    private C55669i() {
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
                return newMessageInfo(f146884e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0001\u0004ြ\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C55657cm.class, C55644c.class, C55668h.class});
            case 3:
                return new C55669i();
            case 4:
                return new C55519a();
            case 5:
                return f146884e;
            case 6:
                C63010eb ebVar = f146885f;
                if (ebVar == null) {
                    synchronized (C55669i.class) {
                        ebVar = f146885f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146884e);
                            f146885f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
