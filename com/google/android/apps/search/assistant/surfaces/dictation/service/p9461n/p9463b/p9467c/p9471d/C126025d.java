package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9471d;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126027d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9472d.C126028a;
import com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a.C130376r;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.d.d */
/* compiled from: PG */
public final /* synthetic */ class C126025d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126026e f347323a;

    /* renamed from: b */
    public final /* synthetic */ C126035k f347324b;

    public /* synthetic */ C126025d(C126026e eVar, C126035k kVar) {
        this.f347323a = eVar;
        this.f347324b = kVar;
    }

    public final Object apply(Object obj) {
        C126026e eVar = this.f347323a;
        C126035k kVar = this.f347324b;
        C58485gu guVar = (C58485gu) obj;
        if (!guVar.isEmpty()) {
            return guVar;
        }
        if (eVar.f347327c.mo107252a(kVar)) {
            return C58485gu.m89846n(eVar.f347325a.mo107353l(((C126029e) kVar).f347344e));
        }
        ArrayList arrayList = new ArrayList();
        if (C126028a.m206050b(kVar)) {
            arrayList.add(eVar.f347325a.mo107350i(((C126029e) kVar).f347344e));
        } else {
            if (eVar.f347326b.f347319a) {
                C126029e eVar2 = (C126029e) kVar;
                C126027d dVar = (C126027d) eVar2.f347341b;
                if (dVar.f347332a && dVar.f347336e == 5 && !dVar.f347335d && C130376r.m212833c("add_item_start_dictation", eVar2.f347342c)) {
                    arrayList.add(eVar.f347325a.mo107344c(eVar2.f347344e, R.string.assistant_keyboard_add_item_text, R.string.assistant_keyboard_add_item_button_description, C125044j.ADD_ITEM));
                }
            }
            if (C126028a.m206051c(kVar)) {
                arrayList.add(eVar.f347325a.mo107351j(((C126029e) kVar).f347344e));
            }
        }
        if (eVar.f347327c.f347337a) {
            C126029e eVar3 = (C126029e) kVar;
            if (((C126027d) eVar3.f347341b).f347332a && C126028a.m206052d(kVar).filter(C126023b.f347321a).isPresent()) {
                arrayList.add(eVar.f347325a.mo107348g(eVar3.f347344e));
            }
        }
        C126029e eVar4 = (C126029e) kVar;
        if (((C126027d) eVar4.f347341b).f347332a && C126028a.m206052d(kVar).filter(C126024c.f347322a).isPresent()) {
            arrayList.add(eVar.f347325a.mo107349h(eVar4.f347344e));
        }
        if (eVar.f347326b.f347320b) {
            C126027d dVar2 = (C126027d) eVar4.f347341b;
            if (dVar2.f347332a && !dVar2.f347335d && dVar2.f347336e == 5 && C130376r.m212833c("save_current_entity", eVar4.f347342c)) {
                arrayList.add(eVar.f347325a.mo107344c(eVar4.f347344e, R.string.assistant_keyboard_save_text, R.string.assistant_keyboard_save_button_description, C125044j.SAVE));
            }
        }
        if (((C126027d) eVar4.f347341b).f347332a) {
            arrayList.add(eVar.f347325a.mo107343b(eVar4.f347344e));
        }
        Collections.shuffle(arrayList);
        return C58485gu.m89842j(arrayList);
    }
}
