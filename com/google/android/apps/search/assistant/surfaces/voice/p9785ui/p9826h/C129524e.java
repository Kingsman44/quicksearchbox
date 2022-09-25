package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9826h;

import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9826h.p9827a.C129516b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9826h.p9827a.C129517c;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.h.e */
/* compiled from: PG */
public final /* synthetic */ class C129524e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129516b f355567a;

    public /* synthetic */ C129524e(C129516b bVar) {
        this.f355567a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C129517c a = this.f355567a.mo17754z();
        String str = ((C52003hb) obj).f136479b;
        TextView textView = (TextView) a.f355557b.requireView().findViewById(R.id.assistant_overapp_text_view);
        if (textView != null) {
            textView.setText(str);
        }
        return C127406c.f350821b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
