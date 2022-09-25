package com.google.android.apps.gsa.staticplugins.p7806dj.p7809c;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7808b.C99599b;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7808b.C99600c;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7808b.C99601d;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7808b.C99602e;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7808b.C99603f;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7808b.C99604g;
import com.google.android.apps.gsa.velvet.p8863ui.settings.SettingsActivity;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118642e;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137589b;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.c.c */
/* compiled from: PG */
public final class C99608c implements C23113i {

    /* renamed from: a */
    private final C99606a f278752a;

    public C99608c(C99606a aVar) {
        this.f278752a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SettingsSearchEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onBackButtonClicked")) {
                ((C99604g) this.f278752a).f278743i.mo80935a();
                return;
            }
            int i = 0;
            if (str.equals("onQueryChanged_java.lang.String")) {
                String string = pVar.f63472a.getString("query");
                string.getClass();
                C99604g gVar = (C99604g) this.f278752a;
                ((C99599b) gVar.f278737c).f278728b.mo28730f(string, false);
                new C90873ag(gVar.f278736b.mo91512a(string), gVar.f278735a, "On related search results found", new C99602e(gVar)).mo85223a(C99603f.f278734a);
            } else if (str.equals("onSearchResultClicked_java.lang.String_java.lang.String")) {
                String string2 = pVar.f63472a.getString("preferenceName");
                string2.getClass();
                String string3 = pVar.f63472a.getString("filePath");
                string3.getClass();
                C99604g gVar2 = (C99604g) this.f278752a;
                if (gVar2.f278741g.containsKey(string2)) {
                    C137589b bVar = (C137589b) gVar2.f278741g.get(string2);
                    if (!gVar2.f278742h.mo78073R() || bVar != C137589b.LOCATION_CONSENT) {
                        new C90873ag(gVar2.f278740f.mo103868b(bVar), gVar2.f278735a, "Start TNG setting activity from SettingsSearchController", new C99600c(gVar2)).mo85223a(C99601d.f278732a);
                    }
                }
                C58485gu guVar = (C58485gu) ((C99599b) gVar2.f278737c).f278727a.f63720e;
                int size = guVar.size();
                while (i < size) {
                    C118642e eVar = (C118642e) guVar.get(i);
                    if ((eVar.f330986a & 2) == 0 || !eVar.f330988c.equals(string3)) {
                        i++;
                    } else {
                        Intent intent = new Intent(gVar2.f278738d, SettingsActivity.class);
                        intent.putExtra("filePath", string3);
                        intent.putExtra("preferenceName", string2);
                        intent.setFlags(67108864);
                        gVar2.f278743i.mo80935a();
                        gVar2.f278739e.mo65089a(intent);
                        return;
                    }
                }
            }
        }
    }
}
