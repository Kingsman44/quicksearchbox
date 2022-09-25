package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aet */
/* compiled from: PG */
public final class aet extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aet f129130d;

    /* renamed from: e */
    private static volatile C63010eb f129131e;

    /* renamed from: a */
    public int f129132a;

    /* renamed from: b */
    public String f129133b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public acz f129134c;

    static {
        aet aet = new aet();
        f129130d = aet;
        C62942bv.registerDefaultInstance(aet.class, aet);
    }

    private aet() {
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
                return newMessageInfo(f129130d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aet();
            case 4:
                return new aes();
            case 5:
                return f129130d;
            case 6:
                C63010eb ebVar = f129131e;
                if (ebVar == null) {
                    synchronized (aet.class) {
                        ebVar = f129131e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129130d);
                            f129131e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
