package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.wu */
/* compiled from: PG */
public final class C52574wu extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52574wu f138026h;

    /* renamed from: i */
    private static volatile C63010eb f138027i;

    /* renamed from: a */
    public int f138028a;

    /* renamed from: b */
    public int f138029b;

    /* renamed from: c */
    public String f138030c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f138031d;

    /* renamed from: e */
    public String f138032e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f138033f;

    /* renamed from: g */
    public String f138034g = BuildConfig.FLAVOR;

    static {
        C52574wu wuVar = new C52574wu();
        f138026h = wuVar;
        C62942bv.registerDefaultInstance(C52574wu.class, wuVar);
    }

    private C52574wu() {
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
                return newMessageInfo(f138026h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C52570wq.f138017a, C45240c.f118157a, "d", "e", C10662f.f35572a, C52573wt.m86653b(), C30325g.f82003a});
            case 3:
                return new C52574wu();
            case 4:
                return new C52569wp();
            case 5:
                return f138026h;
            case 6:
                C63010eb ebVar = f138027i;
                if (ebVar == null) {
                    synchronized (C52574wu.class) {
                        ebVar = f138027i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138026h);
                            f138027i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
