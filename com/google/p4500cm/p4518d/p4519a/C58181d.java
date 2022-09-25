package com.google.p4500cm.p4518d.p4519a;

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

/* renamed from: com.google.cm.d.a.d */
/* compiled from: PG */
public final class C58181d extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C58181d f155547j;

    /* renamed from: l */
    private static volatile C63010eb f155548l;

    /* renamed from: a */
    public String f155549a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f155550b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f155551c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f155552d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f155553e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f155554f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f155555g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f155556h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f155557i = BuildConfig.FLAVOR;

    /* renamed from: k */
    private int f155558k;

    static {
        C58181d dVar = new C58181d();
        f155547j = dVar;
        C62942bv.registerDefaultInstance(C58181d.class, dVar);
    }

    private C58181d() {
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
                return newMessageInfo(f155547j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{C19621k.f54601a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C58181d();
            case 4:
                return new C58180c();
            case 5:
                return f155547j;
            case 6:
                C63010eb ebVar = f155548l;
                if (ebVar == null) {
                    synchronized (C58181d.class) {
                        ebVar = f155548l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155547j);
                            f155548l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
