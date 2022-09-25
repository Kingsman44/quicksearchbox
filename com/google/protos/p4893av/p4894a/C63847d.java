package com.google.protos.p4893av.p4894a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;
import com.google.protos.p4893av.C63857e;

/* renamed from: com.google.protos.av.a.d */
/* compiled from: PG */
public final class C63847d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63847d f172648a;

    /* renamed from: h */
    private static volatile C63010eb f172649h;

    /* renamed from: b */
    private int f172650b;

    /* renamed from: c */
    private C63851h f172651c;

    /* renamed from: d */
    private C63771b f172652d;

    /* renamed from: e */
    private C63853j f172653e;

    /* renamed from: f */
    private C63857e f172654f;

    /* renamed from: g */
    private byte f172655g = 2;

    static {
        C63847d dVar = new C63847d();
        f172648a = dVar;
        C62942bv.registerDefaultInstance(C63847d.class, dVar);
    }

    private C63847d() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172655g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172655g = b;
                return null;
            case 2:
                return newMessageInfo(f172648a, "\u0001\u0004\u0000\u0001\b\u0016\u0004\u0000\u0000\u0003\bᐉ\u0001\tᐉ\u0005\nᐉ\u0006\u0016ဉ\u0007", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C63847d();
            case 4:
                return new C63846c();
            case 5:
                return f172648a;
            case 6:
                C63010eb ebVar = f172649h;
                if (ebVar == null) {
                    synchronized (C63847d.class) {
                        ebVar = f172649h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172648a);
                            f172649h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
