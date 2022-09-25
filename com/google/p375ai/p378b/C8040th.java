package com.google.p375ai.p378b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.th */
/* compiled from: PG */
public final class C8040th extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8040th f28233g;

    /* renamed from: i */
    private static volatile C63010eb f28234i;

    /* renamed from: a */
    public int f28235a;

    /* renamed from: b */
    public C62971cq f28236b = emptyProtobufList();

    /* renamed from: c */
    public int f28237c = 1;

    /* renamed from: d */
    public int f28238d;

    /* renamed from: e */
    public int f28239e;

    /* renamed from: f */
    public int f28240f;

    /* renamed from: h */
    private byte f28241h = 2;

    static {
        C8040th thVar = new C8040th();
        f28233g = thVar;
        C62942bv.registerDefaultInstance(C8040th.class, thVar);
    }

    private C8040th() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28241h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28241h = b;
                return null;
            case 2:
                return newMessageInfo(f28233g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000\u0003င\u0001\u0004င\u0002\u0005င\u0003", new Object[]{"a", "b", C7982rd.class, C45240c.f118157a, C8038tf.f28232a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8040th();
            case 4:
                return new C8037te();
            case 5:
                return f28233g;
            case 6:
                C63010eb ebVar = f28234i;
                if (ebVar == null) {
                    synchronized (C8040th.class) {
                        ebVar = f28234i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28233g);
                            f28234i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
