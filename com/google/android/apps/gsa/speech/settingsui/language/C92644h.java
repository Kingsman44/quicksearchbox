package com.google.android.apps.gsa.speech.settingsui.language;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6513aj.p6515b.C84540a;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.shared.util.C91035f;
import com.google.android.apps.gsa.speech.hotword.p7283b.C92351a;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.h */
/* compiled from: PG */
final class C92644h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguagePreference f258611a;

    /* renamed from: b */
    private final Context f258612b;

    public C92644h(LanguagePreference languagePreference, Context context) {
        this.f258611a = languagePreference;
        this.f258612b = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        List list;
        ArrayList b = C58597ky.m90211b(this.f258611a.f258589a);
        b.remove(this.f258611a.f258590b);
        LanguagePreference languagePreference = this.f258611a;
        C84540a aVar = languagePreference.f258592d;
        aVar.f230070a = languagePreference.f258590b;
        aVar.f230071b = b;
        String str = aVar.f230070a;
        if (str == null || aVar.f230071b == null) {
            throw new IllegalStateException("The spoken and additiona languages must be set before building the suggestions list.");
        }
        if (aVar.mo78260d(str)) {
            list = C58485gu.m89845m();
        } else {
            List list2 = aVar.f230071b;
            ArrayList arrayList = new ArrayList();
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) list2.get(i2);
                if (aVar.mo78258c(str2)) {
                    arrayList.add(str2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str3 = (String) arrayList.get(i3);
                if (aVar.mo78260d(str3)) {
                    arrayList2.add(str3);
                }
            }
            if (aVar.mo78258c(aVar.f230070a)) {
                Collections.sort(arrayList2, aVar);
                list = aVar.mo78257b(arrayList2);
            } else {
                Collections.sort(arrayList, aVar);
                list = aVar.mo78257b(arrayList);
            }
        }
        if (list.isEmpty()) {
            this.f258611a.mo87404a(dialogInterface);
            return;
        }
        LanguagePreference languagePreference2 = this.f258611a;
        Context context = this.f258612b;
        C8513w a = ((C92541i) languagePreference2.f258599k.mo27525b()).mo87316a();
        C90580b bVar = (C90580b) list.get(0);
        String e = C92654a.m152608e(a, languagePreference2.f258590b);
        String e2 = C92654a.m152608e(a, bVar.f253240b);
        String locale = context.getResources().getConfiguration().locale.toString();
        String string = context.getString(R.string.pref_multilang_override_message, new Object[]{C91035f.m148707c(e, languagePreference2.f258590b, locale), C91035f.m148707c(e2, bVar.f253240b, locale)});
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.multilang_suggestion_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.override_dialog_message)).setText(string);
        if (((C92351a) languagePreference2.f258597i.mo27525b()).mo86999a(C58833ax.m90834k(false)).containsKey(languagePreference2.f258590b)) {
            TextView textView = (TextView) inflate.findViewById(R.id.multilang_enabled_hotword);
            ((LinearLayout) textView.getParent()).removeView(textView);
        }
        if ((bVar.f253239a & 8) == 0) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.multilang_enabled_speakerid);
            ((LinearLayout) textView2.getParent()).removeView(textView2);
        }
        new AlertDialog.Builder(context).setTitle(R.string.pref_multilang_override_dialog_title).setView(inflate).setPositiveButton(R.string.pref_multilang_override_doit, new C92643g(languagePreference2, bVar, dialogInterface)).setNegativeButton(R.string.pref_multilang_override_dont, new C92642f(languagePreference2, dialogInterface)).show();
    }
}
