package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ki */
/* compiled from: PG */
public final class C60089ki extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60089ki f162449h;

    /* renamed from: i */
    private static volatile C63010eb f162450i;

    /* renamed from: a */
    public int f162451a;

    /* renamed from: b */
    public float f162452b;

    /* renamed from: c */
    public float f162453c;

    /* renamed from: d */
    public float f162454d;

    /* renamed from: e */
    public boolean f162455e;

    /* renamed from: f */
    public boolean f162456f;

    /* renamed from: g */
    public int f162457g;

    static {
        C60089ki kiVar = new C60089ki();
        f162449h = kiVar;
        C62942bv.registerDefaultInstance(C60089ki.class, kiVar);
    }

    private C60089ki() {
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
                return newMessageInfo(f162449h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C60089ki();
            case 4:
                return new C60088kh();
            case 5:
                return f162449h;
            case 6:
                C63010eb ebVar = f162450i;
                if (ebVar == null) {
                    synchronized (C60089ki.class) {
                        ebVar = f162450i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162449h);
                            f162450i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
