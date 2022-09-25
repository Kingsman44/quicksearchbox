package com.google.android.apps.p489g.p494d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7818lb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.ed */
/* compiled from: PG */
public final class C9249ed extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9249ed f31979g;

    /* renamed from: i */
    private static volatile C63010eb f31980i;

    /* renamed from: a */
    public int f31981a;

    /* renamed from: b */
    public C62971cq f31982b = emptyProtobufList();

    /* renamed from: c */
    public C9141ad f31983c;

    /* renamed from: d */
    public C62971cq f31984d = emptyProtobufList();

    /* renamed from: e */
    public C9141ad f31985e;

    /* renamed from: f */
    public boolean f31986f;

    /* renamed from: h */
    private byte f31987h = 2;

    static {
        C9249ed edVar = new C9249ed();
        f31979g = edVar;
        C62942bv.registerDefaultInstance(C9249ed.class, edVar);
    }

    private C9249ed() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31987h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31987h = b;
                return null;
            case 2:
                return newMessageInfo(f31979g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001\u001b\u0002ᐉ\u0000\u0003\u001b\u0004ᐉ\u0001\u0005ဇ\u0002", new Object[]{"a", "b", C7818lb.class, C45240c.f118157a, "d", C7818lb.class, "e", C10662f.f35572a});
            case 3:
                return new C9249ed();
            case 4:
                return new C9248ec();
            case 5:
                return f31979g;
            case 6:
                C63010eb ebVar = f31980i;
                if (ebVar == null) {
                    synchronized (C9249ed.class) {
                        ebVar = f31980i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31979g);
                            f31980i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
