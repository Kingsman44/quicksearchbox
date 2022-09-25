package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.adr */
/* compiled from: PG */
public final class adr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final adr f129068b;

    /* renamed from: d */
    private static volatile C63010eb f129069d;

    /* renamed from: a */
    public String f129070a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f129071c;

    static {
        adr adr = new adr();
        f129068b = adr;
        C62942bv.registerDefaultInstance(adr.class, adr);
    }

    private adr() {
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
                return newMessageInfo(f129068b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new adr();
            case 4:
                return new adq();
            case 5:
                return f129068b;
            case 6:
                C63010eb ebVar = f129069d;
                if (ebVar == null) {
                    synchronized (adr.class) {
                        ebVar = f129069d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129068b);
                            f129069d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
