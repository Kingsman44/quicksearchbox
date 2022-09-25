package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.li */
/* compiled from: PG */
public final class C50121li extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50121li f130300e;

    /* renamed from: f */
    private static volatile C63010eb f130301f;

    /* renamed from: a */
    public int f130302a;

    /* renamed from: b */
    public String f130303b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C50094ki f130304c;

    /* renamed from: d */
    public C50119lg f130305d;

    static {
        C50121li liVar = new C50121li();
        f130300e = liVar;
        C62942bv.registerDefaultInstance(C50121li.class, liVar);
    }

    private C50121li() {
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
                return newMessageInfo(f130300e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50121li();
            case 4:
                return new C50120lh();
            case 5:
                return f130300e;
            case 6:
                C63010eb ebVar = f130301f;
                if (ebVar == null) {
                    synchronized (C50121li.class) {
                        ebVar = f130301f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130300e);
                            f130301f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
