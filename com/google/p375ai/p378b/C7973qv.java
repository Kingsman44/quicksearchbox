package com.google.p375ai.p378b;

import com.google.p375ai.p378b.p379a.C7512b;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56951a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.qv */
/* compiled from: PG */
public final class C7973qv extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C7973qv f28001c;

    /* renamed from: f */
    private static volatile C63010eb f28002f;

    /* renamed from: a */
    public int f28003a = 48;

    /* renamed from: b */
    public int f28004b;

    /* renamed from: d */
    private int f28005d;

    /* renamed from: e */
    private byte f28006e = 2;

    static {
        C7973qv qvVar = new C7973qv();
        f28001c = qvVar;
        C62942bv.registerDefaultInstance(C7973qv.class, qvVar);
    }

    private C7973qv() {
        emptyLongList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28006e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28006e = b;
                return null;
            case 2:
                return newMessageInfo(f28001c, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဌ\u0000\u0006ဌ\u0001", new Object[]{"d", "a", C7512b.m22772b(), "b", C56951a.f151999a});
            case 3:
                return new C7973qv();
            case 4:
                return new C7972qu();
            case 5:
                return f28001c;
            case 6:
                C63010eb ebVar = f28002f;
                if (ebVar == null) {
                    synchronized (C7973qv.class) {
                        ebVar = f28002f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28001c);
                            f28002f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
