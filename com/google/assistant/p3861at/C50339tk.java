package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.tk */
/* compiled from: PG */
public final class C50339tk extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50339tk f131012h;

    /* renamed from: i */
    private static volatile C63010eb f131013i;

    /* renamed from: a */
    public int f131014a;

    /* renamed from: b */
    public int f131015b;

    /* renamed from: c */
    public String f131016c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f131017d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f131018e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f131019f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f131020g = BuildConfig.FLAVOR;

    static {
        C50339tk tkVar = new C50339tk();
        f131012h = tkVar;
        C62942bv.registerDefaultInstance(C50339tk.class, tkVar);
    }

    private C50339tk() {
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
                return newMessageInfo(f131012h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, "e"});
            case 3:
                return new C50339tk();
            case 4:
                return new C50338tj();
            case 5:
                return f131012h;
            case 6:
                C63010eb ebVar = f131013i;
                if (ebVar == null) {
                    synchronized (C50339tk.class) {
                        ebVar = f131013i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131012h);
                            f131013i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
