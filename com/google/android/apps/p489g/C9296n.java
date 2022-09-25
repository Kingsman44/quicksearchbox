package com.google.android.apps.p489g;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7722hn;
import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.g.n */
/* compiled from: PG */
public final class C9296n extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9296n f32265g;

    /* renamed from: i */
    private static volatile C63010eb f32266i;

    /* renamed from: a */
    public int f32267a;

    /* renamed from: b */
    public long f32268b;

    /* renamed from: c */
    public C7799kj f32269c;

    /* renamed from: d */
    public C7722hn f32270d;

    /* renamed from: e */
    public C63088z f32271e = C63088z.f170246b;

    /* renamed from: f */
    public C60220t f32272f;

    /* renamed from: h */
    private byte f32273h = 2;

    static {
        C9296n nVar = new C9296n();
        f32265g = nVar;
        C62942bv.registerDefaultInstance(C9296n.class, nVar);
    }

    private C9296n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32273h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32273h = b;
                return null;
            case 2:
                return newMessageInfo(f32265g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ဂ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C9296n();
            case 4:
                return new C9295m();
            case 5:
                return f32265g;
            case 6:
                C63010eb ebVar = f32266i;
                if (ebVar == null) {
                    synchronized (C9296n.class) {
                        ebVar = f32266i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32265g);
                            f32266i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
