package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.dn */
/* compiled from: PG */
public final class C49910dn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49910dn f129725c;

    /* renamed from: d */
    private static volatile C63010eb f129726d;

    /* renamed from: a */
    public int f129727a;

    /* renamed from: b */
    public int f129728b;

    static {
        C49910dn dnVar = new C49910dn();
        f129725c = dnVar;
        C62942bv.registerDefaultInstance(C49910dn.class, dnVar);
    }

    private C49910dn() {
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
                return newMessageInfo(f129725c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C49907dk.f129724a});
            case 3:
                return new C49910dn();
            case 4:
                return new C49909dm();
            case 5:
                return f129725c;
            case 6:
                C63010eb ebVar = f129726d;
                if (ebVar == null) {
                    synchronized (C49910dn.class) {
                        ebVar = f129726d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129725c);
                            f129726d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
