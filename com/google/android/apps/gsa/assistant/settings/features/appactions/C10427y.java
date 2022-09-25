package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10342bb;
import com.google.android.apps.gsa.assistant.shared.appactions.v;
import com.google.android.apps.gsa.assistant.shared.appactions.w;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.y */
/* compiled from: PG */
public final /* synthetic */ class C10427y implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C10199ae f35150a;

    public /* synthetic */ C10427y(C10199ae aeVar) {
        this.f35150a = aeVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C10199ae aeVar = this.f35150a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x c = C10199ae.f34623a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AppShortcutDialog");
            ((C59052c) ((C59052c) c).mo56372aa(537)).mo56386p("Failed to fetch shortcut entry");
            return;
        }
        aeVar.f34644v = ((C10342bb) optional.get()).mo18443b();
        boolean isEmpty = aeVar.f34644v.f129465b.isEmpty();
        C10197ac acVar = new C10197ac(aeVar);
        v e = w.e();
        e.b(isEmpty ^ true ? 1 : 0);
        e.e(isEmpty);
        e.d(aeVar.f34644v);
        aeVar.f34624b.findViewById(R.id.chat_bubble_dialog_layout).b(acVar, e.a());
    }
}
