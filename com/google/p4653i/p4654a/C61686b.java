package com.google.p4653i.p4654a;

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

/* renamed from: com.google.i.a.b */
/* compiled from: PG */
public final class C61686b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C61686b f166649j;

    /* renamed from: k */
    private static volatile C63010eb f166650k;

    /* renamed from: a */
    public int f166651a;

    /* renamed from: b */
    public String f166652b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f166653c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f166654d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f166655e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f166656f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f166657g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f166658h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f166659i = BuildConfig.FLAVOR;

    static {
        C61686b bVar = new C61686b();
        f166649j = bVar;
        C62942bv.registerDefaultInstance(C61686b.class, bVar);
    }

    private C61686b() {
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
                return newMessageInfo(f166649j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0006\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C19618h.f54585a, C10662f.f35572a, C30325g.f82003a, "i"});
            case 3:
                return new C61686b();
            case 4:
                return new C61649a();
            case 5:
                return f166649j;
            case 6:
                C63010eb ebVar = f166650k;
                if (ebVar == null) {
                    synchronized (C61686b.class) {
                        ebVar = f166650k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166649j);
                            f166650k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
