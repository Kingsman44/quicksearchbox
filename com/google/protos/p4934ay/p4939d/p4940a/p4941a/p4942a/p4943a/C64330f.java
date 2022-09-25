package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.f */
/* compiled from: PG */
public final class C64330f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64330f f173915f;

    /* renamed from: h */
    private static volatile C63010eb f173916h;

    /* renamed from: a */
    public int f173917a;

    /* renamed from: b */
    public String f173918b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C64283ab f173919c;

    /* renamed from: d */
    public C64300as f173920d;

    /* renamed from: e */
    public C64306ay f173921e;

    /* renamed from: g */
    private C64332h f173922g;

    static {
        C64330f fVar = new C64330f();
        f173915f = fVar;
        C62942bv.registerDefaultInstance(C64330f.class, fVar);
    }

    private C64330f() {
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
                return newMessageInfo(f173915f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0002\u0006ဉ\u0006", new Object[]{"a", "b", "d", C30325g.f82003a, C45240c.f118157a, "e"});
            case 3:
                return new C64330f();
            case 4:
                return new C64329e();
            case 5:
                return f173915f;
            case 6:
                C63010eb ebVar = f173916h;
                if (ebVar == null) {
                    synchronized (C64330f.class) {
                        ebVar = f173916h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173915f);
                            f173916h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
