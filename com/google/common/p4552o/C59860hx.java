package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.hx */
/* compiled from: PG */
public final class C59860hx extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C59860hx f161771i;

    /* renamed from: j */
    private static volatile C63010eb f161772j;

    /* renamed from: a */
    public int f161773a;

    /* renamed from: b */
    public long f161774b;

    /* renamed from: c */
    public long f161775c;

    /* renamed from: d */
    public long f161776d;

    /* renamed from: e */
    public long f161777e;

    /* renamed from: f */
    public String f161778f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f161779g;

    /* renamed from: h */
    public boolean f161780h;

    static {
        C59860hx hxVar = new C59860hx();
        f161771i = hxVar;
        C62942bv.registerDefaultInstance(C59860hx.class, hxVar);
    }

    private C59860hx() {
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
                return newMessageInfo(f161771i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဈ\u0004\u0006ဇ\u0006\u0007ဇ\u0007\bဂ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C45240c.f118157a});
            case 3:
                return new C59860hx();
            case 4:
                return new C59859hw();
            case 5:
                return f161771i;
            case 6:
                C63010eb ebVar = f161772j;
                if (ebVar == null) {
                    synchronized (C59860hx.class) {
                        ebVar = f161772j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161771i);
                            f161772j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
