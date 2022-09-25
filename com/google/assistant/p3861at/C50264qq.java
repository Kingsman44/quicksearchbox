package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qq */
/* compiled from: PG */
public final class C50264qq extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50264qq f130709f;

    /* renamed from: g */
    private static volatile C63010eb f130710g;

    /* renamed from: a */
    public int f130711a;

    /* renamed from: b */
    public String f130712b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130713c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130714d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C50266qs f130715e;

    static {
        C50264qq qqVar = new C50264qq();
        f130709f = qqVar;
        C62942bv.registerDefaultInstance(C50264qq.class, qqVar);
    }

    private C50264qq() {
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
                return newMessageInfo(f130709f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50264qq();
            case 4:
                return new C50263qp();
            case 5:
                return f130709f;
            case 6:
                C63010eb ebVar = f130710g;
                if (ebVar == null) {
                    synchronized (C50264qq.class) {
                        ebVar = f130710g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130709f);
                            f130710g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
