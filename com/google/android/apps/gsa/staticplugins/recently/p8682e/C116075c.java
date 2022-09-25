package com.google.android.apps.gsa.staticplugins.recently.p8682e;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8686a.C116100aa;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8686a.C116118q;
import com.google.android.apps.gsa.staticplugins.recently.p8684g.C116091b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116199b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116200c;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116201d;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Group;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1875j.C22830a;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60494rz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.e.c */
/* compiled from: PG */
public final class C116075c {

    /* renamed from: b */
    private static final C59071e f321860b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.e.c");

    /* renamed from: a */
    public C22831b f321861a;

    /* renamed from: c */
    private final Context f321862c;

    /* renamed from: d */
    private final boolean f321863d;

    /* renamed from: e */
    private final List f321864e = new ArrayList();

    /* renamed from: f */
    private final List f321865f = new ArrayList();

    /* renamed from: g */
    private final C116118q f321866g;

    public C116075c(Context context, C116118q qVar, boolean z) {
        this.f321862c = context;
        this.f321866g = qVar;
        this.f321863d = z;
    }

    /* renamed from: g */
    private static boolean m192449g(int i) {
        return i == C60494rz.NOW.f163762v || i == C60494rz.AMP_NOW.f163762v;
    }

    /* renamed from: a */
    public final void mo102456a(C22845p pVar) {
        if (this.f321861a == null) {
            ((C59052c) ((C59052c) f321860b.mo56225c()).mo56372aa(30950)).mo56386p("recentlyData must have been set before calling addEntryInternal");
        } else if (pVar != null) {
            long j = pVar.f62895d;
            for (int i = 0; i < this.f321861a.f62862a.size(); i++) {
                if (j > ((C22845p) this.f321861a.f62862a.get(i)).f62895d) {
                    C22830a aVar = (C22830a) this.f321861a.toBuilder();
                    aVar.copyOnWrite();
                    C22831b bVar = (C22831b) aVar.instance;
                    bVar.mo28197a();
                    bVar.f62862a.add(i, pVar);
                    this.f321861a = (C22831b) aVar.build();
                    return;
                }
            }
            C22830a aVar2 = (C22830a) this.f321861a.toBuilder();
            aVar2.mo28195b(pVar);
            this.f321861a = (C22831b) aVar2.build();
        }
    }

    /* renamed from: b */
    public final void mo102457b(C116076d dVar) {
        this.f321864e.add(dVar);
        dVar.f321867a = new C116073a(this);
        Collections.sort(this.f321864e, C116074b.f321859a);
        if (this.f321861a != null) {
            mo102460e();
        }
    }

    /* renamed from: c */
    public final void mo102458c(C22845p pVar) {
        if (this.f321861a != null) {
            long j = pVar.f62893b;
            this.f321865f.remove(Long.valueOf(j));
            for (int i = 0; i < this.f321861a.f62862a.size(); i++) {
                if (((C22845p) this.f321861a.f62862a.get(i)).f62893b == j) {
                    C22830a aVar = (C22830a) this.f321861a.toBuilder();
                    aVar.mo28196c(i);
                    this.f321861a = (C22831b) aVar.build();
                    return;
                }
            }
            return;
        }
        ((C59052c) ((C59052c) f321860b.mo56225c()).mo56372aa(30953)).mo56386p("recentlyData must have been set before calling removeEntryInternal");
    }

    /* renamed from: d */
    public final void mo102459d(Group group, boolean z) {
        C116199b bVar = new C116199b(group);
        while (bVar.hasNext()) {
            C22845p a = bVar.next();
            if (z) {
                this.f321865f.add(Long.valueOf(a.f62893b));
            } else {
                this.f321865f.remove(Long.valueOf(a.f62893b));
            }
        }
        if (this.f321861a != null) {
            mo102460e();
        }
    }

