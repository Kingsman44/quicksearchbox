package com.google.android.apps.search.googleapp.search.srp.error;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.p10318i.C136216e;
import com.google.android.apps.search.googleapp.p10318i.C136217f;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138791b;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.p4527a.C58970a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.p */
/* compiled from: PG */
final class C137817p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137821t f374945a;

    /* renamed from: b */
    final /* synthetic */ C136217f f374946b;

    public C137817p(C137821t tVar, C136217f fVar) {
        this.f374945a = tVar;
        this.f374946b = fVar;
    }

    public final void onClick(View view) {
        C137821t tVar = this.f374945a;
        C69664n.m101060f(view, "view");
        C136216e a = C136216e.m221349a(this.f374946b.f370973b);
        if (a == null) {
            a = C136216e.GRANT_MIC_PERMISSION;
        }
        C69664n.m101060f(a, "buttonArgs.buttonType");
        tVar.f374957g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            Intent addCategory = new Intent().setAction("android.settings.APPLICATION_DETAILS_SETTINGS").addCategory("android.intent.category.DEFAULT");
            Context context = tVar.f374954d.getContext();
            Intent addFlags = addCategory.setData(Uri.parse("package:".concat(String.valueOf(context != null ? context.getPackageName() : null)))).addFlags(268435456).addFlags(1073741824).addFlags(8388608);
            C69664n.m101060f(addFlags, "Intent()\n        .setAct…ITY_EXCLUDE_FROM_RECENTS)");
            tVar.f374958h.mo51345a(addFlags);
        } else if (ordinal != 9) {
            switch (ordinal) {
                case 2:
                    C47393f.m84237h(C137822u.f374964a, view);
                    return;
                case 3:
                case 7:
                    Intent flags = new Intent("android.settings.WIFI_SETTINGS").setFlags(268435456);
                    C69664n.m101060f(flags, "Intent(Settings.ACTION_W…t.FLAG_ACTIVITY_NEW_TASK)");
                    tVar.f374958h.mo51345a(flags);
                    return;
                case 4:
                    tVar.mo113984c();
                    return;
                case 5:
                    Intent flags2 = new Intent("android.settings.AIRPLANE_MODE_SETTINGS").setFlags(268435456);
                    C69664n.m101060f(flags2, "Intent(Settings.ACTION_A…t.FLAG_ACTIVITY_NEW_TASK)");
                    tVar.f374958h.mo51345a(flags2);
                    return;
                case 6:
                    Intent flags3 = new Intent("android.settings.DATA_ROAMING_SETTINGS").setFlags(268435456);
                    C69664n.m101060f(flags3, "Intent(Settings.ACTION_D…t.FLAG_ACTIVITY_NEW_TASK)");
                    tVar.f374958h.mo51345a(flags3);
                    return;
                default:
                    ((C58970a) C137821t.f374950a.mo56226d()).mo56389s("No handler for error card button %s", a.name());
                    return;
            }
        } else {
            C47393f.m84237h(C138791b.f377544a, view);
        }
    }
}
