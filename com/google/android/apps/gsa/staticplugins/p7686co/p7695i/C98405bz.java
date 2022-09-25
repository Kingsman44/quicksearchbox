package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.bz */
/* compiled from: PG */
public final class C98405bz extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C98405bz f274704h;

    /* renamed from: i */
    private static volatile C63010eb f274705i;

    /* renamed from: a */
    public int f274706a;

    /* renamed from: b */
    public int f274707b;

    /* renamed from: c */
    public String f274708c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f274709d;

    /* renamed from: e */
    public C62961ch f274710e = emptyIntList();

    /* renamed from: f */
    public C62961ch f274711f = emptyIntList();

    /* renamed from: g */
    public C98418cl f274712g;

    static {
        C98405bz bzVar = new C98405bz();
        f274704h = bzVar;
        C62942bv.registerDefaultInstance(C98405bz.class, bzVar);
    }

    private C98405bz() {
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
                return newMessageInfo(f274704h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004\u0016\u0005\u0016\u0006ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C98413cg.m162978b(), "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C98405bz();
            case 4:
                return new C98404by();
            case 5:
                return f274704h;
            case 6:
                C63010eb ebVar = f274705i;
                if (ebVar == null) {
                    synchronized (C98405bz.class) {
                        ebVar = f274705i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274704h);
                            f274705i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
