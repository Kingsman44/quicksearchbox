package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.fm */
/* compiled from: PG */
public final class C80792fm extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C80792fm f221696l;

    /* renamed from: n */
    private static volatile C63010eb f221697n;

    /* renamed from: a */
    public String f221698a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f221699b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C80727db f221700c;

    /* renamed from: d */
    public C80831aj f221701d;

    /* renamed from: e */
    public String f221702e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C80578l f221703f;

    /* renamed from: g */
    public C48462b f221704g;

    /* renamed from: h */
    public int f221705h;

    /* renamed from: i */
    public C128182n f221706i;

    /* renamed from: j */
    public int f221707j;

    /* renamed from: k */
    public String f221708k = BuildConfig.FLAVOR;

    /* renamed from: m */
    private byte f221709m = 2;

    static {
        C80792fm fmVar = new C80792fm();
        f221696l = fmVar;
        C62942bv.registerDefaultInstance(C80792fm.class, fmVar);
    }

    private C80792fm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221709m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221709m = b;
                return null;
            case 2:
                return newMessageInfo(f221696l, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0003\u0001Ȉ\u0002Ȉ\u0003Љ\u0004Љ\u0005\t\u0006\f\u0007\t\b\f\tȈ\nЉ\u000bȈ", new Object[]{"a", "b", C45240c.f118157a, "d", C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C10662f.f35572a, "e"});
            case 3:
                return new C80792fm();
            case 4:
                return new C80791fl();
            case 5:
                return f221696l;
            case 6:
                C63010eb ebVar = f221697n;
                if (ebVar == null) {
                    synchronized (C80792fm.class) {
                        ebVar = f221697n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221696l);
                            f221697n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
