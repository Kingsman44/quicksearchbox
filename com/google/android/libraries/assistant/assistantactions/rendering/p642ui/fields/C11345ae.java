package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C52478tf;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52493tu;
import com.google.assistant.p3897e.p3921j.C52494tv;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ae */
/* compiled from: PG */
public final /* synthetic */ class C11345ae implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ ContactSelectionFieldV2 f37072a;

    public /* synthetic */ C11345ae(ContactSelectionFieldV2 contactSelectionFieldV2) {
        this.f37072a = contactSelectionFieldV2;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C11301i iVar;
        C50969bn bnVar;
        C51016dg dgVar;
        ContactSelectionFieldV2 contactSelectionFieldV2 = this.f37072a;
        if (!(contactSelectionFieldV2.f37153l == null || contactSelectionFieldV2.f37154m == null)) {
            C52478tf tfVar = (C52478tf) C52479tg.f137757d.createBuilder();
            C52493tu tuVar = (C52493tu) C52494tv.f137809c.createBuilder();
            tuVar.copyOnWrite();
            C52494tv tvVar = (C52494tv) tuVar.instance;
            tvVar.f137811a |= 1;
            tvVar.f137812b = (long) i;
            tfVar.copyOnWrite();
            C52479tg tgVar = (C52479tg) tfVar.instance;
            C52494tv tvVar2 = (C52494tv) tuVar.build();
            tvVar2.getClass();
            tgVar.f137761c = tvVar2;
            tgVar.f137759a |= 2;
            contactSelectionFieldV2.mo19836a((C52479tg) tfVar.build());
            C11298f a = contactSelectionFieldV2.f37154m.mo19691a(contactSelectionFieldV2.f37153l);
            C51941eu euVar = contactSelectionFieldV2.f37153l.f36729a;
            if (euVar.f136277e == 16) {
                bnVar = (C50969bn) euVar.f136278f;
            } else {
                bnVar = C50969bn.f132678i;
            }
            C51030du duVar = bnVar.f132683d;
            if (duVar == null) {
                duVar = C51030du.f132868g;
            }
            C62971cq cqVar = duVar.f132875f;
            if (i >= cqVar.size() || ((C51027dr) cqVar.get(i)).f132857d != 4) {
                contactSelectionFieldV2.mo19941h(a);
            } else {
                C51027dr drVar = (C51027dr) cqVar.get(i);
                if (drVar.f132857d == 4) {
                    dgVar = (C51016dg) drVar.f132858e;
                } else {
                    dgVar = C51016dg.f132827g;
                }
                contactSelectionFieldV2.mo19942i(dgVar, a);
            }
        }
        C28292j a2 = C28295m.m52915a(view);
        if (a2 != null && (iVar = contactSelectionFieldV2.f37152k) != null) {
            iVar.mo19732o(a2);
        }
    }
}
