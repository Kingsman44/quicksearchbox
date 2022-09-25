package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.text.TextUtils;
import android.util.Pair;
import android.widget.LinearLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemLayout;
import com.google.android.apps.gsa.shared.bisto.C89629b;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.j */
/* compiled from: PG */
public final /* synthetic */ class C10151j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34533a;

    public /* synthetic */ C10151j(C10166y yVar) {
        this.f34533a = yVar;
    }

    public final void accept(Object obj) {
        C10166y yVar = this.f34533a;
        Pair pair = (Pair) obj;
        LinearLayout linearLayout = yVar.f34564l;
        C49875cf cfVar = C49875cf.BISTO;
        C58976aa aaVar = C58975e.f156826a;
        ItemLayout inflate = yVar.getLayoutInflater().inflate(R.layout.settings_item_layout, yVar.f34564l, false);
        inflate.p((CharSequence) pair.second);
        inflate.e().setEllipsize(TextUtils.TruncateAt.END);
        inflate.e().setMaxLines(1);
        String str = (String) C58831av.m90830c((String) pair.first, BuildConfig.FLAVOR);
        o oVar = yVar.f34555c;
        if (!oVar.j(str) || !((C89629b) ((C68214a) oVar.b.mo56107c()).mo27525b()).mo83506f(str)) {
            inflate.o(inflate.f(R.string.status_off_text));
        } else {
            inflate.o(inflate.f(R.string.status_on_text));
        }
        inflate.h(yVar.f34555c.b(cfVar, str));
        inflate.setOnClickListener(new C10158q(yVar, cfVar, str));
        linearLayout.addView(inflate);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
