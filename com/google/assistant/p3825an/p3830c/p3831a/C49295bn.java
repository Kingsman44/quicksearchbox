package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.bn */
/* compiled from: PG */
public final class C49295bn extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49295bn f127404f;

    /* renamed from: h */
    private static volatile C63010eb f127405h;

    /* renamed from: a */
    public String f127406a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f127407b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127408c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f127409d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f127410e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private int f127411g;

    static {
        C49295bn bnVar = new C49295bn();
        f127404f = bnVar;
        C62942bv.registerDefaultInstance(C49295bn.class, bnVar);
    }

    private C49295bn() {
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
                return newMessageInfo(f127404f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C49295bn();
            case 4:
                return new C49294bm();
            case 5:
                return f127404f;
            case 6:
                C63010eb ebVar = f127405h;
                if (ebVar == null) {
                    synchronized (C49295bn.class) {
                        ebVar = f127405h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127404f);
                            f127405h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
