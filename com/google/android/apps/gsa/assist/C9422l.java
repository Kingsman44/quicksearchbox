package com.google.android.apps.gsa.assist;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.l */
/* compiled from: PG */
public final class C9422l extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C9422l f32728g;

    /* renamed from: i */
    private static volatile C63010eb f32729i;

    /* renamed from: a */
    public int f32730a;

    /* renamed from: b */
    public int f32731b;

    /* renamed from: c */
    public int f32732c;

    /* renamed from: d */
    public int f32733d;

    /* renamed from: e */
    public int f32734e;

    /* renamed from: f */
    public float f32735f;

    /* renamed from: h */
    private byte f32736h = 2;

    static {
        C9422l lVar = new C9422l();
        f32728g = lVar;
        C62942bv.registerDefaultInstance(C9422l.class, lVar);
    }

    private C9422l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32736h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32736h = b;
                return null;
            case 2:
                return newMessageInfo(f32728g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C9422l();
            case 4:
                return new C9421k();
            case 5:
                return f32728g;
            case 6:
                C63010eb ebVar = f32729i;
                if (ebVar == null) {
                    synchronized (C9422l.class) {
                        ebVar = f32729i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32728g);
                            f32729i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
