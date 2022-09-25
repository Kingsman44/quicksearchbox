package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7818lb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.cz */
/* compiled from: PG */
public final class C9217cz extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C9217cz f31853i;

    /* renamed from: k */
    private static volatile C63010eb f31854k;

    /* renamed from: a */
    public int f31855a;

    /* renamed from: b */
    public String f31856b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31857c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f31858d = emptyProtobufList();

    /* renamed from: e */
    public C9141ad f31859e;

    /* renamed from: f */
    public String f31860f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f31861g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f31862h;

    /* renamed from: j */
    private byte f31863j = 2;

    static {
        C9217cz czVar = new C9217cz();
        f31853i = czVar;
        C62942bv.registerDefaultInstance(C9217cz.class, czVar);
    }

    private C9217cz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31863j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31863j = b;
                return null;
            case 2:
                return newMessageInfo(f31853i, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0001\u0001\u0002ဈ\u0000\u0004ဈ\u0001\u0005ᐉ\u0002\u0006ဈ\u0003\u0007ဈ\u0004\tဇ\u0005\n\u001b", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "d", C7818lb.class});
            case 3:
                return new C9217cz();
            case 4:
                return new C9216cy();
            case 5:
                return f31853i;
            case 6:
                C63010eb ebVar = f31854k;
                if (ebVar == null) {
                    synchronized (C9217cz.class) {
                        ebVar = f31854k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31853i);
                            f31854k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
