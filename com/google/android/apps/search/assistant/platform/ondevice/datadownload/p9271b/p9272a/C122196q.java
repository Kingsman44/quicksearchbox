package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.a.q */
/* compiled from: PG */
public final class C122196q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122196q f338897b;

    /* renamed from: c */
    private static volatile C63010eb f338898c;

    /* renamed from: a */
    public C62971cq f338899a = C62942bv.emptyProtobufList();

    static {
        C122196q qVar = new C122196q();
        f338897b = qVar;
        C62942bv.registerDefaultInstance(C122196q.class, qVar);
    }

    private C122196q() {
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
                return newMessageInfo(f338897b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C122196q();
            case 4:
                return new C122195p();
            case 5:
                return f338897b;
            case 6:
                C63010eb ebVar = f338898c;
                if (ebVar == null) {
                    synchronized (C122196q.class) {
                        ebVar = f338898c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338897b);
                            f338898c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
