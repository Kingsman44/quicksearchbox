package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bg */
/* compiled from: PG */
public final class C51264bg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51264bg f133454g;

    /* renamed from: h */
    private static volatile C63010eb f133455h;

    /* renamed from: a */
    public int f133456a;

    /* renamed from: b */
    public C62961ch f133457b = emptyIntList();

    /* renamed from: c */
    public C62971cq f133458c;

    /* renamed from: d */
    public C62971cq f133459d;

    /* renamed from: e */
    public C62971cq f133460e;

    /* renamed from: f */
    public int f133461f;

    static {
        C51264bg bgVar = new C51264bg();
        f133454g = bgVar;
        C62942bv.registerDefaultInstance(C51264bg.class, bgVar);
    }

    private C51264bg() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        this.f133458c = C62942bv.emptyProtobufList();
        this.f133459d = C62942bv.emptyProtobufList();
        this.f133460e = C62942bv.emptyProtobufList();
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
                return newMessageInfo(f133454g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0004\u0000\u0001\u0016\u0004\u001a\u0005\u001a\u0006\u001a\u0007ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C51263bf.f133453a});
            case 3:
                return new C51264bg();
            case 4:
                return new C51262be();
            case 5:
                return f133454g;
            case 6:
                C63010eb ebVar = f133455h;
                if (ebVar == null) {
                    synchronized (C51264bg.class) {
                        ebVar = f133455h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133454g);
                            f133455h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
