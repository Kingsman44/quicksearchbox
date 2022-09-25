package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.w */
/* compiled from: PG */
public final class C65854w extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C65854w f179011g;

    /* renamed from: i */
    private static volatile C63010eb f179012i;

    /* renamed from: a */
    public int f179013a;

    /* renamed from: b */
    public int f179014b;

    /* renamed from: c */
    public String f179015c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f179016d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f179017e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f179018f = emptyProtobufList();

    /* renamed from: h */
    private byte f179019h = 2;

    static {
        C65854w wVar = new C65854w();
        f179011g = wVar;
        C62942bv.registerDefaultInstance(C65854w.class, wVar);
    }

    private C65854w() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179019h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179019h = b;
                return null;
            case 2:
                return newMessageInfo(f179011g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л\u0005Л", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a, "d", "e", C65768az.class, C10662f.f35572a, C65768az.class});
            case 3:
                return new C65854w();
            case 4:
                return new C65853v();
            case 5:
                return f179011g;
            case 6:
                C63010eb ebVar = f179012i;
                if (ebVar == null) {
                    synchronized (C65854w.class) {
                        ebVar = f179012i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179011g);
                            f179012i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
