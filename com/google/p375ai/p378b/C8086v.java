package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.v */
/* compiled from: PG */
public final class C8086v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8086v f28444c;

    /* renamed from: d */
    private static volatile C63010eb f28445d;

    /* renamed from: a */
    public int f28446a;

    /* renamed from: b */
    public String f28447b = BuildConfig.FLAVOR;

    static {
        C8086v vVar = new C8086v();
        f28444c = vVar;
        C62942bv.registerDefaultInstance(C8086v.class, vVar);
    }

    private C8086v() {
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
                return newMessageInfo(f28444c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8086v();
            case 4:
                return new C8059u();
            case 5:
                return f28444c;
            case 6:
                C63010eb ebVar = f28445d;
                if (ebVar == null) {
                    synchronized (C8086v.class) {
                        ebVar = f28445d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28444c);
                            f28445d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
