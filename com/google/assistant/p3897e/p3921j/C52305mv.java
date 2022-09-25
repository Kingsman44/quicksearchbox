package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.mv */
/* compiled from: PG */
public final class C52305mv extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52305mv f137299h;

    /* renamed from: i */
    private static volatile C63010eb f137300i;

    /* renamed from: a */
    public int f137301a;

    /* renamed from: b */
    public int f137302b;

    /* renamed from: c */
    public long f137303c;

    /* renamed from: d */
    public int f137304d;

    /* renamed from: e */
    public boolean f137305e;

    /* renamed from: f */
    public String f137306f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C51098gh f137307g;

    static {
        C52305mv mvVar = new C52305mv();
        f137299h = mvVar;
        C62942bv.registerDefaultInstance(C52305mv.class, mvVar);
    }

    private C52305mv() {
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
                return newMessageInfo(f137299h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဂ\u0001\u0004ဌ\u0002\u0005ဇ\u0003\u0006ဈ\u0004\bဉ\u0006", new Object[]{"a", "b", C52298mo.f137290a, C45240c.f118157a, "d", C52303mt.f137298a, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C52305mv();
            case 4:
                return new C52302ms();
            case 5:
                return f137299h;
            case 6:
                C63010eb ebVar = f137300i;
                if (ebVar == null) {
                    synchronized (C52305mv.class) {
                        ebVar = f137300i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137299h);
                            f137300i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
