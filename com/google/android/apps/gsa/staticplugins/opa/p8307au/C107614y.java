package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91210bo;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.y */
/* compiled from: PG */
public final class C107614y extends C107609t {

    /* renamed from: a */
    public final C28292j f299372a;

    /* renamed from: b */
    public final C28292j f299373b;

    /* renamed from: c */
    private final C22871g f299374c;

    /* renamed from: d */
    private final Context f299375d;

    /* renamed from: e */
    private final C83581al f299376e;

    /* renamed from: f */
    private final C91189au f299377f;

    public C107614y(Context context, C83581al alVar, C22871g gVar, C91189au auVar) {
        C28292j jVar = new C28292j(79901);
        jVar.mo33795i(5);
        this.f299372a = jVar;
        C28292j jVar2 = new C28292j(79902);
        jVar2.mo33795i(5);
        this.f299373b = jVar2;
        this.f299375d = context;
        this.f299376e = alVar;
        this.f299374c = gVar;
        this.f299377f = auVar;
    }

    /* renamed from: a */
    public final C107608s mo96069a(C123766cf cfVar, int i, C28292j jVar) {
        View inflate = LayoutInflater.from(this.f299375d).inflate(R.layout.rich_input_content_coin, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.opa_rich_input_generic_icon);
        if (imageView != null) {
            if ((cfVar.f341886a & 8) != 0) {
                C91189au auVar = this.f299377f;
                C91193ay q = C91196ba.m149039q();
                ((C91222n) q).f254620a = cfVar.f341890e;
                q.mo85444b(C91210bo.f254596c);
                auVar.mo85420h(q.mo85445c(), imageView);
            } else {
                imageView.setImageResource(R.drawable.product_logo_avatar_anonymous_white_color_24);
            }
        }
        String string = this.f299375d.getResources().getString(i, new Object[]{cfVar.f341887b});
        ((TextView) inflate.findViewById(R.id.opa_richinput_content_text)).setText(string);
        C107607r f = C107608s.m178492f();
        f.mo96047b(inflate);
        C107581a aVar = (C107581a) f;
        aVar.f299301a = C58833ax.m90834k(string);
        aVar.f299302b = jVar;
        return f.mo96046a();
    }

    /* renamed from: b */
    public final C60870cx mo96061b() {
        return this.f299374c.mo28209i(this.f299376e.mo76935j(), "opaStore.getTopContactSections", new C107612w(this));
    }
}
