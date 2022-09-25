package com.google.android.apps.gsa.staticplugins.recently.p8678a;

import android.util.Property;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Group;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116208ae;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.apps.gsa.staticplugins.recently.view.group.RecentlyView;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.p576aq.p578b.C10502ai;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.a.d */
/* compiled from: PG */
public final /* synthetic */ class C116021d implements C10502ai {

    /* renamed from: a */
    public static final /* synthetic */ C116021d f321701a = new C116021d();

    private /* synthetic */ C116021d() {
    }

    /* renamed from: a */
    public final void mo18542a(Object obj, Object obj2) {
        int i;
        C116208ae aeVar;
        C116023f fVar = (C116023f) obj;
        Property property = C116023f.f321703a;
        Timeline timeline = fVar.f321706d;
        fVar.f321706d = (Timeline) obj2;
        Timeline timeline2 = fVar.f321706d;
        C116022e eVar = fVar.f321709g;
        C116208ae aeVar2 = eVar.f321702a.f321710h;
        if (aeVar2 != null) {
            aeVar2.f322246a.f322237y = true;
        }
        if (timeline.f322178a.length != 0 || timeline2.f322178a.length == 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                Group[] groupArr = timeline2.f322178a;
                if (i2 >= groupArr.length) {
                    break;
                }
                Group[] groupArr2 = timeline.f322178a;
                if (i4 >= groupArr2.length) {
                    break;
                }
                Group group = groupArr2[i4];
                Group group2 = groupArr[i2];
                if (group.mo102544b(group2)) {
                    boolean z = group.f322176g;
                    boolean z2 = group2.f322176g;
                    if (z != z2 && (aeVar = eVar.f321702a.f321710h) != null) {
                        RecentlyView recentlyView = aeVar.f322246a;
                        C58485gu guVar = recentlyView.f322215c;
                        int i5 = ((C58724pq) guVar).f156474d;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            C116226r rVar = (C116226r) guVar.get(i6);
                            i6++;
                            if (rVar.f322281b == i2) {
                                if (z2) {
                                    rVar.f322293n = 0.0f;
                                    rVar.f322290k.mo124179e(1.0f);
                                } else {
                                    rVar.f322293n = recentlyView.mo102563b(rVar, 0.5f);
                                    rVar.f322290k.mo124179e(0.0f);
                                }
                            }
                        }
                    }
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        C22845p[] pVarArr = group2.f322177h;
                        if (i7 >= pVarArr.length) {
                            break;
                        }
                        C22845p[] pVarArr2 = group.f322177h;
                        if (i9 >= pVarArr2.length) {
                            break;
                        }
                        C22845p pVar = pVarArr[i7];
                        C22845p pVar2 = pVarArr2[i9];
                        int i10 = i4;
                        if (pVar2.f62893b != pVar.f62893b) {
                            boolean a = group2.mo102543a(pVar2);
                            boolean a2 = group.mo102543a(pVar);
                            if (a && !a2) {
                                eVar.mo102414a(i2, i7);
                                i7++;
                                i8++;
                                i4 = i10;
                            } else if (!a2 || a) {
                                eVar.mo102415b(i2, i9 + i8);
                                eVar.mo102414a(i2, i7);
                            } else {
                                eVar.mo102415b(i2, i9 + i8);
                                i9++;
                                i8--;
                                i4 = i10;
                            }
                        }
                        i7++;
                        i9++;
                        i4 = i10;
                    }
                    i = i4;
                    while (i9 < group.f322177h.length) {
                        eVar.mo102415b(i2, i9 + i8);
                        i9++;
                        i8--;
                    }
                    while (i7 < group2.f322177h.length) {
                        eVar.mo102414a(i2, i7);
                        i7++;
                    }
                } else {
                    i = i4;
                    boolean a3 = timeline2.mo102548a(group);
                    boolean a4 = timeline.mo102548a(group2);
                    if (a3 && !a4) {
                        eVar.mo102416c(i2);
                        i2++;
                        i3++;
                        i4 = i;
                    } else if (!a4 || a3) {
                        eVar.mo102417d(i + i3);
                        eVar.mo102416c(i2);
                    } else {
                        eVar.mo102417d(i + i3);
                        i4 = i + 1;
                        i3--;
                    }
                }
                i2++;
                i4 = i + 1;
            }
            int i11 = i4;
            while (i11 < timeline.f322178a.length) {
                eVar.mo102417d(i11 + i3);
                i11++;
                i3--;
            }
            while (i2 < timeline2.f322178a.length) {
                eVar.mo102416c(i2);
                i2++;
            }
            eVar.mo102418e();
            return;
        }
        if (aeVar2 != null) {
            RecentlyView recentlyView2 = aeVar2.f322246a;
            recentlyView2.removeAllViews();
            recentlyView2.mo102577j();
            recentlyView2.mo102576i();
            recentlyView2.mo102582o();
        }
        eVar.mo102418e();
    }
}
