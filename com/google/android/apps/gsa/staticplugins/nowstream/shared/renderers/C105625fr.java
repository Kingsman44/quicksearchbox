package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.snackbar.Snackbar;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105389aa;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105456z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Collections;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fr */
/* compiled from: PG */
public final class C105625fr extends C22939d implements C90233i {

    /* renamed from: g */
    private static final C59071e f294696g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fr");

    /* renamed from: a */
    public final C105456z f294697a;

    /* renamed from: b */
    public final Context f294698b;

    /* renamed from: c */
    public final C105389aa f294699c;

    /* renamed from: d */
    public Snackbar f294700d;

    /* renamed from: e */
    public View f294701e;

    /* renamed from: f */
    public View.OnClickListener f294702f;

    public C105625fr(C22945j jVar, C105456z zVar, Context context, C105389aa aaVar) {
        super(jVar);
        new Rect(0, 0, 0, 0);
        Collections.newSetFromMap(new WeakHashMap());
        this.f294697a = zVar;
        this.f294698b = context;
        this.f294699c = aaVar;
    }

    /* renamed from: a */
    public final int mo83944a() {
        C90229e eVar = (C90229e) ((C58833ax) ((C23249a) this.f294697a.mo94656f()).mo28725a()).mo56111f();
        if (eVar == C90229e.MINUS_ONE) {
            return 50001;
        }
        if (eVar == C90229e.SEARCH_NOW_FEED) {
            return 65775;
        }
        if (eVar == C90229e.SRP) {
            return 108050;
        }
        if (eVar == C90229e.SECOND_SCREEN) {
            return 132537;
        }
        ((C59052c) ((C59052c) f294696g.mo56226d()).mo56372aa(22370)).mo56389s("Given surface type %s is not supported by bottomsheet", eVar != null ? eVar.name() : "null");
        int i = C90755l.f253831a;
        return 0;
    }

    /* renamed from: b */
    public final View mo83945b() {
        return this.f294700d;
    }

    /* renamed from: c */
    public final String mo83946c() {
        return (String) ((C23249a) this.f294697a.mo94655e()).mo28725a();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f294702f = new C105622fo(this);
        ((C23249a) this.f294697a.mo94653c()).mo28726b(new C105623fp(this));
        ((C23249a) this.f294697a.mo94654d()).mo28726b(new C105624fq(this));
        Snackbar snackbar = (Snackbar) LayoutInflater.from(this.f294698b).inflate(R.layout.snackbar, (ViewGroup) null);
        this.f294700d = snackbar;
        this.f294701e = snackbar.findViewById(R.id.snackbar_frame_layout);
        mo28295iC(this.f294700d);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        int i = 0;
        if (((C58833ax) ((C23249a) this.f294697a.mo94656f()).mo28725a()).mo56113h()) {
            C90229e eVar = (C90229e) ((C58833ax) ((C23249a) this.f294697a.mo94656f()).mo28725a()).mo56107c();
            if (eVar == C90229e.MINUS_ONE) {
                i = 50321;
            } else if (eVar == C90229e.SEARCH_NOW_FEED) {
                i = 65776;
            } else if (eVar == C90229e.SRP) {
                i = 108015;
            } else if (eVar == C90229e.SECOND_SCREEN) {
                i = 132538;
            } else {
                ((C59052c) ((C59052c) f294696g.mo56225c()).mo56372aa(22372)).mo56389s("Given surface type %s is not supported by bottomsheet", eVar.name());
            }
        }
        TextView textView = this.f294700d.f256331b;
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        C28295m.m52919e(textView, jVar);
    }
}
