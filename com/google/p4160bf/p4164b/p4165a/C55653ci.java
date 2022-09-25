package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.bf.b.a.ci */
/* compiled from: PG */
public final class C55653ci extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55653ci f146845g;

    /* renamed from: h */
    private static volatile C63010eb f146846h;

    /* renamed from: a */
    public int f146847a;

    /* renamed from: b */
    public String f146848b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f146849c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f146850d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C55652ch f146851e;

    /* renamed from: f */
    public C63070h f146852f;

    static {
        C55653ci ciVar = new C55653ci();
        f146845g = ciVar;
        C62942bv.registerDefaultInstance(C55653ci.class, ciVar);
    }

    private C55653ci() {
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
                return newMessageInfo(f146845g, "\u0001\u0005\u0000\u0001\u0001\u001e\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0005\u0004ဈ\u0003\u0005ဈ\u0002\u001eဉ\u0006", new Object[]{"a", "b", "e", "d", C45240c.f118157a, C10662f.f35572a});
            case 3:
                return new C55653ci();
            case 4:
                return new C55641bx();
            case 5:
                return f146845g;
            case 6:
                C63010eb ebVar = f146846h;
                if (ebVar == null) {
                    synchronized (C55653ci.class) {
                        ebVar = f146846h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146845g);
                            f146846h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
