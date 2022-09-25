package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.settings.p5781hq.p5782a.p5783a.C73560a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58833ax;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.v */
/* compiled from: PG */
public final class C109248v {

    /* renamed from: a */
    public final C86124t f304208a;

    /* renamed from: b */
    public final C58833ax f304209b;

    /* renamed from: c */
    private final Context f304210c;

    /* renamed from: d */
    private final boolean f304211d;

    public C109248v(Context context, C58833ax axVar, C86124t tVar, C58833ax axVar2) {
        this.f304210c = context;
        this.f304211d = axVar.mo56113h();
        this.f304208a = tVar;
        this.f304209b = axVar2;
    }

    /* renamed from: a */
    public final Intent mo97704a(C109246t tVar) {
        tVar.mo97693g();
        Intent putExtra = new Intent().putExtra("from_dock_mode", tVar.mo97694h()).putExtra("from_badge", tVar.mo97693g()).putExtra("launch_entry_animation", tVar.mo97688c()).putExtra("launch_exit_animation", tVar.mo97689d()).putExtra("close_entry_animation", tVar.mo97686a()).putExtra("close_exit_animation", tVar.mo97687b());
        if (tVar.mo97690e() != null) {
            tVar.mo97690e();
            putExtra.putExtra("nested_page", new ProtoLiteParcelable((MessageLite) tVar.mo97690e()));
        }
        if (tVar.mo97692f() != null) {
            tVar.mo97692f();
            putExtra.putExtra("updates_center_queue", new ProtoLiteParcelable((MessageLite) tVar.mo97692f()));
        }
        int i = tVar.mo97696i();
        if (i != 0) {
            putExtra.putExtra("entry_point_origin", i - 1);
        }
        putExtra.setFlags(67108864);
        if (this.f304208a.mo79746e(C90014bt.f247799nv)) {
            putExtra.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
        }
        putExtra.setClassName(this.f304210c, "com.google.android.apps.gsa.staticplugins.opa.hq.OpaHqActivity");
        if (!this.f304211d) {
            putExtra.addFlags(268435456);
        }
        if (this.f304208a.mo79746e(C90014bt.f247297eW) && this.f304209b.mo56113h()) {
            ((C73560a) this.f304209b.mo56107c()).mo65048c();
        }
        return putExtra;
    }
}
