package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.p */
/* compiled from: PG */
public final class C19993p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19993p f56025e;

    /* renamed from: g */
    private static volatile C63010eb f56026g;

    /* renamed from: a */
    public C19991n f56027a;

    /* renamed from: b */
    public C19991n f56028b;

    /* renamed from: c */
    public C19991n f56029c;

    /* renamed from: d */
    public C19991n f56030d;

    /* renamed from: f */
    private int f56031f;

    static {
        C19993p pVar = new C19993p();
        f56025e = pVar;
        C62942bv.registerDefaultInstance(C19993p.class, pVar);
    }

    private C19993p() {
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
                return newMessageInfo(f56025e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19993p();
            case 4:
                return new C19992o();
            case 5:
                return f56025e;
            case 6:
                C63010eb ebVar = f56026g;
                if (ebVar == null) {
                    synchronized (C19993p.class) {
                        ebVar = f56026g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56025e);
                            f56026g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
