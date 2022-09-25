package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.du */
/* compiled from: PG */
public final class C119880du extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C119880du f333857f;

    /* renamed from: g */
    private static volatile C63010eb f333858g;

    /* renamed from: a */
    public int f333859a;

    /* renamed from: b */
    public String f333860b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f333861c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public boolean f333862d;

    /* renamed from: e */
    public boolean f333863e;

    static {
        C119880du duVar = new C119880du();
        f333857f = duVar;
        C62942bv.registerDefaultInstance(C119880du.class, duVar);
    }

    private C119880du() {
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
                return newMessageInfo(f333857f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C119880du();
            case 4:
                return new C119879dt();
            case 5:
                return f333857f;
            case 6:
                C63010eb ebVar = f333858g;
                if (ebVar == null) {
                    synchronized (C119880du.class) {
                        ebVar = f333858g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333857f);
                            f333858g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
