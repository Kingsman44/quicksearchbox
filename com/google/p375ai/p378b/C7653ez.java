package com.google.p375ai.p378b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ez */
/* compiled from: PG */
public final class C7653ez extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C7653ez f26564g;

    /* renamed from: i */
    private static volatile C63010eb f26565i;

    /* renamed from: a */
    public int f26566a;

    /* renamed from: b */
    public int f26567b = 0;

    /* renamed from: c */
    public Object f26568c;

    /* renamed from: d */
    public C62971cq f26569d = emptyProtobufList();

    /* renamed from: e */
    public int f26570e;

    /* renamed from: f */
    public C7641en f26571f;

    /* renamed from: h */
    private byte f26572h = 2;

    static {
        C7653ez ezVar = new C7653ez();
        f26564g = ezVar;
        C62942bv.registerDefaultInstance(C7653ez.class, ezVar);
    }

    private C7653ez() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26572h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26572h = b;
                return null;
            case 2:
                return newMessageInfo(f26564g, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003Л\u0005င\u0002\u0006ဉ\u0003", new Object[]{C45240c.f118157a, "b", "a", C7750io.class, C7625dy.class, "d", C7704gw.class, "e", C10662f.f35572a});
            case 3:
                return new C7653ez();
            case 4:
                return new C7652ey();
            case 5:
                return f26564g;
            case 6:
                C63010eb ebVar = f26565i;
                if (ebVar == null) {
                    synchronized (C7653ez.class) {
                        ebVar = f26565i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26564g);
                            f26565i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
