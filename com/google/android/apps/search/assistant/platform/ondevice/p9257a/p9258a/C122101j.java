package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a;

import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.a.j */
/* compiled from: PG */
public final class C122101j extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C122101j f338749c;

    /* renamed from: e */
    private static volatile C63010eb f338750e;

    /* renamed from: a */
    public int f338751a;

    /* renamed from: b */
    public C52230ka f338752b;

    /* renamed from: d */
    private byte f338753d = 2;

    static {
        C122101j jVar = new C122101j();
        f338749c = jVar;
        C62942bv.registerDefaultInstance(C122101j.class, jVar);
    }

    private C122101j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f338753d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f338753d = b;
                return null;
            case 2:
                return newMessageInfo(f338749c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C122101j();
            case 4:
                return new C122100i();
            case 5:
                return f338749c;
            case 6:
                C63010eb ebVar = f338750e;
                if (ebVar == null) {
                    synchronized (C122101j.class) {
                        ebVar = f338750e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338749c);
                            f338750e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
