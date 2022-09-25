package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.z */
/* compiled from: PG */
public final class C14636z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14636z f44230e;

    /* renamed from: f */
    private static volatile C63010eb f44231f;

    /* renamed from: a */
    public String f44232a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f44233b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f44234c;

    /* renamed from: d */
    public C62971cq f44235d = emptyProtobufList();

    static {
        C14636z zVar = new C14636z();
        f44230e = zVar;
        C62942bv.registerDefaultInstance(C14636z.class, zVar);
    }

    private C14636z() {
    }

    /* renamed from: a */
    public final void mo21563a() {
        C62971cq cqVar = this.f44235d;
        if (!cqVar.mo58948c()) {
            this.f44235d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f44230e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C14525ml.class});
            case 3:
                return new C14636z();
            case 4:
                return new C14635y();
            case 5:
                return f44230e;
            case 6:
                C63010eb ebVar = f44231f;
                if (ebVar == null) {
                    synchronized (C14636z.class) {
                        ebVar = f44231f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44230e);
                            f44231f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
