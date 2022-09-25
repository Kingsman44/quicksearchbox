package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.assistant.p3897e.p3917i.p3918a.C51348ej;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.e */
/* compiled from: PG */
public final class C128007e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C128007e f352279b;

    /* renamed from: c */
    private static volatile C63010eb f352280c;

    /* renamed from: a */
    public C62971cq f352281a = emptyProtobufList();

    static {
        C128007e eVar = new C128007e();
        f352279b = eVar;
        C62942bv.registerDefaultInstance(C128007e.class, eVar);
    }

    private C128007e() {
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
                return newMessageInfo(f352279b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51348ej.class});
            case 3:
                return new C128007e();
            case 4:
                return new C128006d();
            case 5:
                return f352279b;
            case 6:
                C63010eb ebVar = f352280c;
                if (ebVar == null) {
                    synchronized (C128007e.class) {
                        ebVar = f352280c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352279b);
                            f352280c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
