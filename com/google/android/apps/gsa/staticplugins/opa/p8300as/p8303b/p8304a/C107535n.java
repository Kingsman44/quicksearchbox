package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.n */
/* compiled from: PG */
public final class C107535n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C107535n f299173f;

    /* renamed from: g */
    private static volatile C63010eb f299174g;

    /* renamed from: a */
    public int f299175a;

    /* renamed from: b */
    public aco f299176b;

    /* renamed from: c */
    public String f299177c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f299178d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f299179e = emptyProtobufList();

    static {
        C107535n nVar = new C107535n();
        f299173f = nVar;
        C62942bv.registerDefaultInstance(C107535n.class, nVar);
    }

    private C107535n() {
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
                return newMessageInfo(f299173f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C107534m.class});
            case 3:
                return new C107535n();
            case 4:
                return new C107532k();
            case 5:
                return f299173f;
            case 6:
                C63010eb ebVar = f299174g;
                if (ebVar == null) {
                    synchronized (C107535n.class) {
                        ebVar = f299174g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299173f);
                            f299174g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
