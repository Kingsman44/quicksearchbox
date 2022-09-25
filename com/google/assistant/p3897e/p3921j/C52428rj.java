package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.rj */
/* compiled from: PG */
public final class C52428rj extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C52428rj f137558m;

    /* renamed from: n */
    private static volatile C63010eb f137559n;

    /* renamed from: a */
    public int f137560a;

    /* renamed from: b */
    public String f137561b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f137562c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f137563d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f137564e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f137565f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C52426rh f137566g;

    /* renamed from: h */
    public String f137567h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f137568i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f137569j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f137570k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f137571l = BuildConfig.FLAVOR;

    static {
        C52428rj rjVar = new C52428rj();
        f137558m = rjVar;
        C62942bv.registerDefaultInstance(C52428rj.class, rjVar);
    }

    private C52428rj() {
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
                return newMessageInfo(f137558m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001ဈ\u0004\u0002ဈ\u0002\u0004ဈ\u0005\u0006ဉ\u0007\u0007ဈ\b\bဈ\u0003\tဈ\t\nဈ\n\u000bဈ\u000b\fဈ\f\rဈ\u0001", new Object[]{"a", "e", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "d", "i", "j", C19621k.f54601a, "l", "b"});
            case 3:
                return new C52428rj();
            case 4:
                return new C52427ri();
            case 5:
                return f137558m;
            case 6:
                C63010eb ebVar = f137559n;
                if (ebVar == null) {
                    synchronized (C52428rj.class) {
                        ebVar = f137559n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137558m);
                            f137559n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
