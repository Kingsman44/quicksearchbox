package com.google.android.search.core.p3548a;

import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.search.core.a.b */
/* compiled from: PG */
public final class C45232b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C45232b f118026b;

    /* renamed from: d */
    private static volatile C63010eb f118027d;

    /* renamed from: a */
    public C62971cq f118028a = emptyProtobufList();

    /* renamed from: c */
    private byte f118029c = 2;

    static {
        C45232b bVar = new C45232b();
        f118026b = bVar;
        C62942bv.registerDefaultInstance(C45232b.class, bVar);
    }

    private C45232b() {
    }

    /* renamed from: a */
    public final void mo49094a() {
        C62971cq cqVar = this.f118028a;
        if (!cqVar.mo58948c()) {
            this.f118028a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f118029c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f118029c = b;
                return null;
            case 2:
                return newMessageInfo(f118026b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C60555uf.class});
            case 3:
                return new C45232b();
            case 4:
                return new C45231a();
            case 5:
                return f118026b;
            case 6:
                C63010eb ebVar = f118027d;
                if (ebVar == null) {
                    synchronized (C45232b.class) {
                        ebVar = f118027d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f118026b);
                            f118027d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
