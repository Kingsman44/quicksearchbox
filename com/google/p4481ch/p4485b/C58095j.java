package com.google.p4481ch.p4485b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4666c.p4667a.p4668a.C61776b;
import com.google.p4176bh.p4178b.p4179a.p4180a.C55781d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.ch.b.j */
/* compiled from: PG */
public final class C58095j extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C58095j f155284e;

    /* renamed from: m */
    private static volatile C63010eb f155285m;

    /* renamed from: a */
    public int f155286a;

    /* renamed from: b */
    public int f155287b;

    /* renamed from: c */
    public String f155288c;

    /* renamed from: d */
    public C63771b f155289d;

    /* renamed from: f */
    private int f155290f;

    /* renamed from: g */
    private C58091f f155291g;

    /* renamed from: h */
    private C61776b f155292h;

    /* renamed from: i */
    private C61752n f155293i;

    /* renamed from: j */
    private C62995dn f155294j = C62995dn.f170057a;

    /* renamed from: k */
    private C55781d f155295k;

    /* renamed from: l */
    private byte f155296l = 2;

    static {
        C58095j jVar = new C58095j();
        f155284e = jVar;
        C62942bv.registerDefaultInstance(C58095j.class, jVar);
    }

    private C58095j() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        this.f155288c = BuildConfig.FLAVOR;
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyLongList();
        emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155296l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155296l = b;
                return null;
            case 2:
                return newMessageInfo(f155284e, "\u0001\b\u0000\u0002\u0001c\b\u0001\u0000\u0005\u0001ဌ\u0000\u001bᐉ\u0018\u001cᐉ\u0019&ᐉ\u0016+2;ᐉ,Tဈ\fcᐉ\u001a", new Object[]{"a", C10662f.f35572a, "b", C58094i.f155283a, C19618h.f54585a, "d", C30325g.f82003a, "j", C58093h.f155282a, C19621k.f54601a, C45240c.f118157a, "i"});
            case 3:
                return new C58095j();
            case 4:
                return new C58092g();
            case 5:
                return f155284e;
            case 6:
                C63010eb ebVar = f155285m;
                if (ebVar == null) {
                    synchronized (C58095j.class) {
                        ebVar = f155285m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155284e);
                            f155285m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
