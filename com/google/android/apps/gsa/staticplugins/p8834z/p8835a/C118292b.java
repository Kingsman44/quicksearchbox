package com.google.android.apps.gsa.staticplugins.p8834z.p8835a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.z.a.b */
/* compiled from: PG */
public final class C118292b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C118292b f328366b;

    /* renamed from: c */
    private static volatile C63010eb f328367c;

    /* renamed from: a */
    public C62961ch f328368a = emptyIntList();

    static {
        C118292b bVar = new C118292b();
        f328366b = bVar;
        C62942bv.registerDefaultInstance(C118292b.class, bVar);
    }

    private C118292b() {
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
                return newMessageInfo(f328366b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C118292b();
            case 4:
                return new C118291a();
            case 5:
                return f328366b;
            case 6:
                C63010eb ebVar = f328367c;
                if (ebVar == null) {
                    synchronized (C118292b.class) {
                        ebVar = f328367c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328366b);
                            f328367c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
