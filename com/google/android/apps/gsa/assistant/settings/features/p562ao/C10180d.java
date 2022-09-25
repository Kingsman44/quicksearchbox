package com.google.android.apps.gsa.assistant.settings.features.p562ao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C50277rc;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ao.d */
/* compiled from: PG */
public final class C10180d {

    /* renamed from: a */
    public final C10181e f34594a;

    /* renamed from: b */
    private final C91189au f34595b;

    public C10180d(C91189au auVar, C10181e eVar) {
        this.f34595b = auVar;
        this.f34594a = eVar;
    }

    /* renamed from: b */
    public static void m25050b(View view) {
        C89949q.m146521e(C28285c.m52874a(view, 61687), false);
    }

    /* renamed from: a */
    public final Optional mo18312a(ViewGroup viewGroup, List list, Function function) {
        C28295m.m52919e(viewGroup, new C28292j(86444));
        C89949q.m146521e(C28285c.m52874a(viewGroup, 61687), false);
        Optional findAny = Collection.EL.stream(list).filter(new C10177a(this)).findAny();
        if (findAny.isEmpty()) {
            return Optional.empty();
        }
        C50277rc rcVar = (C50277rc) findAny.get();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.proactive_card, viewGroup, false);
        int i = rcVar.f130749h;
        if (i > 0) {
            C28295m.m52919e(inflate, new C28292j(i));
        }
        if (rcVar.f130744c.isEmpty()) {
            inflate.setVisibility(8);
            if (rcVar.f130751j > 0) {
                C28292j jVar = new C28292j(rcVar.f130751j);
                jVar.mo33795i(5);
                C28295m.m52919e((TextView) inflate.findViewById(R.id.proactive_card_action_button), jVar);
            }
        } else {
            ((TextView) inflate.findViewById(R.id.proactive_card_heading)).setText(rcVar.f130744c);
            ((TextView) inflate.findViewById(R.id.proactive_card_body)).setText(rcVar.f130745d);
            TextView textView = (TextView) inflate.findViewById(R.id.proactive_card_dismiss_button);
            if ((rcVar.f130742a & 16) != 0) {
                textView.setText(rcVar.f130747f);
            }
            C28292j jVar2 = new C28292j(rcVar.f130750i);
            jVar2.mo33795i(5);
            C28295m.m52919e(textView, jVar2);
            textView.setOnClickListener(new C89943l(new C10178b(this, rcVar, inflate)));
            TextView textView2 = (TextView) inflate.findViewById(R.id.proactive_card_action_button);
            textView2.setText(rcVar.f130746e);
            C28292j jVar3 = new C28292j(rcVar.f130751j);
            jVar3.mo33795i(5);
            C28295m.m52919e(textView2, jVar3);
            textView2.setOnClickListener(new C89943l(new C10179c(this, rcVar, inflate, function)));
            this.f34595b.mo85421i(rcVar.f130748g, (ImageView) inflate.findViewById(R.id.proactive_card_image));
        }
        return Optional.m71637of(inflate);
    }
}
