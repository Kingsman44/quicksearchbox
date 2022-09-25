package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.wi */
/* compiled from: PG */
public final class C52562wi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52562wi f137956d;

    /* renamed from: e */
    private static volatile C63010eb f137957e;

    /* renamed from: a */
    public int f137958a;

    /* renamed from: b */
    public String f137959b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f137960c;

    static {
        C52562wi wiVar = new C52562wi();
        f137956d = wiVar;
        C62942bv.registerDefaultInstance(C52562wi.class, wiVar);
    }

    private C52562wi() {
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
                return newMessageInfo(f137956d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52562wi();
            case 4:
                return new C52561wh();
            case 5:
                return f137956d;
            case 6:
                C63010eb ebVar = f137957e;
                if (ebVar == null) {
                    synchronized (C52562wi.class) {
                        ebVar = f137957e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137956d);
                            f137957e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
