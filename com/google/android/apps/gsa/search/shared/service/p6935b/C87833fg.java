package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.fg */
/* compiled from: PG */
public final class C87833fg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87833fg f237645c;

    /* renamed from: d */
    private static volatile C63010eb f237646d;

    /* renamed from: a */
    public int f237647a;

    /* renamed from: b */
    public String f237648b = BuildConfig.FLAVOR;

    static {
        C87833fg fgVar = new C87833fg();
        f237645c = fgVar;
        C62942bv.registerDefaultInstance(C87833fg.class, fgVar);
    }

    private C87833fg() {
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
                return newMessageInfo(f237645c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87833fg();
            case 4:
                return new C87832ff();
            case 5:
                return f237645c;
            case 6:
                C63010eb ebVar = f237646d;
                if (ebVar == null) {
                    synchronized (C87833fg.class) {
                        ebVar = f237646d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237645c);
                            f237646d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
