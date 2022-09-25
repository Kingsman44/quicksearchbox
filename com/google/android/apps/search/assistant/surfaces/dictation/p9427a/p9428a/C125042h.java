package com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.a.h */
/* compiled from: PG */
public final class C125042h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C125042h f344983g;

    /* renamed from: h */
    private static volatile C63010eb f344984h;

    /* renamed from: a */
    public String f344985a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f344986b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f344987c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f344988d;

    /* renamed from: e */
    public boolean f344989e;

    /* renamed from: f */
    public boolean f344990f;

    static {
        C125042h hVar = new C125042h();
        f344983g = hVar;
        C62942bv.registerDefaultInstance(C125042h.class, hVar);
    }

    private C125042h() {
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
                return newMessageInfo(f344983g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004\f\u0005\u0007\u0006\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C125042h();
            case 4:
                return new C125041g();
            case 5:
                return f344983g;
            case 6:
                C63010eb ebVar = f344984h;
                if (ebVar == null) {
                    synchronized (C125042h.class) {
                        ebVar = f344984h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344983g);
                            f344984h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
