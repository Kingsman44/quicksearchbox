package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agx */
/* compiled from: PG */
public final class agx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final agx f129268d;

    /* renamed from: e */
    private static volatile C63010eb f129269e;

    /* renamed from: a */
    public int f129270a;

    /* renamed from: b */
    public String f129271b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129272c = BuildConfig.FLAVOR;

    static {
        agx agx = new agx();
        f129268d = agx;
        C62942bv.registerDefaultInstance(agx.class, agx);
    }

    private agx() {
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
                return newMessageInfo(f129268d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new agx();
            case 4:
                return new agw();
            case 5:
                return f129268d;
            case 6:
                C63010eb ebVar = f129269e;
                if (ebVar == null) {
                    synchronized (agx.class) {
                        ebVar = f129269e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129268d);
                            f129269e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
