package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.bp */
/* compiled from: PG */
public final class C124650bp extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C124650bp f343890p;

    /* renamed from: q */
    private static volatile C63010eb f343891q;

    /* renamed from: a */
    public int f343892a;

    /* renamed from: b */
    public int f343893b;

    /* renamed from: c */
    public String f343894c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f343895d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f343896e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f343897f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f343898g;

    /* renamed from: h */
    public long f343899h;

    /* renamed from: i */
    public long f343900i;

    /* renamed from: j */
    public long f343901j;

    /* renamed from: k */
    public long f343902k;

    /* renamed from: l */
    public String f343903l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f343904m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public C62971cq f343905n = C62942bv.emptyProtobufList();

    /* renamed from: o */
    public int f343906o;

    static {
        C124650bp bpVar = new C124650bp();
        f343890p = bpVar;
        C62942bv.registerDefaultInstance(C124650bp.class, bpVar);
    }

    private C124650bp() {
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
                return newMessageInfo(f343890p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဈ\n\fဈ\u000b\u000e\u001a\u000fဌ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, C124627at.m204293b()});
            case 3:
                return new C124650bp();
            case 4:
                return new C124649bo();
            case 5:
                return f343890p;
            case 6:
                C63010eb ebVar = f343891q;
                if (ebVar == null) {
                    synchronized (C124650bp.class) {
                        ebVar = f343891q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343890p);
                            f343891q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
