package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.sk */
/* compiled from: PG */
public final class C8016sk extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C8016sk f28141h;

    /* renamed from: j */
    private static volatile C63010eb f28142j;

    /* renamed from: a */
    public int f28143a;

    /* renamed from: b */
    public int f28144b = 0;

    /* renamed from: c */
    public Object f28145c;

    /* renamed from: d */
    public int f28146d;

    /* renamed from: e */
    public int f28147e;

    /* renamed from: f */
    public int f28148f;

    /* renamed from: g */
    public int f28149g;

    /* renamed from: i */
    private byte f28150i = 2;

    static {
        C8016sk skVar = new C8016sk();
        f28141h = skVar;
        C62942bv.registerDefaultInstance(C8016sk.class, skVar);
    }

    private C8016sk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28150i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28150i = b;
                return null;
            case 2:
                return newMessageInfo(f28141h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဌ\u0006", new Object[]{C45240c.f118157a, "b", "a", C7893nw.class, C8042tj.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C8006sa.f28127a});
            case 3:
                return new C8016sk();
            case 4:
                return new C8015sj();
            case 5:
                return f28141h;
            case 6:
                C63010eb ebVar = f28142j;
                if (ebVar == null) {
                    synchronized (C8016sk.class) {
                        ebVar = f28142j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28141h);
                            f28142j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
