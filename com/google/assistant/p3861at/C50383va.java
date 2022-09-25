package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.va */
/* compiled from: PG */
public final class C50383va extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50383va f131148c;

    /* renamed from: d */
    private static volatile C63010eb f131149d;

    /* renamed from: a */
    public int f131150a;

    /* renamed from: b */
    public String f131151b = BuildConfig.FLAVOR;

    static {
        C50383va vaVar = new C50383va();
        f131148c = vaVar;
        C62942bv.registerDefaultInstance(C50383va.class, vaVar);
    }

    private C50383va() {
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
                return newMessageInfo(f131148c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C50383va();
            case 4:
                return new C50381uz();
            case 5:
                return f131148c;
            case 6:
                C63010eb ebVar = f131149d;
                if (ebVar == null) {
                    synchronized (C50383va.class) {
                        ebVar = f131149d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131148c);
                            f131149d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
