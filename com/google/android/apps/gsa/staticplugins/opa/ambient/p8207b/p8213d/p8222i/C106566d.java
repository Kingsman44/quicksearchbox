package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.i.d */
/* compiled from: PG */
public final class C106566d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C106566d f297147b;

    /* renamed from: f */
    private static volatile C63010eb f297148f;

    /* renamed from: a */
    public C62971cq f297149a = emptyProtobufList();

    /* renamed from: c */
    private int f297150c;

    /* renamed from: d */
    private C52560wg f297151d;

    /* renamed from: e */
    private byte f297152e = 2;

    static {
        C106566d dVar = new C106566d();
        f297147b = dVar;
        C62942bv.registerDefaultInstance(C106566d.class, dVar);
    }

    private C106566d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f297152e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f297152e = b;
                return null;
            case 2:
                return newMessageInfo(f297147b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{C45240c.f118157a, "d", "a", C106564b.class});
            case 3:
                return new C106566d();
            case 4:
                return new C106565c();
            case 5:
                return f297147b;
            case 6:
                C63010eb ebVar = f297148f;
                if (ebVar == null) {
                    synchronized (C106566d.class) {
                        ebVar = f297148f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297147b);
                            f297148f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
