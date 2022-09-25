package com.google.android.apps.search.podcasts.p10600q;

import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.libraries.play.unison.binding.C31958ag;
import com.google.android.libraries.play.unison.binding.C31963al;
import com.google.android.libraries.play.unison.binding.C31969ar;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.android.libraries.play.unison.binding.C31993s;
import com.google.android.libraries.play.unison.binding.C31999y;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.q.i */
/* compiled from: PG */
public final class C140950i extends C31993s {

    /* renamed from: c */
    private final RecyclerView f382706c;

    /* renamed from: d */
    private final C31969ar f382707d;

    public C140950i(RecyclerView recyclerView, C31958ag agVar, C0660fv fvVar) {
        super(recyclerView);
        this.f382706c = recyclerView;
        RecyclerView recyclerView2 = recyclerView;
        C31958ag agVar2 = agVar;
        C31969ar a = C31963al.m59554a(recyclerView2, agVar2, C140948g.f382704a, C140949h.f382705a, C31999y.f85999a, C31963al.f85947a);
        C31993s.m59595m(this, a);
        this.f382707d = a;
        C140943b.m228894a(recyclerView, fvVar);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo37761c(Object obj, C31989o oVar) {
        C140952k kVar = (C140952k) obj;
        C69664n.m101061g(kVar, "compositeViewData");
        C69664n.m101061g(oVar, "bindingContext");
        C31969ar arVar = this.f382707d;
        C69664n.m101060f(arVar, "listItemsBindable");
        mo37764l(arVar, C140946e.m228899a(kVar.f382708a));
        Integer num = kVar.f382709b;
        if (num != null) {
            this.f382706c.scrollToPosition(num.intValue());
        }
    }
}
