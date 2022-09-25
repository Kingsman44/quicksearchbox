package com.google.android.apps.gsa.staticplugins.p7638ca.p7641c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7070b.p7099p.C90269b;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7152d.C90671d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.p7638ca.p7640b.C97506a;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100072o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ca.c.e */
/* compiled from: PG */
public final class C97511e extends C22939d implements C90269b {

    /* renamed from: a */
    public static final C59071e f272319a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ca.c.e");

    /* renamed from: b */
    public final C90671d f272320b;

    /* renamed from: c */
    public C97508b f272321c;

    /* renamed from: d */
    private final Context f272322d;

    /* renamed from: e */
    private final C97506a f272323e;

    public C97511e(C22945j jVar, Context context, C97506a aVar, C90671d dVar) {
        super(jVar);
        this.f272322d = context;
        this.f272323e = aVar;
        this.f272320b = dVar;
    }

    /* renamed from: a */
    public final void mo83977a(C100072o oVar) {
        C97508b bVar = this.f272321c;
        if (bVar != null) {
            bVar.f272316e = oVar;
            return;
        }
        ((C59052c) ((C59052c) f272319a.mo56226d()).mo56372aa(21321)).mo56386p("Renderer method called before the renderer was initialized");
        int i = C90755l.f253831a;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        SuggestionGridLayout suggestionGridLayout = (SuggestionGridLayout) LayoutInflater.from(this.f272322d).inflate(R.layout.native_cards_container, (ViewGroup) null);
        mo28295iC(suggestionGridLayout);
        this.f272321c = new C97508b(suggestionGridLayout);
        ((C23249a) this.f272323e.mo90735b()).mo28726b(new C97509c(this));
        ((C23249a) this.f272323e.mo90736c()).mo28726b(new C97510d(this));
    }
}
