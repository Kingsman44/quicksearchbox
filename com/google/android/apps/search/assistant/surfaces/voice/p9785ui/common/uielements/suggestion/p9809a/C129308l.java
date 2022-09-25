package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51991gq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.a.l */
/* compiled from: PG */
public final class C129308l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C129308l f355150g;

    /* renamed from: h */
    private static volatile C63010eb f355151h;

    /* renamed from: a */
    public int f355152a;

    /* renamed from: b */
    public String f355153b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f355154c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f355155d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C129306j f355156e;

    /* renamed from: f */
    public C51991gq f355157f;

    static {
        C129308l lVar = new C129308l();
        f355150g = lVar;
        C62942bv.registerDefaultInstance(C129308l.class, lVar);
    }

    private C129308l() {
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
                return newMessageInfo(f355150g, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004ဉ\u0000\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "d"});
            case 3:
                return new C129308l();
            case 4:
                return new C129307k();
            case 5:
                return f355150g;
            case 6:
                C63010eb ebVar = f355151h;
                if (ebVar == null) {
                    synchronized (C129308l.class) {
                        ebVar = f355151h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355150g);
                            f355151h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
