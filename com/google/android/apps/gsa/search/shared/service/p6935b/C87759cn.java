package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.cn */
/* compiled from: PG */
public final class C87759cn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87759cn f237518c;

    /* renamed from: d */
    private static volatile C63010eb f237519d;

    /* renamed from: a */
    public int f237520a;

    /* renamed from: b */
    public C52091ex f237521b;

    static {
        C87759cn cnVar = new C87759cn();
        f237518c = cnVar;
        C62942bv.registerDefaultInstance(C87759cn.class, cnVar);
    }

    private C87759cn() {
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
                return newMessageInfo(f237518c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87759cn();
            case 4:
                return new C87758cm();
            case 5:
                return f237518c;
            case 6:
                C63010eb ebVar = f237519d;
                if (ebVar == null) {
                    synchronized (C87759cn.class) {
                        ebVar = f237519d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237518c);
                            f237519d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
