package com.google.android.apps.gsa.search.core.udc;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.udc.aa */
/* compiled from: PG */
public final class C87197aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87197aa f235604b;

    /* renamed from: c */
    private static volatile C63010eb f235605c;

    /* renamed from: a */
    public C62971cq f235606a = emptyProtobufList();

    static {
        C87197aa aaVar = new C87197aa();
        f235604b = aaVar;
        C62942bv.registerDefaultInstance(C87197aa.class, aaVar);
    }

    private C87197aa() {
    }

    /* renamed from: a */
    public final void mo80832a() {
        C62971cq cqVar = this.f235606a;
        if (!cqVar.mo58948c()) {
            this.f235606a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f235604b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C87229y.class});
            case 3:
                return new C87197aa();
            case 4:
                return new C87230z();
            case 5:
                return f235604b;
            case 6:
                C63010eb ebVar = f235605c;
                if (ebVar == null) {
                    synchronized (C87197aa.class) {
                        ebVar = f235605c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235604b);
                            f235605c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
