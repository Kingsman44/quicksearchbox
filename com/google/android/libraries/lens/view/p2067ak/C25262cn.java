package com.google.android.libraries.lens.view.p2067ak;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.cn */
/* compiled from: PG */
public final class C25262cn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C25262cn f68725d;

    /* renamed from: e */
    private static volatile C63010eb f68726e;

    /* renamed from: a */
    public String f68727a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f68728b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f68729c = emptyProtobufList();

    static {
        C25262cn cnVar = new C25262cn();
        f68725d = cnVar;
        C62942bv.registerDefaultInstance(C25262cn.class, cnVar);
    }

    private C25262cn() {
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
                return newMessageInfo(f68725d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"a", C45240c.f118157a, C25261cm.class, "b"});
            case 3:
                return new C25262cn();
            case 4:
                return new C25259ck();
            case 5:
                return f68725d;
            case 6:
                C63010eb ebVar = f68726e;
                if (ebVar == null) {
                    synchronized (C25262cn.class) {
                        ebVar = f68726e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68725d);
                            f68726e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
