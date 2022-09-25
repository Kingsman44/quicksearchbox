package com.google.android.apps.gsa.staticplugins.settings;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.f */
/* compiled from: PG */
public final class C117314f {

    /* renamed from: a */
    private static final C59071e f325654a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.settings.f");

    /* renamed from: b */
    private final C68214a f325655b;

    /* renamed from: c */
    private final C68214a f325656c;

    /* renamed from: d */
    private final C9325m f325657d;

    /* renamed from: e */
    private final C58881cr f325658e;

    public C117314f(Context context, C68214a aVar, C68214a aVar2, C9325m mVar) {
        this.f325655b = aVar;
        this.f325656c = aVar2;
        this.f325657d = mVar;
        this.f325658e = C58886cw.m90973a(new C117313e(context));
    }

    /* renamed from: a */
    public final boolean mo103258a() {
        if (!C90772bp.m148274A(((C86124t) this.f325655b.mo27525b()).mo79745c(C90126fx.f251678nO), Build.MODEL)) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (((Boolean) this.f325658e.mo6453a()).booleanValue()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else if (!((bm) this.f325656c.mo27525b()).w()) {
            C59104x d = f325654a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AssistantSettings");
            ((C59052c) ((C59052c) d).mo56372aa(32820)).mo56386p("OPA isn't enabled, disabling settings entry.");
            return false;
        } else if (this.f325657d.mo17534a()) {
            return true;
        } else {
            C59104x d2 = f325654a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AssistantSettings");
            ((C59052c) ((C59052c) d2).mo56372aa(32819)).mo56386p("AGA isn't the default assistant app, hiding settings entry.");
            return false;
        }
    }
}
