package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.dp */
/* compiled from: PG */
public final class C49023dp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49023dp f126805e;

    /* renamed from: f */
    private static volatile C63010eb f126806f;

    /* renamed from: a */
    public int f126807a;

    /* renamed from: b */
    public int f126808b;

    /* renamed from: c */
    public String f126809c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f126810d = emptyProtobufList();

    static {
        C49023dp dpVar = new C49023dp();
        f126805e = dpVar;
        C62942bv.registerDefaultInstance(C49023dp.class, dpVar);
    }

    private C49023dp() {
    }

    /* renamed from: a */
    public final void mo53211a() {
        C62971cq cqVar = this.f126810d;
        if (!cqVar.mo58948c()) {
            this.f126810d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f126805e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C49022do.class});
            case 3:
                return new C49023dp();
            case 4:
                return new C49020dm();
            case 5:
                return f126805e;
            case 6:
                C63010eb ebVar = f126806f;
                if (ebVar == null) {
                    synchronized (C49023dp.class) {
                        ebVar = f126806f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126805e);
                            f126806f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
