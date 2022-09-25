package com.google.android.apps.search.googleapp.search.settings.p10428e;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.search.settings.p10428e.p10429a.C137614b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.e */
/* compiled from: PG */
public final class C137619e extends C0640fb {

    /* renamed from: a */
    public final C137614b f374335a;

    /* renamed from: b */
    public final C46439e f374336b;

    /* renamed from: c */
    public final List f374337c;

    /* renamed from: d */
    private final C47770dh f374338d;

    public C137619e(C137614b bVar, C47770dh dhVar, C46439e eVar, List list) {
        this.f374335a = bVar;
        this.f374338d = dhVar;
        this.f374336b = eVar;
        this.f374337c = list;
    }

    public final int getItemCount() {
        return this.f374337c.size();
    }

    public final int getItemViewType(int i) {
        return ((C137615b) this.f374337c.get(i)).f374327c.ordinal();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C69664n.m101061g(ghVar, "viewHolder");
        C137615b bVar = (C137615b) this.f374337c.get(ghVar.getBindingAdapterPosition());
        if (ghVar instanceof C137617c) {
            C137617c cVar = (C137617c) ghVar;
            cVar.f374332b.setVisibility(true != bVar.f374330f ? 4 : 0);
            cVar.f374331a.setText(bVar.f374328d);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_search_region_preference, viewGroup, false);
        C69664n.m101060f(inflate, "from(parent.context)\n   …/* attachToRoot=*/ false)");
        C137617c cVar = new C137617c(inflate);
        cVar.itemView.setOnClickListener(new C47591co(this.f374338d, "Search Region changed", new C137618d(this, cVar)));
        return cVar;
    }
}
