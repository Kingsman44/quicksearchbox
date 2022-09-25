package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.C65190ex;
import com.google.speech.p5218j.C67091ks;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.p */
/* compiled from: PG */
public final class C122461p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C122461p f339487e;

    /* renamed from: f */
    private static volatile C63010eb f339488f;

    /* renamed from: a */
    public int f339489a;

    /* renamed from: b */
    public int f339490b = 0;

    /* renamed from: c */
    public Object f339491c;

    /* renamed from: d */
    public C67091ks f339492d;

    static {
        C122461p pVar = new C122461p();
        f339487e = pVar;
        C62942bv.registerDefaultInstance(C122461p.class, pVar);
    }

    private C122461p() {
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
                return newMessageInfo(f339487e, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000", new Object[]{C45240c.f118157a, "b", "a", C122445cj.class, C65190ex.class, "d"});
            case 3:
                return new C122461p();
            case 4:
                return new C122459n();
            case 5:
                return f339487e;
            case 6:
                C63010eb ebVar = f339488f;
                if (ebVar == null) {
                    synchronized (C122461p.class) {
                        ebVar = f339488f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339487e);
                            f339488f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
