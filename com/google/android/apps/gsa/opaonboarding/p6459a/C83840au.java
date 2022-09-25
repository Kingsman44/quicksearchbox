package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4018a.p4019a.p4020a.C53777bh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.au */
/* compiled from: PG */
public final class C83840au extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C83840au f228470g;

    /* renamed from: h */
    private static volatile C63010eb f228471h;

    /* renamed from: a */
    public int f228472a;

    /* renamed from: b */
    public int f228473b = 0;

    /* renamed from: c */
    public Object f228474c;

    /* renamed from: d */
    public int f228475d;

    /* renamed from: e */
    public boolean f228476e;

    /* renamed from: f */
    public int f228477f;

    static {
        C83840au auVar = new C83840au();
        f228470g = auVar;
        C62942bv.registerDefaultInstance(C83840au.class, auVar);
    }

    private C83840au() {
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
                return newMessageInfo(f228470g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ဌ\u0002\u0003ြ\u0000\u0004ဇ\u0003\u0005ဌ\u0004", new Object[]{C45240c.f118157a, "b", "a", C83839at.class, "d", C83834ao.f228464a, C83837ar.class, "e", C10662f.f35572a, C53777bh.f141155a});
            case 3:
                return new C83840au();
            case 4:
                return new C83833an();
            case 5:
                return f228470g;
            case 6:
                C63010eb ebVar = f228471h;
                if (ebVar == null) {
                    synchronized (C83840au.class) {
                        ebVar = f228471h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228470g);
                            f228471h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
