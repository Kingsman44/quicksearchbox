package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.ca */
/* compiled from: PG */
public final class C54020ca extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54020ca f141734f;

    /* renamed from: g */
    private static volatile C63010eb f141735g;

    /* renamed from: a */
    public C58079k f141736a;

    /* renamed from: b */
    public float f141737b;

    /* renamed from: c */
    public C62910ar f141738c;

    /* renamed from: d */
    public String f141739d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f141740e;

    static {
        C54020ca caVar = new C54020ca();
        f141734f = caVar;
        C62942bv.registerDefaultInstance(C54020ca.class, caVar);
    }

    private C54020ca() {
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
                return newMessageInfo(f141734f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\t\u0002\u0001\u0005\t\u0006Ȉ\u0007\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54020ca();
            case 4:
                return new C54018bz();
            case 5:
                return f141734f;
            case 6:
                C63010eb ebVar = f141735g;
                if (ebVar == null) {
                    synchronized (C54020ca.class) {
                        ebVar = f141735g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141734f);
                            f141735g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
