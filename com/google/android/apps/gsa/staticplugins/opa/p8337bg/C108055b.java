package com.google.android.apps.gsa.staticplugins.opa.p8337bg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.permissions.C91075b;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114513a;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114514b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bg.b */
/* compiled from: PG */
public final class C108055b extends C91090a implements C91079f {

    /* renamed from: e */
    final C91075b f300601e;

    /* renamed from: f */
    private final C114513a f300602f;

    /* renamed from: g */
    private final C87568k f300603g;

    public C108055b(C107710u uVar, C107698i iVar, C114514b bVar, C90465g gVar, C87568k kVar, Context context, Activity activity, C68214a aVar) {
        super(activity, activity, 1000);
        C114513a a = bVar.mo101365a((ViewGroup) null, true != C90685b.m148054b(context, (C90021c) aVar.mo27525b()) ? "com.google.android.googlequicksearchbox.NEXUS_OPA_FEEDBACK" : "com.google.android.googlequicksearchbox.ANDROID_TABLET_OPA_FEEDBACK", gVar.mo84210a(context));
        this.f300602f = a;
        a.mo101364e(uVar, iVar);
        this.f300601e = new C91075b(this.f254379a, this);
        this.f300603g = kVar;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        if (!"opa-android://send_feedback".equals(intent.getDataString())) {
            C87565h hVar = new C87565h();
            hVar.f236566l = intent;
            hVar.f236497A = true;
            hVar.f236560f = 4;
            this.f300603g.mo81689c(this.f254379a, hVar.mo81685a(), 335544320);
        } else {
            this.f300602f.mo101361a();
        }
        return true;
    }

    /* renamed from: ju */
    public final void mo81047ju(String[] strArr, int i, C91078e eVar) {
        this.f300601e.mo81047ju(strArr, i, eVar);
    }
}
