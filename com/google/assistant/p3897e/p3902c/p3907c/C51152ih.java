package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ih */
/* compiled from: PG */
public final class C51152ih extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51152ih f133149f;

    /* renamed from: g */
    private static volatile C63010eb f133150g;

    /* renamed from: a */
    public int f133151a;

    /* renamed from: b */
    public int f133152b;

    /* renamed from: c */
    public C52460so f133153c;

    /* renamed from: d */
    public C52460so f133154d;

    /* renamed from: e */
    public String f133155e = BuildConfig.FLAVOR;

    static {
        C51152ih ihVar = new C51152ih();
        f133149f = ihVar;
        C62942bv.registerDefaultInstance(C51152ih.class, ihVar);
    }

    private C51152ih() {
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
                return newMessageInfo(f133149f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C51150if.f133148a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C51152ih();
            case 4:
                return new C51149ie();
            case 5:
                return f133149f;
            case 6:
                C63010eb ebVar = f133150g;
                if (ebVar == null) {
                    synchronized (C51152ih.class) {
                        ebVar = f133150g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133149f);
                            f133150g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
