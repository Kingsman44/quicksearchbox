package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import com.google.android.apps.gsa.shared.p7148ui.C90627ac;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91738a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.n */
/* compiled from: PG */
public final class C105469n implements C91738a {

    /* renamed from: b */
    private static final C59071e f294131b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.shared.n");

    /* renamed from: a */
    public C91738a f294132a;

    /* renamed from: a */
    public final void mo86233a(C7718hj hjVar, boolean z) {
        C91738a aVar = this.f294132a;
        if (aVar == null) {
            ((C59052c) ((C59052c) f294131b.mo56226d()).mo56372aa(22334)).mo56386p("Trying to handle entry dismissing events but EntryDismisser is null");
            int i = C90755l.f253831a;
            return;
        }
        aVar.mo86233a(hjVar, false);
    }

    /* renamed from: b */
    public final boolean mo86234b(C7718hj hjVar, C90627ac acVar, String str) {
        C91738a aVar = this.f294132a;
        if (aVar != null) {
            return aVar.mo86234b(hjVar, acVar, str);
        }
        ((C59052c) ((C59052c) f294131b.mo56226d()).mo56372aa(22335)).mo56386p("Trying to handle entry dismissing events but EntryDismisser is null");
        int i = C90755l.f253831a;
        return false;
    }

    /* renamed from: c */
    public final void mo86235c(C7718hj hjVar) {
        C91738a aVar = this.f294132a;
        if (aVar == null) {
            ((C59052c) ((C59052c) f294131b.mo56226d()).mo56372aa(22333)).mo56386p("Trying to handle entry dismissing events but EntryDismisser is null");
            int i = C90755l.f253831a;
            return;
        }
        aVar.mo86235c(hjVar);
    }
}
