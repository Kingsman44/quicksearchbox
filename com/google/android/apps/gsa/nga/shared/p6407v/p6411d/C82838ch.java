package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ch */
/* compiled from: PG */
public final class C82838ch extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C82838ch f225874h;

    /* renamed from: j */
    private static volatile C63010eb f225875j;

    /* renamed from: a */
    public int f225876a;

    /* renamed from: b */
    public int f225877b;

    /* renamed from: c */
    public int f225878c;

    /* renamed from: d */
    public int f225879d;

    /* renamed from: e */
    public C80388r f225880e;

    /* renamed from: f */
    public C80386p f225881f;

    /* renamed from: g */
    public C82843cm f225882g;

    /* renamed from: i */
    private byte f225883i = 2;

    static {
        C82838ch chVar = new C82838ch();
        f225874h = chVar;
        C62942bv.registerDefaultInstance(C82838ch.class, chVar);
    }

    private C82838ch() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225883i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225883i = b;
                return null;
            case 2:
                Object[] objArr = new Object[10];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C82918fg.f226213a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[5] = C10662f.f35572a;
                objArr[6] = C30325g.f82003a;
                objArr[7] = "e";
                objArr[8] = "d";
                objArr[9] = C82831ca.m132407b();
                return newMessageInfo(f225874h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ဌ\u0000\u0002ဌ\u0001\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ဉ\u0003\u0007ဌ\u0002", objArr);
            case 3:
                return new C82838ch();
            case 4:
                return new C82837cg();
            case 5:
                return f225874h;
            case 6:
                C63010eb ebVar = f225875j;
                if (ebVar == null) {
                    synchronized (C82838ch.class) {
                        ebVar = f225875j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225874h);
                            f225875j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
