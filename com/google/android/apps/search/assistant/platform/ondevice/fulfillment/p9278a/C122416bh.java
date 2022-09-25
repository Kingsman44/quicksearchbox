package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bh */
/* compiled from: PG */
public final class C122416bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C122416bh f339381d;

    /* renamed from: e */
    private static volatile C63010eb f339382e;

    /* renamed from: a */
    public int f339383a;

    /* renamed from: b */
    public long f339384b;

    /* renamed from: c */
    public long f339385c;

    static {
        C122416bh bhVar = new C122416bh();
        f339381d = bhVar;
        C62942bv.registerDefaultInstance(C122416bh.class, bhVar);
    }

    private C122416bh() {
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
                return newMessageInfo(f339381d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C122416bh();
            case 4:
                return new C122415bg();
            case 5:
                return f339381d;
            case 6:
                C63010eb ebVar = f339382e;
                if (ebVar == null) {
                    synchronized (C122416bh.class) {
                        ebVar = f339382e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339381d);
                            f339382e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
