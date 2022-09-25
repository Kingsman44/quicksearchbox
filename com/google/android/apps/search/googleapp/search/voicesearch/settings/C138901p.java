package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.C138889f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import java.util.Iterator;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.p */
/* compiled from: PG */
final class C138901p implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138899o f377819a;

    public C138901p(C138899o oVar) {
        this.f377819a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        RecyclerView recyclerView;
        C0640fb fbVar;
        C138889f.C138890a aVar = (C138889f.C138890a) bVar;
        C138899o oVar = this.f377819a;
        C69664n.m101061g(aVar, "event");
        String str = aVar.f377784a;
        Iterator it = oVar.f377813m.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            C138891g gVar = (C138891g) next;
            if (C69664n.m101066l(str, gVar.f377786b)) {
                if (gVar.f377787c) {
                    if (oVar.f377814n.size() == 1) {
                        Snackbar p = Snackbar.m79660p(oVar.f377803c.requireView(), R.string.googleapp_voice_settings_languages_setting_no_selection_notice, -1);
                        p.mo48350o();
                        p.mo48343h();
                    }
                    oVar.f377814n.remove(str);
                } else if (oVar.f377814n.size() >= 5) {
                    Snackbar p2 = Snackbar.m79660p(oVar.f377803c.requireView(), R.string.googleapp_voice_settings_languages_setting_limit_reached_notice, -1);
                    p2.mo48350o();
                    p2.mo48343h();
                    break;
                } else {
                    oVar.f377814n.add(str);
                }
                oVar.mo114628c();
                gVar.f377787c = !gVar.f377787c;
                View view = oVar.f377803c.getView();
                if (!(view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.googleapp_voice_languages_setting_language_list)) == null || (fbVar = recyclerView.mAdapter) == null)) {
                    fbVar.notifyItemChanged(i);
                }
                if (oVar.f377814n.size() > 0) {
                    oVar.mo114627b(oVar.f377814n);
                }
                Button a = oVar.mo114626a();
                if (oVar.f377814n.size() > 1) {
                    a.setVisibility(0);
                } else {
                    a.setVisibility(8);
                }
            }
            i = i2;
        }
        return C47392e.f123115a;
    }
}
