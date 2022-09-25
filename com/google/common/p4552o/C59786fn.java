package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23105h;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fn */
/* compiled from: PG */
public final class C59786fn extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C59786fn f161539i;

    /* renamed from: j */
    private static volatile C63010eb f161540j;

    /* renamed from: a */
    public int f161541a;

    /* renamed from: b */
    public String f161542b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f161543c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f161544d;

    /* renamed from: e */
    public C62971cq f161545e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f161546f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C59761er f161547g;

    /* renamed from: h */
    public int f161548h;

    static {
        C59786fn fnVar = new C59786fn();
        f161539i = fnVar;
        C62942bv.registerDefaultInstance(C59786fn.class, fnVar);
    }

    private C59786fn() {
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
                return newMessageInfo(f161539i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0005\u001a\u0006ဈ\u0004\u0007ဉ\u0005\bဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C23105h.m43286b()});
            case 3:
                return new C59786fn();
            case 4:
                return new C59785fm();
            case 5:
                return f161539i;
            case 6:
                C63010eb ebVar = f161540j;
                if (ebVar == null) {
                    synchronized (C59786fn.class) {
                        ebVar = f161540j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161539i);
                            f161540j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
