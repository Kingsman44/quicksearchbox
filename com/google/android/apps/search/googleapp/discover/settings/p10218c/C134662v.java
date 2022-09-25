package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.List;
import java.util.Locale;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.v */
/* compiled from: PG */
public final class C134662v extends C0640fb {

    /* renamed from: a */
    public final List f366705a;

    /* renamed from: b */
    public final C28443m f366706b;

    /* renamed from: c */
    public final C69626l f366707c;

    /* renamed from: d */
    private final C28310af f366708d;

    /* renamed from: e */
    private final C28306ab f366709e;

    /* renamed from: f */
    private final C47770dh f366710f;

    public C134662v(List list, C28310af afVar, C28306ab abVar, C47770dh dhVar, C28443m mVar, C69626l lVar) {
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(mVar, "interactionLogger");
        this.f366705a = list;
        this.f366708d = afVar;
        this.f366709e = abVar;
        this.f366710f = dhVar;
        this.f366706b = mVar;
        this.f366707c = lVar;
    }

    public final int getItemCount() {
        return this.f366705a.size();
    }

    public final int getItemViewType(int i) {
        return ((C134658r) this.f366705a.get(i)).f366693a.ordinal();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C69664n.m101061g(ghVar, "viewHolder");
        C28306ab abVar = this.f366709e;
        View view = ghVar.itemView;
        C28313c a = this.f366708d.mo33805a(C28427h.m53115a(125758));
        a.mo33858f(C28375ak.m53059a((long) ghVar.getBindingAdapterPosition()));
        abVar.mo33802c(view, a);
        C134658r rVar = (C134658r) this.f366705a.get(ghVar.getBindingAdapterPosition());
        if (ghVar instanceof C134657q) {
            ((C134657q) ghVar).f366692a.setText(rVar.f366694b);
        } else if (ghVar instanceof C134660t) {
            C134660t tVar = (C134660t) ghVar;
            tVar.f366702c.setVisibility(true != rVar.f366696d ? 4 : 0);
            tVar.f366700a.setText(rVar.f366694b);
            tVar.f366701b.setText(Locale.forLanguageTag(rVar.f366695c).getDisplayName());
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == C134659s.LANGUAGE.ordinal()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_discover_language_list_language_item, viewGroup, false);
            C69664n.m101060f(inflate, "from(parent.context)\n   … */ false\n              )");
            C134660t tVar = new C134660t(inflate);
            tVar.itemView.setOnClickListener(new C47591co(this.f366710f, "Discover language changed", new C134661u(this, tVar)));
            return tVar;
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_discover_language_list_heading_item, viewGroup, false);
        C69664n.m101060f(inflate2, "from(parent.context)\n   …t= */ false\n            )");
        return new C134657q(inflate2);
    }

    public final void onViewRecycled(C0673gh ghVar) {
        C69664n.m101061g(ghVar, "holder");
        C28306ab.m52929e(ghVar.itemView);
    }
}
