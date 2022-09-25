package com.google.assistant.p3897e.p3921j.p3924c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c.j */
/* compiled from: PG */
public final class C51739j extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51739j f135736i;

    /* renamed from: k */
    private static volatile C63010eb f135737k;

    /* renamed from: a */
    public int f135738a = 0;

    /* renamed from: b */
    public Object f135739b;

    /* renamed from: c */
    public String f135740c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f135741d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f135742e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C52428rj f135743f;

    /* renamed from: g */
    public int f135744g;

    /* renamed from: h */
    public String f135745h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private int f135746j;

    static {
        C51739j jVar = new C51739j();
        f135736i = jVar;
        C62942bv.registerDefaultInstance(C51739j.class, jVar);
    }

    private C51739j() {
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
                return newMessageInfo(f135736i, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0002\u0002ြ\u0000\u0004ဈ\u0001\u0005ြ\u0000\u0006ဈ\u0006\u0007ဉ\u0007\bင\b\tဈ\t\nြ\u0000", new Object[]{"b", "a", "j", "d", C52395qd.class, C45240c.f118157a, C51738i.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C51736g.class});
            case 3:
                return new C51739j();
            case 4:
                return new C51730a();
            case 5:
                return f135736i;
            case 6:
                C63010eb ebVar = f135737k;
                if (ebVar == null) {
                    synchronized (C51739j.class) {
                        ebVar = f135737k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135736i);
                            f135737k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
