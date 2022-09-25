package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.assistant.contexttrigger.C17740h;
import com.google.android.libraries.assistant.contexttrigger.p1454a.C17613i;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17666g;
import com.google.android.libraries.assistant.contexttrigger.p1463g.C17739b;
import com.google.android.libraries.assistant.contexttrigger.p1464h.C17741a;
import com.google.android.libraries.assistant.contexttrigger.p1465i.C17748f;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17793i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.t */
/* compiled from: PG */
public final class C17730t implements C17740h {

    /* renamed from: a */
    public static final C59071e f50938a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.f.t");

    /* renamed from: b */
    public final C17613i f50939b;

    /* renamed from: c */
    public final C17793i f50940c;

    /* renamed from: d */
    public final C17739b f50941d;

    /* renamed from: e */
    public final C17666g f50942e;

    /* renamed from: f */
    public final C17748f f50943f;

    /* renamed from: g */
    public final C17703ai f50944g;

    /* renamed from: h */
    public final Executor f50945h;

    /* renamed from: i */
    public final C17741a f50946i;

    public C17730t(C17613i iVar, C17793i iVar2, C17739b bVar, C17666g gVar, C17703ai aiVar, C17748f fVar, Executor executor, C17741a aVar) {
        this.f50939b = iVar;
        this.f50940c = iVar2;
        this.f50941d = bVar;
        this.f50942e = gVar;
        this.f50944g = aiVar;
        this.f50943f = fVar;
        this.f50945h = executor;
        this.f50946i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo23452a(C48915q qVar, boolean z) {
        C48919u uVar = qVar.f126577b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        String a = C17709ao.m34990a(uVar);
        C59104x b = f50938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CtfManager");
        ((C59052c) ((C59052c) b).mo56372aa(47017)).mo56355H("remove request for trigger key: %s, isClientInitiated: %s", a, z);
        C17703ai aiVar = this.f50944g;
        C58490gz gzVar = new C58490gz(4);
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        return C47633f.m84733g(C47633f.m84733g(aiVar.f50900a.mo46039a(new C17698ad(aiVar, a, e, e2, gzVar), aiVar.f50901b)).mo51515h(new C17699ae(e, gzVar, e2), aiVar.f50901b)).mo51516i(new C17722l(this, qVar, z), this.f50945h);
    }
}
