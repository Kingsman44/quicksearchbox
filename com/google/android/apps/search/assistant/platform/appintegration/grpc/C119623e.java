package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.e */
/* compiled from: PG */
public final class C119623e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119623e f333371e;

    /* renamed from: g */
    private static volatile C63010eb f333372g;

    /* renamed from: a */
    public int f333373a;

    /* renamed from: b */
    public int f333374b = 0;

    /* renamed from: c */
    public Object f333375c;

    /* renamed from: d */
    public C119640v f333376d;

    /* renamed from: f */
    private byte f333377f = 2;

    static {
        C119623e eVar = new C119623e();
        f333371e = eVar;
        C62942bv.registerDefaultInstance(C119623e.class, eVar);
    }

    private C119623e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333377f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333377f = b;
                return null;
            case 2:
                return newMessageInfo(f333371e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ြ\u0000\u0003်\u0000\u0004်\u0000\u0005်\u0000\u0006ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C119605ay.class, C119599as.class});
            case 3:
                return new C119623e();
            case 4:
                return new C119622d();
            case 5:
                return f333371e;
            case 6:
                C63010eb ebVar = f333372g;
                if (ebVar == null) {
                    synchronized (C119623e.class) {
                        ebVar = f333372g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333371e);
                            f333372g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
