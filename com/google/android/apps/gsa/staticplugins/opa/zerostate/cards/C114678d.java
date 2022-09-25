package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114803b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114964f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.C114965g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53350kq;
import com.google.assistant.p3994s.p3995a.C53353kt;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.d */
/* compiled from: PG */
public final class C114678d implements C114750d {

    /* renamed from: a */
    public static final C59071e f318171a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.d");

    /* renamed from: l */
    private static final C114803b f318172l = new C114803b();

    /* renamed from: b */
    public final LayoutInflater f318173b;

    /* renamed from: c */
    public final Resources f318174c;

    /* renamed from: d */
    public final C53350kq f318175d;

    /* renamed from: e */
    public final C91097g f318176e;

    /* renamed from: f */
    public final List f318177f = new ArrayList();

    /* renamed from: g */
    public C28293k f318178g;

    /* renamed from: h */
    public final C114628am f318179h;

    /* renamed from: i */
    public final Context f318180i;

    /* renamed from: j */
    public final C21370a f318181j;

    /* renamed from: k */
    public final C114964f f318182k;

    /* renamed from: m */
    private final Activity f318183m;

    /* renamed from: n */
    private final C58881cr f318184n;

    /* renamed from: o */
    private final C58833ax f318185o;

    public C114678d(Context context, Activity activity, C114628am amVar, C21370a aVar, C58833ax axVar, C114965g gVar, C53350kq kqVar, boolean z, C91097g gVar2) {
        this.f318183m = activity;
        this.f318175d = kqVar;
        this.f318176e = gVar2;
        this.f318173b = LayoutInflater.from(context);
        this.f318179h = amVar;
        this.f318174c = context.getResources();
        this.f318184n = C58886cw.m90973a(new C114615a(this));
        this.f318180i = context;
        this.f318181j = aVar;
        this.f318185o = axVar;
        this.f318182k = gVar.mo101755a(z);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        return (View) this.f318184n.mo6453a();
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        if (this.f318178g == null) {
            View view = (View) this.f318184n.mo6453a();
        }
        return this.f318178g;
    }

    /* renamed from: d */
    public final /* synthetic */ C53420nf mo101466d() {
        return null;
    }

    /* renamed from: e */
    public final void mo101467e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101468f(C53287ih ihVar, AnimatorSet animatorSet) {
        animatorSet.start();
    }

