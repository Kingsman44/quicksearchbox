package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139352h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60901do;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.o */
/* compiled from: PG */
final class C139472o implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139470n f379250a;

    public C139472o(C139470n nVar) {
        this.f379250a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139352h hVar = (C139352h) bVar;
        C139470n nVar = this.f379250a;
        nVar.mo114993c(5);
        Optional map = Optional.ofNullable(nVar.f379240c.getView()).map(C139469m.f379237a);
        if (map.isPresent()) {
            ((ViewGroup) map.get()).setVisibility(0);
            nVar.mo114993c(6);
        }
        View view = nVar.f379240c.getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.googleapp_preview_label_with_spinner);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            View findViewById2 = view.findViewById(R.id.googleapp_preview_label);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
                if (findViewById2.getBackground() != null) {
                    findViewById2.getBackground().setAlpha(76);
                }
                ((TextView) view.findViewById(R.id.googleapp_preview_label_text)).setAlpha(0.3f);
            }
        }
        C60872cz d = nVar.f379244g.mo29164d(C60901do.f165001a, nVar.f379245h.toMillis(), TimeUnit.MILLISECONDS);
        C46439e eVar = nVar.f379243f;
        C46438d b = C46438d.m82810b(d);
        eVar.mo50428h(b.f121541a, (Object) null, nVar.f379248k);
        return C47392e.f123115a;
    }
}
