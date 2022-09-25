package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.j */
/* compiled from: PG */
public final class C54246j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54246j f142427c;

    /* renamed from: d */
    private static volatile C63010eb f142428d;

    /* renamed from: a */
    public int f142429a;

    /* renamed from: b */
    public String f142430b = BuildConfig.FLAVOR;

    static {
        C54246j jVar = new C54246j();
        f142427c = jVar;
        C62942bv.registerDefaultInstance(C54246j.class, jVar);
    }

    private C54246j() {
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
                return newMessageInfo(f142427c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54246j();
            case 4:
                return new C54245i();
            case 5:
                return f142427c;
            case 6:
                C63010eb ebVar = f142428d;
                if (ebVar == null) {
                    synchronized (C54246j.class) {
                        ebVar = f142428d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142427c);
                            f142428d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
