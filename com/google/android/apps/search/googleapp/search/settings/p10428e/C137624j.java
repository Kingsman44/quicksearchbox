package com.google.android.apps.search.googleapp.search.settings.p10428e;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.List;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.j */
/* compiled from: PG */
public final class C137624j implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C137625k f374347a;

    public C137624j(C137625k kVar) {
        this.f374347a = kVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C137625k.f374348a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41016));
        cVar.mo56386p("Failed to load first run data");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        RecyclerView recyclerView;
        C0640fb fbVar;
        String str;
        String str2 = (String) obj;
        C69664n.m101061g(str2, "searchRegionCode");
        C137625k kVar = this.f374347a;
        View view = kVar.f374350c.getView();
        List list = null;
        TextView textView = view != null ? (TextView) view.findViewById(R.id.googleapp_search_region_selected_region) : null;
        if (textView != null) {
            if (str2.length() == 0) {
                str = kVar.f374349b.getResources().getString(R.string.googleapp_search_region_default);
            } else {
                str = new Locale(BuildConfig.FLAVOR, str2).getDisplayCountry();
            }
            textView.setText(str);
        }
        C137625k kVar2 = this.f374347a;
        List list2 = kVar2.f374357j;
        if (list2 == null) {
            C69664n.m101065k("searchRegionEntries");
        } else {
            list = list2;
        }
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            C137615b bVar = (C137615b) next;
            boolean l = C69664n.m101066l(str2, bVar.f374329e);
            if (bVar.f374330f != l) {
                bVar.f374330f = l;
                View view2 = kVar2.f374350c.getView();
                if (!(view2 == null || (recyclerView = (RecyclerView) view2.findViewById(R.id.googleapp_search_region_preferences_layout)) == null || (fbVar = recyclerView.mAdapter) == null)) {
                    fbVar.notifyItemChanged(i);
                }
            }
            i = i2;
        }
    }
}
