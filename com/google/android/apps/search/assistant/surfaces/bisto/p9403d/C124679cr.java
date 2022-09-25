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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.cr */
/* compiled from: PG */
public final class C124679cr extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C124679cr f343956o;

    /* renamed from: p */
    private static volatile C63010eb f343957p;

    /* renamed from: a */
    public int f343958a;

    /* renamed from: b */
    public int f343959b;

    /* renamed from: c */
    public int f343960c;

    /* renamed from: d */
    public int f343961d;

    /* renamed from: e */
    public int f343962e;

    /* renamed from: f */
    public boolean f343963f;

    /* renamed from: g */
    public String f343964g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f343965h;

    /* renamed from: i */
    public String f343966i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public boolean f343967j;

    /* renamed from: k */
    public String f343968k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f343969l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f343970m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public boolean f343971n;

    static {
        C124679cr crVar = new C124679cr();
        f343956o = crVar;
        C62942bv.registerDefaultInstance(C124679cr.class, crVar);
    }

    private C124679cr() {
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
                return newMessageInfo(f343956o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဈ\u0007\tဇ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဇ\f", new Object[]{"a", "b", C124715m.m204379b(), C45240c.f118157a, C124633az.m204300b(), "d", C124719q.m204381b(), "e", C124636bb.m204302b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C124679cr();
            case 4:
                return new C124678cq();
            case 5:
                return f343956o;
            case 6:
                C63010eb ebVar = f343957p;
                if (ebVar == null) {
                    synchronized (C124679cr.class) {
                        ebVar = f343957p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343956o);
                            f343957p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
