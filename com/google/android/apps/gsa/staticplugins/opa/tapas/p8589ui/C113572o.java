package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112685aw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8564h.C112600b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112908gz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113344co;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.o */
/* compiled from: PG */
public final class C113572o extends C0640fb implements C113427g {

    /* renamed from: a */
    public static final C59071e f314464a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.ui.o");

    /* renamed from: b */
    public final C113344co f314465b;

    /* renamed from: c */
    public final boolean f314466c;

    /* renamed from: d */
    public final C112600b f314467d;

    /* renamed from: e */
    public final C112694be f314468e;

    /* renamed from: f */
    public final C112685aw f314469f;

    /* renamed from: g */
    public final C113576s f314470g;

    /* renamed from: h */
    private final C112908gz f314471h;

    public C113572o(C113344co coVar, C112908gz gzVar, C113576s sVar, boolean z, C112600b bVar, C112694be beVar, C112685aw awVar) {
        this.f314465b = coVar;
        this.f314471h = gzVar;
        this.f314470g = sVar;
        this.f314466c = z;
        this.f314467d = bVar;
        this.f314468e = beVar;
        this.f314469f = awVar;
    }

    /* renamed from: a */
    public final void mo100230a(C113415ez ezVar) {
        int indexOf = this.f314465b.f313868b.indexOf(ezVar);
        if (indexOf != -1) {
            notifyItemChanged(indexOf);
        }
    }

    /* renamed from: b */
    public final View mo100313b(C0673gh ghVar) {
        List list = this.f314465b.f313868b;
        if (!list.isEmpty()) {
            Optional a = this.f314471h.mo99778a(((C113415ez) list.get(0)).mo100206f());
            if (a.isPresent()) {
                Optional e = ((C113342cm) ((C69464a) a.get()).mo17428b()).mo99716e(ghVar);
                if (e.isPresent()) {
                    return (View) e.get();
                }
            }
        }
        return this.f314466c ? ghVar.itemView.findViewById(R.id.suggestion_item_content_container) : ghVar.itemView;
    }

    public final int getItemCount() {
        return this.f314465b.f313868b.size();
    }

    public final long getItemId(int i) {
        return (long) ((C113415ez) this.f314465b.f313868b.get(i)).mo100058Q().hashCode();
    }

    public final int getItemViewType(int i) {
        return ((C113415ez) this.f314465b.f313868b.get(i)).mo100206f();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        View view;
        C113415ez ezVar = (C113415ez) this.f314465b.f313868b.get(i);
        Optional a = this.f314471h.mo99778a(ezVar.mo100206f());
        if (!a.isEmpty()) {
            C113342cm cmVar = (C113342cm) ((C69464a) a.get()).mo17428b();
            cmVar.mo99686h(this.f314465b.f313869c, ezVar, ghVar, this);
            this.f314468e.mo99651b(ghVar.itemView, cmVar.mo99684b(ezVar), cmVar.mo99715d(ezVar));
            if (this.f314466c) {
                view = ghVar.itemView.findViewById(R.id.suggestion_item_content_container);
            } else {
                view = ghVar.itemView;
            }
            RatingBar ratingBar = this.f314466c ? (RatingBar) ghVar.itemView.findViewById(R.id.suggestion_item_rating) : null;
            if (view != null) {
                view.setOnClickListener(new C113568k(this, cmVar, ezVar, ghVar));
                view.setOnLongClickListener(new C113569l(cmVar, ezVar, ghVar));
            }
            if (ratingBar != null) {
                ratingBar.setOnRatingBarChangeListener(new C113570m(this, ezVar));
            }
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.suggestion_item_container, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.suggestion_item_content_container);
        boolean z = this.f314466c;
        if (true != z) {
            viewGroup2 = viewGroup;
        }
        if (true == z) {
            viewGroup = frameLayout;
        }
        return (C0673gh) this.f314471h.mo99778a(i).map(new C113566i(this, viewGroup2, viewGroup)).orElseGet(new C113567j(context));
    }
}
