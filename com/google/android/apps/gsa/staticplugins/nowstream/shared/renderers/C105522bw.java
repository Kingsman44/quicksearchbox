package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105440j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bw */
/* compiled from: PG */
public final class C105522bw extends C22939d implements C90233i {

    /* renamed from: d */
    private static final C59071e f294399d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bw");

    /* renamed from: a */
    public final Context f294400a;

    /* renamed from: b */
    public TextView f294401b;

    /* renamed from: c */
    public View f294402c;

    /* renamed from: e */
    private final C105440j f294403e;

    /* renamed from: f */
    private View f294404f;

    public C105522bw(C22945j jVar, C105440j jVar2, Context context) {
        super(jVar);
        this.f294403e = jVar2;
        this.f294400a = context;
    }

    /* renamed from: a */
    public final int mo83944a() {
        C90229e eVar = (C90229e) ((C58833ax) ((C23249a) this.f294403e.mo94605d()).mo28725a()).mo56111f();
        if (eVar == C90229e.MINUS_ONE) {
            return 53025;
        }
        if (eVar == C90229e.SEARCH_NOW_FEED) {
            return 65774;
        }
        ((C59052c) ((C59052c) f294399d.mo56225c()).mo56372aa(22350)).mo56386p("Given surface type is not supported by bottomsheet");
        return 0;
    }

    /* renamed from: b */
    public final View mo83945b() {
        return this.f294404f;
    }

    /* renamed from: c */
    public final String mo83946c() {
        return (String) ((C23249a) this.f294403e.mo94604c()).mo28725a();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f294400a).inflate(R.layout.new_content_button, (ViewGroup) null);
        mo28295iC(inflate);
        View findViewById = inflate.findViewById(R.id.new_content);
        this.f294404f = findViewById;
        this.f294401b = (TextView) findViewById.findViewById(R.id.action_button);
        this.f294402c = this.f294404f.findViewById(R.id.bubble_snackbar);
        ((C23249a) this.f294403e.mo94604c()).mo28726b(new C105520bu(this));
        ((C23249a) this.f294403e.mo94603b()).mo28726b(new C105521bv(this));
    }
}
