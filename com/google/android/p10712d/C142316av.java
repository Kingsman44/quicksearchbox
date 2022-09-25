package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.av */
/* compiled from: PG */
public final class C142316av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142316av f386087c;

    /* renamed from: e */
    private static volatile C63010eb f386088e;

    /* renamed from: a */
    public String f386089a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f386090b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private int f386091d;

    static {
        C142316av avVar = new C142316av();
        f386087c = avVar;
        C62942bv.registerDefaultInstance(C142316av.class, avVar);
    }

    private C142316av() {
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
                return newMessageInfo(f386087c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            case 3:
                return new C142316av();
            case 4:
                return new C142315au();
            case 5:
                return f386087c;
            case 6:
                C63010eb ebVar = f386088e;
                if (ebVar == null) {
                    synchronized (C142316av.class) {
                        ebVar = f386088e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386087c);
                            f386088e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
