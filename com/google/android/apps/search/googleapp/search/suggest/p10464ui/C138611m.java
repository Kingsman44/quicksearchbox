package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.apps.search.lens.p10547a.C139916a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.m */
/* compiled from: PG */
public final class C138611m {

    /* renamed from: a */
    public final C138548ac f376970a;

    /* renamed from: b */
    public final C47770dh f376971b;

    /* renamed from: c */
    public final C138068y f376972c;

    /* renamed from: d */
    public final C138057n f376973d;

    /* renamed from: e */
    public final C139708c f376974e;

    /* renamed from: f */
    public final C89859i f376975f;

    /* renamed from: g */
    public final C28306ab f376976g;

    /* renamed from: h */
    public final C28443m f376977h;

    /* renamed from: i */
    public final boolean f376978i;

    /* renamed from: j */
    public final C139916a f376979j;

    /* renamed from: k */
    public final boolean f376980k;

    /* renamed from: l */
    public final C46401p f376981l;

    /* renamed from: m */
    public final C38553h f376982m;

    /* renamed from: n */
    private final C138575b f376983n;

    public C138611m(C138575b bVar, C138548ac acVar, C47770dh dhVar, C138068y yVar, C138057n nVar, C139708c cVar, C89859i iVar, C28306ab abVar, C28443m mVar, boolean z, C38553h hVar, C139916a aVar, boolean z2, InstanceStateStoreFactory instanceStateStoreFactory) {
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(yVar, "suggestLoggingState");
        C69664n.m101061g(nVar, "suggestLogger");
        C69664n.m101061g(cVar, "voiceSearchLogger");
        C69664n.m101061g(iVar, "appFlowLogger");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(hVar, "fragmentIncognitoChecker");
        C69664n.m101061g(instanceStateStoreFactory, "entryPointStoreFactory");
        this.f376983n = bVar;
        this.f376970a = acVar;
        this.f376971b = dhVar;
        this.f376972c = yVar;
        this.f376973d = nVar;
        this.f376974e = cVar;
        this.f376975f = iVar;
        this.f376976g = abVar;
        this.f376977h = mVar;
        this.f376978i = z;
        this.f376982m = hVar;
        this.f376979j = aVar;
        this.f376980k = z2;
        this.f376981l = instanceStateStoreFactory.mo50325a("entry_point", C138550ae.f376838c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r4.length() == 0) goto L_0x003d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m225071d(android.view.View r4, android.widget.EditText r5, android.view.View r6, android.widget.ImageButton r7, com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138611m r8) {
        /*
            android.text.Editable r0 = r5.getText()
            java.lang.String r1 = "searchBox.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            int r0 = r0.length()
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138601c.m225070a(r4, r0)
            android.text.Editable r4 = r5.getText()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r1)
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0026
            r4 = 1
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138601c.m225070a(r6, r4)
            boolean r4 = r8.f376978i
            if (r4 == 0) goto L_0x003c
            android.text.Editable r4 = r5.getText()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r1)
            int r4 = r4.length()
            if (r4 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138601c.m225070a(r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138611m.m225071d(android.view.View, android.widget.EditText, android.view.View, android.widget.ImageButton, com.google.android.apps.search.googleapp.search.suggest.ui.m):void");
    }

    /* renamed from: a */
    public final InputMethodManager mo114400a() {
        Object systemService = this.f376983n.requireContext().getSystemService("input_method");
        C69664n.m101059e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    /* renamed from: b */
    public final EditText mo114401b() {
        View findViewById = this.f376983n.requireView().findViewById(R.id.googleapp_search_box);
        C69664n.m101060f(findViewById, "fragment.requireView().f….id.googleapp_search_box)");
        return (EditText) findViewById;
    }

    /* renamed from: c */
    public final void mo114402c() {
        mo114400a().hideSoftInputFromWindow(this.f376983n.requireView().getWindowToken(), 0);
    }

    /* renamed from: e */
    public final void mo114403e(C139704d dVar) {
        C46401p pVar = this.f376981l;
        C62912at atVar = C62912at.f169862a;
        C138549ad adVar = (C138549ad) C138550ae.f376838c.createBuilder();
        C69664n.m101060f(adVar, "newBuilder()");
        C69664n.m101061g(adVar, "builder");
        C69664n.m101061g(dVar, "value");
        adVar.copyOnWrite();
        C138550ae aeVar = (C138550ae) adVar.instance;
        aeVar.f376841b = dVar.f379715p;
        aeVar.f376840a |= 1;
        C62942bv build = adVar.build();
        C69664n.m101060f(build, "_builder.build()");
        pVar.mo50381d(atVar, (C138550ae) build);
    }

    /* renamed from: f */
    public final void mo114404f(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "query");
        Editable text = mo114401b().getText();
        Selection.setSelection(text, text.length());
        text.replace(0, text.length(), charSequence);
    }

    /* renamed from: g */
    public final void mo114405g(EditText editText) {
        if (editText.isFocused()) {
            mo114400a().showSoftInput(editText, 1);
        }
    }

    /* renamed from: h */
    public final void mo114406h() {
        EditText b = mo114401b();
        b.requestFocus();
        if (b.hasWindowFocus()) {
            mo114405g(b);
        } else {
            b.getViewTreeObserver().addOnWindowFocusChangeListener(new C138610l(b, this));
        }
    }

    /* renamed from: i */
    public final void mo114407i() {
        mo114402c();
        mo114401b().clearFocus();
    }

    /* renamed from: j */
    public final void mo114408j(EditText editText) {
        C138550ae aeVar;
        C46370ah a = this.f376981l.mo50378a(C62912at.f169862a);
        C139704d dVar = null;
        if (!(a == null || (aeVar = (C138550ae) a.f121384a) == null || (dVar = C139704d.m227141a(aeVar.f376841b)) != null)) {
            dVar = C139704d.UNKNOWN;
        }
        if (dVar == null) {
            dVar = C139704d.UNKNOWN;
        }
        editText.setHint(true != C139705e.m227143a(dVar) ? R.string.ga_search_box_hint : R.string.googleapp_pixel_search_box_hint);
    }
}
