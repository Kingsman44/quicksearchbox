package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.c */
/* compiled from: PG */
public final class C49308c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49308c f127443c;

    /* renamed from: d */
    private static volatile C63010eb f127444d;

    /* renamed from: a */
    public String f127445a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62995dn f127446b = C62995dn.f170057a;

    static {
        C49308c cVar = new C49308c();
        f127443c = cVar;
        C62942bv.registerDefaultInstance(C49308c.class, cVar);
    }

    private C49308c() {
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
                return newMessageInfo(f127443c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"a", "b", C49281b.f127377a});
            case 3:
                return new C49308c();
            case 4:
                return new C49254a();
            case 5:
                return f127443c;
            case 6:
                C63010eb ebVar = f127444d;
                if (ebVar == null) {
                    synchronized (C49308c.class) {
                        ebVar = f127444d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127443c);
                            f127444d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
