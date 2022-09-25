package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ir */
/* compiled from: PG */
public final class C59994ir extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59994ir f162142h;

    /* renamed from: i */
    private static volatile C63010eb f162143i;

    /* renamed from: a */
    public int f162144a;

    /* renamed from: b */
    public int f162145b;

    /* renamed from: c */
    public String f162146c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f162147d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f162148e;

    /* renamed from: f */
    public int f162149f;

    /* renamed from: g */
    public long f162150g;

    static {
        C59994ir irVar = new C59994ir();
        f162142h = irVar;
        C62942bv.registerDefaultInstance(C59994ir.class, irVar);
    }

    private C59994ir() {
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
                return newMessageInfo(f162142h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0007ဂ\u0005", new Object[]{"a", "b", C59993iq.f162141a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C59994ir();
            case 4:
                return new C59992ip();
            case 5:
                return f162142h;
            case 6:
                C63010eb ebVar = f162143i;
                if (ebVar == null) {
                    synchronized (C59994ir.class) {
                        ebVar = f162143i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162142h);
                            f162143i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
