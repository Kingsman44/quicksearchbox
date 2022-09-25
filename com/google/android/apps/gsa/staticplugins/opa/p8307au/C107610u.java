package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.u */
/* compiled from: PG */
public final class C107610u extends C107609t {

    /* renamed from: a */
    private final Context f299368a;

    /* renamed from: b */
    private final C28292j f299369b;

    public C107610u(Context context) {
        C28292j jVar = new C28292j(79904);
        jVar.mo33795i(5);
        this.f299369b = jVar;
        this.f299368a = context;
    }

    /* renamed from: b */
    public final C60870cx mo96061b() {
        View inflate = LayoutInflater.from(this.f299368a).inflate(R.layout.rich_input_content_coin, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R.id.opa_rich_input_generic_icon)).setImageResource(R.drawable.ic_reminder_googblue);
        String string = this.f299368a.getResources().getString(R.string.opa_rich_input_set_reminder);
        ((TextView) inflate.findViewById(R.id.opa_richinput_content_text)).setText(string);
        C107607r f = C107608s.m178492f();
        f.mo96047b(inflate);
        C58833ax k = C58833ax.m90834k(string);
        C107581a aVar = (C107581a) f;
        aVar.f299301a = k;
        aVar.f299302b = this.f299369b;
        return C60856cj.m92900i(C58485gu.m89846n(f.mo96046a()));
    }
}
