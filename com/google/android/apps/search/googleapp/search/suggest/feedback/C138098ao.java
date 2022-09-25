package com.google.android.apps.search.googleapp.search.suggest.feedback;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.ao */
/* compiled from: PG */
public final class C138098ao extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C138098ao f375725f;

    /* renamed from: h */
    private static volatile C63010eb f375726h;

    /* renamed from: a */
    public int f375727a;

    /* renamed from: b */
    public C62995dn f375728b = C62995dn.f170057a;

    /* renamed from: c */
    public String f375729c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C138030av f375730d;

    /* renamed from: e */
    public String f375731e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f375732g = 2;

    static {
        C138098ao aoVar = new C138098ao();
        f375725f = aoVar;
        C62942bv.registerDefaultInstance(C138098ao.class, aoVar);
    }

    private C138098ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f375732g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f375732g = b;
                return null;
            case 2:
                return newMessageInfo(f375725f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0001\u00012\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C138097an.f375724a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C138098ao();
            case 4:
                return new C138096am();
            case 5:
                return f375725f;
            case 6:
                C63010eb ebVar = f375726h;
                if (ebVar == null) {
                    synchronized (C138098ao.class) {
                        ebVar = f375726h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375725f);
                            f375726h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
