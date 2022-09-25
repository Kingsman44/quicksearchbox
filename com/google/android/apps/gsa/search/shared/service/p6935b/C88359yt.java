package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.yt */
/* compiled from: PG */
public final class C88359yt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88359yt f238950c;

    /* renamed from: d */
    private static volatile C63010eb f238951d;

    /* renamed from: a */
    public int f238952a;

    /* renamed from: b */
    public C87423k f238953b;

    static {
        C88359yt ytVar = new C88359yt();
        f238950c = ytVar;
        C62942bv.registerDefaultInstance(C88359yt.class, ytVar);
    }

    private C88359yt() {
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
                return newMessageInfo(f238950c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88359yt();
            case 4:
                return new C88358ys();
            case 5:
                return f238950c;
            case 6:
                C63010eb ebVar = f238951d;
                if (ebVar == null) {
                    synchronized (C88359yt.class) {
                        ebVar = f238951d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238950c);
                            f238951d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
