package com.google.android.libraries.lens.p1994b;

import android.content.Context;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146039s;
import com.google.android.gms.tasks.C146042v;
import com.google.android.play.core.p3538g.C45121ag;
import com.google.android.play.core.p3538g.C45122ah;
import com.google.android.play.core.p3538g.C45140az;
import com.google.android.play.core.p3538g.C45180o;
import com.google.android.play.core.p3538g.C45187v;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.lens.b.b */
/* compiled from: PG */
public final class C24068b implements C24067a {

    /* renamed from: a */
    private static final C58974d f65749a = C58974d.m91135i("FeatureSplitManagerImpl");

    /* renamed from: b */
    private final Context f65750b;

    /* renamed from: c */
    private final C45187v f65751c;

    public C24068b(Context context, C45187v vVar) {
        this.f65750b = context;
        this.f65751c = vVar;
    }

    /* renamed from: a */
    public final void mo29458a(C45140az azVar) {
        this.f65751c.mo49001h(azVar);
    }

    /* renamed from: b */
    public final void mo29459b(C45140az azVar) {
        this.f65751c.mo49002i(azVar);
    }

    /* renamed from: c */
    public final boolean mo29460c() {
        return this.f65751c.mo49000g().contains("lens_ondevice_engine_feature_module");
    }

    /* renamed from: d */
    public final void mo29461d() {
        ((C58970a) ((C58970a) f65749a.mo56224b()).mo56372aa(48753)).mo56389s("Loading %s", "lens_ondevice_engine");
        C45180o.m80432a(this.f65750b, "lens_ondevice_engine");
    }

    /* renamed from: e */
    public final void mo29462e() {
        this.f65751c.mo48994a(Arrays.asList(new String[]{"lens_ondevice_engine_feature_module"}));
    }

    /* renamed from: f */
    public final void mo29463f(C146042v vVar, C146039s sVar) {
        C45187v vVar2 = this.f65751c;
        C45121ag agVar = new C45121ag();
        agVar.mo48957a("lens_ondevice_engine_feature_module");
        C146006ab e = vVar2.mo48998e(new C45122ah(agVar));
        e.mo122499r(vVar);
        e.mo122498q(sVar);
    }
}
