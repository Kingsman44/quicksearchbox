package com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114542a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114545d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114547f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114776a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114802az;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53350kq;
import com.google.assistant.p3994s.p3995a.C53353kt;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.assistant.p3994s.p3995a.C53356kw;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72298v;
import org.p5633c.p5634a.p5639e.C72234a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs.c */
/* compiled from: PG */
public final /* synthetic */ class C114762c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ AgendaHubActivity f318478a;

    public /* synthetic */ C114762c(AgendaHubActivity agendaHubActivity) {
        this.f318478a = agendaHubActivity;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        List list;
        C58833ax axVar;
        C58833ax axVar2;
        C58833ax axVar3;
        ViewGroup viewGroup;
        Iterator it;
        boolean z;
        ViewGroup viewGroup2;
        LayoutInflater layoutInflater;
        ViewGroup viewGroup3;
        Resources resources;
        C58833ax axVar4;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        ViewGroup viewGroup6;
        C53420nf nfVar;
        C53420nf nfVar2;
        C53350kq kqVar;
        AgendaHubActivity agendaHubActivity = this.f318478a;
        List list2 = (List) obj;
        if (agendaHubActivity.f318470p.mo79746e(C90014bt.f247647lB)) {
            list = (List) ((C58833ax) list2.get(1)).mo56106b(C114760a.f318476a).mo56109e(C58485gu.m89845m());
        } else {
            list = (List) ((C58833ax) list2.get(1)).mo56106b(C114761b.f318477a).mo56109e(C58485gu.m89845m());
        }
        C58833ax axVar5 = (C58833ax) list2.get(0);
        if (!axVar5.mo56113h()) {
            ((C59052c) ((C59052c) AgendaHubActivity.f318464j.mo56226d()).mo56372aa(29355)).mo56386p("#getAgendaSectionData: No Zerostate response found.");
            axVar = C58836b.f156633a;
        } else {
            C114547f fVar = agendaHubActivity.f318468n;
            C53370lj ljVar = ((C53422nh) axVar5.mo56107c()).f140188e;
            if (ljVar == null) {
                ljVar = C53370lj.f140047c;
            }
            C114546e a = fVar.mo101404a(ljVar, list);
            C53356kw kwVar = ((C53422nh) axVar5.mo56107c()).f140189f;
            if (kwVar == null) {
                kwVar = C53356kw.f140005b;
            }
            C53368lh lhVar = kwVar.f140007a;
            if (lhVar == null) {
                lhVar = C53368lh.f140044b;
            }
            C114542a aVar = new C114542a();
            aVar.f317636a = new C58759qy(C53365le.CARD);
            C114545d a2 = aVar.mo101396a();
            ArrayList arrayList = new ArrayList();
            if (lhVar.f140046a.size() != 0) {
                for (String str : lhVar.f140046a) {
                    C53366lf lfVar = (C53366lf) a.f317640b.get(str);
                    if (lfVar == null) {
                        ((C59052c) ((C59052c) C114546e.f317638a.mo56226d()).mo56372aa(29251)).mo56389s("#getCachedElementCandidates(): CachedElementCandidate with id %s not found", str);
                    } else {
                        C53366lf a3 = a.mo101401a(lfVar);
                        a.f317640b.put(str, a3);
                        if (a.mo101403c(a3, a2, true)) {
                            arrayList.add(a3);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty() && ((C53366lf) arrayList.get(0)).f140037b == 4) {
                C53366lf lfVar2 = (C53366lf) arrayList.get(0);
                if (lfVar2.f140037b == 4) {
                    nfVar = (C53420nf) lfVar2.f140038c;
                } else {
                    nfVar = C53420nf.f140165o;
                }
                if (nfVar.f140168b == 3) {
                    C53366lf lfVar3 = (C53366lf) arrayList.get(0);
                    if (lfVar3.f140037b == 4) {
                        nfVar2 = (C53420nf) lfVar3.f140038c;
                    } else {
                        nfVar2 = C53420nf.f140165o;
                    }
                    if (nfVar2.f140168b == 3) {
                        kqVar = (C53350kq) nfVar2.f140169c;
                    } else {
                        kqVar = C53350kq.f139991e;
                    }
                    axVar = C58833ax.m90834k(kqVar);
                }
            }
            ((C59052c) ((C59052c) AgendaHubActivity.f318464j.mo56226d()).mo56372aa(29354)).mo56386p("#getAgendaSectionData: Couldn't find agenda section information.");
            axVar = C58836b.f156633a;
        }
        agendaHubActivity.f318472r.setVisibility(8);
        if (axVar.mo56113h()) {
            C114770j jVar = agendaHubActivity.f318466l;
            C91097g gVar = agendaHubActivity.f318471q;
            C53350kq kqVar2 = (C53350kq) axVar.mo56107c();
            Context context = (Context) jVar.f318487a.mo17428b();
            context.getClass();
            C58833ax axVar6 = (C58833ax) jVar.f318488b.mo17428b();
            axVar6.getClass();
            gVar.getClass();
            kqVar2.getClass();
            Resources resources2 = context.getResources();
            LayoutInflater from = LayoutInflater.from(context);
            TreeMap treeMap = new TreeMap();
            ViewGroup viewGroup7 = null;
            ViewGroup viewGroup8 = (ViewGroup) from.inflate(R.layout.agenda_hub_view, (ViewGroup) null);
            ViewGroup viewGroup9 = (ViewGroup) viewGroup8.findViewById(R.id.agenda_day_group_container);
            for (C53354ku kuVar : kqVar2.f139994b) {
                if (!C114874f.m190418r(kuVar)) {
                    ((C59052c) ((C59052c) C114769i.f318485a.mo56226d()).mo56372aa(29361)).mo56386p("Invalid calendar entry found.");
                } else {
                    C52282lz lzVar = kuVar.f140002b;
                    if (lzVar == null) {
                        lzVar = C52282lz.f137236h;
                    }
                    C52395qd qdVar = lzVar.f137240c;
                    if (qdVar == null) {
                        qdVar = C52395qd.f137485e;
                    }
                    C72210d e = ((C72210d) C114802az.m190315b(qdVar).mo56107c()).mo63547e();
                    if (treeMap.containsKey(e)) {
                        ((C114776a) treeMap.get(e)).mo101591a(kuVar);
                    } else {
                        C114776a aVar2 = new C114776a(e);
                        aVar2.mo101591a(kuVar);
                        treeMap.put(e, aVar2);
                    }
                }
            }
            Iterator it2 = treeMap.values().iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                C114776a aVar3 = (C114776a) it2.next();
                if (!aVar3.f318500a.isEmpty() || !aVar3.f318501b.isEmpty()) {
                    ViewGroup viewGroup10 = (ViewGroup) from.inflate(R.layout.agenda_day_group_view, viewGroup7);
                    TextView textView = (TextView) viewGroup10.findViewById(R.id.day_group_title);
                    ViewGroup viewGroup11 = (ViewGroup) viewGroup10.findViewById(R.id.day_group_entries_container);
                    textView.setText(C72234a.m106517a("MMMM d, E").mo63596b(aVar3.f318502c));
                    C72298v vVar = new C72298v();
                    if (aVar3.f318502c.mo63548f().equals(vVar)) {
                        textView.setText(resources2.getString(R.string.agenda_group_today_title));
                        viewGroup6 = viewGroup10;
                        viewGroup4 = viewGroup9;
                        viewGroup5 = viewGroup8;
                        it = it2;
                        z = z2;
                    } else {
                        C72298v f = aVar3.f318502c.mo63548f();
                        viewGroup6 = viewGroup10;
                        viewGroup4 = viewGroup9;
                        viewGroup5 = viewGroup8;
                        it = it2;
                        long p = vVar.f192453b.mo63352i().mo63453p(vVar.f192453b.mo63327E().mo63474b(vVar.f192452a, 1));
                        z = z2;
                        if (p != vVar.f192452a) {
                            vVar = new C72298v(p, vVar.f192453b);
                        }
                        if (f.equals(vVar)) {
                            textView.setText(resources2.getString(R.string.agenda_group_tomorrow_title));
                        }
                    }
                    boolean isEmpty = aVar3.f318500a.isEmpty();
                    int i = R.drawable.quantum_ic_reminder_grey600_24;
                    int i2 = R.drawable.dot;
                    int i3 = R.id.agenda_icon;
                    int i4 = R.id.calendar_event_title;
                    if (!isEmpty) {
                        ViewGroup viewGroup12 = (ViewGroup) from.inflate(R.layout.agenda_all_day_view, (ViewGroup) null);
                        viewGroup11.addView(viewGroup12);
                        ((TextView) viewGroup12.findViewById(R.id.all_day_title)).setText(resources2.getString(R.string.all_day_event));
                        ViewGroup viewGroup13 = (ViewGroup) viewGroup12.findViewById(R.id.agenda_sub_items);
                        List<C53354ku> list3 = aVar3.f318500a;
                        Collections.sort(list3, C114769i.f318486b);
                        for (C53354ku kuVar2 : list3) {
                            ViewGroup viewGroup14 = (ViewGroup) from.inflate(R.layout.agenda_hub_all_day_view, (ViewGroup) null);
                            TextView textView2 = (TextView) viewGroup14.findViewById(i4);
                            C52282lz lzVar2 = kuVar2.f140002b;
                            if (lzVar2 == null) {
                                lzVar2 = C52282lz.f137236h;
                            }
                            textView2.setText(lzVar2.f137239b);
                            ImageView imageView = (ImageView) viewGroup14.findViewById(i3);
                            C52282lz lzVar3 = kuVar2.f140002b;
                            if (lzVar3 == null) {
                                lzVar3 = C52282lz.f137236h;
                            }
                            if ((lzVar3.f137238a & 8192) != 0) {
                                GradientDrawable gradientDrawable = (GradientDrawable) resources2.getDrawable(i2);
                                C52282lz lzVar4 = kuVar2.f140002b;
                                if (lzVar4 == null) {
                                    lzVar4 = C52282lz.f137236h;
                                }
                                gradientDrawable.setColor(lzVar4.f137244g);
                                imageView.setImageDrawable(gradientDrawable);
                            }
                            int a4 = C53353kt.m86814a(kuVar2.f140003c);
                            if (a4 != 0 && a4 == 3) {
                                imageView.setImageResource(i);
                            }
                            ViewGroup viewGroup15 = viewGroup5;
                            ViewGroup viewGroup16 = viewGroup11;
                            C114874f.m190411k(viewGroup14, kuVar2, gVar, agendaHubActivity, axVar6, (List) null, C53306j.MAIN_APP);
                            viewGroup13.addView(viewGroup14);
                            resources2 = resources2;
                            from = from;
                            viewGroup4 = viewGroup4;
                            viewGroup11 = viewGroup16;
                            axVar6 = axVar6;
                            i4 = R.id.calendar_event_title;
                            i = R.drawable.quantum_ic_reminder_grey600_24;
                            i2 = R.drawable.dot;
                            i3 = R.id.agenda_icon;
                        }
                    }
                    ViewGroup viewGroup17 = viewGroup11;
                    resources = resources2;
                    axVar3 = axVar6;
                    viewGroup2 = viewGroup5;
                    viewGroup = viewGroup4;
                    viewGroup3 = null;
                    layoutInflater = from;
                    for (C53354ku kuVar3 : aVar3.f318501b) {
                        C52282lz lzVar5 = kuVar3.f140002b;
                        if (lzVar5 == null) {
                            lzVar5 = C52282lz.f137236h;
                        }
                        ViewGroup viewGroup18 = (ViewGroup) layoutInflater.inflate(R.layout.calendar_event_view, (ViewGroup) null);
                        TextView textView3 = (TextView) viewGroup18.findViewById(R.id.calendar_event_title);
                        ImageView imageView2 = (ImageView) viewGroup18.findViewById(R.id.agenda_icon);
                        if ((lzVar5.f137238a & 8192) != 0) {
                            GradientDrawable gradientDrawable2 = (GradientDrawable) resources.getDrawable(R.drawable.dot);
                            gradientDrawable2.setColor(lzVar5.f137244g);
                            imageView2.setImageDrawable(gradientDrawable2);
                        }
                        textView3.setText(lzVar5.f137239b);
                        ((TextView) viewGroup18.findViewById(R.id.calendar_event_description)).setText(C114874f.m190406f(context, lzVar5));
                        int a5 = C53353kt.m86814a(kuVar3.f140003c);
                        if (a5 != 0) {
                            if (a5 == 3) {
                                imageView2.setImageResource(R.drawable.quantum_ic_reminder_grey600_24);
                            }
                        }
                        C114874f.m190411k(viewGroup18, kuVar3, gVar, agendaHubActivity, axVar3, (List) null, C53306j.MAIN_APP);
                        viewGroup17.addView(viewGroup18);
                    }
                    axVar4 = C58833ax.m90834k(viewGroup6);
                } else {
                    axVar4 = C58836b.f156633a;
                    viewGroup = viewGroup9;
                    viewGroup2 = viewGroup8;
                    it = it2;
                    z = z2;
                    axVar3 = axVar6;
                    viewGroup3 = viewGroup7;
                    layoutInflater = from;
                    resources = resources2;
                }
                if (axVar4.mo56113h()) {
                    viewGroup9 = viewGroup;
                    viewGroup9.addView((View) axVar4.mo56107c());
                    resources2 = resources;
                    viewGroup7 = viewGroup3;
                    from = layoutInflater;
                    viewGroup8 = viewGroup2;
                    it2 = it;
                    axVar6 = axVar3;
                    z2 = true;
                } else {
                    resources2 = resources;
                    viewGroup7 = viewGroup3;
                    from = layoutInflater;
                    viewGroup8 = viewGroup2;
                    z2 = z;
                    it2 = it;
                    viewGroup9 = viewGroup;
                    axVar6 = axVar3;
                }
            }
            ViewGroup viewGroup19 = viewGroup8;
            if (!z2) {
                axVar2 = C58836b.f156633a;
            } else {
                axVar2 = C58833ax.m90834k(viewGroup19);
            }
            if (axVar2.mo56113h()) {
                agendaHubActivity.f318473s.addView((View) axVar2.mo56107c());
                agendaHubActivity.f318473s.invalidate();
                return;
            }
            agendaHubActivity.findViewById(R.id.empty_agenda).setVisibility(0);
            return;
        }
        ((C59052c) ((C59052c) AgendaHubActivity.f318464j.mo56226d()).mo56372aa(29356)).mo56386p("#createContentViewAsync Unable to get AgendaCard from ZeroStateResponse.");
        agendaHubActivity.findViewById(R.id.empty_agenda).setVisibility(0);
    }
}
