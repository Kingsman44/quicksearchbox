package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.ax */
/* compiled from: PG */
public final class C123730ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123730ax f341767b;

    /* renamed from: d */
    private static volatile C63010eb f341768d;

    /* renamed from: a */
    public C62971cq f341769a = emptyProtobufList();

    /* renamed from: c */
    private byte f341770c = 2;

    static {
        C123730ax axVar = new C123730ax();
        f341767b = axVar;
        C62942bv.registerDefaultInstance(C123730ax.class, axVar);
    }

    private C123730ax() {
    }

    /* renamed from: a */
    public final void mo106116a() {
        C62971cq cqVar = this.f341769a;
        if (!cqVar.mo58948c()) {
            this.f341769a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341770c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341770c = b;
                return null;
            case 2:
                return newMessageInfo(f341767b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C123728av.class});
            case 3:
                return new C123730ax();
            case 4:
                return new C123729aw();
            case 5:
                return f341767b;
            case 6:
                C63010eb ebVar = f341768d;
                if (ebVar == null) {
                    synchronized (C123730ax.class) {
                        ebVar = f341768d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341767b);
                            f341768d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
