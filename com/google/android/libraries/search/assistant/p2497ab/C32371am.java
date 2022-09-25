package com.google.android.libraries.search.assistant.p2497ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.ab.am */
/* compiled from: PG */
public final class C32371am extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C32371am f86780i;

    /* renamed from: j */
    private static volatile C63010eb f86781j;

    /* renamed from: a */
    public int f86782a;

    /* renamed from: b */
    public String f86783b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f86784c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public double f86785d;

    /* renamed from: e */
    public double f86786e;

    /* renamed from: f */
    public double f86787f;

    /* renamed from: g */
    public double f86788g;

    /* renamed from: h */
    public C32361ac f86789h;

    static {
        C32371am amVar = new C32371am();
        f86780i = amVar;
        C62942bv.registerDefaultInstance(C32371am.class, amVar);
    }

    private C32371am() {
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
                return newMessageInfo(f86780i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C32371am();
            case 4:
                return new C32370al();
            case 5:
                return f86780i;
            case 6:
                C63010eb ebVar = f86781j;
                if (ebVar == null) {
                    synchronized (C32371am.class) {
                        ebVar = f86781j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86780i);
                            f86781j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
