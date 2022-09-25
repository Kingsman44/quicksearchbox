package com.google.android.apps.gsa.nga.engine.grammar;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.p */
/* compiled from: PG */
public final class C76138p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76138p f211096c;

    /* renamed from: e */
    private static volatile C63010eb f211097e;

    /* renamed from: a */
    public String f211098a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f211099b = emptyProtobufList();

    /* renamed from: d */
    private byte f211100d = 2;

    static {
        C76138p pVar = new C76138p();
        f211096c = pVar;
        C62942bv.registerDefaultInstance(C76138p.class, pVar);
    }

    private C76138p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f211100d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f211100d = b;
                return null;
            case 2:
                return newMessageInfo(f211096c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Ȉ\u0002Л", new Object[]{"a", "b", C76137o.class});
            case 3:
                return new C76138p();
            case 4:
                return new C76135m();
            case 5:
                return f211096c;
            case 6:
                C63010eb ebVar = f211097e;
                if (ebVar == null) {
                    synchronized (C76138p.class) {
                        ebVar = f211097e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211096c);
                            f211097e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
