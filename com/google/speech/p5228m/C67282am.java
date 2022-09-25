package com.google.speech.p5228m;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.am */
/* compiled from: PG */
public final class C67282am extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C67282am f182887g;

    /* renamed from: i */
    private static volatile C63010eb f182888i;

    /* renamed from: a */
    public int f182889a;

    /* renamed from: b */
    public int f182890b;

    /* renamed from: c */
    public int f182891c;

    /* renamed from: d */
    public long f182892d;

    /* renamed from: e */
    public long f182893e;

    /* renamed from: f */
    public boolean f182894f;

    /* renamed from: h */
    private int f182895h;

    static {
        C67282am amVar = new C67282am();
        f182887g = amVar;
        C62942bv.registerDefaultInstance(C67282am.class, amVar);
    }

    private C67282am() {
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
                return newMessageInfo(f182887g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005", new Object[]{C19618h.f54585a, "a", C67277ah.f182881a, "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C67282am();
            case 4:
                return new C67281al();
            case 5:
                return f182887g;
            case 6:
                C63010eb ebVar = f182888i;
                if (ebVar == null) {
                    synchronized (C67282am.class) {
                        ebVar = f182888i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182887g);
                            f182888i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
