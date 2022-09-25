package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.v */
/* compiled from: PG */
public final class C54258v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54258v f142462c;

    /* renamed from: d */
    private static volatile C63010eb f142463d;

    /* renamed from: a */
    public int f142464a;

    /* renamed from: b */
    public String f142465b = BuildConfig.FLAVOR;

    static {
        C54258v vVar = new C54258v();
        f142462c = vVar;
        C62942bv.registerDefaultInstance(C54258v.class, vVar);
    }

    private C54258v() {
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
                return newMessageInfo(f142462c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C54258v();
            case 4:
                return new C54257u();
            case 5:
                return f142462c;
            case 6:
                C63010eb ebVar = f142463d;
                if (ebVar == null) {
                    synchronized (C54258v.class) {
                        ebVar = f142463d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142462c);
                            f142463d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
