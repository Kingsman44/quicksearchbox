package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.i */
/* compiled from: PG */
public final class C25333i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25333i f68945c;

    /* renamed from: d */
    private static volatile C63010eb f68946d;

    /* renamed from: a */
    public int f68947a;

    /* renamed from: b */
    public int f68948b;

    static {
        C25333i iVar = new C25333i();
        f68945c = iVar;
        C62942bv.registerDefaultInstance(C25333i.class, iVar);
    }

    private C25333i() {
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
                return newMessageInfo(f68945c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C25333i();
            case 4:
                return new C25332h();
            case 5:
                return f68945c;
            case 6:
                C63010eb ebVar = f68946d;
                if (ebVar == null) {
                    synchronized (C25333i.class) {
                        ebVar = f68946d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68945c);
                            f68946d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
