package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C52016ho;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ge */
/* compiled from: PG */
public final class C53230ge extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C53230ge f139503j;

    /* renamed from: k */
    private static volatile C63010eb f139504k;

    /* renamed from: a */
    public int f139505a;

    /* renamed from: b */
    public String f139506b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139507c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f139508d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f139509e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f139510f;

    /* renamed from: g */
    public String f139511g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f139512h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f139513i;

    static {
        C53230ge geVar = new C53230ge();
        f139503j = geVar;
        C62942bv.registerDefaultInstance(C53230ge.class, geVar);
    }

    private C53230ge() {
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
                return newMessageInfo(f139503j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဌ\u0007\bဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", C52016ho.f136522a, C10662f.f35572a, C53236gk.m86794b()});
            case 3:
                return new C53230ge();
            case 4:
                return new C53229gd();
            case 5:
                return f139503j;
            case 6:
                C63010eb ebVar = f139504k;
                if (ebVar == null) {
                    synchronized (C53230ge.class) {
                        ebVar = f139504k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139503j);
                            f139504k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
