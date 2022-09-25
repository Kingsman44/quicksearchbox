package com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d */
/* compiled from: PG */
public final class C92380d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C92380d f257600g;

    /* renamed from: h */
    private static volatile C63010eb f257601h;

    /* renamed from: a */
    public int f257602a;

    /* renamed from: b */
    public int f257603b;

    /* renamed from: c */
    public boolean f257604c;

    /* renamed from: d */
    public boolean f257605d;

    /* renamed from: e */
    public boolean f257606e;

    /* renamed from: f */
    public boolean f257607f;

    static {
        C92380d dVar = new C92380d();
        f257600g = dVar;
        C62942bv.registerDefaultInstance(C92380d.class, dVar);
    }

    private C92380d() {
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
                return newMessageInfo(f257600g, "\u0001\u0005\u0000\u0001\u0006\u0013\u0005\u0000\u0000\u0000\u0006ဌ\u0000\nဇ\u0001\rဇ\u0002\u000eဇ\u0003\u0013ဇ\u0004", new Object[]{"a", "b", C92378b.f257599a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C92380d();
            case 4:
                return new C92377a();
            case 5:
                return f257600g;
            case 6:
                C63010eb ebVar = f257601h;
                if (ebVar == null) {
                    synchronized (C92380d.class) {
                        ebVar = f257601h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f257600g);
                            f257601h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
