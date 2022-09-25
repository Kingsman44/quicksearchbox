package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.u */
/* compiled from: PG */
public final class C80024u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80024u f219602d;

    /* renamed from: e */
    private static volatile C63010eb f219603e;

    /* renamed from: a */
    public int f219604a;

    /* renamed from: b */
    public String f219605b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f219606c = BuildConfig.FLAVOR;

    static {
        C80024u uVar = new C80024u();
        f219602d = uVar;
        C62942bv.registerDefaultInstance(C80024u.class, uVar);
    }

    private C80024u() {
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
                return newMessageInfo(f219602d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80024u();
            case 4:
                return new C80023t();
            case 5:
                return f219602d;
            case 6:
                C63010eb ebVar = f219603e;
                if (ebVar == null) {
                    synchronized (C80024u.class) {
                        ebVar = f219603e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219602d);
                            f219603e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
