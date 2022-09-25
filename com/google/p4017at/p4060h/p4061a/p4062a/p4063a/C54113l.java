package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.l */
/* compiled from: PG */
public final class C54113l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54113l f141984f;

    /* renamed from: g */
    private static volatile C63010eb f141985g;

    /* renamed from: a */
    public int f141986a;

    /* renamed from: b */
    public String f141987b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f141988c;

    /* renamed from: d */
    public String f141989d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f141990e;

    static {
        C54113l lVar = new C54113l();
        f141984f = lVar;
        C62942bv.registerDefaultInstance(C54113l.class, lVar);
    }

    private C54113l() {
        emptyProtobufList();
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
                return newMessageInfo(f141984f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0004ဃ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", "d", C45240c.f118157a, "e", C54111j.f141983a});
            case 3:
                return new C54113l();
            case 4:
                return new C54110i();
            case 5:
                return f141984f;
            case 6:
                C63010eb ebVar = f141985g;
                if (ebVar == null) {
                    synchronized (C54113l.class) {
                        ebVar = f141985g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141984f);
                            f141985g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
