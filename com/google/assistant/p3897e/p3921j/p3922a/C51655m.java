package com.google.assistant.p3897e.p3921j.p3922a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.a.m */
/* compiled from: PG */
public final class C51655m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51655m f134589g;

    /* renamed from: h */
    private static volatile C63010eb f134590h;

    /* renamed from: a */
    public int f134591a;

    /* renamed from: b */
    public int f134592b;

    /* renamed from: c */
    public int f134593c;

    /* renamed from: d */
    public int f134594d;

    /* renamed from: e */
    public int f134595e;

    /* renamed from: f */
    public C62971cq f134596f = emptyProtobufList();

    static {
        C51655m mVar = new C51655m();
        f134589g = mVar;
        C62942bv.registerDefaultInstance(C51655m.class, mVar);
    }

    private C51655m() {
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
                return newMessageInfo(f134589g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C51653k.f134588a, "e", C51651i.f134587a, C10662f.f35572a, C51648f.class});
            case 3:
                return new C51655m();
            case 4:
                return new C51650h();
            case 5:
                return f134589g;
            case 6:
                C63010eb ebVar = f134590h;
                if (ebVar == null) {
                    synchronized (C51655m.class) {
                        ebVar = f134590h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134589g);
                            f134590h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
