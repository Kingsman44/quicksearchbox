package com.google.assistant.p3861at;

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

/* renamed from: com.google.assistant.at.pt */
/* compiled from: PG */
public final class C50240pt extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C50240pt f130631j;

    /* renamed from: k */
    private static volatile C63010eb f130632k;

    /* renamed from: a */
    public int f130633a;

    /* renamed from: b */
    public C50149mj f130634b;

    /* renamed from: c */
    public String f130635c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130636d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130637e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f130638f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f130639g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f130640h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f130641i = BuildConfig.FLAVOR;

    static {
        C50240pt ptVar = new C50240pt();
        f130631j = ptVar;
        C62942bv.registerDefaultInstance(C50240pt.class, ptVar);
    }

    private C50240pt() {
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
                return newMessageInfo(f130631j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဉ\u0000", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "b"});
            case 3:
                return new C50240pt();
            case 4:
                return new C50239ps();
            case 5:
                return f130631j;
            case 6:
                C63010eb ebVar = f130632k;
                if (ebVar == null) {
                    synchronized (C50240pt.class) {
                        ebVar = f130632k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130631j);
                            f130632k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
