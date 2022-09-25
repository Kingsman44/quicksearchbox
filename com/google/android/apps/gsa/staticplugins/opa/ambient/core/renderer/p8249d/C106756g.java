package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8249d;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83773p;
import com.google.android.apps.gsa.p8839t.p8840a.C118340b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.C106818o;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.shared.VerticallyResizeableLinearLayout;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.d.g */
/* compiled from: PG */
public final class C106756g implements C106818o {

    /* renamed from: a */
    public static int f297492a = 0;

    /* renamed from: o */
    private static final C59071e f297493o = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.d.g");

    /* renamed from: b */
    public final C107698i f297494b;

    /* renamed from: c */
    public final Query f297495c;

    /* renamed from: d */
    public final C118340b f297496d;

    /* renamed from: e */
    public final VerticallyResizeableLinearLayout f297497e;

    /* renamed from: f */
    public final TextView f297498f;

    /* renamed from: g */
    public boolean f297499g = false;

    /* renamed from: h */
    public int f297500h = 0;

    /* renamed from: i */
    public final C92125t f297501i;

    /* renamed from: j */
    public boolean f297502j = false;

    /* renamed from: k */
    public final int f297503k;

    /* renamed from: l */
    public final int f297504l;

    /* renamed from: m */
    public final int f297505m;

    /* renamed from: n */
    public C2164c f297506n;

    /* renamed from: p */
    private final C106760k f297507p;

    /* renamed from: q */
    private final C86124t f297508q;

    /* renamed from: r */
    private final ViewGroup f297509r;

    /* renamed from: s */
    private final TextView f297510s;

    /* renamed from: t */
    private final Context f297511t;

    /* renamed from: u */
    private int f297512u = 0;

    /* renamed from: v */
    private final LayoutInflater f297513v;

    /* renamed from: w */
    private final C58485gu f297514w;

    /* renamed from: x */
    private final C60870cx f297515x;

