package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.bq */
/* compiled from: PG */
public final class C142338bq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C142338bq f386166g;

    /* renamed from: h */
    private static volatile C63010eb f386167h;

    /* renamed from: a */
    public int f386168a;

    /* renamed from: b */
    public C142355cg f386169b;

    /* renamed from: c */
    public C142328bg f386170c;

    /* renamed from: d */
    public C142355cg f386171d;

    /* renamed from: e */
    public C142355cg f386172e;

    /* renamed from: f */
    public String f386173f = BuildConfig.FLAVOR;

    static {
        C142338bq bqVar = new C142338bq();
        f386166g = bqVar;
        C62942bv.registerDefaultInstance(C142338bq.class, bqVar);
    }

    private C142338bq() {
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
                return newMessageInfo(f386166g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C142338bq();
            case 4:
                return new C142337bp();
            case 5:
                return f386166g;
            case 6:
                C63010eb ebVar = f386167h;
                if (ebVar == null) {
                    synchronized (C142338bq.class) {
                        ebVar = f386167h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386166g);
                            f386167h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
