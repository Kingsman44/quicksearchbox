package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3562ao.p3570b.p3571a.p3572a.p3573a.C45591b;
import com.google.p3562ao.p3570b.p3571a.p3572a.p3573a.C45593d;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mj */
/* compiled from: PG */
public final class C50149mj extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C50149mj f130370k;

    /* renamed from: m */
    private static volatile C63010eb f130371m;

    /* renamed from: a */
    public int f130372a;

    /* renamed from: b */
    public String f130373b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130374c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f130375d;

    /* renamed from: e */
    public C58131b f130376e;

    /* renamed from: f */
    public int f130377f;

    /* renamed from: g */
    public int f130378g;

    /* renamed from: h */
    public int f130379h;

    /* renamed from: i */
    public String f130380i;

    /* renamed from: j */
    public String f130381j;

    /* renamed from: l */
    private C50147mh f130382l;

    static {
        C50149mj mjVar = new C50149mj();
        f130370k = mjVar;
        C62942bv.registerDefaultInstance(C50149mj.class, mjVar);
    }

    private C50149mj() {
        emptyIntList();
        this.f130380i = BuildConfig.FLAVOR;
        this.f130381j = BuildConfig.FLAVOR;
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
                return newMessageInfo(f130370k, "\u0001\n\u0000\u0001\u0001\u0016\n\u0000\u0000\u0000\u0001ဈ\u0000\nဈ\u0002\u000bဌ\u0003\u000fဉ\r\u0011ဉ\u000f\u0012ဌ\u0010\u0013ဈ\u0014\u0014ဌ\u0011\u0015ဌ\u0012\u0016ဈ\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", C49875cf.m85756b(), "l", "e", C10662f.f35572a, C45595b.m81284b(), "j", C30325g.f82003a, C45593d.m81282b(), C19618h.f54585a, C45591b.m81280b(), "i"});
            case 3:
                return new C50149mj();
            case 4:
                return new C50148mi();
            case 5:
                return f130370k;
            case 6:
                C63010eb ebVar = f130371m;
                if (ebVar == null) {
                    synchronized (C50149mj.class) {
                        ebVar = f130371m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130370k);
                            f130371m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
