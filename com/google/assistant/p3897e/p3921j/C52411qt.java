package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.qt */
/* compiled from: PG */
public final class C52411qt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52411qt f137532c;

    /* renamed from: d */
    private static volatile C63010eb f137533d;

    /* renamed from: a */
    public int f137534a;

    /* renamed from: b */
    public String f137535b = BuildConfig.FLAVOR;

    static {
        C52411qt qtVar = new C52411qt();
        f137532c = qtVar;
        C62942bv.registerDefaultInstance(C52411qt.class, qtVar);
    }

    private C52411qt() {
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
                return newMessageInfo(f137532c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52411qt();
            case 4:
                return new C52410qs();
            case 5:
                return f137532c;
            case 6:
                C63010eb ebVar = f137533d;
                if (ebVar == null) {
                    synchronized (C52411qt.class) {
                        ebVar = f137533d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137532c);
                            f137533d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
