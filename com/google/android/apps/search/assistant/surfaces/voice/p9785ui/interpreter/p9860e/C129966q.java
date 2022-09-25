package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.q */
/* compiled from: PG */
public final class C129966q extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C129966q f356466k;

    /* renamed from: l */
    private static volatile C63010eb f356467l;

    /* renamed from: a */
    public int f356468a;

    /* renamed from: b */
    public int f356469b = 0;

    /* renamed from: c */
    public Object f356470c;

    /* renamed from: d */
    public String f356471d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f356472e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f356473f;

    /* renamed from: g */
    public String f356474g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f356475h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f356476i;

    /* renamed from: j */
    public C129954e f356477j;

    static {
        C129966q qVar = new C129966q();
        f356466k = qVar;
        C62942bv.registerDefaultInstance(C129966q.class, qVar);
    }

    private C129966q() {
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
                return newMessageInfo(f356466k, "\u0000\f\u0001\u0001\u0001\u0012\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\fȈ\rȈ\u000e\f\u000fȈ\u0010Ȉ\u0011\u0004\u0012ဉ\u0000", new Object[]{C45240c.f118157a, "b", "a", C129956g.class, C129965p.class, C129958i.class, C129961l.class, C129963n.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C129966q();
            case 4:
                return new C129944c();
            case 5:
                return f356466k;
            case 6:
                C63010eb ebVar = f356467l;
                if (ebVar == null) {
                    synchronized (C129966q.class) {
                        ebVar = f356467l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356466k);
                            f356467l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
