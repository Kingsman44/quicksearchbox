package com.google.protos.youtube.elements;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.em */
/* compiled from: PG */
public final class C66226em extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66226em f180086e;

    /* renamed from: g */
    private static volatile C63010eb f180087g;

    /* renamed from: a */
    public boolean f180088a;

    /* renamed from: b */
    public boolean f180089b;

    /* renamed from: c */
    public boolean f180090c;

    /* renamed from: d */
    public boolean f180091d;

    /* renamed from: f */
    private int f180092f;

    static {
        C66226em emVar = new C66226em();
        f180086e = emVar;
        C62942bv.registerDefaultInstance(C66226em.class, emVar);
    }

    private C66226em() {
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
                return newMessageInfo(f180086e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66226em();
            case 4:
                return new C66225el();
            case 5:
                return f180086e;
            case 6:
                C63010eb ebVar = f180087g;
                if (ebVar == null) {
                    synchronized (C66226em.class) {
                        ebVar = f180087g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180086e);
                            f180087g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
