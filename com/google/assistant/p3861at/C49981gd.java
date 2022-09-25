package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.gd */
/* compiled from: PG */
public final class C49981gd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49981gd f129922c;

    /* renamed from: e */
    private static volatile C63010eb f129923e;

    /* renamed from: a */
    public String f129924a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f129925b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f129926d;

    static {
        C49981gd gdVar = new C49981gd();
        f129922c = gdVar;
        C62942bv.registerDefaultInstance(C49981gd.class, gdVar);
    }

    private C49981gd() {
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
                return newMessageInfo(f129922c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49981gd();
            case 4:
                return new C49980gc();
            case 5:
                return f129922c;
            case 6:
                C63010eb ebVar = f129923e;
                if (ebVar == null) {
                    synchronized (C49981gd.class) {
                        ebVar = f129923e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129922c);
                            f129923e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
