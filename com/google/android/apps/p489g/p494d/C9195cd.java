package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.android.apps.g.d.cd */
/* compiled from: PG */
public final class C9195cd extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C9195cd f31746j;

    /* renamed from: k */
    private static volatile C63010eb f31747k;

    /* renamed from: a */
    public int f31748a;

    /* renamed from: b */
    public int f31749b = 1;

    /* renamed from: c */
    public String f31750c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f31751d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f31752e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f31753f;

    /* renamed from: g */
    public C62971cq f31754g = emptyProtobufList();

    /* renamed from: h */
    public boolean f31755h;

    /* renamed from: i */
    public boolean f31756i;

    static {
        C9195cd cdVar = new C9195cd();
        f31746j = cdVar;
        C62942bv.registerDefaultInstance(C9195cd.class, cdVar);
    }

    private C9195cd() {
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
                return newMessageInfo(f31746j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ဈ\u0001\u0002ဌ\u0000\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဇ\u0004\u0007\u001b\bဇ\u0005\tဇ\u0006", new Object[]{"a", C45240c.f118157a, "b", C9193cb.f31745a, "d", "e", C10662f.f35572a, C30325g.f82003a, C9192ca.class, C19618h.f54585a, "i"});
            case 3:
                return new C9195cd();
            case 4:
                return new C9189by();
            case 5:
                return f31746j;
            case 6:
                C63010eb ebVar = f31747k;
                if (ebVar == null) {
                    synchronized (C9195cd.class) {
                        ebVar = f31747k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31746j);
                            f31747k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
