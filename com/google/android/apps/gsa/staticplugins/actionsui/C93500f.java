package com.google.android.apps.gsa.staticplugins.actionsui;

import android.text.TextUtils;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.ButtonAction;
import com.google.android.apps.gsa.search.shared.actions.core.PromoAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.f */
/* compiled from: PG */
public final class C93500f extends C93503i {
    public C93500f(C88512f fVar, C58833ax axVar) {
        super(fVar, axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo82048k() {
        mo82057t();
    }

    /* renamed from: t */
    public final void mo82057t() {
        if (mo82060w() && ((ButtonAction) this.f239226b).f236041g.equals("Discoverability")) {
            C88509c cVar = this.f239227c;
            cVar.getClass();
            C93475bc bcVar = (C93475bc) cVar;
            C88507a aVar = bcVar.f239232a;
            aVar.getClass();
            VoiceAction voiceAction = ((C93500f) aVar).f239226b;
            if (voiceAction instanceof PromoAction) {
                PromoAction promoAction = (PromoAction) voiceAction;
                String str = promoAction.f236052h;
                String str2 = promoAction.f236053i;
                String str3 = promoAction.f236054j;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    bcVar.f260871f.setText(str);
                    bcVar.f260872g.setText(str2);
                    WebImageView webImageView = bcVar.f260870e;
                    C88507a aVar2 = bcVar.f239232a;
                    aVar2.getClass();
                    webImageView.mo76738i(str3, ((C93500f) aVar2).mo82040ap());
                }
            }
        }
    }
}
