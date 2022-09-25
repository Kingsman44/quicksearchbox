package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60105ky;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bo */
/* compiled from: PG */
public final class C124844bo extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C124844bo f344417m;

    /* renamed from: n */
    private static volatile C63010eb f344418n;

    /* renamed from: a */
    public int f344419a;

    /* renamed from: b */
    public String f344420b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f344421c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f344422d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f344423e;

    /* renamed from: f */
    public boolean f344424f;

    /* renamed from: g */
    public boolean f344425g;

    /* renamed from: h */
    public String f344426h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f344427i;

    /* renamed from: j */
    public int f344428j;

    /* renamed from: k */
    public boolean f344429k;

    /* renamed from: l */
    public boolean f344430l;

    static {
        C124844bo boVar = new C124844bo();
        f344417m = boVar;
        C62942bv.registerDefaultInstance(C124844bo.class, boVar);
    }

    private C124844bo() {
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
                return newMessageInfo(f344417m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဇ\u0007\tဌ\b\nဇ\t\u000bဇ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C60105ky.m92529b(), C19621k.f54601a, "l"});
            case 3:
                return new C124844bo();
            case 4:
                return new C124843bn();
            case 5:
                return f344417m;
            case 6:
                C63010eb ebVar = f344418n;
                if (ebVar == null) {
                    synchronized (C124844bo.class) {
                        ebVar = f344418n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344417m);
                            f344418n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
