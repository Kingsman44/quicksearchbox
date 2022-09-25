package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ek */
/* compiled from: PG */
public final class C52078ek extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52078ek f136671f;

    /* renamed from: g */
    private static volatile C63010eb f136672g;

    /* renamed from: a */
    public int f136673a;

    /* renamed from: b */
    public int f136674b = 0;

    /* renamed from: c */
    public Object f136675c;

    /* renamed from: d */
    public String f136676d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C52089ev f136677e;

    static {
        C52078ek ekVar = new C52078ek();
        f136671f = ekVar;
        C62942bv.registerDefaultInstance(C52078ek.class, ekVar);
    }

    private C52078ek() {
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
                return newMessageInfo(f136671f, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0007ဈ\u0001\bဉ\u0002", new Object[]{C45240c.f118157a, "b", "a", C52238ki.class, C52070ec.class, C52273lq.class, C51805du.class, "d", "e"});
            case 3:
                return new C52078ek();
            case 4:
                return new C52077ej();
            case 5:
                return f136671f;
            case 6:
                C63010eb ebVar = f136672g;
                if (ebVar == null) {
                    synchronized (C52078ek.class) {
                        ebVar = f136672g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136671f);
                            f136672g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
