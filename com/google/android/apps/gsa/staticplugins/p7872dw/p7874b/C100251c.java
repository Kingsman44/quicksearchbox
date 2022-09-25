package com.google.android.apps.gsa.staticplugins.p7872dw.p7874b;

import android.os.Bundle;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6699df.C85355a;
import com.google.android.apps.gsa.staticplugins.p7872dw.p7873a.C100247b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.b.c */
/* compiled from: PG */
public final class C100251c implements C23113i {

    /* renamed from: a */
    private final C100249a f280370a;

    public C100251c(C100249a aVar) {
        this.f280370a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        String str3;
        if ("SuggestFeedbackEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onAdditionalCommentTextChanged_java.lang.String")) {
                String string = pVar.f63472a.getString("text");
                string.getClass();
                ((C23251a) ((C100247b) this.f280370a).f280363b.mo91824b()).mo28730f(string, false);
            } else if (str.equals("onBackButtonClicked")) {
                C100249a aVar = this.f280370a;
                C58976aa aaVar = C58975e.f156826a;
                ((C100247b) aVar).f280365d.mo80935a();
            } else if (str.equals("onDoneButtonClicked")) {
                C100249a aVar2 = this.f280370a;
                C58976aa aaVar2 = C58975e.f156826a;
                ((C100247b) aVar2).f280365d.mo80935a();
            } else {
                boolean z = true;
                if (str.equals("onOptionIdSelectedChanged_int")) {
                    int intValue = Integer.valueOf(pVar.f63472a.getInt("id")).intValue();
                    C100247b bVar = (C100247b) this.f280370a;
                    ((C23251a) bVar.f280363b.mo91827e()).mo28730f(Integer.valueOf(intValue), false);
                    C23251a aVar3 = (C23251a) bVar.f280363b.mo91830h();
                    if (intValue != 7) {
                        z = false;
                    }
                    aVar3.mo28730f(Boolean.valueOf(z), false);
                    ((C23251a) bVar.f280363b.mo91829g()).mo28730f(Boolean.valueOf(C100247b.m166145e(intValue, (String) ((C23251a) bVar.f280363b.mo91828f()).f63720e)), false);
                } else if (str.equals("onOtherOptionTextChanged_java.lang.String")) {
                    String string2 = pVar.f63472a.getString("text");
                    string2.getClass();
                    C100247b bVar2 = (C100247b) this.f280370a;
                    ((C23251a) bVar2.f280363b.mo91828f()).mo28730f(string2, false);
                    ((C23251a) bVar2.f280363b.mo91829g()).mo28730f(Boolean.valueOf(C100247b.m166145e(((Integer) ((C23251a) bVar2.f280363b.mo91827e()).f63720e).intValue(), string2)), false);
                } else if (str.equals("onSendButtonClicked")) {
                    C100249a aVar4 = this.f280370a;
                    C58976aa aaVar3 = C58975e.f156826a;
                    C100247b bVar3 = (C100247b) aVar4;
                    if (((Boolean) ((C23251a) bVar3.f280363b.mo91829g()).f63720e).booleanValue()) {
                        ((C23251a) bVar3.f280363b.mo91831i()).mo28730f(true, false);
                        C85355a aVar5 = bVar3.f280364c;
                        String str4 = (String) ((C23251a) bVar3.f280363b.mo91824b()).f63720e;
                        HashMap hashMap = new HashMap();
                        hashMap.put("choice_id_cc", String.valueOf(((C23251a) bVar3.f280363b.mo91827e()).f63720e));
                        hashMap.put("choices_sc", (String) ((C23251a) bVar3.f280363b.mo91832j()).f63720e);
                        switch (((Integer) ((C23251a) bVar3.f280363b.mo91827e()).f63720e).intValue()) {
                            case 1:
                                str3 = bVar3.f280362a.getResources().getString(R.string.irrelevant);
                                break;
                            case 2:
                                str3 = bVar3.f280362a.getResources().getString(R.string.violence_or_gore);
                                break;
                            case 3:
                                str3 = bVar3.f280362a.getResources().getString(R.string.sexually_explicit_vulgar_or_profane);
                                break;
                            case 4:
                                str3 = bVar3.f280362a.getResources().getString(R.string.hateful_against_groups);
                                break;
                            case 5:
                                str3 = bVar3.f280362a.getResources().getString(R.string.sensitive_or_disparaging_for_individuals);
                                break;
                            case 6:
                                str3 = bVar3.f280362a.getResources().getString(R.string.dangerous_or_harmful_activity);
                                break;
                            case 7:
                                str3 = bVar3.f280362a.getResources().getString(R.string.report_other_option);
                                break;
                            default:
                                str3 = BuildConfig.FLAVOR;
                                break;
                        }
                        hashMap.put("choice_cc", str3);
                        hashMap.put("suggestion-type_sc", (String) bVar3.f280363b.mo91834l().f63720e);
                        hashMap.put("suggestion-subtypes_sc", (String) bVar3.f280363b.mo91833k().f63720e);
                        hashMap.put("scuti_ui_version", "1");
                        if (((Integer) ((C23251a) bVar3.f280363b.mo91827e()).f63720e).intValue() == 7) {
                            hashMap.put("choice_additional_comment_cc", (String) ((C23251a) bVar3.f280363b.mo91828f()).f63720e);
                        }
                        aVar5.mo78888c(str4, hashMap);
                    }
                }
            }
        }
    }
}
