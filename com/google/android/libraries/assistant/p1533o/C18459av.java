package com.google.android.libraries.assistant.p1533o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.av */
/* compiled from: PG */
public final class C18459av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18459av f52376c;

    /* renamed from: d */
    private static volatile C63010eb f52377d;

    /* renamed from: a */
    public String f52378a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f52379b = C62942bv.emptyProtobufList();

    static {
        C18459av avVar = new C18459av();
        f52376c = avVar;
        C62942bv.registerDefaultInstance(C18459av.class, avVar);
    }

    private C18459av() {
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
                return newMessageInfo(f52376c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C18459av();
            case 4:
                return new C18458au();
            case 5:
                return f52376c;
            case 6:
                C63010eb ebVar = f52377d;
                if (ebVar == null) {
                    synchronized (C18459av.class) {
                        ebVar = f52377d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52376c);
                            f52377d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
