package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.gt */
/* compiled from: PG */
public final class C59827gt extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C59827gt f161660l;

    /* renamed from: m */
    private static volatile C63010eb f161661m;

    /* renamed from: a */
    public int f161662a;

    /* renamed from: b */
    public String f161663b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f161664c;

    /* renamed from: d */
    public int f161665d;

    /* renamed from: e */
    public C62971cq f161666e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f161667f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f161668g = emptyProtobufList();

    /* renamed from: h */
    public int f161669h;

    /* renamed from: i */
    public boolean f161670i;

    /* renamed from: j */
    public String f161671j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public boolean f161672k;

    static {
        C59827gt gtVar = new C59827gt();
        f161660l = gtVar;
        C62942bv.registerDefaultInstance(C59827gt.class, gtVar);
    }

    private C59827gt() {
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
                return newMessageInfo(f161660l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007င\u0003\bဇ\u0004\tဈ\u0005\nဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C59860hx.class, C10662f.f35572a, C59860hx.class, C30325g.f82003a, C59860hx.class, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C59827gt();
            case 4:
                return new C59826gs();
            case 5:
                return f161660l;
            case 6:
                C63010eb ebVar = f161661m;
                if (ebVar == null) {
                    synchronized (C59827gt.class) {
                        ebVar = f161661m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161660l);
                            f161661m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
