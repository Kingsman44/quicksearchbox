package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.wc */
/* compiled from: PG */
public final class C52556wc extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52556wc f137935f;

    /* renamed from: g */
    private static volatile C63010eb f137936g;

    /* renamed from: a */
    public String f137937a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f137938b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52535vi f137939c;

    /* renamed from: d */
    public String f137940d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f137941e;

    static {
        C52556wc wcVar = new C52556wc();
        f137935f = wcVar;
        C62942bv.registerDefaultInstance(C52556wc.class, wcVar);
    }

    private C52556wc() {
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
                return newMessageInfo(f137935f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004Ȉ\u0005\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C52556wc();
            case 4:
                return new C52555wb();
            case 5:
                return f137935f;
            case 6:
                C63010eb ebVar = f137936g;
                if (ebVar == null) {
                    synchronized (C52556wc.class) {
                        ebVar = f137936g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137935f);
                            f137936g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
