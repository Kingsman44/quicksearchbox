package com.google.android.libraries.componentview.components.elements.p1696a;

import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.elements.a.d */
/* compiled from: PG */
public final class C20379d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20379d f57299c;

    /* renamed from: d */
    private static volatile C63010eb f57300d;

    /* renamed from: a */
    public int f57301a;

    /* renamed from: b */
    public C19916aq f57302b;

    static {
        C20379d dVar = new C20379d();
        f57299c = dVar;
        C62942bv.registerDefaultInstance(C20379d.class, dVar);
    }

    private C20379d() {
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
                return newMessageInfo(f57299c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C20379d();
            case 4:
                return new C20378c();
            case 5:
                return f57299c;
            case 6:
                C63010eb ebVar = f57300d;
                if (ebVar == null) {
                    synchronized (C20379d.class) {
                        ebVar = f57300d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57299c);
                            f57300d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
