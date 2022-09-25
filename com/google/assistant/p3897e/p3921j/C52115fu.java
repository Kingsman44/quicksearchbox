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

/* renamed from: com.google.assistant.e.j.fu */
/* compiled from: PG */
public final class C52115fu extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C52115fu f136753n;

    /* renamed from: o */
    private static volatile C63010eb f136754o;

    /* renamed from: a */
    public int f136755a;

    /* renamed from: b */
    public String f136756b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f136757c;

    /* renamed from: d */
    public double f136758d;

    /* renamed from: e */
    public int f136759e;

    /* renamed from: f */
    public String f136760f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f136761g;

    /* renamed from: h */
    public String f136762h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public long f136763i;

    /* renamed from: j */
    public boolean f136764j;

    /* renamed from: k */
    public boolean f136765k;

    /* renamed from: l */
    public int f136766l;

    /* renamed from: m */
    public String f136767m = BuildConfig.FLAVOR;

    static {
        C52115fu fuVar = new C52115fu();
        f136753n = fuVar;
        C62942bv.registerDefaultInstance(C52115fu.class, fuVar);
    }

    private C52115fu() {
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
                return newMessageInfo(f136753n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003က\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဂ\u0007\tဇ\b\nဇ\t\u000bင\n\fဈ\u000b", new Object[]{"a", "b", C45240c.f118157a, C52111fq.f136751a, "d", "e", C52113fs.f136752a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C52115fu();
            case 4:
                return new C52110fp();
            case 5:
                return f136753n;
            case 6:
                C63010eb ebVar = f136754o;
                if (ebVar == null) {
                    synchronized (C52115fu.class) {
                        ebVar = f136754o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136753n);
                            f136754o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
