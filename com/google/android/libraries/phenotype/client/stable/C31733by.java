package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.phenotype.client.stable.by */
/* compiled from: PG */
public final class C31733by extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C31733by f85305h;

    /* renamed from: i */
    private static volatile C63010eb f85306i;

    /* renamed from: a */
    public int f85307a;

    /* renamed from: b */
    public String f85308b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f85309c = C63088z.f170246b;

    /* renamed from: d */
    public String f85310d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f85311e;

    /* renamed from: f */
    public long f85312f;

    /* renamed from: g */
    public C62971cq f85313g = emptyProtobufList();

    static {
        C31733by byVar = new C31733by();
        f85305h = byVar;
        C62942bv.registerDefaultInstance(C31733by.class, byVar);
    }

    private C31733by() {
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
                return newMessageInfo(f85305h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C31736ca.class, C10662f.f35572a});
            case 3:
                return new C31733by();
            case 4:
                return new C31732bx();
            case 5:
                return f85305h;
            case 6:
                C63010eb ebVar = f85306i;
                if (ebVar == null) {
                    synchronized (C31733by.class) {
                        ebVar = f85306i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85305h);
                            f85306i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
