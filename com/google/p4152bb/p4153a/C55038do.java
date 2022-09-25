package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.do */
/* compiled from: PG */
public final class C55038do extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55038do f144799f;

    /* renamed from: g */
    private static volatile C63010eb f144800g;

    /* renamed from: a */
    public int f144801a;

    /* renamed from: b */
    public String f144802b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f144803c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f144804d;

    /* renamed from: e */
    public int f144805e;

    static {
        C55038do doVar = new C55038do();
        f144799f = doVar;
        C62942bv.registerDefaultInstance(C55038do.class, doVar);
    }

    private C55038do() {
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
                return newMessageInfo(f144799f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55038do();
            case 4:
                return new C55037dn();
            case 5:
                return f144799f;
            case 6:
                C63010eb ebVar = f144800g;
                if (ebVar == null) {
                    synchronized (C55038do.class) {
                        ebVar = f144800g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144799f);
                            f144800g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
