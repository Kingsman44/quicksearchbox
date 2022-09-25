package com.google.assistant.p3897e.p3929l.p3930a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.ca */
/* compiled from: PG */
public final class C52722ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52722ca f138382c;

    /* renamed from: f */
    private static volatile C63010eb f138383f;

    /* renamed from: a */
    public boolean f138384a;

    /* renamed from: b */
    public String f138385b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f138386d;

    /* renamed from: e */
    private C62995dn f138387e = C62995dn.f170057a;

    static {
        C52722ca caVar = new C52722ca();
        f138382c = caVar;
        C62942bv.registerDefaultInstance(C52722ca.class, caVar);
    }

    private C52722ca() {
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
                return newMessageInfo(f138382c, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0001\u0000\u0000\u0001ဇ\u0000\u0006ဈ\u0006\u00072", new Object[]{"d", "a", "b", "e", C52720bz.f138381a});
            case 3:
                return new C52722ca();
            case 4:
                return new C52717bw();
            case 5:
                return f138382c;
            case 6:
                C63010eb ebVar = f138383f;
                if (ebVar == null) {
                    synchronized (C52722ca.class) {
                        ebVar = f138383f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138382c);
                            f138383f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
