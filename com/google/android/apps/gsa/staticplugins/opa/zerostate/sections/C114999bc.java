package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108431il;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bc */
/* compiled from: PG */
public class C114999bc extends C0640fb implements C28289g {

    /* renamed from: j */
    private static final C59071e f319173j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bc");

    /* renamed from: a */
    protected final Context f319174a;

    /* renamed from: b */
    protected final LayoutInflater f319175b;

    /* renamed from: c */
    protected final List f319176c;

    /* renamed from: d */
    protected final C108226ax f319177d;

    /* renamed from: e */
    protected final int f319178e;

    /* renamed from: f */
    protected final int f319179f;

    /* renamed from: g */
    protected final int f319180g;

    /* renamed from: h */
    protected final int f319181h;

    /* renamed from: i */
    protected final C28293k f319182i;

    /* renamed from: k */
    private int f319183k = 0;

    public C114999bc(Context context, List list, C108226ax axVar) {
        this.f319174a = context;
        this.f319175b = LayoutInflater.from(context);
        this.f319176c = list;
        this.f319177d = axVar;
        this.f319178e = context.getResources().getDimensionPixelSize(R.dimen.zero_state_section_title_side_padding);
        this.f319179f = context.getResources().getDimensionPixelSize(R.dimen.conversation_starters_suggestion_without_icon_inner_side_padding);
        this.f319180g = context.getResources().getDimensionPixelSize(R.dimen.conversation_starters_suggestion_without_icon_text_max_width);
        this.f319181h = context.getResources().getDimensionPixelSize(R.dimen.conversation_starters_suggestion_without_icon_text_max_width_DM);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C28293k.m52908e(((C108430ik) it.next()).f301597d, new C28293k[0]));
        }
        C28292j jVar = new C28292j(52135);
        jVar.mo33795i(22);
        jVar.f76976d = true;
        jVar.mo33795i(5);
        this.f319182i = C28293k.m52907d(jVar, arrayList);
    }

    /* renamed from: d */
    protected static boolean m190658d(C108430ik ikVar) {
        return (ikVar instanceof C108249bt) && ((C108249bt) ikVar).f301136a.mo96699a();
    }

    /* renamed from: e */
    protected static final boolean m190659e(C108430ik ikVar) {
        if ((ikVar instanceof C108249bt) && ((C108249bt) ikVar).f301137b != null) {
            return true;
        }
        if (ikVar instanceof C108431il) {
            C108431il ilVar = (C108431il) ikVar;
            if (ilVar.f301623c == null || ilVar.f301620B == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f319182i;
    }

    /* renamed from: b */
    public void onBindViewHolder(C114998bb bbVar, int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i < 0 || this.f319176c.size() <= i) {
            C59104x d = f319173j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConvStartersAdapter");
            ((C59052c) ((C59052c) d).mo56372aa(29481)).mo56393w("#onBindViewHolder(): Invalid position specified: %d. Suggestion list size: %d.", i, this.f319176c.size());
            return;
        }
        C108430ik ikVar = (C108430ik) this.f319176c.get(i);
        if (!ikVar.f301614u) {
            ikVar.f301616w = true;
            bbVar.f319171a.setText(ikVar.mo96708f());
            if (!m190659e(ikVar)) {
                bbVar.f319172b.setVisibility(8);
            } else {
                bbVar.f319172b.setVisibility(0);
                if (ikVar instanceof C108249bt) {
                    Drawable drawable = ((C108249bt) ikVar).f301137b;
                    if (drawable != null) {
                        bbVar.f319172b.setImageDrawable(drawable);
                    }
                } else if (ikVar instanceof C108431il) {
                    C108431il ilVar = (C108431il) ikVar;
                    C60870cx cxVar = ilVar.f301623c;
                    C91189au auVar = ilVar.f301620B;
                    if (!(cxVar == null || auVar == null)) {
                        auVar.mo85428r(cxVar, "ConvStartersAdapter.ImageCallback", new C114997ba(bbVar));
                    }
                }
            }
            C28293k kVar = this.f319182i;
            if (kVar != null) {
                C28295m.m52919e(bbVar.itemView, ((C28293k) ((C28257a) kVar).f76909b.get(i)).mo33745a());
            }
            bbVar.itemView.setOnClickListener(new C89943l(new C114995az(this, ikVar, bbVar)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo101810c(C114998bb bbVar) {
        View view = bbVar.itemView;
        view.setPadding(this.f319179f, view.getPaddingTop(), this.f319179f, bbVar.itemView.getPaddingBottom());
    }

    public final int getItemCount() {
        int size = this.f319176c.size();
        C58976aa aaVar = C58975e.f156826a;
        return size;
    }

    public final int getItemViewType(int i) {
        if (i < 0 || this.f319176c.size() <= i) {
            return 0;
        }
        C108430ik ikVar = (C108430ik) this.f319176c.get(i);
        boolean e = m190659e(ikVar);
        if (m190658d(ikVar)) {
            e |= true;
        }
        if (ikVar.f301614u) {
            int i2 = this.f319183k;
            if (i2 == i) {
                this.f319183k = i2 + 1;
            }
            e |= true;
        }
        if (i == this.f319183k) {
            e |= true;
        }
        return i == this.f319176c.size() + -1 ? e | true ? 1 : 0 : e ? 1 : 0;
    }

    public /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        throw null;
    }
}