    /* renamed from: g */
    public final C58833ax mo101518g(List list, List list2, String str, boolean z) {
        if (list.isEmpty() && list2.isEmpty()) {
            return C58836b.f156633a;
        }
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = (ViewGroup) this.f318173b.inflate(R.layout.agenda_day_group_view, (ViewGroup) null);
        ((TextView) viewGroup2.findViewById(R.id.day_group_title)).setText(str);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.day_group_entries_container);
        boolean isEmpty = list.isEmpty();
        int i = R.drawable.quantum_ic_reminder_grey600_24;
        int i2 = R.drawable.dot;
        if (!isEmpty) {
            ViewGroup viewGroup4 = (ViewGroup) this.f318173b.inflate(R.layout.agenda_all_day_view, (ViewGroup) null);
            viewGroup3.addView(viewGroup4);
            TextView textView = (TextView) viewGroup4.findViewById(R.id.all_day_title);
            textView.setText(this.f318174c.getString(R.string.all_day_event));
            Collections.sort(list, f318172l);
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroup5 = (ViewGroup) viewGroup4.findViewById(R.id.agenda_sub_items);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C53354ku kuVar = (C53354ku) it.next();
                ViewGroup viewGroup6 = (ViewGroup) this.f318173b.inflate(R.layout.agenda_hub_all_day_view, (ViewGroup) null);
                TextView textView2 = (TextView) viewGroup6.findViewById(R.id.calendar_event_title);
                C52282lz lzVar = kuVar.f140002b;
                if (lzVar == null) {
                    lzVar = C52282lz.f137236h;
                }
                textView2.setText(lzVar.f137239b);
                ImageView imageView = (ImageView) viewGroup6.findViewById(R.id.agenda_icon);
                C52282lz lzVar2 = kuVar.f140002b;
                if (lzVar2 == null) {
                    lzVar2 = C52282lz.f137236h;
                }
                if ((lzVar2.f137238a & 8192) != 0) {
                    GradientDrawable gradientDrawable = (GradientDrawable) this.f318174c.getDrawable(i2);
                    C52282lz lzVar3 = kuVar.f140002b;
                    if (lzVar3 == null) {
                        lzVar3 = C52282lz.f137236h;
                    }
                    gradientDrawable.setColor(lzVar3.f137244g);
                    imageView.setImageDrawable(gradientDrawable);
                }
                int a = C53353kt.m86814a(kuVar.f140003c);
                if (a != 0 && a == 3) {
                    imageView.setImageResource(i);
                }
                C91097g gVar = this.f318176e;
                Activity activity = this.f318183m;
                C58833ax axVar = this.f318185o;
                ViewGroup viewGroup7 = viewGroup6;
                C114874f.m190411k(viewGroup6, kuVar, gVar, activity, axVar, arrayList, C53306j.MAIN_APP);
                viewGroup5.addView(viewGroup7);
                i = R.drawable.quantum_ic_reminder_grey600_24;
                i2 = R.drawable.dot;
            }
            this.f318177f.add(C28293k.m52907d(C28295m.m52915a(textView), arrayList));
        }
        Iterator it2 = list2.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            C53354ku kuVar2 = (C53354ku) it2.next();
            if (i3 >= 3) {
                break;
            }
            i3++;
            C52282lz lzVar4 = kuVar2.f140002b;
            if (lzVar4 == null) {
                lzVar4 = C52282lz.f137236h;
            }
            ViewGroup viewGroup8 = (ViewGroup) this.f318173b.inflate(R.layout.calendar_event_view, viewGroup);
            TextView textView3 = (TextView) viewGroup8.findViewById(R.id.calendar_event_title);
            ImageView imageView2 = (ImageView) viewGroup8.findViewById(R.id.agenda_icon);
            if ((lzVar4.f137238a & 8192) != 0) {
                GradientDrawable gradientDrawable2 = (GradientDrawable) this.f318174c.getDrawable(R.drawable.dot);
                gradientDrawable2.setColor(lzVar4.f137244g);
                imageView2.setImageDrawable(gradientDrawable2);
            }
            textView3.setText(lzVar4.f137239b);
            ((TextView) viewGroup8.findViewById(R.id.calendar_event_description)).setText(C114874f.m190406f(this.f318180i, lzVar4));
            int a2 = C53353kt.m86814a(kuVar2.f140003c);
            if (a2 != 0 && a2 == 3) {
                imageView2.setImageResource(R.drawable.quantum_ic_reminder_grey600_24);
            }
            C91097g gVar2 = this.f318176e;
            Activity activity2 = this.f318183m;
            C58833ax axVar2 = this.f318185o;
            List list3 = this.f318177f;
            ViewGroup viewGroup9 = viewGroup8;
            C114874f.m190411k(viewGroup8, kuVar2, gVar2, activity2, axVar2, list3, C53306j.MAIN_APP);
            viewGroup3.addView(viewGroup9);
            viewGroup = null;
        }
        if (!z) {
            viewGroup2.findViewById(R.id.overflow_menu_icon).setVisibility(8);
        } else if ((this.f318175d.f139993a & 1) != 0) {
            View findViewById = viewGroup2.findViewById(R.id.overflow_menu_icon);
            findViewById.setVisibility(0);
            C28292j jVar = new C28292j(52620);
            jVar.mo33795i(5);
            findViewById.getClass();
            C28295m.m52919e(findViewById, jVar);
            this.f318177f.add(C28293k.m52908e(jVar, new C28293k[0]));
            findViewById.setOnClickListener(new C89943l(new C114670c(this)));
        }
        return C58833ax.m90834k(viewGroup2);
    }
}
