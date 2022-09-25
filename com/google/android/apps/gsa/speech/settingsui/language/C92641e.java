package com.google.android.apps.gsa.speech.settingsui.language;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckedTextView;
import android.widget.Toast;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.googlequicksearchbox.R;
import com.google.p395al.p408c.p414c.p416b.C8460ac;
import com.google.p395al.p408c.p414c.p416b.C8470am;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.e */
/* compiled from: PG */
final class C92641e implements AdapterView.OnItemLongClickListener {

    /* renamed from: a */
    final /* synthetic */ LanguagePreference f258605a;

    public C92641e(LanguagePreference languagePreference) {
        this.f258605a = languagePreference;
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        C8460ac acVar;
        CheckedTextView checkedTextView = (CheckedTextView) view;
        String obj = checkedTextView.getText().toString();
        Iterator it = ((C92541i) this.f258605a.f258599k.mo27525b()).mo87316a().f29533c.iterator();
        do {
            acVar = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator it2 = ((C8470am) it.next()).f29409a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C8460ac acVar2 = (C8460ac) it2.next();
                if (acVar2.f29382b.equals(obj)) {
                    acVar = acVar2;
                    continue;
                    break;
                }
            }
        } while (acVar == null);
        if (acVar == null) {
            return false;
        }
        if (checkedTextView.isChecked() || this.f258605a.f258589a.size() < this.f258605a.f258593e) {
            LanguagePreference languagePreference = this.f258605a;
            String str = acVar.f29383c;
            languagePreference.f258590b = str;
            languagePreference.f258589a.add(str);
            C92654a.m152611h(this.f258605a.f258589a);
            LanguagePreference languagePreference2 = this.f258605a;
            languagePreference2.mo87405b(obj, languagePreference2.f258590b);
            checkedTextView.setChecked(true);
            return true;
        }
        checkedTextView.setChecked(false);
        Toast.makeText(this.f258605a.getContext(), R.string.pref_multilang_notice_limit_reached, 0).show();
        return true;
    }
}
