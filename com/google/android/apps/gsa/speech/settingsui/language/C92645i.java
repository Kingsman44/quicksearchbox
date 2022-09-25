package com.google.android.apps.gsa.speech.settingsui.language;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.i */
/* compiled from: PG */
final class C92645i implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguagePreference f258613a;

    public C92645i(LanguagePreference languagePreference) {
        this.f258613a = languagePreference;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r6.f258589a.contains(r6.f258590b) == false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r5, int r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r0 = r4.f258613a
            java.util.List r0 = r0.f258594f
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r1 = r4.f258613a
            dagger.a r1 = r1.f258599k
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.speech.n.i r1 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r1
            com.google.al.c.c.b.w r1 = r1.mo87316a()
            boolean r1 = com.google.android.apps.gsa.speech.utils.C92654a.m152612i(r1, r0)
            if (r1 != 0) goto L_0x001f
            return
        L_0x001f:
            r1 = 0
            if (r7 == 0) goto L_0x0057
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r7 = r4.f258613a
            java.util.List r7 = r7.f258589a
            int r7 = r7.size()
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r2 = r4.f258613a
            int r3 = r2.f258593e
            if (r7 >= r3) goto L_0x003d
            java.util.List r6 = r2.f258589a
            r6.add(r0)
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r6 = r4.f258613a
            java.util.List r6 = r6.f258589a
            com.google.android.apps.gsa.speech.utils.C92654a.m152611h(r6)
            goto L_0x005e
        L_0x003d:
            android.app.AlertDialog r5 = (android.app.AlertDialog) r5
            android.widget.ListView r5 = r5.getListView()
            r5.setItemChecked(r6, r1)
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r5 = r4.f258613a
            android.content.Context r5 = r5.getContext()
            r6 = 2132091595(0x7f1522cb, float:1.9823563E38)
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r1)
            r5.show()
            return
        L_0x0057:
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r6 = r4.f258613a
            java.util.List r6 = r6.f258589a
            r6.remove(r0)
        L_0x005e:
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r6 = r4.f258613a
            java.util.List r6 = r6.f258589a
            int r6 = r6.size()
            r7 = 1
            if (r6 == r7) goto L_0x007f
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r6 = r4.f258613a
            java.util.List r6 = r6.f258589a
            int r6 = r6.size()
            if (r6 <= r7) goto L_0x00a8
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r6 = r4.f258613a
            java.util.List r0 = r6.f258589a
            java.lang.String r6 = r6.f258590b
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L_0x00a8
        L_0x007f:
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r6 = r4.f258613a
            java.util.List r0 = r6.f258589a
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6.f258590b = r0
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r6 = r4.f258613a
            dagger.a r6 = r6.f258599k
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.speech.n.i r6 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r6
            com.google.al.c.c.b.w r6 = r6.mo87316a()
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r0 = r4.f258613a
            java.lang.String r0 = r0.f258590b
            java.lang.String r6 = com.google.android.apps.gsa.speech.utils.C92654a.m152608e(r6, r0)
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r0 = r4.f258613a
            java.lang.String r1 = r0.f258590b
            r0.mo87405b(r6, r1)
        L_0x00a8:
            android.app.AlertDialog r5 = (android.app.AlertDialog) r5
            r6 = -1
            android.widget.Button r5 = r5.getButton(r6)
            com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference r6 = r4.f258613a
            java.util.List r6 = r6.f258589a
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r7
            r5.setEnabled(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.settingsui.language.C92645i.onClick(android.content.DialogInterface, int, boolean):void");
    }
}
