package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.aw */
/* compiled from: PG */
public final class C22065aw extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C22065aw f60793g;

    /* renamed from: h */
    private static volatile C63010eb f60794h;

    /* renamed from: a */
    public int f60795a;

    /* renamed from: b */
    public int f60796b = 0;

    /* renamed from: c */
    public Object f60797c;

    /* renamed from: d */
    public int f60798d;

    /* renamed from: e */
    public int f60799e;

    /* renamed from: f */
    public boolean f60800f;

    static {
        C22065aw awVar = new C22065aw();
        f60793g = awVar;
        C62942bv.registerDefaultInstance(C22065aw.class, awVar);
    }

    private C22065aw() {
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
                return newMessageInfo(f60793g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ျ\u0000\u0004ြ\u0000\u0005ဇ\u0004", new Object[]{C45240c.f118157a, "b", "a", "d", C55421x.m87687b(), "e", C55998f.m87879b(), C22082bl.class, C10662f.f35572a});
            case 3:
                return new C22065aw();
            case 4:
                return new C22064av();
            case 5:
                return f60793g;
            case 6:
                C63010eb ebVar = f60794h;
                if (ebVar == null) {
                    synchronized (C22065aw.class) {
                        ebVar = f60794h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60793g);
                            f60794h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
