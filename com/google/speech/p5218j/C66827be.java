package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.be */
/* compiled from: PG */
public final class C66827be extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66827be f181719f;

    /* renamed from: g */
    private static volatile C63010eb f181720g;

    /* renamed from: a */
    public int f181721a;

    /* renamed from: b */
    public C66760aa f181722b;

    /* renamed from: c */
    public C62961ch f181723c = emptyIntList();

    /* renamed from: d */
    public boolean f181724d;

    /* renamed from: e */
    public C66780au f181725e;

    static {
        C66827be beVar = new C66827be();
        f181719f = beVar;
        C62942bv.registerDefaultInstance(C66827be.class, beVar);
    }

    private C66827be() {
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
                return newMessageInfo(f181719f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e\u0005ဇ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C67125lz.m97425b(), "d", "e"});
            case 3:
                return new C66827be();
            case 4:
                return new C66826bd();
            case 5:
                return f181719f;
            case 6:
                C63010eb ebVar = f181720g;
                if (ebVar == null) {
                    synchronized (C66827be.class) {
                        ebVar = f181720g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181719f);
                            f181720g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
