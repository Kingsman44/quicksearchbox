package com.google.assistant.p3860as;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.d */
/* compiled from: PG */
public final class C49790d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49790d f128572e;

    /* renamed from: g */
    private static volatile C63010eb f128573g;

    /* renamed from: a */
    public String f128574a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public float f128575b;

    /* renamed from: c */
    public float f128576c;

    /* renamed from: d */
    public int f128577d;

    /* renamed from: f */
    private int f128578f;

    static {
        C49790d dVar = new C49790d();
        f128572e = dVar;
        C62942bv.registerDefaultInstance(C49790d.class, dVar);
    }

    private C49790d() {
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
                return newMessageInfo(f128572e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0004ခ\u0003\u0006ခ\u0005\u0007ဌ\u0006", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d", C49764b.f128503a});
            case 3:
                return new C49790d();
            case 4:
                return new C49737a();
            case 5:
                return f128572e;
            case 6:
                C63010eb ebVar = f128573g;
                if (ebVar == null) {
                    synchronized (C49790d.class) {
                        ebVar = f128573g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128572e);
                            f128573g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
