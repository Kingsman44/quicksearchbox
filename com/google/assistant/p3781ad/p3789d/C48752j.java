package com.google.assistant.p3781ad.p3789d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.j */
/* compiled from: PG */
public final class C48752j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48752j f126144f;

    /* renamed from: h */
    private static volatile C63010eb f126145h;

    /* renamed from: a */
    public String f126146a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f126147b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126148c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f126149d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f126150e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private int f126151g;

    static {
        C48752j jVar = new C48752j();
        f126144f = jVar;
        C62942bv.registerDefaultInstance(C48752j.class, jVar);
    }

    private C48752j() {
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
                return newMessageInfo(f126144f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48752j();
            case 4:
                return new C48751i();
            case 5:
                return f126144f;
            case 6:
                C63010eb ebVar = f126145h;
                if (ebVar == null) {
                    synchronized (C48752j.class) {
                        ebVar = f126145h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126144f);
                            f126145h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
