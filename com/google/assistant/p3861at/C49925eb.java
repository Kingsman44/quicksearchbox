package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.eb */
/* compiled from: PG */
public final class C49925eb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49925eb f129768c;

    /* renamed from: d */
    private static volatile C63010eb f129769d;

    /* renamed from: a */
    public int f129770a;

    /* renamed from: b */
    public String f129771b = BuildConfig.FLAVOR;

    static {
        C49925eb ebVar = new C49925eb();
        f129768c = ebVar;
        C62942bv.registerDefaultInstance(C49925eb.class, ebVar);
    }

    private C49925eb() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f129768c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49925eb();
            case 4:
                return new C49924ea();
            case 5:
                return f129768c;
            case 6:
                C63010eb ebVar = f129769d;
                if (ebVar == null) {
                    synchronized (C49925eb.class) {
                        ebVar = f129769d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129768c);
                            f129769d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
