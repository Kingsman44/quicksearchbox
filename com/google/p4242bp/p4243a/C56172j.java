package com.google.p4242bp.p4243a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52748d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.j */
/* compiled from: PG */
public final class C56172j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56172j f149664a;

    /* renamed from: e */
    private static volatile C63010eb f149665e;

    /* renamed from: b */
    private int f149666b;

    /* renamed from: c */
    private C52748d f149667c;

    /* renamed from: d */
    private byte f149668d = 2;

    static {
        C56172j jVar = new C56172j();
        f149664a = jVar;
        C62942bv.registerDefaultInstance(C56172j.class, jVar);
    }

    private C56172j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149668d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149668d = b;
                return null;
            case 2:
                return newMessageInfo(f149664a, "\u0001\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0001\u000eᐉ\r", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56172j();
            case 4:
                return new C56171i();
            case 5:
                return f149664a;
            case 6:
                C63010eb ebVar = f149665e;
                if (ebVar == null) {
                    synchronized (C56172j.class) {
                        ebVar = f149665e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149664a);
                            f149665e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
