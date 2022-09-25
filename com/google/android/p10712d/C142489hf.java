package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hf */
/* compiled from: PG */
public final class C142489hf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142489hf f386673c;

    /* renamed from: d */
    private static volatile C63010eb f386674d;

    /* renamed from: a */
    public String f386675a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f386676b = emptyProtobufList();

    static {
        C142489hf hfVar = new C142489hf();
        f386673c = hfVar;
        C62942bv.registerDefaultInstance(C142489hf.class, hfVar);
    }

    private C142489hf() {
    }

    /* renamed from: a */
    public final void mo117137a() {
        C62971cq cqVar = this.f386676b;
        if (!cqVar.mo58948c()) {
            this.f386676b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f386673c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", C142482gz.class});
            case 3:
                return new C142489hf();
            case 4:
                return new C142488he();
            case 5:
                return f386673c;
            case 6:
                C63010eb ebVar = f386674d;
                if (ebVar == null) {
                    synchronized (C142489hf.class) {
                        ebVar = f386674d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386673c);
                            f386674d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
