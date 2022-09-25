package com.google.android.apps.gsa.p8839t.p8845f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.t.f.g */
/* compiled from: PG */
public final class C118365g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C118365g f328542b;

    /* renamed from: d */
    private static volatile C63010eb f328543d;

    /* renamed from: a */
    public C62971cq f328544a = emptyProtobufList();

    /* renamed from: c */
    private byte f328545c = 2;

    static {
        C118365g gVar = new C118365g();
        f328542b = gVar;
        C62942bv.registerDefaultInstance(C118365g.class, gVar);
    }

    private C118365g() {
    }

    /* renamed from: a */
    public final void mo103682a() {
        C62971cq cqVar = this.f328544a;
        if (!cqVar.mo58948c()) {
            this.f328544a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f328545c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f328545c = b;
                return null;
            case 2:
                return newMessageInfo(f328542b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C118363e.class});
            case 3:
                return new C118365g();
            case 4:
                return new C118364f();
            case 5:
                return f328542b;
            case 6:
                C63010eb ebVar = f328543d;
                if (ebVar == null) {
                    synchronized (C118365g.class) {
                        ebVar = f328543d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328542b);
                            f328543d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
