package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.apb;
import com.google.assistant.p3897e.p3921j.apc;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cr */
/* compiled from: PG */
public final /* synthetic */ class C114848cr implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C114860dc f318635a;

    /* renamed from: b */
    public final /* synthetic */ String f318636b;

    /* renamed from: c */
    public final /* synthetic */ String f318637c;

    public /* synthetic */ C114848cr(C114860dc dcVar, String str, String str2) {
        this.f318635a = dcVar;
        this.f318636b = str;
        this.f318637c = str2;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C114860dc dcVar = this.f318635a;
        String str = this.f318636b;
        String str2 = this.f318637c;
        if (i == -1) {
            if (C58837ba.m90859h(str) || C58837ba.m90859h(str2)) {
                C87571n nVar = dcVar.f318675h;
                C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
                hwVar.copyOnWrite();
                C53287ih ihVar = (C53287ih) hwVar.instance;
                ihVar.f139698d = 2;
                ihVar.f139695a |= 1;
                hwVar.copyOnWrite();
                C53287ih ihVar2 = (C53287ih) hwVar.instance;
                ihVar2.f139702h = 4;
                ihVar2.f139695a |= 64;
                hwVar.copyOnWrite();
                C53287ih ihVar3 = (C53287ih) hwVar.instance;
                ihVar3.f139703i = 46;
                ihVar3.f139695a |= 128;
                nVar.mo81698j(context, (C53287ih) hwVar.build());
            } else {
                apb apb = (apb) apc.f135542e.createBuilder();
                apb.copyOnWrite();
                apc apc = (apc) apb.instance;
                apc.f135544a |= 8;
                apc.f135547d = true;
                String str3 = String.format("https://assistant.google.com/services/invoke/uid/%s", new Object[]{str}) + "?intent=" + str2;
                apb.copyOnWrite();
                apc apc2 = (apc) apb.instance;
                apc2.f135544a |= 1;
                apc2.f135545b = str3;
                C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                jzVar.copyOnWrite();
                C52230ka kaVar = (C52230ka) jzVar.instance;
                kaVar.f137059a |= 1;
                kaVar.f137060b = "assistant.api.client_input.UrlIntentInput";
                C63088z byteString = ((apc) apb.build()).toByteString();
                jzVar.copyOnWrite();
                C52230ka kaVar2 = (C52230ka) jzVar.instance;
                byteString.getClass();
                kaVar2.f137059a |= 2;
                kaVar2.f137061c = byteString;
                C87565h hVar = new C87565h();
                hVar.f236509M = true;
                hVar.f236497A = dcVar.f318676i.mo79746e(C90014bt.f247604kL);
                hVar.f236560f = 1;
                hVar.f236556b = e.au;
                hVar.f236523a = "and.opa.conversation.deeplink";
                C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                dsVar.copyOnWrite();
                C51805du duVar = (C51805du) dsVar.instance;
                duVar.f135926a |= 1;
                duVar.f135927b = "url.INTENT";
                dsVar.mo53729a("url_intent_input", (C52230ka) jzVar.build());
                hVar.f236517U = ((C51805du) dsVar.build()).toByteArray();
                ((C87568k) dcVar.f318682o.mo56107c()).mo81688b(dcVar.f318670c, hVar.mo81685a());
            }
            return true;
        } else if (i == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        }
    }
}
