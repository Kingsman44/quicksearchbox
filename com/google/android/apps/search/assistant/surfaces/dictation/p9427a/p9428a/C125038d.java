package com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.a.d */
/* compiled from: PG */
public final class C125038d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C125038d f344972d;

    /* renamed from: e */
    private static volatile C63010eb f344973e;

    /* renamed from: a */
    public int f344974a;

    /* renamed from: b */
    public boolean f344975b;

    /* renamed from: c */
    public boolean f344976c;

    static {
        C125038d dVar = new C125038d();
        f344972d = dVar;
        C62942bv.registerDefaultInstance(C125038d.class, dVar);
    }

    private C125038d() {
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
                return newMessageInfo(f344972d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C125038d();
            case 4:
                return new C125037c();
            case 5:
                return f344972d;
            case 6:
                C63010eb ebVar = f344973e;
                if (ebVar == null) {
                    synchronized (C125038d.class) {
                        ebVar = f344973e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344972d);
                            f344973e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
