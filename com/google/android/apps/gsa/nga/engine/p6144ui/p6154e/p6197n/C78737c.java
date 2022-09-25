package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6197n;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.shared.android.C80952h;
import com.google.common.p4526f.C59052c;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.n.c */
/* compiled from: PG */
public final /* synthetic */ class C78737c implements C80952h {

    /* renamed from: a */
    public static final /* synthetic */ C78737c f216769a = new C78737c();

    private /* synthetic */ C78737c() {
    }

    /* renamed from: a */
    public final void mo73592a(Object obj, Intent intent) {
        C78739e eVar = (C78739e) obj;
        String stringExtra = intent.getStringExtra("type");
        ((C59052c) ((C59052c) eVar.f216770a.mo56224b()).mo56372aa(5287)).mo56389s("Receiving sys ui event of type %s.", stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            ((C59052c) ((C59052c) eVar.f216770a.mo56226d()).mo56372aa(5289)).mo56386p("Empty sys ui event type.");
            return;
        }
        C78738d dVar = (C78738d) ((Map) eVar.f216771b.mo27525b()).get(stringExtra);
        if (dVar == null) {
            ((C59052c) ((C59052c) eVar.f216770a.mo56226d()).mo56372aa(5288)).mo56386p("No event listener registered for sys ui event.");
        } else {
            eVar.f216772c.mo28212l("[NGA] Execute SysUi event listener", new C78736b(dVar, intent));
        }
    }
}
