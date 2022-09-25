package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.nd */
/* compiled from: PG */
public final class C51585nd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51585nd f134442c;

    /* renamed from: d */
    private static volatile C63010eb f134443d;

    /* renamed from: a */
    public String f134444a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f134445b = C62942bv.emptyProtobufList();

    static {
        C51585nd ndVar = new C51585nd();
        f134442c = ndVar;
        C62942bv.registerDefaultInstance(C51585nd.class, ndVar);
    }

    private C51585nd() {
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
                return newMessageInfo(f134442c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C51585nd();
            case 4:
                return new C51584nc();
            case 5:
                return f134442c;
            case 6:
                C63010eb ebVar = f134443d;
                if (ebVar == null) {
                    synchronized (C51585nd.class) {
                        ebVar = f134443d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134442c);
                            f134443d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
