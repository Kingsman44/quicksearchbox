package com.google.android.apps.p489g.p494d;

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

/* renamed from: com.google.android.apps.g.d.be */
/* compiled from: PG */
public final class C9169be extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C9169be f31664i;

    /* renamed from: j */
    private static volatile C63010eb f31665j;

    /* renamed from: a */
    public int f31666a;

    /* renamed from: b */
    public String f31667b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C9167bc f31668c;

    /* renamed from: d */
    public C9167bc f31669d;

    /* renamed from: e */
    public String f31670e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f31671f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f31672g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f31673h = BuildConfig.FLAVOR;

    static {
        C9169be beVar = new C9169be();
        f31664i = beVar;
        C62942bv.registerDefaultInstance(C9169be.class, beVar);
    }

    private C9169be() {
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
                return newMessageInfo(f31664i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C9169be();
            case 4:
                return new C9168bd();
            case 5:
                return f31664i;
            case 6:
                C63010eb ebVar = f31665j;
                if (ebVar == null) {
                    synchronized (C9169be.class) {
                        ebVar = f31665j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31664i);
                            f31665j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
