package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a;

import com.google.android.libraries.mdi.C29690f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.a.b */
/* compiled from: PG */
public final class C122181b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122181b f338867b;

    /* renamed from: c */
    private static volatile C63010eb f338868c;

    /* renamed from: a */
    public C29690f f338869a;

    static {
        C122181b bVar = new C122181b();
        f338867b = bVar;
        C62942bv.registerDefaultInstance(C122181b.class, bVar);
    }

    private C122181b() {
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
                return newMessageInfo(f338867b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C122181b();
            case 4:
                return new C122180a();
            case 5:
                return f338867b;
            case 6:
                C63010eb ebVar = f338868c;
                if (ebVar == null) {
                    synchronized (C122181b.class) {
                        ebVar = f338868c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338867b);
                            f338868c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
