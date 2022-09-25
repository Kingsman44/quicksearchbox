package com.google.assistant.p3897e.p3921j;

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

/* renamed from: com.google.assistant.e.j.ju */
/* compiled from: PG */
public final class C52223ju extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C52223ju f137038i;

    /* renamed from: j */
    private static volatile C63010eb f137039j;

    /* renamed from: a */
    public int f137040a;

    /* renamed from: b */
    public String f137041b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f137042c;

    /* renamed from: d */
    public int f137043d;

    /* renamed from: e */
    public String f137044e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f137045f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f137046g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C52222jt f137047h;

    static {
        C52223ju juVar = new C52223ju();
        f137038i = juVar;
        C62942bv.registerDefaultInstance(C52223ju.class, juVar);
    }

    private C52223ju() {
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
                return newMessageInfo(f137038i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0007ဈ\u0006\bဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C52223ju();
            case 4:
                return new C52220jr();
            case 5:
                return f137038i;
            case 6:
                C63010eb ebVar = f137039j;
                if (ebVar == null) {
                    synchronized (C52223ju.class) {
                        ebVar = f137039j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137038i);
                            f137039j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
