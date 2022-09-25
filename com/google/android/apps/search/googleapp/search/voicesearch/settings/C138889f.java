package com.google.android.apps.search.googleapp.search.voicesearch.settings;

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
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.List;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.f */
/* compiled from: PG */
public final class C138889f extends C0640fb {

    /* renamed from: a */
    public final List f377779a;

    /* renamed from: b */
    public final C28443m f377780b;

    /* renamed from: c */
    private final C47770dh f377781c;

    /* renamed from: d */
    private final C28310af f377782d;

    /* renamed from: e */
    private final C28306ab f377783e;

    /* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.f$a */
    /* compiled from: PG */
    public final class C138890a implements C47388b {

        /* renamed from: a */
        public final String f377784a;

        public C138890a(String str) {
            C69664n.m101061g(str, "clickedLanguage");
            this.f377784a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C138890a) && C69664n.m101066l(this.f377784a, ((C138890a) obj).f377784a);
        }

        public final int hashCode() {
            return this.f377784a.hashCode();
        }

        public final String toString() {
            String str = this.f377784a;
            return "LanguageEntryClickEvent(clickedLanguage=" + str + ")";
        }
    }

    public C138889f(C47770dh dhVar, List list, C28310af afVar, C28306ab abVar, C28443m mVar) {
        this.f377781c = dhVar;
        this.f377779a = list;
        this.f377782d = afVar;
        this.f377783e = abVar;
        this.f377780b = mVar;
    }

    public final int getItemCount() {
        return this.f377779a.size();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C69664n.m101061g(ghVar, "viewHolder");
        C28306ab abVar = this.f377783e;
        View view = ghVar.itemView;
        C28313c a = this.f377782d.mo33805a(C28427h.m53115a(150547));
        a.mo33858f(C28375ak.m53059a((long) ghVar.getBindingAdapterPosition()));
        abVar.mo33802c(view, a);
        C138891g gVar = (C138891g) this.f377779a.get(ghVar.getBindingAdapterPosition());
        C138892h hVar = (C138892h) ghVar;
        hVar.f377790c.setVisibility(true != gVar.f377787c ? 4 : 0);
        hVar.f377788a.setText(gVar.f377785a);
        hVar.f377789b.setText(Locale.forLanguageTag(gVar.f377786b).getDisplayName());
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_voice_settings_languages_setting_entry, viewGroup, false);
        C69664n.m101060f(inflate, "from(parent.context)\n   …Root=*/ false\n          )");
        C138892h hVar = new C138892h(inflate);
        hVar.itemView.setOnClickListener(new C47591co(this.f377781c, "Voice language entry tapped", new C138893i(this, hVar)));
        return hVar;
    }

    public final void onViewRecycled(C0673gh ghVar) {
        C69664n.m101061g(ghVar, "holder");
        C28306ab.m52929e(ghVar.itemView);
    }
}
