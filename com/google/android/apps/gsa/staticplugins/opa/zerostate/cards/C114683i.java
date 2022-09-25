package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58881cr;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.i */
/* compiled from: PG */
public final /* synthetic */ class C114683i implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114686l f318207a;

    public /* synthetic */ C114683i(C114686l lVar) {
        this.f318207a = lVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C114686l lVar = this.f318207a;
        ViewGroup viewGroup = (ViewGroup) lVar.f318213c.inflate(R.layout.ambient_notification_card, (ViewGroup) null);
        C28292j jVar = new C28292j(83313);
        jVar.mo33795i(5);
        C28295m.m52919e(viewGroup, jVar);
        lVar.f318217g = C28293k.m52908e(jVar, new C28293k[0]);
        viewGroup.setOnClickListener(new C89943l(new C114684j(lVar)));
        lVar.f318214d.mo98652a((LinearLayout) viewGroup.findViewById(R.id.amb_notification_symbol_container), (View) null, -1);
        TextView textView = (TextView) viewGroup.findViewById(R.id.amb_notification_description);
        lVar.mo101520g(textView, new ArrayList());
        lVar.f318215e.mo5704e(lVar.f318212b, new C114685k(lVar, textView));
        viewGroup.getClass();
        return viewGroup;
    }
}
