package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.internal.common.C31921i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33224b;
import com.google.assistant.p3897e.p3921j.C52534vh;
import com.google.assistant.p3897e.p3921j.C52535vi;
import com.google.assistant.p3897e.p3921j.C52536vj;
import com.google.assistant.p3897e.p3921j.C52537vk;
import com.google.assistant.p3897e.p3921j.C52538vl;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.l */
/* compiled from: PG */
public final /* synthetic */ class C33253l implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C33255n f88918a;

    public /* synthetic */ C33253l(C33255n nVar) {
        this.f88918a = nVar;
    }

    public final void onActivityResult(Object obj) {
        C33224b bVar;
        C33255n nVar = this.f88918a;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.f2756b;
        if (intent == null) {
            ((C59052c) ((C59052c) C33255n.f88919a.mo56226d()).mo56372aa(51172)).mo56386p("Failed to retrieve result from MapLocationPicker");
            return;
        }
        int i = activityResult.f2755a;
        if (i == -1) {
            Place b = C31921i.m59481b(intent);
            ((C59052c) ((C59052c) C33255n.f88919a.mo56224b()).mo56372aa(51173)).mo56389s("location place: %s", b);
            if (b.mo37503b() != null) {
                String m = b.mo37516m();
                String p = b.mo37519p();
                LatLng b2 = b.mo37503b();
                b2.getClass();
                Double valueOf = Double.valueOf(b2.f392012a);
                LatLng b3 = b.mo37503b();
                b3.getClass();
                bVar = new C33224b(m, p, valueOf, Double.valueOf(b3.f392013b));
            } else {
                bVar = new C33224b(b.mo37516m(), b.mo37519p(), (Double) null, (Double) null);
            }
            C52538vl vlVar = (C52538vl) C52541vo.f137908f.createBuilder();
            C52536vj vjVar = (C52536vj) C52537vk.f137903c.createBuilder();
            String str = bVar.f88847b;
            vjVar.copyOnWrite();
            C52537vk vkVar = (C52537vk) vjVar.instance;
            str.getClass();
            vkVar.f137905a |= 1;
            vkVar.f137906b = str;
            C52537vk vkVar2 = (C52537vk) vjVar.build();
            vlVar.copyOnWrite();
            C52541vo voVar = (C52541vo) vlVar.instance;
            vkVar2.getClass();
            voVar.f137912c = vkVar2;
            voVar.f137910a |= 4;
            String str2 = bVar.f88846a;
            vlVar.copyOnWrite();
            C52541vo voVar2 = (C52541vo) vlVar.instance;
            str2.getClass();
            voVar2.f137910a |= 2;
            voVar2.f137911b = str2;
            vlVar.copyOnWrite();
            C52541vo voVar3 = (C52541vo) vlVar.instance;
            voVar3.f137914e = 1;
            voVar3.f137910a |= 16;
            if (!(bVar.f88848c == null || bVar.f88849d == null)) {
                C52534vh vhVar = (C52534vh) C52535vi.f137898d.createBuilder();
                Double d = bVar.f88848c;
                d.getClass();
                double doubleValue = d.doubleValue();
                vhVar.copyOnWrite();
                C52535vi viVar = (C52535vi) vhVar.instance;
                viVar.f137900a = 1 | viVar.f137900a;
                viVar.f137901b = doubleValue;
                Double d2 = bVar.f88849d;
                d2.getClass();
                double doubleValue2 = d2.doubleValue();
                vhVar.copyOnWrite();
                C52535vi viVar2 = (C52535vi) vhVar.instance;
                viVar2.f137900a = 2 | viVar2.f137900a;
                viVar2.f137902c = doubleValue2;
                vlVar.copyOnWrite();
                C52541vo voVar4 = (C52541vo) vlVar.instance;
                C52535vi viVar3 = (C52535vi) vhVar.build();
                viVar3.getClass();
                voVar4.f137913d = viVar3;
                voVar4.f137910a |= 8;
            }
            nVar.f88921b.mo38634a((C52541vo) vlVar.build());
        } else if (i == 2) {
            String str3 = C31921i.m59480a(intent).f389622h;
            if (str3 != null) {
                ((C59052c) ((C59052c) C33255n.f88919a.mo56226d()).mo56372aa(51171)).mo56389s("Status message: %s", str3);
            } else {
                ((C59052c) ((C59052c) C33255n.f88919a.mo56226d()).mo56372aa(51170)).mo56386p("Fail to start autocomplete intent and status message is null.");
            }
        }
    }
}
