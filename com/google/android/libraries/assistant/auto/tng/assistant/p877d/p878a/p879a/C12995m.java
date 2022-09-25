package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.m */
/* compiled from: PG */
public final class C12995m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C12995m f40394e;

    /* renamed from: f */
    private static volatile C63010eb f40395f;

    /* renamed from: a */
    public int f40396a;

    /* renamed from: b */
    public boolean f40397b;

    /* renamed from: c */
    public boolean f40398c;

    /* renamed from: d */
    public boolean f40399d;

    static {
        C12995m mVar = new C12995m();
        f40394e = mVar;
        C62942bv.registerDefaultInstance(C12995m.class, mVar);
    }

    private C12995m() {
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
                return newMessageInfo(f40394e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C12995m();
            case 4:
                return new C12994l();
            case 5:
                return f40394e;
            case 6:
                C63010eb ebVar = f40395f;
                if (ebVar == null) {
                    synchronized (C12995m.class) {
                        ebVar = f40395f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40394e);
                            f40395f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
