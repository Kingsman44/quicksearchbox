package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a;

import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.a.s */
/* compiled from: PG */
public final class C122198s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122198s f338900b;

    /* renamed from: c */
    private static volatile C63010eb f338901c;

    /* renamed from: a */
    public C48773e f338902a;

    static {
        C122198s sVar = new C122198s();
        f338900b = sVar;
        C62942bv.registerDefaultInstance(C122198s.class, sVar);
    }

    private C122198s() {
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
                return newMessageInfo(f338900b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C122198s();
            case 4:
                return new C122197r();
            case 5:
                return f338900b;
            case 6:
                C63010eb ebVar = f338901c;
                if (ebVar == null) {
                    synchronized (C122198s.class) {
                        ebVar = f338901c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338900b);
                            f338901c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
