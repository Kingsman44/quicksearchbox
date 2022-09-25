package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lw */
/* compiled from: PG */
public final class C88011lw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88011lw f238004e;

    /* renamed from: f */
    private static volatile C63010eb f238005f;

    /* renamed from: a */
    public int f238006a;

    /* renamed from: b */
    public int f238007b = 0;

    /* renamed from: c */
    public Object f238008c;

    /* renamed from: d */
    public int f238009d;

    static {
        C88011lw lwVar = new C88011lw();
        f238004e = lwVar;
        C62942bv.registerDefaultInstance(C88011lw.class, lwVar);
    }

    private C88011lw() {
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
                return newMessageInfo(f238004e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဵ\u0000\u0003်\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C88011lw();
            case 4:
                return new C88010lv();
            case 5:
                return f238004e;
            case 6:
                C63010eb ebVar = f238005f;
                if (ebVar == null) {
                    synchronized (C88011lw.class) {
                        ebVar = f238005f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238004e);
                            f238005f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
