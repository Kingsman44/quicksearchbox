package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.p */
/* compiled from: PG */
public final class C57159p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57159p f152593e;

    /* renamed from: g */
    private static volatile C63010eb f152594g;

    /* renamed from: a */
    public float f152595a;

    /* renamed from: b */
    public float f152596b;

    /* renamed from: c */
    public float f152597c;

    /* renamed from: d */
    public float f152598d;

    /* renamed from: f */
    private int f152599f;

    static {
        C57159p pVar = new C57159p();
        f152593e = pVar;
        C62942bv.registerDefaultInstance(C57159p.class, pVar);
    }

    private C57159p() {
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
                return newMessageInfo(f152593e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57159p();
            case 4:
                return new C57158o();
            case 5:
                return f152593e;
            case 6:
                C63010eb ebVar = f152594g;
                if (ebVar == null) {
                    synchronized (C57159p.class) {
                        ebVar = f152594g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152593e);
                            f152594g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
