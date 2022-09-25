package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.du */
/* compiled from: PG */
public final class C125147du extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125147du f345228b;

    /* renamed from: c */
    private static volatile C63010eb f345229c;

    /* renamed from: a */
    public C62971cq f345230a = C62942bv.emptyProtobufList();

    static {
        C125147du duVar = new C125147du();
        f345228b = duVar;
        C62942bv.registerDefaultInstance(C125147du.class, duVar);
    }

    private C125147du() {
    }

    /* renamed from: a */
    public final void mo106809a() {
        C62971cq cqVar = this.f345230a;
        if (!cqVar.mo58948c()) {
            this.f345230a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f345228b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C125147du();
            case 4:
                return new C125146dt();
            case 5:
                return f345228b;
            case 6:
                C63010eb ebVar = f345229c;
                if (ebVar == null) {
                    synchronized (C125147du.class) {
                        ebVar = f345229c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345228b);
                            f345229c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
