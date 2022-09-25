package com.google.android.apps.search.assistant.platform.p9080f.p9123l;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67050je;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.h */
/* compiled from: PG */
public final class C120815h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C120815h f335972f;

    /* renamed from: g */
    private static volatile C63010eb f335973g;

    /* renamed from: a */
    public int f335974a;

    /* renamed from: b */
    public String f335975b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f335976c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C67050je f335977d;

    /* renamed from: e */
    public boolean f335978e;

    static {
        C120815h hVar = new C120815h();
        f335972f = hVar;
        C62942bv.registerDefaultInstance(C120815h.class, hVar);
    }

    private C120815h() {
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
                return newMessageInfo(f335972f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ț\u0004ဇ\u0001", new Object[]{"a", "b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C120815h();
            case 4:
                return new C120814g();
            case 5:
                return f335972f;
            case 6:
                C63010eb ebVar = f335973g;
                if (ebVar == null) {
                    synchronized (C120815h.class) {
                        ebVar = f335973g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f335972f);
                            f335973g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
