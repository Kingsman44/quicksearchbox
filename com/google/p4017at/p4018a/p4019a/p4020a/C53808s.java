package com.google.p4017at.p4018a.p4019a.p4020a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.s */
/* compiled from: PG */
public final class C53808s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53808s f141225c;

    /* renamed from: d */
    private static volatile C63010eb f141226d;

    /* renamed from: a */
    public int f141227a;

    /* renamed from: b */
    public String f141228b = BuildConfig.FLAVOR;

    static {
        C53808s sVar = new C53808s();
        f141225c = sVar;
        C62942bv.registerDefaultInstance(C53808s.class, sVar);
    }

    private C53808s() {
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
                return newMessageInfo(f141225c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53808s();
            case 4:
                return new C53807r();
            case 5:
                return f141225c;
            case 6:
                C63010eb ebVar = f141226d;
                if (ebVar == null) {
                    synchronized (C53808s.class) {
                        ebVar = f141226d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141225c);
                            f141226d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
