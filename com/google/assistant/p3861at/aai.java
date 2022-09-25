package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aai */
/* compiled from: PG */
public final class aai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aai f128698d;

    /* renamed from: e */
    private static volatile C63010eb f128699e;

    /* renamed from: a */
    public int f128700a;

    /* renamed from: b */
    public String f128701b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f128702c = BuildConfig.FLAVOR;

    static {
        aai aai = new aai();
        f128698d = aai;
        C62942bv.registerDefaultInstance(aai.class, aai);
    }

    private aai() {
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
                return newMessageInfo(f128698d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aai();
            case 4:
                return new aah();
            case 5:
                return f128698d;
            case 6:
                C63010eb ebVar = f128699e;
                if (ebVar == null) {
                    synchronized (aai.class) {
                        ebVar = f128699e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128698d);
                            f128699e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