    /* renamed from: e */
    public final void mo102460e() {
        boolean z;
        boolean z2;
        C22845p b;
        if (this.f321861a == null) {
            ((C59052c) ((C59052c) f321860b.mo56225c()).mo56372aa(30956)).mo56386p("recentlyData must have been set before calling updateTimeline");
            return;
        }
        ArrayList<C116201d> arrayList = new ArrayList<>();
        Iterator it = this.f321861a.f62862a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C22845p pVar = (C22845p) it.next();
            if (m192449g(pVar.f62900i) && DateUtils.isToday(pVar.f62895d) && (i = i + 1) > 3) {
                z = true;
                break;
            }
        }
        for (C22845p pVar2 : this.f321861a.f62862a) {
            if (this.f321863d) {
                arrayList.add(m192448f(pVar2));
            } else {
                C116201d dVar = null;
                if (!m192449g(pVar2.f62900i)) {
                    String str = pVar2.f62896e;
                    if (!TextUtils.isEmpty(str)) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C116201d dVar2 = (C116201d) it2.next();
                            if (dVar2.f322182a.equals(str)) {
                                dVar = dVar2;
                                break;
                            }
                        }
                    }
                } else if (z || !DateUtils.isToday(pVar2.f62895d)) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C116201d dVar3 = (C116201d) it3.next();
                        if (dVar3.mo102557a() > 0 && (b = dVar3.mo102558b(0)) != null && m192449g(b.f62900i)) {
                            if (C116091b.m192481a(dVar3.f322184c, 0) == C116091b.m192481a(pVar2.f62895d, 0)) {
                                dVar = dVar3;
                                break;
                            }
                        }
                    }
                }
                if (dVar != null) {
                    dVar.mo102559c(pVar2);
                } else {
                    arrayList.add(m192448f(pVar2));
                }
            }
        }
        for (C116076d b2 : this.f321864e) {
            b2.mo102462b(arrayList);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f321862c.getSystemService("accessibility");
        boolean z3 = accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C116201d dVar4 = (C116201d) arrayList.get(i2);
            Collections.sort(dVar4.f322186e, C116200c.f322181a);
            if (!z3 && dVar4.mo102557a() != 1) {
                int i3 = 0;
                while (true) {
                    if (i3 >= dVar4.mo102557a()) {
                        z2 = false;
                        break;
                    } else if (this.f321865f.contains(Long.valueOf(dVar4.mo102558b(i3).f62893b))) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z2 = true;
            dVar4.f322189h = z2;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C116201d dVar5 : arrayList) {
            String str2 = dVar5.f322182a;
            String str3 = dVar5.f322183b;
            long j = dVar5.f322184c;
            int i4 = dVar5.f322185d;
            boolean z4 = dVar5.f322187f;
            boolean z5 = dVar5.f322188g;
            boolean z6 = dVar5.f322189h;
            List list = dVar5.f322186e;
            arrayList2.add(new Group(str2, str3, j, i4, z4, z5, z6, (C22845p[]) list.toArray(new C22845p[list.size()])));
        }
        C116118q qVar = this.f321866g;
        Timeline timeline = new Timeline((List) arrayList2);
        C116100aa aaVar = qVar.f322012a;
        if (!qVar.f322013b.mo28420E()) {
            ((C23251a) aaVar.f321932c.mo102513l()).mo28730f(C58833ax.m90834k(timeline), false);
        }
    }

    /* renamed from: f */
    private final C116201d m192448f(C22845p pVar) {
        String str;
        int i;
        if ((pVar.f62892a & 8) != 0) {
            str = pVar.f62896e;
        } else {
            str = this.f321862c.getString(R.string.screenshot_srp_voice_pending_title);
        }
        long j = pVar.f62895d;
        String b = C116091b.m192482b(this.f321862c, j, System.currentTimeMillis());
        if (m192449g(pVar.f62900i)) {
            str = this.f321862c.getString(R.string.recently_feed_entry);
            i = R.drawable.recently_feed_icon;
        } else {
            i = R.drawable.search_icon;
        }
        C116201d dVar = new C116201d();
        dVar.f322182a = str;
        dVar.f322183b = b;
        dVar.f322184c = j;
        dVar.f322185d = i;
        dVar.f322188g = true;
        dVar.mo102559c(pVar);
        return dVar;
    }
}
