package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.v */
/* compiled from: PG */
public final class C129688v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129688v f355911c;

    /* renamed from: d */
    private static volatile C63010eb f355912d;

    /* renamed from: a */
    public int f355913a;

    /* renamed from: b */
    public int f355914b;

    static {
        C129688v vVar = new C129688v();
        f355911c = vVar;
        C62942bv.registerDefaultInstance(C129688v.class, vVar);
    }

    private C129688v() {
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
                return newMessageInfo(f355911c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C129687u.m211746b()});
            case 3:
                return new C129688v();
            case 4:
                return new C129685s();
            case 5:
                return f355911c;
            case 6:
                C63010eb ebVar = f355912d;
                if (ebVar == null) {
                    synchronized (C129688v.class) {
                        ebVar = f355912d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355911c);
                            f355912d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
