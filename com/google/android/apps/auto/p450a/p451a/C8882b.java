package com.google.android.apps.auto.p450a.p451a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.b */
/* compiled from: PG */
public final class C8882b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8882b f30834g;

    /* renamed from: h */
    private static volatile C63010eb f30835h;

    /* renamed from: a */
    public int f30836a;

    /* renamed from: b */
    public boolean f30837b;

    /* renamed from: c */
    public boolean f30838c;

    /* renamed from: d */
    public boolean f30839d;

    /* renamed from: e */
    public boolean f30840e;

    /* renamed from: f */
    public boolean f30841f;

    static {
        C8882b bVar = new C8882b();
        f30834g = bVar;
        C62942bv.registerDefaultInstance(C8882b.class, bVar);
    }

    private C8882b() {
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
                return newMessageInfo(f30834g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8882b();
            case 4:
                return new C8855a();
            case 5:
                return f30834g;
            case 6:
                C63010eb ebVar = f30835h;
                if (ebVar == null) {
                    synchronized (C8882b.class) {
                        ebVar = f30835h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30834g);
                            f30835h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
