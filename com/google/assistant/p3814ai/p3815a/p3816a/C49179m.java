package com.google.assistant.p3814ai.p3815a.p3816a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.m */
/* compiled from: PG */
public final class C49179m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49179m f127159c;

    /* renamed from: d */
    private static volatile C63010eb f127160d;

    /* renamed from: a */
    public String f127161a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f127162b = C62942bv.emptyProtobufList();

    static {
        C49179m mVar = new C49179m();
        f127159c = mVar;
        C62942bv.registerDefaultInstance(C49179m.class, mVar);
    }

    private C49179m() {
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
                return newMessageInfo(f127159c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C49179m();
            case 4:
                return new C49178l();
            case 5:
                return f127159c;
            case 6:
                C63010eb ebVar = f127160d;
                if (ebVar == null) {
                    synchronized (C49179m.class) {
                        ebVar = f127160d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127159c);
                            f127160d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
