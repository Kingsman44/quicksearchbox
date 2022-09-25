package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.di */
/* compiled from: PG */
public final class C49606di extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49606di f128007d;

    /* renamed from: f */
    private static volatile C63010eb f128008f;

    /* renamed from: a */
    public int f128009a;

    /* renamed from: b */
    public String f128010b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f128011c = C62942bv.emptyProtobufList();

    /* renamed from: e */
    private int f128012e;

    static {
        C49606di diVar = new C49606di();
        f128007d = diVar;
        C62942bv.registerDefaultInstance(C49606di.class, diVar);
    }

    private C49606di() {
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
                return newMessageInfo(f128007d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"e", "a", C49617h.m85586b(), "b", C45240c.f118157a});
            case 3:
                return new C49606di();
            case 4:
                return new C49605dh();
            case 5:
                return f128007d;
            case 6:
                C63010eb ebVar = f128008f;
                if (ebVar == null) {
                    synchronized (C49606di.class) {
                        ebVar = f128008f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128007d);
                            f128008f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
