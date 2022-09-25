package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.sf */
/* compiled from: PG */
public final class C8011sf extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C8011sf f28129c;

    /* renamed from: f */
    private static volatile C63010eb f28130f;

    /* renamed from: a */
    public C62971cq f28131a = emptyProtobufList();

    /* renamed from: b */
    public C8034tb f28132b;

    /* renamed from: d */
    private int f28133d;

    /* renamed from: e */
    private byte f28134e = 2;

    static {
        C8011sf sfVar = new C8011sf();
        f28129c = sfVar;
        C62942bv.registerDefaultInstance(C8011sf.class, sfVar);
    }

    private C8011sf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28134e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28134e = b;
                return null;
            case 2:
                return newMessageInfo(f28129c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"d", "a", C8025st.class, "b"});
            case 3:
                return new C8011sf();
            case 4:
                return new C8010se();
            case 5:
                return f28129c;
            case 6:
                C63010eb ebVar = f28130f;
                if (ebVar == null) {
                    synchronized (C8011sf.class) {
                        ebVar = f28130f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28129c);
                            f28130f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
