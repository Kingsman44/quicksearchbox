package com.google.android.apps.gsa.staticplugins.p7614bx.p7623e;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Html;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97427h;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97430k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.play.core.p3525a.C45025a;
import com.google.android.play.core.p3525a.C45032e;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.FileNotFoundException;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69421bp;
import p5451f.p5452a.p5453a.p5454a.C69455t;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.e.f */
/* compiled from: PG */
public final class C97442f extends C22939d {

    /* renamed from: g */
    private static final C59071e f272131g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bx.e.f");

    /* renamed from: a */
    public final C97427h f272132a;

    /* renamed from: b */
    public final C45032e f272133b;

    /* renamed from: c */
    TextView f272134c;

    /* renamed from: d */
    TextView f272135d;

    /* renamed from: e */
    TextView f272136e;

    /* renamed from: f */
    TextView f272137f;

    /* renamed from: h */
    private final Context f272138h;

    /* renamed from: i */
    private final C97430k f272139i;

    /* renamed from: j */
    private final C58833ax f272140j;

    public C97442f(C22945j jVar, C97430k kVar, C97427h hVar, Context context, C58833ax axVar, C45032e eVar) {
        super(jVar);
        this.f272138h = context;
        this.f272139i = kVar;
        this.f272132a = hVar;
        this.f272140j = axVar;
        this.f272133b = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo90719e(C45025a aVar) {
        try {
            this.f272133b.mo48867b(aVar, (Activity) this.f272140j.mo56107c());
        } catch (IntentSender.SendIntentException e) {
            C59104x c = f272131g.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MenuPromoRenderer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21021)).mo56386p("Failed to send intent");
        }
    }

    /* renamed from: f */
    public final void mo90720f(TextView textView, C69455t tVar) {
        int i = tVar.f185863a;
        if (i == 1) {
            textView.setText(Html.fromHtml((String) tVar.f185864b));
        } else if (i == 2) {
            try {
                Pair k = C90772bp.m148303k(this.f272138h, Uri.parse((String) tVar.f185864b));
                textView.setText(Html.fromHtml(((Resources) k.first).getString(((Integer) k.second).intValue())));
            } catch (FileNotFoundException e) {
                C59104x c = f272131g.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MenuPromoRenderer");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21022)).mo56386p("Cannot find string for uri.");
            }
        }
    }

    /* renamed from: g */
    public final void mo90721g() {
        C69396ar arVar = (C69396ar) ((C23249a) this.f272139i.mo90691b()).mo28725a();
        if (!C58832aw.m90831a(arVar, C69396ar.f185678d)) {
            C69421bp bpVar = arVar.f185682c;
            if (bpVar == null) {
                bpVar = C69421bp.f185742q;
            }
            if (!bpVar.f185749f) {
                mo28297il().setVisibility(0);
                return;
            }
        }
        mo28297il().setVisibility(8);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f272138h).inflate(R.layout.menu_promotion, (ViewGroup) null);
        mo28295iC(inflate);
        this.f272134c = (TextView) inflate.findViewById(R.id.menu_tip_title);
        this.f272135d = (TextView) inflate.findViewById(R.id.menu_tip_description);
        this.f272136e = (TextView) inflate.findViewById(R.id.menu_tip_accept_button);
        this.f272137f = (TextView) inflate.findViewById(R.id.menu_tip_reject_button);
        ((C23249a) this.f272139i.mo90691b()).mo28726b(new C97441e(this));
    }
}
