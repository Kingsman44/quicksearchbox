package com.google.assistant.p3996t.p3997a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.t.a.h */
/* compiled from: PG */
public final class C53481h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53481h f140358b;

    /* renamed from: c */
    private static volatile C63010eb f140359c;

    /* renamed from: a */
    public String f140360a = BuildConfig.FLAVOR;

    static {
        C53481h hVar = new C53481h();
        f140358b = hVar;
        C62942bv.registerDefaultInstance(C53481h.class, hVar);
    }

    private C53481h() {
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
                return newMessageInfo(f140358b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C53481h();
            case 4:
                return new C53480g();
            case 5:
                return f140358b;
            case 6:
                C63010eb ebVar = f140359c;
                if (ebVar == null) {
                    synchronized (C53481h.class) {
                        ebVar = f140359c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140358b);
                            f140359c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
