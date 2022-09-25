package com.google.protos.p4850an.p4854c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.v */
/* compiled from: PG */
public final class C63433v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63433v f171433e;

    /* renamed from: g */
    private static volatile C63010eb f171434g;

    /* renamed from: a */
    public boolean f171435a;

    /* renamed from: b */
    public boolean f171436b;

    /* renamed from: c */
    public boolean f171437c;

    /* renamed from: d */
    public boolean f171438d;

    /* renamed from: f */
    private int f171439f;

    static {
        C63433v vVar = new C63433v();
        f171433e = vVar;
        C62942bv.registerDefaultInstance(C63433v.class, vVar);
    }

    private C63433v() {
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
                return newMessageInfo(f171433e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0006ဇ\u0006", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63433v();
            case 4:
                return new C63432u();
            case 5:
                return f171433e;
            case 6:
                C63010eb ebVar = f171434g;
                if (ebVar == null) {
                    synchronized (C63433v.class) {
                        ebVar = f171434g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171433e);
                            f171434g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
