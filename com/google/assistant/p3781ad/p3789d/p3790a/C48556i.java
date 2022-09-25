package com.google.assistant.p3781ad.p3789d.p3790a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.i */
/* compiled from: PG */
public final class C48556i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48556i f125438f;

    /* renamed from: g */
    private static volatile C63010eb f125439g;

    /* renamed from: a */
    public int f125440a;

    /* renamed from: b */
    public String f125441b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f125442c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f125443d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f125444e;

    static {
        C48556i iVar = new C48556i();
        f125438f = iVar;
        C62942bv.registerDefaultInstance(C48556i.class, iVar);
    }

    private C48556i() {
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
                return newMessageInfo(f125438f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48556i();
            case 4:
                return new C48555h();
            case 5:
                return f125438f;
            case 6:
                C63010eb ebVar = f125439g;
                if (ebVar == null) {
                    synchronized (C48556i.class) {
                        ebVar = f125439g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125438f);
                            f125439g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
