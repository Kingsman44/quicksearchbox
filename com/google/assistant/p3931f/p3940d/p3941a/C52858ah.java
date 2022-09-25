package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.ah */
/* compiled from: PG */
public final class C52858ah extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52858ah f138677h;

    /* renamed from: i */
    private static volatile C63010eb f138678i;

    /* renamed from: a */
    public float f138679a;

    /* renamed from: b */
    public float f138680b;

    /* renamed from: c */
    public float f138681c;

    /* renamed from: d */
    public float f138682d;

    /* renamed from: e */
    public int f138683e;

    /* renamed from: f */
    public int f138684f;

    /* renamed from: g */
    public boolean f138685g;

    static {
        C52858ah ahVar = new C52858ah();
        f138677h = ahVar;
        C62942bv.registerDefaultInstance(C52858ah.class, ahVar);
    }

    private C52858ah() {
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
                return newMessageInfo(f138677h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\f\u0004\f\u0005\u0001\u0006\u0001\u0007\u0007", new Object[]{"a", "d", "e", C10662f.f35572a, "b", C45240c.f118157a, C30325g.f82003a});
            case 3:
                return new C52858ah();
            case 4:
                return new C52856af();
            case 5:
                return f138677h;
            case 6:
                C63010eb ebVar = f138678i;
                if (ebVar == null) {
                    synchronized (C52858ah.class) {
                        ebVar = f138678i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138677h);
                            f138678i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
