package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4140ba.p4147b.p4148a.p4149a.C54937b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afz */
/* compiled from: PG */
public final class afz extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final afz f158594h;

    /* renamed from: j */
    private static volatile C63010eb f158595j;

    /* renamed from: a */
    public int f158596a;

    /* renamed from: b */
    public String f158597b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f158598c;

    /* renamed from: d */
    public float f158599d;

    /* renamed from: e */
    public C54937b f158600e;

    /* renamed from: f */
    public int f158601f;

    /* renamed from: g */
    public int f158602g;

    /* renamed from: i */
    private byte f158603i = 2;

    static {
        afz afz = new afz();
        f158594h = afz;
        C62942bv.registerDefaultInstance(afz.class, afz);
    }

    private afz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158603i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f158603i = b;
                return null;
            case 2:
                return newMessageInfo(f158594h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, afy.m92394b(), C30325g.f82003a, C80515d.m128186b()});
            case 3:
                return new afz();
            case 4:
                return new afw();
            case 5:
                return f158594h;
            case 6:
                C63010eb ebVar = f158595j;
                if (ebVar == null) {
                    synchronized (afz.class) {
                        ebVar = f158595j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158594h);
                            f158595j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
