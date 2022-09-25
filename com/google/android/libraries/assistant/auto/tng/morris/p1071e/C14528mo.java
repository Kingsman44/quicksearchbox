package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.mo */
/* compiled from: PG */
public final class C14528mo extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14528mo f43909f;

    /* renamed from: g */
    private static volatile C63010eb f43910g;

    /* renamed from: a */
    public String f43911a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f43912b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f43913c;

    /* renamed from: d */
    public C63042fg f43914d;

    /* renamed from: e */
    public C14361gj f43915e;

    static {
        C14528mo moVar = new C14528mo();
        f43909f = moVar;
        C62942bv.registerDefaultInstance(C14528mo.class, moVar);
    }

    private C14528mo() {
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
                return newMessageInfo(f43909f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\t\u0005\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C14528mo();
            case 4:
                return new C14526mm();
            case 5:
                return f43909f;
            case 6:
                C63010eb ebVar = f43910g;
                if (ebVar == null) {
                    synchronized (C14528mo.class) {
                        ebVar = f43910g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43909f);
                            f43910g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
