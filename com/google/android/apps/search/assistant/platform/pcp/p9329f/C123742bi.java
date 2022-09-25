package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bi */
/* compiled from: PG */
public final class C123742bi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123742bi f341800b;

    /* renamed from: d */
    private static volatile C63010eb f341801d;

    /* renamed from: a */
    public C62971cq f341802a = emptyProtobufList();

    /* renamed from: c */
    private byte f341803c = 2;

    static {
        C123742bi biVar = new C123742bi();
        f341800b = biVar;
        C62942bv.registerDefaultInstance(C123742bi.class, biVar);
    }

    private C123742bi() {
    }

    /* renamed from: a */
    public final void mo106123a() {
        C62971cq cqVar = this.f341802a;
        if (!cqVar.mo58948c()) {
            this.f341802a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341803c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341803c = b;
                return null;
            case 2:
                return newMessageInfo(f341800b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C53020k.class});
            case 3:
                return new C123742bi();
            case 4:
                return new C123741bh();
            case 5:
                return f341800b;
            case 6:
                C63010eb ebVar = f341801d;
                if (ebVar == null) {
                    synchronized (C123742bi.class) {
                        ebVar = f341801d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341800b);
                            f341801d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
