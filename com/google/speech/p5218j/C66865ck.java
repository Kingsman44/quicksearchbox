package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ck */
/* compiled from: PG */
public final class C66865ck extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C66865ck f181787h;

    /* renamed from: i */
    private static volatile C63010eb f181788i;

    /* renamed from: a */
    public int f181789a;

    /* renamed from: b */
    public int f181790b = 0;

    /* renamed from: c */
    public Object f181791c;

    /* renamed from: d */
    public int f181792d;

    /* renamed from: e */
    public String f181793e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f181794f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f181795g = BuildConfig.FLAVOR;

    static {
        C66865ck ckVar = new C66865ck();
        f181787h = ckVar;
        C62942bv.registerDefaultInstance(C66865ck.class, ckVar);
    }

    private C66865ck() {
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
                return newMessageInfo(f181787h, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\bျ\u0000\tဿ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C66863ci.f181786a, "e", C10662f.f35572a, C30325g.f82003a, C66948fk.m97390b()});
            case 3:
                return new C66865ck();
            case 4:
                return new C66862ch();
            case 5:
                return f181787h;
            case 6:
                C63010eb ebVar = f181788i;
                if (ebVar == null) {
                    synchronized (C66865ck.class) {
                        ebVar = f181788i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181787h);
                            f181788i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
