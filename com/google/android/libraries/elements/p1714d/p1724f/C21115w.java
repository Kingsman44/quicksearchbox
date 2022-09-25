package com.google.android.libraries.elements.p1714d.p1724f;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21294cj;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.youtube.elements.C66127bf;
import com.google.protos.youtube.elements.C66128bg;
import com.google.protos.youtube.elements.C66130bi;
import com.google.protos.youtube.elements.C66132bk;
import com.google.protos.youtube.elements.C66133bl;
import com.google.protos.youtube.elements.C66134bm;
import com.google.protos.youtube.elements.C66232es;
import com.google.protos.youtube.elements.C66248fh;
import java.nio.ByteBuffer;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.d.f.w */
/* compiled from: PG */
public final class C21115w implements C21294cj {

    /* renamed from: f */
    private static final C62921ba f59161f;

    /* renamed from: g */
    private static final C66134bm f59162g;

    /* renamed from: h */
    private static final C66134bm f59163h;

    /* renamed from: a */
    public final C69464a f59164a;

    /* renamed from: b */
    public final Context f59165b;

    /* renamed from: c */
    public final boolean f59166c;

    /* renamed from: d */
    public final C69464a f59167d;

    /* renamed from: e */
    public final C69464a f59168e;

    static {
        C62921ba baVar = new C62921ba();
        baVar.mo58832e(C66248fh.f180141d);
        f59161f = baVar;
        C66133bl blVar = (C66133bl) C66134bm.f179838c.createBuilder();
        blVar.copyOnWrite();
        C66134bm bmVar = (C66134bm) blVar.instance;
        bmVar.f179840a = 8;
        bmVar.f179841b = 0;
        f59162g = (C66134bm) blVar.build();
        C66133bl blVar2 = (C66133bl) C66134bm.f179838c.createBuilder();
        blVar2.copyOnWrite();
        C66134bm bmVar2 = (C66134bm) blVar2.instance;
        bmVar2.f179840a = 8;
        bmVar2.f179841b = 1;
        f59163h = (C66134bm) blVar2.build();
    }

    public C21115w(Context context, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f59165b = context;
        this.f59166c = ((Boolean) axVar.mo56109e(false)).booleanValue();
        this.f59164a = aVar;
        this.f59167d = aVar2;
        this.f59168e = aVar3;
        if (((Boolean) axVar2.mo56109e(false)).booleanValue() || ((Boolean) axVar3.mo56109e(false)).booleanValue()) {
            aVar.mo17428b();
        }
    }

    /* renamed from: a */
    static String m39647a(byte[] bArr) {
        Object obj;
        try {
            C66232es esVar = (C66232es) C62942bv.parseFrom((C62942bv) C66232es.f180105a, bArr, f59161f);
            C62940bt r0 = C62942bv.checkIsLite(C66248fh.f180141d);
            esVar.mo58887l(r0);
            Object l = esVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            return ((C66248fh) obj).f180144b;
        } catch (C62974ct unused) {
            return "Unknown template";
        }
    }

    /* renamed from: b */
    static ByteBuffer m39648b(Context context, C21279bv bvVar) {
        C66134bm bmVar;
        try {
            if (!bvVar.f59594d) {
                return bvVar.f59593c.duplicate();
            }
            ByteBuffer e = bvVar.mo26771e();
            C62921ba baVar = C62921ba.f169869a;
            C66130bi biVar = (C66130bi) C66132bk.f179834b.createBuilder((C66132bk) C62942bv.parseFrom((C62942bv) C66132bk.f179834b, e, baVar));
            if (context.getResources().getConfiguration().orientation == 2) {
                bmVar = f59162g;
            } else {
                bmVar = f59163h;
            }
            biVar.mo59442a("/system/orientation", bmVar);
            C66127bf bfVar = (C66127bf) C66128bg.f179829a.createBuilder();
            bfVar.mo58885m(C66132bk.f179835c, (C66132bk) biVar.build());
            return ByteBuffer.wrap(((C66128bg) bfVar.build()).toByteArray());
        } catch (C62974ct e2) {
            throw new C21260bc("Failed to deserialize Model", e2);
        }
    }
}
