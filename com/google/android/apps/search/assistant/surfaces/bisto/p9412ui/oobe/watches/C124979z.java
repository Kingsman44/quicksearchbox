package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.z */
/* compiled from: PG */
public final class C124979z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C124979z f344847e;

    /* renamed from: f */
    private static volatile C63010eb f344848f;

    /* renamed from: a */
    public int f344849a;

    /* renamed from: b */
    public C63088z f344850b = C63088z.f170246b;

    /* renamed from: c */
    public C63138d f344851c;

    /* renamed from: d */
    public boolean f344852d;

    static {
        C124979z zVar = new C124979z();
        f344847e = zVar;
        C62942bv.registerDefaultInstance(C124979z.class, zVar);
    }

    private C124979z() {
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
                return newMessageInfo(f344847e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C124979z();
            case 4:
                return new C124978y();
            case 5:
                return f344847e;
            case 6:
                C63010eb ebVar = f344848f;
                if (ebVar == null) {
                    synchronized (C124979z.class) {
                        ebVar = f344848f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344847e);
                            f344848f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
