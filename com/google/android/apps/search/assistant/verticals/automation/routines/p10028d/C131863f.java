package com.google.android.apps.search.assistant.verticals.automation.routines.p10028d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.d.f */
/* compiled from: PG */
public final class C131863f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C131863f f360097c;

    /* renamed from: d */
    private static volatile C63010eb f360098d;

    /* renamed from: a */
    public int f360099a;

    /* renamed from: b */
    public String f360100b = BuildConfig.FLAVOR;

    static {
        C131863f fVar = new C131863f();
        f360097c = fVar;
        C62942bv.registerDefaultInstance(C131863f.class, fVar);
    }

    private C131863f() {
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
                return newMessageInfo(f360097c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C131863f();
            case 4:
                return new C131862e();
            case 5:
                return f360097c;
            case 6:
                C63010eb ebVar = f360098d;
                if (ebVar == null) {
                    synchronized (C131863f.class) {
                        ebVar = f360098d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360097c);
                            f360098d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
