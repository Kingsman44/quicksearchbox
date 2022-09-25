package com.google.assistant.p3931f.p3940d.p3941a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.assistant.p3931f.p3939c.C52815ae;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.an */
/* compiled from: PG */
public final class C52864an extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52864an f138696g;

    /* renamed from: h */
    private static volatile C63010eb f138697h;

    /* renamed from: a */
    public C52813ac f138698a;

    /* renamed from: b */
    public C52829f f138699b;

    /* renamed from: c */
    public C52883bf f138700c;

    /* renamed from: d */
    public String f138701d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C52873aw f138702e;

    /* renamed from: f */
    public C52815ae f138703f;

    static {
        C52864an anVar = new C52864an();
        f138696g = anVar;
        C62942bv.registerDefaultInstance(C52864an.class, anVar);
    }

    private C52864an() {
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
                return newMessageInfo(f138696g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004Ȉ\u0006\t\u0007\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C52864an();
            case 4:
                return new C52863am();
            case 5:
                return f138696g;
            case 6:
                C63010eb ebVar = f138697h;
                if (ebVar == null) {
                    synchronized (C52864an.class) {
                        ebVar = f138697h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138696g);
                            f138697h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
