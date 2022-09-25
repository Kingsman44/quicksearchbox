package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.fs */
/* compiled from: PG */
public final class C49969fs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49969fs f129902c;

    /* renamed from: d */
    private static volatile C63010eb f129903d;

    /* renamed from: a */
    public int f129904a;

    /* renamed from: b */
    public String f129905b = BuildConfig.FLAVOR;

    static {
        C49969fs fsVar = new C49969fs();
        f129902c = fsVar;
        C62942bv.registerDefaultInstance(C49969fs.class, fsVar);
    }

    private C49969fs() {
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
                return newMessageInfo(f129902c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49969fs();
            case 4:
                return new C49968fr();
            case 5:
                return f129902c;
            case 6:
                C63010eb ebVar = f129903d;
                if (ebVar == null) {
                    synchronized (C49969fs.class) {
                        ebVar = f129903d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129902c);
                            f129903d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
