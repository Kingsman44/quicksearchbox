package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.aak;
import com.google.android.apps.gsa.search.shared.service.p6935b.aal;
import com.google.android.apps.gsa.search.shared.service.p6935b.aam;
import com.google.android.apps.gsa.searchplate.C88923ay;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62940bt;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.ac */
/* compiled from: PG */
final class C87624ac implements AdapterView.OnItemSelectedListener, View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C87625ad f236768a;

    /* renamed from: b */
    private boolean f236769b = false;

    public C87624ac(C87625ad adVar) {
        this.f236768a = adVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C28293k kVar;
        C28292j a;
        C87625ad adVar = this.f236768a;
        if (adVar.f236822aY) {
            C88923ay ayVar = adVar.f236813aP;
            if (ayVar.f240889l) {
                ayVar.f240889l = false;
                return;
            }
            adVar.f236823aZ = true;
            adVar.f236822aY = false;
            if (!ayVar.f240884g || i != ayVar.f240881d.size()) {
                String str = (String) this.f236768a.f236813aP.f240881d.get(i);
                if (!(str == null || (kVar = this.f236768a.f236819aV) == null || ((C28257a) kVar).f76909b.size() <= i || (a = ((C28293k) ((C28257a) this.f236768a.f236819aV).f76909b.get(i)).mo33745a()) == null)) {
                    C89949q.m146521e(C28285c.m52883j(a, 5, (Integer) null), false);
                }
                C87625ad adVar2 = this.f236768a;
                C88923ay ayVar2 = adVar2.f236813aP;
                ayVar2.f240886i = str;
                if (adVar2.f236877s.f236720R) {
                    HashSet hashSet = new HashSet(C58485gu.m89842j(ayVar2.f240881d));
                    hashSet.remove(str);
                    C87673aa aaVar = this.f236768a.f236773C;
                    C88489j jVar = new C88489j(C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SELECTED);
                    C62940bt btVar = aak.f237085a;
                    aal aal = (aal) aam.f237086e.createBuilder();
                    aal.copyOnWrite();
                    aam aam = (aam) aal.instance;
                    str.getClass();
                    aam.f237088a |= 1;
                    aam.f237089b = str;
                    aal.mo81977a(hashSet);
                    aal.copyOnWrite();
                    aam aam2 = (aam) aal.instance;
                    aam2.f237088a |= 2;
                    aam2.f237091d = true;
                    jVar.mo82014b(btVar, (aam) aal.build());
                    aaVar.mo81937i(jVar.mo82013a());
                    this.f236768a.f236818aU = str;
                }
                this.f236768a.mo81786S();
                C87625ad adVar3 = this.f236768a;
                if (adVar3.f236877s.f236722T && adVar3.f236815aR != null && adVar3.f236812aO.containsKey(str)) {
                    ((TextView) this.f236768a.f236815aR.findViewById(R.id.language_switcher_nudge)).setText((CharSequence) this.f236768a.f236812aO.get(str));
                    ((C89859i) this.f236768a.f236781K.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_LANGUAGE_PICKER_NUDGE_SHOWN_AFTER_LANGUAGE_SELECTED);
                    if (this.f236768a.f236815aR.getVisibility() == 0) {
                        C87625ad adVar4 = this.f236768a;
                        if (adVar4.f236877s.f236719Q && !adVar4.f236820aW) {
                            adVar4.f236820aW = true;
                            adVar4.f236817aT = false;
                            adVar4.mo81810ar();
                            this.f236768a.mo81793Z(str, false);
                            return;
                        }
                    }
                    this.f236768a.f236820aW = true;
                }
                C87625ad adVar5 = this.f236768a;
                if (adVar5.f236821aX) {
                    adVar5.f236821aX = false;
                    adVar5.mo81770C(QueryTriggerType.AGA_PROGRAMMATIC_LANGUAGE_SWITCHER_CLOSED);
                    return;
                }
                return;
            }
            this.f236768a.f236773C.mo81937i(new C88489j(C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_AUTO_OPTION_SELECTED).mo82013a());
            this.f236768a.mo81786S();
            C87625ad adVar6 = this.f236768a;
            if (adVar6.f236821aX) {
                adVar6.mo81770C(QueryTriggerType.AGA_PROGRAMMATIC_LANGUAGE_SWITCHER_CLOSED);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f236769b = true;
        } else if (action == 1 && this.f236769b) {
            this.f236769b = false;
            view.performClick();
        }
        return true;
    }
}
