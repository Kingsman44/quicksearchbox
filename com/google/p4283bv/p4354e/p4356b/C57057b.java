package com.google.p4283bv.p4354e.p4356b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.p4283bv.p4354e.C57528m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b */
/* compiled from: PG */
public final class C57057b extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C57057b f152311e;

    /* renamed from: g */
    private static volatile C63010eb f152312g;

    /* renamed from: a */
    public int f152313a;

    /* renamed from: b */
    public C7669fo f152314b;

    /* renamed from: c */
    public C7973qv f152315c;

    /* renamed from: d */
    public int f152316d;

    /* renamed from: f */
    private byte f152317f = 2;

    static {
        C57057b bVar = new C57057b();
        f152311e = bVar;
        C62942bv.registerDefaultInstance(C57057b.class, bVar);
    }

    private C57057b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152317f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152317f = b;
                return null;
            case 2:
                return newMessageInfo(f152311e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C57528m.m88370b()});
            case 3:
                return new C57057b();
            case 4:
                return new C57052a();
            case 5:
                return f152311e;
            case 6:
                C63010eb ebVar = f152312g;
                if (ebVar == null) {
                    synchronized (C57057b.class) {
                        ebVar = f152312g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152311e);
                            f152312g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
