package com.google.android.libraries.search.assistant.p2497ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.ab.ag */
/* compiled from: PG */
public final class C32365ag extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C32365ag f86758h;

    /* renamed from: i */
    private static volatile C63010eb f86759i;

    /* renamed from: a */
    public int f86760a;

    /* renamed from: b */
    public String f86761b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f86762c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f86763d;

    /* renamed from: e */
    public C62971cq f86764e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f86765f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f86766g = BuildConfig.FLAVOR;

    static {
        C32365ag agVar = new C32365ag();
        f86758h = agVar;
        C62942bv.registerDefaultInstance(C32365ag.class, agVar);
    }

    private C32365ag() {
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
                return newMessageInfo(f86758h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C32365ag();
            case 4:
                return new C32364af();
            case 5:
                return f86758h;
            case 6:
                C63010eb ebVar = f86759i;
                if (ebVar == null) {
                    synchronized (C32365ag.class) {
                        ebVar = f86759i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86758h);
                            f86759i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
