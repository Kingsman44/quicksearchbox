package com.google.assistant.p3897e.p3921j.p3926e;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.e.gq */
/* compiled from: PG */
public final class C51991gq extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C51991gq f136433k;

    /* renamed from: l */
    private static volatile C63010eb f136434l;

    /* renamed from: a */
    public int f136435a;

    /* renamed from: b */
    public int f136436b;

    /* renamed from: c */
    public int f136437c;

    /* renamed from: d */
    public int f136438d;

    /* renamed from: e */
    public String f136439e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f136440f;

    /* renamed from: g */
    public int f136441g;

    /* renamed from: h */
    public C63088z f136442h = C63088z.f170246b;

    /* renamed from: i */
    public boolean f136443i;

    /* renamed from: j */
    public String f136444j = BuildConfig.FLAVOR;

    static {
        C51991gq gqVar = new C51991gq();
        f136433k = gqVar;
        C62942bv.registerDefaultInstance(C51991gq.class, gqVar);
    }

    private C51991gq() {
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
                return newMessageInfo(f136433k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001\u0003ဆ\u0002\u0004ဈ\u0003\u0005င\u0005\u0006ည\u0006\u0007ဇ\u0007\bဇ\u0004\tဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", C10662f.f35572a, "j"});
            case 3:
                return new C51991gq();
            case 4:
                return new C51990gp();
            case 5:
                return f136433k;
            case 6:
                C63010eb ebVar = f136434l;
                if (ebVar == null) {
                    synchronized (C51991gq.class) {
                        ebVar = f136434l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136433k);
                            f136434l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
