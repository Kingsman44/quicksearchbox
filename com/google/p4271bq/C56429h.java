package com.google.p4271bq;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bq.h */
/* compiled from: PG */
public final class C56429h extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C56429h f150547k;

    /* renamed from: m */
    private static volatile C63010eb f150548m;

    /* renamed from: a */
    public int f150549a;

    /* renamed from: b */
    public C60214n f150550b;

    /* renamed from: c */
    public boolean f150551c;

    /* renamed from: d */
    public int f150552d;

    /* renamed from: e */
    public String f150553e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f150554f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f150555g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f150556h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f150557i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f150558j = BuildConfig.FLAVOR;

    /* renamed from: l */
    private byte f150559l = 2;

    static {
        C56429h hVar = new C56429h();
        f150547k = hVar;
        C62942bv.registerDefaultInstance(C56429h.class, hVar);
    }

    private C56429h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150559l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150559l = b;
                return null;
            case 2:
                return newMessageInfo(f150547k, "\u0001\t\u0000\u0001\u0001Ɛ\t\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004dဈ\u0005Èဈ\u0006Ĭဈ\u0007Ɛဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", C56427f.f150546a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C56429h();
            case 4:
                return new C56426e();
            case 5:
                return f150547k;
            case 6:
                C63010eb ebVar = f150548m;
                if (ebVar == null) {
                    synchronized (C56429h.class) {
                        ebVar = f150548m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150547k);
                            f150548m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
