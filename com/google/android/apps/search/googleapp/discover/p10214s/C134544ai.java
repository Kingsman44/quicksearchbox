package com.google.android.apps.search.googleapp.discover.p10214s;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.ai */
/* compiled from: PG */
public final class C134544ai extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C134544ai f366393i;

    /* renamed from: k */
    private static volatile C63010eb f366394k;

    /* renamed from: a */
    public int f366395a;

    /* renamed from: b */
    public int f366396b = 0;

    /* renamed from: c */
    public Object f366397c;

    /* renamed from: d */
    public int f366398d;

    /* renamed from: e */
    public String f366399e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C7669fo f366400f;

    /* renamed from: g */
    public int f366401g;

    /* renamed from: h */
    public C134599q f366402h;

    /* renamed from: j */
    private byte f366403j = 2;

    static {
        C134544ai aiVar = new C134544ai();
        f366393i = aiVar;
        C62942bv.registerDefaultInstance(C134544ai.class, aiVar);
    }

    private C134544ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366403j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366403j = b;
                return null;
            case 2:
                return newMessageInfo(f366393i, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐼ\u0000\u0003ဈ\u0002\u0006ဉ\u0003\bဌ\u0004\tဉ\u0005", new Object[]{C45240c.f118157a, "b", "a", "d", C134543ah.m218282b(), C57784p.class, "e", C10662f.f35572a, C30325g.f82003a, C134540ae.m218280b(), C19618h.f54585a});
            case 3:
                return new C134544ai();
            case 4:
                return new C134541af();
            case 5:
                return f366393i;
            case 6:
                C63010eb ebVar = f366394k;
                if (ebVar == null) {
                    synchronized (C134544ai.class) {
                        ebVar = f366394k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366393i);
                            f366394k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
