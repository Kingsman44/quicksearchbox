package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3897e.p3921j.p3926e.C52030ib;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.an.c.a.br */
/* compiled from: PG */
public final class C49299br extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C49299br f127413h;

    /* renamed from: i */
    public static final C62940bt f127414i;

    /* renamed from: j */
    private static volatile C63010eb f127415j;

    /* renamed from: a */
    public int f127416a;

    /* renamed from: b */
    public int f127417b;

    /* renamed from: c */
    public C49826ak f127418c;

    /* renamed from: d */
    public C49838aw f127419d;

    /* renamed from: e */
    public C49295bn f127420e;

    /* renamed from: f */
    public String f127421f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f127422g = BuildConfig.FLAVOR;

    static {
        C49299br brVar = new C49299br();
        f127413h = brVar;
        C62942bv.registerDefaultInstance(C49299br.class, brVar);
        f127414i = C62942bv.newSingularGeneratedExtension(C52030ib.f136561a, brVar, brVar, (C62958ce) null, 310942747, C63066gd.MESSAGE, C49299br.class);
    }

    private C49299br() {
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
                return newMessageInfo(f127413h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဌ\u0000\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", C45240c.f118157a, "d", "b", C49297bp.f127412a, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C49299br();
            case 4:
                return new C49296bo();
            case 5:
                return f127413h;
            case 6:
                C63010eb ebVar = f127415j;
                if (ebVar == null) {
                    synchronized (C49299br.class) {
                        ebVar = f127415j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127413h);
                            f127415j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
