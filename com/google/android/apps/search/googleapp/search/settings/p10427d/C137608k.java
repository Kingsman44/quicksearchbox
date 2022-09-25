package com.google.android.apps.search.googleapp.search.settings.p10427d;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.search.settings.p10424a.C137565e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.d.k */
/* compiled from: PG */
public final class C137608k implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C137609l f374296a;

    public C137608k(C137609l lVar) {
        this.f374296a = lVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C137609l.f374298b.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41011));
        cVar.mo56386p("Failed to load first run data");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        RecyclerView recyclerView;
        C0640fb fbVar;
        C137565e eVar = (C137565e) obj;
        C69664n.m101061g(eVar, "searchSettings");
        C137609l lVar = this.f374296a;
        String str = eVar.f374179b;
        C69664n.m101060f(str, "searchSettings.selectedLanguageHl");
        View view = lVar.f374300d.getView();
        View view2 = null;
        TextView textView = view != null ? (TextView) view.findViewById(R.id.googleapp_search_language_selected_language) : null;
        if (textView != null) {
            C8506p pVar = (C8506p) lVar.f374305i.get(str);
            textView.setText(pVar != null ? pVar.f29513a : null);
        }
        View view3 = lVar.f374300d.getView();
        if (view3 != null) {
            view2 = view3.findViewById(R.id.googleapp_search_language_selected_layout);
        }
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(str.length() == 0 ? 8 : 0);
        }
        C137609l lVar2 = this.f374296a;
        String str2 = eVar.f374179b;
        C69664n.m101060f(str2, "searchSettings.selectedLanguageHl");
        for (Object next : lVar2.f374306j) {
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            C137599b bVar = (C137599b) next;
            boolean l = C69664n.m101066l(str2, bVar.f374277c);
            if (bVar.f374279e != l) {
                bVar.f374279e = l;
                View view4 = lVar2.f374300d.getView();
                if (!(view4 == null || (recyclerView = (RecyclerView) view4.findViewById(R.id.googleapp_search_language_preferences_layout)) == null || (fbVar = recyclerView.mAdapter) == null)) {
                    fbVar.notifyItemChanged(i);
                }
            }
            i = i2;
        }
    }
}
