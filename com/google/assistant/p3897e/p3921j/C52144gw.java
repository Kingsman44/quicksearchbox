package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.gw */
/* compiled from: PG */
public final class C52144gw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52144gw f136821c;

    /* renamed from: e */
    private static volatile C63010eb f136822e;

    /* renamed from: a */
    public String f136823a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f136824b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f136825d;

    static {
        C52144gw gwVar = new C52144gw();
        f136821c = gwVar;
        C62942bv.registerDefaultInstance(C52144gw.class, gwVar);
    }

    private C52144gw() {
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
                return newMessageInfo(f136821c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C52144gw();
            case 4:
                return new C52143gv();
            case 5:
                return f136821c;
            case 6:
                C63010eb ebVar = f136822e;
                if (ebVar == null) {
                    synchronized (C52144gw.class) {
                        ebVar = f136822e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136821c);
                            f136822e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
