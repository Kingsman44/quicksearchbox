package com.google.assistant.p3803ag.p3807b.p3808a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.ac */
/* compiled from: PG */
public final class C48888ac extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C48888ac f126507h;

    /* renamed from: i */
    private static volatile C63010eb f126508i;

    /* renamed from: a */
    public int f126509a;

    /* renamed from: b */
    public String f126510b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126511c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C48952az f126512d;

    /* renamed from: e */
    public int f126513e;

    /* renamed from: f */
    public int f126514f;

    /* renamed from: g */
    public int f126515g;

    static {
        C48888ac acVar = new C48888ac();
        f126507h = acVar;
        C62942bv.registerDefaultInstance(C48888ac.class, acVar);
    }

    private C48888ac() {
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
                return newMessageInfo(f126507h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C48922x.m85307b(), C10662f.f35572a, C48922x.m85307b(), C30325g.f82003a, C48886aa.f126506a});
            case 3:
                return new C48888ac();
            case 4:
                return new C48924z();
            case 5:
                return f126507h;
            case 6:
                C63010eb ebVar = f126508i;
                if (ebVar == null) {
                    synchronized (C48888ac.class) {
                        ebVar = f126508i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126507h);
                            f126508i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
