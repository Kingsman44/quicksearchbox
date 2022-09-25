package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qf */
/* compiled from: PG */
public final class C50253qf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50253qf f130682c;

    /* renamed from: e */
    private static volatile C63010eb f130683e;

    /* renamed from: a */
    public String f130684a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f130685b = emptyProtobufList();

    /* renamed from: d */
    private int f130686d;

    static {
        C50253qf qfVar = new C50253qf();
        f130682c = qfVar;
        C62942bv.registerDefaultInstance(C50253qf.class, qfVar);
    }

    private C50253qf() {
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
                return newMessageInfo(f130682c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C50264qq.class});
            case 3:
                return new C50253qf();
            case 4:
                return new C50252qe();
            case 5:
                return f130682c;
            case 6:
                C63010eb ebVar = f130683e;
                if (ebVar == null) {
                    synchronized (C50253qf.class) {
                        ebVar = f130683e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130682c);
                            f130683e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
