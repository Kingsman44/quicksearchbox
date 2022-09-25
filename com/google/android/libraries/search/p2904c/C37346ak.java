package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.ak */
/* compiled from: PG */
public final class C37346ak extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C37346ak f99197g;

    /* renamed from: h */
    private static volatile C63010eb f99198h;

    /* renamed from: a */
    public int f99199a;

    /* renamed from: b */
    public int f99200b = 4;

    /* renamed from: c */
    public int f99201c = 3;

    /* renamed from: d */
    public boolean f99202d = true;

    /* renamed from: e */
    public C37773c f99203e;

    /* renamed from: f */
    public int f99204f;

    static {
        C37346ak akVar = new C37346ak();
        f99197g = akVar;
        C62942bv.registerDefaultInstance(C37346ak.class, akVar);
    }

    private C37346ak() {
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
                return newMessageInfo(f99197g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0005ဉ\u0003\u0006င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C37346ak();
            case 4:
                return new C37345aj();
            case 5:
                return f99197g;
            case 6:
                C63010eb ebVar = f99198h;
                if (ebVar == null) {
                    synchronized (C37346ak.class) {
                        ebVar = f99198h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99197g);
                            f99198h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
