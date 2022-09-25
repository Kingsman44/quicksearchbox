package com.google.assistant.p3863av.p3864a.p3865a.p3866a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.a.a.a.f */
/* compiled from: PG */
public final class C50528f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50528f f131510c;

    /* renamed from: f */
    private static volatile C63010eb f131511f;

    /* renamed from: a */
    public int f131512a;

    /* renamed from: b */
    public String f131513b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private C62995dn f131514d = C62995dn.f170057a;

    /* renamed from: e */
    private C62995dn f131515e = C62995dn.f170057a;

    static {
        C50528f fVar = new C50528f();
        f131510c = fVar;
        C62942bv.registerDefaultInstance(C50528f.class, fVar);
    }

    private C50528f() {
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
                return newMessageInfo(f131510c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u00012\u0002ဈ\u0000\u00032", new Object[]{"a", "d", C50527e.f131509a, "b", "e", C50525c.f131508a});
            case 3:
                return new C50528f();
            case 4:
                return new C50526d();
            case 5:
                return f131510c;
            case 6:
                C63010eb ebVar = f131511f;
                if (ebVar == null) {
                    synchronized (C50528f.class) {
                        ebVar = f131511f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131510c);
                            f131511f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
