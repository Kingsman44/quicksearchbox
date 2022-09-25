package com.google.android.apps.search.weather.suggestions.p10697d;

import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.weather.suggestions.d.d */
/* compiled from: PG */
public final class C142145d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142145d f385604b;

    /* renamed from: c */
    private static volatile C63010eb f385605c;

    /* renamed from: a */
    public C62971cq f385606a = emptyProtobufList();

    static {
        C142145d dVar = new C142145d();
        f385604b = dVar;
        C62942bv.registerDefaultInstance(C142145d.class, dVar);
    }

    private C142145d() {
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
                return newMessageInfo(f385604b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C67962d.class});
            case 3:
                return new C142145d();
            case 4:
                return new C142144c();
            case 5:
                return f385604b;
            case 6:
                C63010eb ebVar = f385605c;
                if (ebVar == null) {
                    synchronized (C142145d.class) {
                        ebVar = f385605c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385604b);
                            f385605c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
