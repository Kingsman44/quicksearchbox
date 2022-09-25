package com.google.android.apps.gsa.staticplugins.opa.ambient.p8274i.p8275a;

import android.content.Intent;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50706ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.i.a.c */
/* compiled from: PG */
public abstract class C107081c {

    /* renamed from: a */
    private static final C59071e f298137a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.i.a.c");

    /* renamed from: e */
    public static C107081c m177811e(Intent intent) {
        C107079a g = m177812g();
        if (intent.hasExtra("EXTRA_MAIN_USE_CASE")) {
            g.mo95776b(intent.getIntExtra("EXTRA_MAIN_USE_CASE", 0));
        }
        String stringExtra = intent.getStringExtra("EXTRA_TITLE");
        if (stringExtra != null) {
            g.f298130a = Optional.m71637of(stringExtra);
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_DETAILS_PAGE_PAYLOAD");
        if (byteArrayExtra != null) {
            try {
                g.f298131b = Optional.m71637of((C50706ar) C62942bv.parseFrom((C62942bv) C50706ar.f131960a, byteArrayExtra, C62921ba.m95368a()));
            } catch (C62974ct e) {
                C59104x c = f298137a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DetailsStartReq");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(23489)).mo56386p("Could not parse DetailsPagePayload.");
            }
        }
        return g.mo95775a();
    }

    /* renamed from: g */
    public static C107079a m177812g() {
        C107079a aVar = new C107079a();
        aVar.f298132c = 1;
        return aVar;
    }

    /* renamed from: a */
    public abstract Optional mo95777a();

    /* renamed from: b */
    public abstract Optional mo95778b();

    /* renamed from: c */
    public abstract Optional mo95779c();

    /* renamed from: d */
    public abstract boolean mo95780d();

    /* renamed from: f */
    public final C50701am mo95784f() {
        if (mo95778b().isPresent()) {
            return C50701am.m85887a(((Integer) mo95778b().get()).intValue());
        }
        return C50701am.UNKNOWN;
    }
}
