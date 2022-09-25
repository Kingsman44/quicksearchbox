package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.af */
/* compiled from: PG */
public final class C57802af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57802af f154423d;

    /* renamed from: f */
    private static volatile C63010eb f154424f;

    /* renamed from: a */
    public String f154425a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f154426b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f154427c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f154428e;

    static {
        C57802af afVar = new C57802af();
        f154423d = afVar;
        C62942bv.registerDefaultInstance(C57802af.class, afVar);
    }

    private C57802af() {
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
                return newMessageInfo(f154423d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C57802af();
            case 4:
                return new C57801ae();
            case 5:
                return f154423d;
            case 6:
                C63010eb ebVar = f154424f;
                if (ebVar == null) {
                    synchronized (C57802af.class) {
                        ebVar = f154424f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154423d);
                            f154424f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
