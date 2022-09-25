package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.a.n */
/* compiled from: PG */
public final class C129310n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C129310n f355158b;

    /* renamed from: d */
    private static volatile C63010eb f355159d;

    /* renamed from: a */
    public C62971cq f355160a = emptyProtobufList();

    /* renamed from: c */
    private byte f355161c = 2;

    static {
        C129310n nVar = new C129310n();
        f355158b = nVar;
        C62942bv.registerDefaultInstance(C129310n.class, nVar);
    }

    private C129310n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f355161c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f355161c = b;
                return null;
            case 2:
                return newMessageInfo(f355158b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C129304h.class});
            case 3:
                return new C129310n();
            case 4:
                return new C129309m();
            case 5:
                return f355158b;
            case 6:
                C63010eb ebVar = f355159d;
                if (ebVar == null) {
                    synchronized (C129310n.class) {
                        ebVar = f355159d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355158b);
                            f355159d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
