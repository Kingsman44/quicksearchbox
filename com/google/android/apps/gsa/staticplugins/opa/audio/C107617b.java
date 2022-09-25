package com.google.android.apps.gsa.staticplugins.opa.audio;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.audio.b */
/* compiled from: PG */
public final class C107617b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C107617b f299379e;

    /* renamed from: g */
    private static volatile C63010eb f299380g;

    /* renamed from: a */
    public int f299381a;

    /* renamed from: b */
    public long f299382b;

    /* renamed from: c */
    public long f299383c;

    /* renamed from: d */
    public C52176ia f299384d;

    /* renamed from: f */
    private byte f299385f = 2;

    static {
        C107617b bVar = new C107617b();
        f299379e = bVar;
        C62942bv.registerDefaultInstance(C107617b.class, bVar);
    }

    private C107617b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f299385f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f299385f = b;
                return null;
            case 2:
                return newMessageInfo(f299379e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C107617b();
            case 4:
                return new C107616a();
            case 5:
                return f299379e;
            case 6:
                C63010eb ebVar = f299380g;
                if (ebVar == null) {
                    synchronized (C107617b.class) {
                        ebVar = f299380g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299379e);
                            f299380g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
