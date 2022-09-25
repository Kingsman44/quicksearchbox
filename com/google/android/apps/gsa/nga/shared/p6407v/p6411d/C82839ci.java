package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ci */
/* compiled from: PG */
public final class C82839ci extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C82839ci f225884b;

    /* renamed from: d */
    private static volatile C63010eb f225885d;

    /* renamed from: a */
    public C62971cq f225886a = emptyProtobufList();

    /* renamed from: c */
    private byte f225887c = 2;

    static {
        C82839ci ciVar = new C82839ci();
        f225884b = ciVar;
        C62942bv.registerDefaultInstance(C82839ci.class, ciVar);
    }

    private C82839ci() {
    }

    /* renamed from: a */
    public final void mo76625a() {
        C62971cq cqVar = this.f225886a;
        if (!cqVar.mo58948c()) {
            this.f225886a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225887c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225887c = b;
                return null;
            case 2:
                return newMessageInfo(f225884b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C82838ch.class});
            case 3:
                return new C82839ci();
            case 4:
                return new C82836cf();
            case 5:
                return f225884b;
            case 6:
                C63010eb ebVar = f225885d;
                if (ebVar == null) {
                    synchronized (C82839ci.class) {
                        ebVar = f225885d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225884b);
                            f225885d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
