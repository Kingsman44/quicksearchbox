package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.e */
/* compiled from: PG */
public final /* synthetic */ class C114061e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f315766a;

    public /* synthetic */ C114061e(C113926aa aaVar) {
        this.f315766a = aaVar;
    }

    public final void accept(Object obj) {
        C113926aa aaVar = this.f315766a;
        ViewGroup viewGroup = (ViewGroup) obj;
        C28295m.m52919e(viewGroup, new C28292j(129794));
        TextView textView = (TextView) viewGroup.findViewById(R.id.correction_title_text);
        String x = aaVar.f315514c.mo79758x(C90029ch.f248244ae);
        if (!TextUtils.isEmpty(x)) {
            textView.setText(x);
        }
        View findViewById = viewGroup.findViewById(R.id.btn_close);
        C28292j jVar = new C28292j(129795);
        jVar.mo33795i(5);
        C28295m.m52919e(findViewById, jVar);
        findViewById.setOnClickListener(new C89943l(new C114080i(aaVar)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
