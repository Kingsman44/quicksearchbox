package com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.hotword.unicornenrollment.a.b */
/* compiled from: PG */
public final class C92422b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C92422b f257764c;

    /* renamed from: d */
    private static volatile C63010eb f257765d;

    /* renamed from: a */
    public int f257766a;

    /* renamed from: b */
    public String f257767b = BuildConfig.FLAVOR;

    static {
        C92422b bVar = new C92422b();
        f257764c = bVar;
        C62942bv.registerDefaultInstance(C92422b.class, bVar);
    }

    private C92422b() {
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
                return newMessageInfo(f257764c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C92422b();
            case 4:
                return new C92421a();
            case 5:
                return f257764c;
            case 6:
                C63010eb ebVar = f257765d;
                if (ebVar == null) {
                    synchronized (C92422b.class) {
                        ebVar = f257765d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f257764c);
                            f257765d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
