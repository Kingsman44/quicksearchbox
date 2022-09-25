package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.az */
/* compiled from: PG */
public final class C96833az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f270790c = new C96829av();

    /* renamed from: h */
    public static final C96833az f270791h;

    /* renamed from: i */
    public static final C62940bt f270792i;

    /* renamed from: j */
    private static volatile C63010eb f270793j;

    /* renamed from: a */
    public int f270794a;

    /* renamed from: b */
    public C62961ch f270795b = emptyIntList();

    /* renamed from: d */
    public boolean f270796d;

    /* renamed from: e */
    public String f270797e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f270798f;

    /* renamed from: g */
    public long f270799g;

    static {
        C96833az azVar = new C96833az();
        f270791h = azVar;
        C62942bv.registerDefaultInstance(C96833az.class, azVar);
        f270792i = C62942bv.newSingularGeneratedExtension(C118476ak.f328838a, azVar, azVar, (C62958ce) null, 364748041, C63066gd.MESSAGE, C96833az.class);
    }

    private C96833az() {
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
                return newMessageInfo(f270791h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001e\u0002ဇ\u0000\u0003ဈ\u0001\u0004ဌ\u0002\u0005ဂ\u0003", new Object[]{"a", "b", C65753ak.m96798c(), "d", "e", C10662f.f35572a, C96831ax.f270789a, C30325g.f82003a});
            case 3:
                return new C96833az();
            case 4:
                return new C96830aw();
            case 5:
                return f270791h;
            case 6:
                C63010eb ebVar = f270793j;
                if (ebVar == null) {
                    synchronized (C96833az.class) {
                        ebVar = f270793j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f270791h);
                            f270793j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
