package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.l */
/* compiled from: PG */
final class C129370l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129369k f355283a;

    public C129370l(C129369k kVar) {
        this.f355283a = kVar;
    }

    public final void onClick(View view) {
        C129369k kVar = this.f355283a;
        C69664n.m101061g(view, "unused");
        C58976aa aaVar = C58975e.f156826a;
        C126879a aVar = kVar.f355281a;
        Intent addFlags = new Intent(kVar.f355282b.f355273c).addFlags(268435456);
        C69664n.m101060f(addFlags, "Intent(args.settingActio…t.FLAG_ACTIVITY_NEW_TASK)");
        C129364f fVar = kVar.f355282b;
        if ((fVar.f355271a & 4) != 0) {
            addFlags.setData(Uri.parse(fVar.f355274d));
        }
        C129364f fVar2 = kVar.f355282b;
        if ((fVar2.f355271a & 8) != 0) {
            addFlags.addCategory(fVar2.f355275e);
        }
        aVar.mo20101f(addFlags);
    }
}
