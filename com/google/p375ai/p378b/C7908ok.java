package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56957g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ok */
/* compiled from: PG */
public final class C7908ok extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C7908ok f27786g;

    /* renamed from: h */
    private static volatile C63010eb f27787h;

    /* renamed from: a */
    public int f27788a;

    /* renamed from: b */
    public String f27789b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f27790c;

    /* renamed from: d */
    public String f27791d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f27792e;

    /* renamed from: f */
    public String f27793f = BuildConfig.FLAVOR;

    static {
        C7908ok okVar = new C7908ok();
        f27786g = okVar;
        C62942bv.registerDefaultInstance(C7908ok.class, okVar);
    }

    private C7908ok() {
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
                return newMessageInfo(f27786g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C56957g.f152005a, C10662f.f35572a});
            case 3:
                return new C7908ok();
            case 4:
                return new C7907oj();
            case 5:
                return f27786g;
            case 6:
                C63010eb ebVar = f27787h;
                if (ebVar == null) {
                    synchronized (C7908ok.class) {
                        ebVar = f27787h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27786g);
                            f27787h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
