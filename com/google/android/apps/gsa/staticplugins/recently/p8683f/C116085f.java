package com.google.android.apps.gsa.staticplugins.recently.p8683f;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116199b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Group;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.f.f */
/* compiled from: PG */
public final /* synthetic */ class C116085f implements C116086g {

    /* renamed from: a */
    public final /* synthetic */ Group f321881a;

    public /* synthetic */ C116085f(Group group) {
        this.f321881a = group;
    }

    /* renamed from: a */
    public final void mo102473a(SharedPreferences.Editor editor) {
        C116199b bVar = new C116199b(this.f321881a);
        while (bVar.hasNext()) {
            C116087h.m192470g(editor, bVar.next(), false);
        }
    }
}
