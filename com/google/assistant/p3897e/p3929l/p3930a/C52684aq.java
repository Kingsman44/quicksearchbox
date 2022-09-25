package com.google.assistant.p3897e.p3929l.p3930a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.aq */
/* compiled from: PG */
public final class C52684aq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52684aq f138284b;

    /* renamed from: g */
    private static volatile C63010eb f138285g;

    /* renamed from: a */
    public String f138286a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f138287c;

    /* renamed from: d */
    private C62995dn f138288d = C62995dn.f170057a;

    /* renamed from: e */
    private C52783k f138289e;

    /* renamed from: f */
    private C62995dn f138290f = C62995dn.f170057a;

    static {
        C52684aq aqVar = new C52684aq();
        f138284b = aqVar;
        C62942bv.registerDefaultInstance(C52684aq.class, aqVar);
    }

    private C52684aq() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f138284b, "\u0001\u0004\u0000\u0001\u0001\u0015\u0004\u0002\u0000\u0000\u0001ဈ\u0000\u000e2\u0012ဉ\u0010\u00152", new Object[]{C45240c.f118157a, "a", "d", C52683ap.f138283a, "e", C10662f.f35572a, C52680am.f138280a});
            case 3:
                return new C52684aq();
            case 4:
                return new C52677aj();
            case 5:
                return f138284b;
            case 6:
                C63010eb ebVar = f138285g;
                if (ebVar == null) {
                    synchronized (C52684aq.class) {
                        ebVar = f138285g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138284b);
                            f138285g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
