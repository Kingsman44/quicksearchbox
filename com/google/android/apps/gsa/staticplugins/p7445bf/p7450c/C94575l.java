package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C49944eu;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.l */
/* compiled from: PG */
public final class C94575l extends C0640fb {

    /* renamed from: a */
    public final C58485gu f264541a;

    /* renamed from: b */
    public final C94570g f264542b;

    /* renamed from: c */
    public String f264543c;

    /* renamed from: d */
    public C58833ax f264544d;

    public C94575l(List list, String str, C94570g gVar) {
        C58833ax axVar;
        C58480gp gpVar = new C58480gp(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C49944eu euVar = (C49944eu) it.next();
            boolean equals = TextUtils.equals(euVar.f129813d, str);
            if ((euVar.f129810a & 32) != 0) {
                axVar = C58833ax.m90834k(Integer.valueOf(euVar.f129817h));
            } else {
                axVar = C58836b.f156633a;
            }
            gpVar.mo55395g(new C94571h(euVar.f129813d, euVar.f129814e, axVar, equals));
        }
        this.f264544d = C58836b.f156633a;
        this.f264543c = str;
        this.f264541a = gpVar.mo55394f();
        this.f264542b = gVar;
    }

    /* renamed from: a */
    public final int mo88513a(String str) {
        int i = 0;
        while (true) {
            C58485gu guVar = this.f264541a;
            if (i >= ((C58724pq) guVar).f156474d) {
                throw new IllegalArgumentException("Unknown id: ".concat(String.valueOf(str)));
            } else if (((C94571h) guVar.get(i)).f264525a.equals(str)) {
                return i;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final C28293k mo88514b() {
        C58480gp gpVar = new C58480gp(4);
        int i = 0;
        while (true) {
            C58485gu guVar = this.f264541a;
            if (i >= ((C58724pq) guVar).f156474d) {
                return C28293k.m52906c((C28292j) null, gpVar.mo55394f());
            }
            C94571h hVar = (C94571h) guVar.get(i);
            C58833ax axVar = hVar.f264527c;
            if (axVar.mo56113h()) {
                gpVar.mo55395g(C28293k.m52908e((C28292j) axVar.mo56107c(), C28293k.m52908e(hVar.f264528d, new C28293k[0])));
            }
            i++;
        }
    }

    /* renamed from: c */
    public final void mo88515c(C58833ax axVar) {
        this.f264544d = axVar;
        String str = (String) axVar.mo56109e(BuildConfig.FLAVOR);
        C58485gu guVar = this.f264541a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C94571h hVar = (C94571h) guVar.get(i2);
            hVar.f264530f = hVar.f264525a.equals(str);
        }
        this.mObservable.mo2881c(0, ((C58724pq) this.f264541a).f156474d, (Object) null);
    }

    public final int getItemCount() {
        return ((C58724pq) this.f264541a).f156474d;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C89943l lVar;
        C94574k kVar = (C94574k) ghVar;
        C94571h hVar = (C94571h) this.f264541a.get(i);
        kVar.f264536b.setText(hVar.f264526b);
        TextView textView = kVar.f264536b;
        textView.setTextColor(textView.getContext().getResources().getColor(true != hVar.f264529e ? 17170444 : R.color.google_blue));
        kVar.f264535a.setVisibility(true != hVar.f264529e ? 4 : 0);
        String str = hVar.f264525a;
        kVar.itemView.setOnClickListener(new C89943l(new C94572i(kVar, str)));
        C28295m.m52919e(kVar.f264537c, hVar.f264528d);
        View view = kVar.f264537c;
        if (kVar.f264540f.f264544d.mo56113h()) {
            lVar = null;
        } else {
            lVar = new C89943l(new C94573j(kVar, str));
        }
        view.setOnClickListener(lVar);
        if (hVar.f264530f) {
            kVar.f264539e.setVisibility(8);
            kVar.f264538d.setVisibility(0);
        } else {
            kVar.f264539e.setVisibility(0);
            kVar.f264538d.setVisibility(8);
        }
        C58833ax axVar = hVar.f264527c;
        if (axVar.mo56113h()) {
            C28295m.m52919e(kVar.itemView, (C28292j) axVar.mo56107c());
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C94574k(this, LayoutInflater.from(viewGroup.getContext()), viewGroup);
    }
}
