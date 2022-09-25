package com.google.android.libraries.lens.common.text;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62441br;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.common.text.k */
/* compiled from: PG */
public final class C24135k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C24135k f65892e;

    /* renamed from: f */
    private static volatile C63010eb f65893f;

    /* renamed from: a */
    public String f65894a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62441br f65895b;

    /* renamed from: c */
    public C62971cq f65896c = emptyProtobufList();

    /* renamed from: d */
    public C24128d f65897d;

    static {
        C24135k kVar = new C24135k();
        f65892e = kVar;
        C62942bv.registerDefaultInstance(C24135k.class, kVar);
    }

    private C24135k() {
    }

    /* renamed from: a */
    public final void mo29542a() {
        C62971cq cqVar = this.f65896c;
        if (!cqVar.mo58948c()) {
            this.f65896c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f65892e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\t", new Object[]{"a", "b", C45240c.f118157a, C24139o.class, "d"});
            case 3:
                return new C24135k();
            case 4:
                return new C24134j();
            case 5:
                return f65892e;
            case 6:
                C63010eb ebVar = f65893f;
                if (ebVar == null) {
                    synchronized (C24135k.class) {
                        ebVar = f65893f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f65892e);
                            f65893f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
