package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bb.a.af */
/* compiled from: PG */
public final class C54948af extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C54948af f144541h;

    /* renamed from: k */
    private static volatile C63010eb f144542k;

    /* renamed from: a */
    public int f144543a;

    /* renamed from: b */
    public int f144544b;

    /* renamed from: c */
    public int f144545c;

    /* renamed from: d */
    public C63088z f144546d = C63088z.f170246b;

    /* renamed from: e */
    public boolean f144547e = true;

    /* renamed from: f */
    public String f144548f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C63088z f144549g = C63088z.f170246b;

    /* renamed from: i */
    private C55390qp f144550i;

    /* renamed from: j */
    private byte f144551j = 2;

    static {
        C54948af afVar = new C54948af();
        f144541h = afVar;
        C62942bv.registerDefaultInstance(C54948af.class, afVar);
    }

    private C54948af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144551j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144551j = b;
                return null;
            case 2:
                return newMessageInfo(f144541h, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004ဇ\u0004\u0006ဈ\u0006\nᐉ\t\rည\f", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, C55421x.m87687b(), "d", "e", C10662f.f35572a, "i", C30325g.f82003a});
            case 3:
                return new C54948af();
            case 4:
                return new C54947ae();
            case 5:
                return f144541h;
            case 6:
                C63010eb ebVar = f144542k;
                if (ebVar == null) {
                    synchronized (C54948af.class) {
                        ebVar = f144542k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144541h);
                            f144542k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
