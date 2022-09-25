package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a;

import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.a.j */
/* compiled from: PG */
public final class C122189j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122189j f338885b;

    /* renamed from: c */
    private static volatile C63010eb f338886c;

    /* renamed from: a */
    public C62971cq f338887a = emptyProtobufList();

    static {
        C122189j jVar = new C122189j();
        f338885b = jVar;
        C62942bv.registerDefaultInstance(C122189j.class, jVar);
    }

    private C122189j() {
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
                return newMessageInfo(f338885b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48770b.class});
            case 3:
                return new C122189j();
            case 4:
                return new C122188i();
            case 5:
                return f338885b;
            case 6:
                C63010eb ebVar = f338886c;
                if (ebVar == null) {
                    synchronized (C122189j.class) {
                        ebVar = f338886c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338885b);
                            f338886c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
