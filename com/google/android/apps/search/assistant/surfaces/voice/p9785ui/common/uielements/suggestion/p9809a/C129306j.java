package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.a.j */
/* compiled from: PG */
public final class C129306j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129306j f355146c;

    /* renamed from: d */
    private static volatile C63010eb f355147d;

    /* renamed from: a */
    public int f355148a;

    /* renamed from: b */
    public String f355149b = BuildConfig.FLAVOR;

    static {
        C129306j jVar = new C129306j();
        f355146c = jVar;
        C62942bv.registerDefaultInstance(C129306j.class, jVar);
    }

    private C129306j() {
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
                return newMessageInfo(f355146c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C129306j();
            case 4:
                return new C129305i();
            case 5:
                return f355146c;
            case 6:
                C63010eb ebVar = f355147d;
                if (ebVar == null) {
                    synchronized (C129306j.class) {
                        ebVar = f355147d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355146c);
                            f355147d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
