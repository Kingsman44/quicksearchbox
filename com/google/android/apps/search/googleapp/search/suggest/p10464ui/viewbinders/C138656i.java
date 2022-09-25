package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.p10139b.C133488d;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47586cj;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58838bb;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.i */
/* compiled from: PG */
public final class C138656i extends C46756m {

    /* renamed from: a */
    private final Map f377130a;

    /* renamed from: b */
    private final C47770dh f377131b;

    /* renamed from: c */
    private final boolean f377132c;

    /* renamed from: d */
    private final boolean f377133d;

    public C138656i(Map map, C47770dh dhVar, boolean z, boolean z2) {
        this.f377130a = map;
        this.f377131b = dhVar;
        this.f377132c = z;
        this.f377133d = z2;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(true != this.f377132c ? R.layout.googleapp_core_suggestion : R.layout.googleapp_pixel_core_suggestion, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C138015ag agVar = (C138015ag) obj;
        boolean z = true;
        if (agVar.f375483c.size() != 1) {
            z = false;
        }
        C58838bb.m90868c(z);
        C138030av avVar = (C138030av) agVar.f375483c.get(0);
        C138658k a = ((CoreSuggestionView) view).mo17754z();
        if (a.f377146i) {
            a.f377138a.findViewById(R.id.googleapp_pixel_two_line_suggestion_min_height).setVisibility(8);
        }
        a.mo114449b((String) null);
        a.f377142e.setVisibility(8);
        C47449e eVar = a.f377139b;
        eVar.mo51286a().mo11876n(a.f377143f);
        C47449e eVar2 = a.f377139b;
        eVar2.mo51286a().mo11876n(a.f377144g);
        a.f377144g.setVisibility(8);
        a.f377144g.setClickable(false);
        C47449e eVar3 = a.f377139b;
        eVar3.mo51286a().mo11876n(a.f377145h);
        a.f377145h.setVisibility(8);
        a.f377147j.setVisibility(8);
        ViewGroup viewGroup = a.f377148k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (this.f377132c) {
            if (agVar.f375486f) {
                if (agVar.f375487g) {
                    view.setBackgroundResource(R.drawable.googleapp_pixel_only_suggestion_in_group_bg);
                } else {
                    view.setBackgroundResource(R.drawable.googleapp_pixel_top_suggestion_bg);
                }
            } else if (agVar.f375487g) {
                view.setBackgroundResource(R.drawable.googleapp_pixel_bottom_suggestion_bg);
            } else {
                view.setBackgroundResource(R.drawable.googleapp_pixel_middle_suggestion_bg);
            }
        }
        View findViewById = view.findViewById(R.id.googleapp_core_suggestion);
        Map map = this.f377130a;
        C138029au a2 = C138029au.m224331a(avVar.f375541d);
        if (a2 == null) {
            a2 = C138029au.QUERY;
        }
        C138635an anVar = (C138635an) map.get(a2);
        anVar.getClass();
        findViewById.setOnClickListener(new C47591co(this.f377131b, "Clicked suggestion.", new C138653f(anVar, avVar, view)));
        C133488d.m216677b(findViewById, C133488d.m216676a(this.f377131b, new C138654g(anVar, avVar, view), "Long-clicked suggestion"));
        if (this.f377133d) {
            findViewById.setOnTouchListener(new C138626ae(new C47586cj(this.f377131b, new C138655h(anVar, avVar, view), "Touched suggestion")));
        }
        if (anVar.mo114426f()) {
            anVar.mo114425e(view, avVar);
        } else {
            findViewById.setVisibility(8);
        }
    }
}
