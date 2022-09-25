package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.apm */
/* compiled from: PG */
public final class apm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final apm f135560b;

    /* renamed from: c */
    private static volatile C63010eb f135561c;

    /* renamed from: a */
    public String f135562a = BuildConfig.FLAVOR;

    static {
        apm apm = new apm();
        f135560b = apm;
        C62942bv.registerDefaultInstance(apm.class, apm);
    }

    private apm() {
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
                return newMessageInfo(f135560b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new apm();
            case 4:
                return new apl();
            case 5:
                return f135560b;
            case 6:
                C63010eb ebVar = f135561c;
                if (ebVar == null) {
                    synchronized (apm.class) {
                        ebVar = f135561c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135560b);
                            f135561c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
