package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.et */
/* compiled from: PG */
public final class C14317et extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14317et f43301d;

    /* renamed from: e */
    private static volatile C63010eb f43302e;

    /* renamed from: a */
    public String f43303a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f43304b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f43305c;

    static {
        C14317et etVar = new C14317et();
        f43301d = etVar;
        C62942bv.registerDefaultInstance(C14317et.class, etVar);
    }

    private C14317et() {
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
                return newMessageInfo(f43301d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14317et();
            case 4:
                return new C14316es();
            case 5:
                return f43301d;
            case 6:
                C63010eb ebVar = f43302e;
                if (ebVar == null) {
                    synchronized (C14317et.class) {
                        ebVar = f43302e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43301d);
                            f43302e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
