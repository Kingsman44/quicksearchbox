package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a;

import com.google.android.libraries.mdi.C29690f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.a.h */
/* compiled from: PG */
public final class C122187h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122187h f338882b;

    /* renamed from: c */
    private static volatile C63010eb f338883c;

    /* renamed from: a */
    public C62971cq f338884a = emptyProtobufList();

    static {
        C122187h hVar = new C122187h();
        f338882b = hVar;
        C62942bv.registerDefaultInstance(C122187h.class, hVar);
    }

    private C122187h() {
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
                return newMessageInfo(f338882b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C29690f.class});
            case 3:
                return new C122187h();
            case 4:
                return new C122186g();
            case 5:
                return f338882b;
            case 6:
                C63010eb ebVar = f338883c;
                if (ebVar == null) {
                    synchronized (C122187h.class) {
                        ebVar = f338883c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338882b);
                            f338883c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
