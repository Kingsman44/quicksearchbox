package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.bd */
/* compiled from: PG */
public final class C121782bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121782bd f337952c;

    /* renamed from: d */
    private static volatile C63010eb f337953d;

    /* renamed from: a */
    public int f337954a;

    /* renamed from: b */
    public String f337955b = BuildConfig.FLAVOR;

    static {
        C121782bd bdVar = new C121782bd();
        f337952c = bdVar;
        C62942bv.registerDefaultInstance(C121782bd.class, bdVar);
    }

    private C121782bd() {
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
                return newMessageInfo(f337952c, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ለ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C121782bd();
            case 4:
                return new C121781bc();
            case 5:
                return f337952c;
            case 6:
                C63010eb ebVar = f337953d;
                if (ebVar == null) {
                    synchronized (C121782bd.class) {
                        ebVar = f337953d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337952c);
                            f337953d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
