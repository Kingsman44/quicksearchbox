package com.google.android.libraries.assistant.contexttrigger.p1466j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.w */
/* compiled from: PG */
public final class C17807w extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C17807w f51105e;

    /* renamed from: f */
    private static volatile C63010eb f51106f;

    /* renamed from: a */
    public int f51107a;

    /* renamed from: b */
    public C63042fg f51108b;

    /* renamed from: c */
    public C63042fg f51109c;

    /* renamed from: d */
    public C62971cq f51110d = emptyProtobufList();

    static {
        C17807w wVar = new C17807w();
        f51105e = wVar;
        C62942bv.registerDefaultInstance(C17807w.class, wVar);
    }

    private C17807w() {
    }

    /* renamed from: a */
    public final void mo23470a() {
        C62971cq cqVar = this.f51110d;
        if (!cqVar.mo58948c()) {
            this.f51110d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f51105e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C17805u.class});
            case 3:
                return new C17807w();
            case 4:
                return new C17806v();
            case 5:
                return f51105e;
            case 6:
                C63010eb ebVar = f51106f;
                if (ebVar == null) {
                    synchronized (C17807w.class) {
                        ebVar = f51106f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51105e);
                            f51106f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