    public C106756g(C107698i iVar, Query query, C118340b bVar, C86124t tVar, Context context, C92125t tVar2, C68214a aVar, C83564a aVar2, C83773p pVar, ViewGroup viewGroup) {
        this.f297494b = iVar;
        this.f297495c = query;
        this.f297496d = bVar;
        C106760k kVar = new C106760k(aVar, aVar2, tVar);
        this.f297507p = kVar;
        this.f297508q = tVar;
        LayoutInflater from = LayoutInflater.from(context);
        this.f297513v = from;
        this.f297511t = context;
        this.f297501i = tVar2;
        if (kVar.f297530c == null) {
            kVar.f297530c = new LinearLayout(context);
            if (kVar.f297529b.mo79746e(C90017bw.f247941bC)) {
                kVar.f297530c.setOrientation(0);
            } else {
                kVar.f297530c.setOrientation(1);
            }
            kVar.f297530c.setLayoutTransition(new LayoutTransition());
            C28295m.m52919e(kVar.f297530c, new C28292j(104342));
        }
        this.f297509r = kVar.f297530c;
        this.f297497e = (VerticallyResizeableLinearLayout) from.inflate(R.layout.headphone_context_child, viewGroup, false);
        C58480gp e = C58485gu.m89837e();
        C123746bm bmVar = pVar.f228330a;
        for (C123744bk bkVar : (bmVar == null ? C123746bm.f341818b : bmVar).f341820a) {
            e.mo55395g(Integer.valueOf(bkVar.f341810e));
            C59104x b = f297493o.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaR");
            ((C59052c) ((C59052c) b).mo56372aa(23278)).mo56387q("Add allowed ProactiveDataType %s", bkVar.f341810e);
        }
        this.f297514w = e.mo55394f();
        C28295m.m52919e(this.f297497e, new C28292j(104341));
        TextView textView = (TextView) this.f297497e.findViewById(R.id.head_context_child_title);
        this.f297510s = textView;
        textView.setText(R.string.media_suggestions_title);
        if (tVar.mo79746e(C90017bw.f247941bC)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VerticallyResizeableLinearLayout verticallyResizeableLinearLayout = this.f297497e;
        verticallyResizeableLinearLayout.addView(this.f297509r, verticallyResizeableLinearLayout.getChildCount() - 1);
        TextView textView2 = (TextView) this.f297497e.findViewById(R.id.view_more_row);
        this.f297498f = textView2;
        if (tVar.mo79746e(C90017bw.f247941bC)) {
            textView2.setVisibility(8);
        }
        textView2.setOnClickListener(new C106750a(this));
        textView2.setText(this.f297511t.getString(R.string.aa_suggestions_view_more));
        C28292j jVar = new C28292j(104343);
        jVar.mo33795i(5);
        C28295m.m52919e(textView2, jVar);
        Resources resources = this.f297511t.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.aa_media_top_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.aa_media_thumbnail_margin_top);
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.aa_media_thumbnail_height);
        C58976aa aaVar = C58975e.f156826a;
        this.f297503k = dimensionPixelOffset + dimensionPixelOffset2 + dimensionPixelOffset3;
        this.f297504l = resources.getDimensionPixelOffset(R.dimen.aa_headphones_child_holder_title_size);
        int dimensionPixelOffset4 = resources.getDimensionPixelOffset(R.dimen.aa_view_more_text_size);
        int dimensionPixelOffset5 = resources.getDimensionPixelOffset(R.dimen.aa_view_more_padding);
        this.f297505m = dimensionPixelOffset4 + dimensionPixelOffset5 + dimensionPixelOffset5;
        this.f297497e.f297683a = new C106753d(this);
        this.f297515x = C2169h.m6027a(new C106755f(this));
    }

    /* renamed from: a */
    public final List mo95632a() {
        return C58485gu.m89846n(C106734a.FULL);
    }

    /* renamed from: b */
    public final C60870cx mo95633b() {
        return this.f297515x;
    }

    /* renamed from: c */
    public final void mo95641c(List list) {
        list.addAll(this.f297514w);
    }

    /* renamed from: d */
    public final void mo95642d(C123746bm bmVar) {
        C123730ax axVar;
        Drawable drawable;
        C51058ev evVar;
        int i;
        C123742bi biVar;
        int i2;
        C123746bm bmVar2 = bmVar;
        if (!this.f297502j || !this.f297508q.mo79746e(C90017bw.f247960bV)) {
            C59104x b = f297493o.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaR");
            ((C59052c) ((C59052c) b).mo56372aa(23279)).mo56387q("Updated data count %d", bmVar2.f341820a.size());
            LinearLayout linearLayout = this.f297507p.f297530c;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            this.f297512u = 0;
            this.f297500h = 0;
            Iterator it = bmVar2.f341820a.iterator();
            while (it.hasNext()) {
                C123744bk bkVar = (C123744bk) it.next();
                if (this.f297514w.contains(Integer.valueOf(bkVar.f341810e))) {
                    int i3 = bkVar.f341810e;
                    if (i3 == 19) {
                        C59104x b2 = f297493o.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "MediaR");
                        ((C59052c) ((C59052c) b2).mo56372aa(23283)).mo56386p("found potter media");
                        if (bkVar.f341808c == 6) {
                            biVar = (C123742bi) bkVar.f341809d;
                        } else {
                            biVar = C123742bi.f341800b;
                        }
                        LayoutInflater layoutInflater = this.f297513v;
                        Context context = this.f297511t;
                        if (this.f297508q.mo79746e(C90017bw.f247941bC)) {
                            this.f297499g = true;
                        }
                        for (int i4 = 0; i4 < biVar.f341802a.size(); i4++) {
                            C53020k kVar = (C53020k) biVar.f341802a.get(i4);
                            this.f297500h += kVar.f138974c.size();
                            for (int i5 = 0; i5 < kVar.f138974c.size(); i5++) {
                                C52560wg wgVar = (C52560wg) kVar.f138974c.get(i5);
                                int i6 = this.f297512u;
                                if (i6 < f297492a || this.f297499g) {
                                    this.f297512u = i6 + 1;
                                    i2 = 0;
                                } else {
                                    i2 = 8;
                                }
                                int i7 = i2;
                                View a = this.f297507p.mo95645a((Drawable) null, wgVar, i7, layoutInflater, context);
                                a.setVisibility(i7);
                                a.setOnClickListener(new C106754e(this, a, wgVar));
                            }
                        }
                    } else if (i3 == 9) {
                        C59104x b3 = f297493o.mo56224b();
                        b3.mo56378ag(C58975e.f156826a, "MediaR");
                        ((C59052c) ((C59052c) b3).mo56372aa(23282)).mo56386p("found on-device media");
                        Context context2 = this.f297511t;
                        if (bkVar.f341808c == 5) {
                            axVar = (C123730ax) bkVar.f341809d;
                        } else {
                            axVar = C123730ax.f341767b;
                        }
                        C123730ax axVar2 = axVar;
                        LayoutInflater layoutInflater2 = this.f297513v;
                        if (this.f297508q.mo79746e(C90017bw.f247941bC)) {
                            this.f297499g = true;
                        }
                        long a2 = this.f297508q.mo79743a(C90017bw.f248021cu);
                        long a3 = this.f297508q.mo79743a(C90017bw.f248022cv);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= axVar2.f341769a.size() || ((long) i9) >= a2) {
                                break;
                            }
                            C123728av avVar = (C123728av) axVar2.f341769a.get(i9);
                            String str = avVar.f341756b;
                            try {
                                drawable = context2.getPackageManager().getApplicationIcon(str);
                            } catch (PackageManager.NameNotFoundException e) {
                                C59104x c = f297493o.mo56225c();
                                c.mo56378ag(C58975e.f156826a, "MediaR");
                                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(23277)).mo56386p("error");
                                drawable = null;
                            }
                            this.f297500h += (int) Math.min((long) avVar.f341758d.size(), a3);
                            int i10 = i8;
                            int i11 = 0;
                            while (i11 < avVar.f341758d.size() && ((long) i11) < a3) {
                                C52560wg wgVar2 = (C52560wg) avVar.f341758d.get(i11);
                                C51098gh ghVar = wgVar2.f137949e;
                                if (ghVar == null) {
                                    ghVar = C51098gh.f133009e;
                                }
                                Iterator it2 = it;
                                C123730ax axVar3 = axVar2;
                                if (ghVar.f133012b == 1) {
                                    evVar = (C51058ev) ghVar.f133013c;
                                } else {
                                    evVar = C51058ev.f132941o;
                                }
                                C51055es esVar = (C51055es) evVar.toBuilder();
                                esVar.copyOnWrite();
                                C51058ev evVar2 = (C51058ev) esVar.instance;
                                str.getClass();
                                C123728av avVar2 = avVar;
                                evVar2.f132943a |= 1;
                                evVar2.f132944b = str;
                                C51058ev evVar3 = (C51058ev) esVar.build();
                                C52559wf wfVar = (C52559wf) wgVar2.toBuilder();
                                C51097gg ggVar = (C51097gg) ghVar.toBuilder();
                                ggVar.copyOnWrite();
                                C51098gh ghVar2 = (C51098gh) ggVar.instance;
                                evVar3.getClass();
                                ghVar2.f133013c = evVar3;
                                ghVar2.f133012b = 1;
                                C51098gh ghVar3 = (C51098gh) ggVar.build();
                                wfVar.copyOnWrite();
                                C52560wg wgVar3 = (C52560wg) wfVar.instance;
                                ghVar3.getClass();
                                wgVar3.f137949e = ghVar3;
                                wgVar3.f137945a |= 4;
                                C52560wg wgVar4 = (C52560wg) wfVar.build();
                                int i12 = this.f297512u;
                                if (i12 < f297492a || this.f297499g) {
                                    this.f297512u = i12 + 1;
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                String str2 = str;
                                Drawable drawable2 = drawable;
                                int i13 = i9;
                                long j = a3;
                                View a4 = this.f297507p.mo95645a(drawable, wgVar2, i, layoutInflater2, context2);
                                a4.setVisibility(i);
                                if (this.f297508q.mo79746e(C90017bw.f247941bC)) {
                                    a4.setOnClickListener(new C106751b(this, a4, wgVar4));
                                } else {
                                    a4.setOnClickListener(new C106752c(this, a4, wgVar4));
                                }
                                i10++;
                                if (this.f297508q.mo79746e(C90017bw.f247941bC) && i10 >= 4) {
                                    it = it2;
                                    break;
                                }
                                i11++;
                                it = it2;
                                axVar2 = axVar3;
                                avVar = avVar2;
                                drawable = drawable2;
                                str = str2;
                                i9 = i13;
                                a3 = j;
                            }
                            i9++;
                            i8 = i10;
                            it = it;
                            axVar2 = axVar2;
                            a3 = a3;
                        }
                    }
                }
            }
            C59104x b4 = f297493o.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "MediaR");
            ((C59052c) ((C59052c) b4).mo56372aa(23281)).mo56387q("populateData(): availableSuggestions %d", this.f297500h);
            this.f297501i.mo86709n(this.f297509r, this.f297497e);
            this.f297502j = true;
            C2164c cVar = this.f297506n;
            if (cVar != null) {
                cVar.mo5437b(Optional.m71637of(this.f297497e));
                return;
            }
            return;
        }
        C59104x b5 = f297493o.mo56224b();
        b5.mo56378ag(C58975e.f156826a, "MediaR");
        ((C59052c) ((C59052c) b5).mo56372aa(23280)).mo56387q("Ignored update of proactive data with count %d", bmVar2.f341820a.size());
    }

    /* renamed from: e */
    public final void mo95643e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f297512u = 0;
        for (int i = 0; i < this.f297509r.getChildCount(); i++) {
            View childAt = this.f297509r.getChildAt(i);
            int i2 = this.f297512u;
            if (i2 < f297492a || this.f297499g) {
                this.f297512u = i2 + 1;
                if (childAt.getVisibility() != 0) {
                    childAt.setVisibility(0);
                    this.f297501i.mo86711p(childAt);
                }
            } else if (childAt.getVisibility() != 8) {
                childAt.setVisibility(8);
            }
        }
        mo95644f();
    }

    /* renamed from: f */
    public final void mo95644f() {
        if (!this.f297508q.mo79746e(C90017bw.f247941bC)) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f297500h > f297492a) {
                if (this.f297498f.getVisibility() != 0) {
                    this.f297498f.setVisibility(0);
                }
                if (this.f297499g) {
                    this.f297498f.setText(R.string.aa_suggestions_view_less);
                } else {
                    this.f297498f.setText(R.string.aa_suggestions_view_more);
                }
            } else if (this.f297498f.getVisibility() != 8) {
                this.f297498f.setVisibility(8);
            }
        }
    }
}
