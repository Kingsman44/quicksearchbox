package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.dg */
/* compiled from: PG */
public final class C49903dg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49903dg f129712g;

    /* renamed from: h */
    private static volatile C63010eb f129713h;

    /* renamed from: a */
    public int f129714a;

    /* renamed from: b */
    public String f129715b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f129716c = 1;

    /* renamed from: d */
    public int f129717d = 1;

    /* renamed from: e */
    public C49901de f129718e;

    /* renamed from: f */
    public C49891cv f129719f;

    static {
        C49903dg dgVar = new C49903dg();
        f129712g = dgVar;
        C62942bv.registerDefaultInstance(C49903dg.class, dgVar);
    }

    private C49903dg() {
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
                return newMessageInfo(f129712g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0005\u0003ဌ\u0001\u0004ဌ\u0003\tဉ\u0004", new Object[]{"a", "b", C10662f.f35572a, C45240c.f118157a, C49875cf.m85756b(), "d", C49899dc.f129707a, "e"});
            case 3:
                return new C49903dg();
            case 4:
                return new C49902df();
            case 5:
                return f129712g;
            case 6:
                C63010eb ebVar = f129713h;
                if (ebVar == null) {
                    synchronized (C49903dg.class) {
                        ebVar = f129713h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129712g);
                            f129713h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
