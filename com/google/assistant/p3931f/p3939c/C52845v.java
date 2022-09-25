package com.google.assistant.p3931f.p3939c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.v */
/* compiled from: PG */
public final class C52845v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52845v f138648d;

    /* renamed from: e */
    private static volatile C63010eb f138649e;

    /* renamed from: a */
    public String f138650a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f138651b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f138652c = emptyProtobufList();

    static {
        C52845v vVar = new C52845v();
        f138648d = vVar;
        C62942bv.registerDefaultInstance(C52845v.class, vVar);
    }

    private C52845v() {
    }

    /* renamed from: a */
    public final void mo53929a() {
        C62971cq cqVar = this.f138652c;
        if (!cqVar.mo58948c()) {
            this.f138652c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f138648d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C52842s.class});
            case 3:
                return new C52845v();
            case 4:
                return new C52840q();
            case 5:
                return f138648d;
            case 6:
                C63010eb ebVar = f138649e;
                if (ebVar == null) {
                    synchronized (C52845v.class) {
                        ebVar = f138649e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138648d);
                            f138649e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
