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

/* renamed from: com.google.bb.a.ad */
/* compiled from: PG */
public final class C54946ad extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C54946ad f144531h;

    /* renamed from: j */
    private static volatile C63010eb f144532j;

    /* renamed from: a */
    public int f144533a;

    /* renamed from: b */
    public boolean f144534b;

    /* renamed from: c */
    public boolean f144535c = true;

    /* renamed from: d */
    public C54948af f144536d;

    /* renamed from: e */
    public C54976bg f144537e;

    /* renamed from: f */
    public String f144538f;

    /* renamed from: g */
    public String f144539g;

    /* renamed from: i */
    private byte f144540i = 2;

    static {
        C54946ad adVar = new C54946ad();
        f144531h = adVar;
        C62942bv.registerDefaultInstance(C54946ad.class, adVar);
    }

    private C54946ad() {
        emptyIntList();
        this.f144538f = BuildConfig.FLAVOR;
        emptyProtobufList();
        this.f144539g = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144540i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144540i = b;
                return null;
            case 2:
                return newMessageInfo(f144531h, "\u0001\u0006\u0000\u0001\u0004\u0010\u0006\u0000\u0000\u0002\u0004ᐉ\u0004\nဇ\u0002\u000bᐉ\u0005\fဇ\u0003\u000eဈ\u000b\u0010ဈ\f", new Object[]{"a", "d", "b", "e", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C54946ad();
            case 4:
                return new C54945ac();
            case 5:
                return f144531h;
            case 6:
                C63010eb ebVar = f144532j;
                if (ebVar == null) {
                    synchronized (C54946ad.class) {
                        ebVar = f144532j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144531h);
                            f144532j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
