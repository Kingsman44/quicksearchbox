package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.mv */
/* compiled from: PG */
public final class C51576mv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51576mv f134424c;

    /* renamed from: d */
    private static volatile C63010eb f134425d;

    /* renamed from: a */
    public String f134426a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C51575mu f134427b;

    static {
        C51576mv mvVar = new C51576mv();
        f134424c = mvVar;
        C62942bv.registerDefaultInstance(C51576mv.class, mvVar);
    }

    private C51576mv() {
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
                return newMessageInfo(f134424c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C51576mv();
            case 4:
                return new C51571mq();
            case 5:
                return f134424c;
            case 6:
                C63010eb ebVar = f134425d;
                if (ebVar == null) {
                    synchronized (C51576mv.class) {
                        ebVar = f134425d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134424c);
                            f134425d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
