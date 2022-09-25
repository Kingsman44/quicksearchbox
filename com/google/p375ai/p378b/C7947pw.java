package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.pw */
/* compiled from: PG */
public final class C7947pw extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C7947pw f27896j;

    /* renamed from: l */
    private static volatile C63010eb f27897l;

    /* renamed from: a */
    public int f27898a;

    /* renamed from: b */
    public String f27899b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f27900c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f27901d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f27902e;

    /* renamed from: f */
    public int f27903f = 1;

    /* renamed from: g */
    public C7805kp f27904g;

    /* renamed from: h */
    public C7944pt f27905h;

    /* renamed from: i */
    public boolean f27906i;

    /* renamed from: k */
    private byte f27907k = 2;

    static {
        C7947pw pwVar = new C7947pw();
        f27896j = pwVar;
        C62942bv.registerDefaultInstance(C7947pw.class, pwVar);
    }

    private C7947pw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27907k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27907k = b;
                return null;
            case 2:
                return newMessageInfo(f27896j, "\u0001\b\u0000\u0001\u0001\u0014\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဂ\u0003\u0005ဌ\u0004\nဉ\u0005\u000bဉ\u0006\u000eဇ\u0007\u0014ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C7945pu.f27895a, C30325g.f82003a, C19618h.f54585a, "i", "d"});
            case 3:
                return new C7947pw();
            case 4:
                return new C7942pr();
            case 5:
                return f27896j;
            case 6:
                C63010eb ebVar = f27897l;
                if (ebVar == null) {
                    synchronized (C7947pw.class) {
                        ebVar = f27897l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27896j);
                            f27897l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
