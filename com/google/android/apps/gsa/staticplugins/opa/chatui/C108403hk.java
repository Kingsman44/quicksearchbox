package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.assist.p507f.p508a.C9413b;
import com.google.android.apps.gsa.shared.p7129r.C90468j;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hk */
/* compiled from: PG */
public final class C108403hk implements View.OnClickListener {

    /* renamed from: a */
    public static final C59071e f301511a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.hk");

    /* renamed from: b */
    public final C9413b f301512b;

    /* renamed from: c */
    public String f301513c;

    /* renamed from: d */
    public View f301514d;

    /* renamed from: e */
    private final C90468j f301515e;

    /* renamed from: f */
    private final C22871g f301516f;

    /* renamed from: g */
    private final C91097g f301517g;

    /* renamed from: h */
    private boolean f301518h = false;

    public C108403hk(C9413b bVar, C90468j jVar, C22871g gVar, C91097g gVar2) {
        this.f301512b = bVar;
        this.f301515e = jVar;
        this.f301516f = gVar;
        this.f301517g = gVar2;
    }

    /* renamed from: a */
    public final void mo96844a(Intent intent) {
        C59104x b = f301511a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Sharing");
        ((C59052c) ((C59052c) b).mo56372aa(24032)).mo56386p("#sharing - Launching share app chooser.");
        this.f301517g.mo65089a(Intent.createChooser(intent, (CharSequence) null));
        this.f301518h = false;
    }

    public final void onClick(View view) {
        C59071e eVar = f301511a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Sharing");
        ((C59052c) ((C59052c) b).mo56372aa(24033)).mo56386p("#sharing - Ui clicked.");
        if (!this.f301518h) {
            this.f301518h = true;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", this.f301513c);
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TITLE", this.f301513c);
            if (this.f301514d != null) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "Sharing");
                ((C59052c) ((C59052c) b2).mo56372aa(24035)).mo56386p("#sharing - Attempting to share with screenshot.");
                this.f301512b.mo17669e(this.f301515e.mo84218a(this.f301514d, (Activity) null, -1));
                C60856cj.m92911t(this.f301516f.mo28201a("#sharing - Save screenshot", new C108401hi(this)), new C108402hj(this, intent), C60826bg.f164896a);
                return;
            }
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "Sharing");
            ((C59052c) ((C59052c) b3).mo56372aa(24034)).mo56386p("#sharing - Sharing without screenshot.");
            mo96844a(intent);
        }
    }
}
