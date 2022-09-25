package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.shared.C73844bk;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C59071e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ay */
/* compiled from: PG */
public final class C9670ay extends C9648ac {

    /* renamed from: a */
    public static final C59071e f33440a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.c.ay");

    /* renamed from: b */
    public C69464a f33441b;

    /* renamed from: c */
    public C58833ax f33442c;

    /* renamed from: d */
    public C22871g f33443d;

    /* renamed from: e */
    public C86124t f33444e;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_supporting_devices_section, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        if (this.f33444e.mo79746e(C90014bt.f247200cf)) {
            new C90873ag(((C73844bk) ((C58847bk) this.f33442c).f156646a).mo65327a(), this.f33443d, "fetching Dreamliner devices", new C9668aw(this)).mo85223a(new C9669ax());
        }
    }
}
