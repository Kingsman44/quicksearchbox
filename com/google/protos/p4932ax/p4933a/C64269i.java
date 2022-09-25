package com.google.protos.p4932ax.p4933a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4948ba.p4949a.C64369b;

/* renamed from: com.google.protos.ax.a.i */
/* compiled from: PG */
public final class C64269i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f173762f = new C64266f();

    /* renamed from: g */
    public static final C64269i f173763g;

    /* renamed from: h */
    private static volatile C63010eb f173764h;

    /* renamed from: a */
    public int f173765a;

    /* renamed from: b */
    public String f173766b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f173767c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62995dn f173768d = C62995dn.f170057a;

    /* renamed from: e */
    public C62961ch f173769e;

    static {
        C64269i iVar = new C64269i();
        f173763g = iVar;
        C62942bv.registerDefaultInstance(C64269i.class, iVar);
    }

    private C64269i() {
        emptyIntList();
        this.f173769e = emptyIntList();
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
                return newMessageInfo(f173763g, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00052\u0006\u001e", new Object[]{"a", "b", C45240c.f118157a, "d", C64268h.f173761a, "e", C64369b.m96391b()});
            case 3:
                return new C64269i();
            case 4:
                return new C64267g();
            case 5:
                return f173763g;
            case 6:
                C63010eb ebVar = f173764h;
                if (ebVar == null) {
                    synchronized (C64269i.class) {
                        ebVar = f173764h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173763g);
                            f173764h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
