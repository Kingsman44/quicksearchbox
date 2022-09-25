package com.google.assistant.p3745ab;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.z */
/* compiled from: PG */
public final class C48436z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48436z f125157b;

    /* renamed from: c */
    private static volatile C63010eb f125158c;

    /* renamed from: a */
    public String f125159a = BuildConfig.FLAVOR;

    static {
        C48436z zVar = new C48436z();
        f125157b = zVar;
        C62942bv.registerDefaultInstance(C48436z.class, zVar);
    }

    private C48436z() {
        emptyProtobufList();
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
                return newMessageInfo(f125157b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C48436z();
            case 4:
                return new C48433y();
            case 5:
                return f125157b;
            case 6:
                C63010eb ebVar = f125158c;
                if (ebVar == null) {
                    synchronized (C48436z.class) {
                        ebVar = f125158c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125157b);
                            f125158c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
