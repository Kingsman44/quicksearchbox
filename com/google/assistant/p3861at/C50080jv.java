package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jv */
/* compiled from: PG */
public final class C50080jv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50080jv f130199c;

    /* renamed from: d */
    private static volatile C63010eb f130200d;

    /* renamed from: a */
    public int f130201a;

    /* renamed from: b */
    public String f130202b = BuildConfig.FLAVOR;

    static {
        C50080jv jvVar = new C50080jv();
        f130199c = jvVar;
        C62942bv.registerDefaultInstance(C50080jv.class, jvVar);
    }

    private C50080jv() {
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
                return newMessageInfo(f130199c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50080jv();
            case 4:
                return new C50079ju();
            case 5:
                return f130199c;
            case 6:
                C63010eb ebVar = f130200d;
                if (ebVar == null) {
                    synchronized (C50080jv.class) {
                        ebVar = f130200d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130199c);
                            f130200d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
