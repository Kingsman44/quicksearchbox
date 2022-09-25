package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.z */
/* compiled from: PG */
public class C115650z extends C0640fb {

    /* renamed from: a */
    private final Context f320827a;

    /* renamed from: b */
    public C52176ia f320828b = C52176ia.f136911k;

    /* renamed from: c */
    public C115466j f320829c = C115466j.f320304q;

    /* renamed from: d */
    private final C115641q f320830d;

    public C115650z(Context context, C115641q qVar) {
        this.f320827a = context;
        this.f320830d = qVar;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        return this.f320828b.f136914b.size() + 1;
    }

    public final long getItemId(int i) {
        if (getItemViewType(i) == 0) {
            return (long) ((C52174hz) this.f320828b.f136914b.get(i)).f136895b.hashCode();
        }
        return -1;
    }

    public final int getItemViewType(int i) {
        return i == getItemCount() + -1 ? 1 : 0;
    }

    public void onBindViewHolder(C0673gh ghVar, int i) {
        if (getItemViewType(i) == 0 && i >= 0 && i < this.f320828b.f136914b.size()) {
            C52174hz hzVar = (C52174hz) this.f320828b.f136914b.get(i);
            C115640p pVar = (C115640p) ghVar;
            C115466j jVar = this.f320829c;
            if (((long) i) != jVar.f320307b) {
                jVar = C115466j.f320304q;
            }
            pVar.mo102131a(i, hzVar, jVar);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.f320827a);
        if (i == 0) {
            return this.f320830d.mo102078a(from, viewGroup);
        }
        if (i != 1) {
            return null;
        }
        return new C115649y(from.inflate(R.layout.omp_footer, viewGroup, false));
    }
}
