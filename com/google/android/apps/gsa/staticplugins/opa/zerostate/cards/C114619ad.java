package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114869dl;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3994s.p3995a.C53091ba;
import com.google.assistant.p3994s.p3995a.C53093bc;
import com.google.assistant.p3994s.p3995a.C53095be;
import com.google.common.base.C58881cr;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ad */
/* compiled from: PG */
public final /* synthetic */ class C114619ad implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114623ah f317974a;

    public /* synthetic */ C114619ad(C114623ah ahVar) {
        this.f317974a = ahVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C114623ah ahVar = this.f317974a;
        ViewGroup viewGroup = (ViewGroup) ahVar.f317986g.inflate(R.layout.zero_state_multi_item_card, (ViewGroup) null);
        ((TextView) viewGroup.findViewById(R.id.card_header_title)).setText(R.string.missed_communication_card_title);
        View findViewById = viewGroup.findViewById(R.id.overflow_menu_icon);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new C114620ae(ahVar));
        ahVar.f317988i = (ViewGroup) viewGroup.findViewById(R.id.zero_state_multi_item_card_item_list_container);
        for (C53091ba baVar : ahVar.f317984e.f139150a) {
            String str = baVar.f139126b;
            if (!str.isEmpty()) {
                C53093bc bcVar = baVar.f139130f;
                if (bcVar == null) {
                    bcVar = C53093bc.f139133e;
                }
                String str2 = bcVar.f139136b;
                if (str2.isEmpty()) {
                    str2 = baVar.f139129e;
                }
                Context context = ahVar.f317980a;
                Object[] objArr = new Object[1];
                if (true == str2.isEmpty()) {
                    str2 = str;
                }
                objArr[0] = str2;
                String string = context.getString(R.string.missed_call_from, objArr);
                C114869dl dlVar = ahVar.f317983d;
                C63042fg fgVar = baVar.f139128d;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                String a = dlVar.mo101668a(C62953e.m95478c(fgVar));
                C53093bc bcVar2 = baVar.f139130f;
                if (bcVar2 == null) {
                    bcVar2 = C53093bc.f139133e;
                }
                String str3 = bcVar2.f139137c;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ahVar.mo101473g(ahVar.f317980a.getString(R.string.call_back), str));
                arrayList.add(ahVar.mo101474h(ahVar.f317980a.getString(R.string.send_a_sms), str));
                ahVar.f317988i.addView(new C114699y(ahVar.f317980a, ahVar.f317981b, ahVar.f317982c, string, a, str3, arrayList).f318262c);
            }
        }
        for (C53095be beVar : ahVar.f317984e.f139151b) {
            String str4 = beVar.f139144c;
            if (!str4.isEmpty()) {
                String str5 = beVar.f139143b;
                Context context2 = ahVar.f317980a;
                Object[] objArr2 = new Object[1];
                if (true == str5.isEmpty()) {
                    str5 = str4;
                }
                objArr2[0] = str5;
                String string2 = context2.getString(R.string.unread_sms_from, objArr2);
                C114869dl dlVar2 = ahVar.f317983d;
                C63042fg fgVar2 = beVar.f139145d;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                String a2 = dlVar2.mo101668a(C62953e.m95478c(fgVar2));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ahVar.mo101474h(ahVar.f317980a.getString(R.string.reply), str4));
                arrayList2.add(ahVar.mo101473g(ahVar.f317980a.getString(R.string.call_back), str4));
                ahVar.f317988i.addView(new C114699y(ahVar.f317980a, ahVar.f317981b, ahVar.f317982c, string2, a2, BuildConfig.FLAVOR, arrayList2).f318262c);
            }
        }
        viewGroup.getClass();
        return viewGroup;
    }
}
