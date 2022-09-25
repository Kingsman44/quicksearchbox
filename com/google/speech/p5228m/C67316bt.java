package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bt */
/* compiled from: PG */
public final class C67316bt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C67316bt f182967f;

    /* renamed from: g */
    private static volatile C63010eb f182968g;

    /* renamed from: a */
    public int f182969a;

    /* renamed from: b */
    public long f182970b;

    /* renamed from: c */
    public String f182971c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62961ch f182972d = emptyIntList();

    /* renamed from: e */
    public String f182973e = BuildConfig.FLAVOR;

    static {
        C67316bt btVar = new C67316bt();
        f182967f = btVar;
        C62942bv.registerDefaultInstance(C67316bt.class, btVar);
    }

    private C67316bt() {
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
                return newMessageInfo(f182967f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0001\u0002,\u0003ဈ\u0002\u0004ဂ\u0000", new Object[]{"a", C45240c.f118157a, "d", C51209d.m86087b(), "e", "b"});
            case 3:
                return new C67316bt();
            case 4:
                return new C67315bs();
            case 5:
                return f182967f;
            case 6:
                C63010eb ebVar = f182968g;
                if (ebVar == null) {
                    synchronized (C67316bt.class) {
                        ebVar = f182968g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182967f);
                            f182968g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
