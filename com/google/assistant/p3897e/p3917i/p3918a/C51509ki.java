package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4373g.C57667b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ki */
/* compiled from: PG */
public final class C51509ki extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C62962ci f134187j = new C51507kg();

    /* renamed from: k */
    public static final C51509ki f134188k;

    /* renamed from: m */
    private static volatile C63010eb f134189m;

    /* renamed from: a */
    public int f134190a;

    /* renamed from: b */
    public String f134191b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f134192c = emptyProtobufList();

    /* renamed from: d */
    public String f134193d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f134194e;

    /* renamed from: f */
    public long f134195f;

    /* renamed from: g */
    public C51511kk f134196g;

    /* renamed from: h */
    public String f134197h;

    /* renamed from: i */
    public C62961ch f134198i;

    /* renamed from: l */
    private byte f134199l = 2;

    static {
        C51509ki kiVar = new C51509ki();
        f134188k = kiVar;
        C62942bv.registerDefaultInstance(C51509ki.class, kiVar);
    }

    private C51509ki() {
        emptyProtobufList();
        this.f134197h = BuildConfig.FLAVOR;
        this.f134198i = emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134199l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134199l = b;
                return null;
            case 2:
                return newMessageInfo(f134188k, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဂ\u0002\u0004ဉ\u0004\u0005ဂ\u0003\u0006ဈ\u0005\tဈ\u0001\n\u001e", new Object[]{"a", "b", C45240c.f118157a, C51519ks.class, "e", C30325g.f82003a, C10662f.f35572a, C19618h.f54585a, "d", "i", C57667b.m88515b()});
            case 3:
                return new C51509ki();
            case 4:
                return new C51508kh();
            case 5:
                return f134188k;
            case 6:
                C63010eb ebVar = f134189m;
                if (ebVar == null) {
                    synchronized (C51509ki.class) {
                        ebVar = f134189m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134188k);
                            f134189m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
