package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.widget.LinearLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.g;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114214b;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.jk */
/* compiled from: PG */
public final class C108457jk extends C108232bc {

    /* renamed from: b */
    private static final C59071e f301682b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.jk");

    /* renamed from: a */
    public final g f301683a;

    /* renamed from: c */
    private final C91097g f301684c;

    /* renamed from: d */
    private final C58833ax f301685d;

    /* renamed from: e */
    private final int f301686e;

    public C108457jk(C91097g gVar, C58833ax axVar, int i, g gVar2) {
        super((byte[]) null);
        this.f301684c = gVar;
        this.f301685d = axVar;
        this.f301686e = i;
        this.f301683a = gVar2;
    }

    /* renamed from: c */
    private final String m180295c() {
        C60214n g;
        C28292j jVar = this.f301030l;
        if (jVar == null || (g = C28285c.m52880g(jVar)) == null) {
            return null;
        }
        return C28294l.m52913c(g);
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 59750;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return this.f301686e == 3 ? 31 : 18;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar;
        if (this.f301686e != 2 || (jVar = this.f301030l) == null) {
            return null;
        }
        return C28293k.m52908e(jVar, new C28293k[0]);
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        int i = this.f301686e;
        if (i == 2 || i == 3) {
            LinearLayout linearLayout = blVar.f301099z;
            linearLayout.getClass();
            linearLayout.setOnClickListener(new C108456jj(this));
        }
    }

    /* renamed from: b */
    public final void mo96898b() {
        int i = this.f301683a.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 != 0) {
            String str = BuildConfig.FLAVOR;
            if (i3 == 0) {
                C114214b bVar = (C114214b) this.f301685d.mo56107c();
                g gVar = this.f301683a;
                if (!bVar.mo101264a(bVar.f316710c.mo84245H(0, false, (QueryTriggerType) null), gVar.b == 1 ? (String) gVar.c : str, m180295c())) {
                    C59052c cVar = (C59052c) ((C59052c) f301682b.mo56225c()).mo56372aa(24060);
                    g gVar2 = this.f301683a;
                    if (gVar2.b == 1) {
                        str = (String) gVar2.c;
                    }
                    cVar.mo56389s("Cannot execute URL from history: %s", str);
                }
            } else if (i3 != 1) {
                ((C59052c) ((C59052c) f301682b.mo56225c()).mo56372aa(24059)).mo56386p("Unknown OpaWebviewQueryArgs.");
            } else {
                Intent intent = new Intent();
                g gVar3 = this.f301683a;
                if (gVar3.b == 2) {
                    str = (String) gVar3.c;
                }
                intent.putExtra("com.google.opa.QUERY", str);
                if (this.f301025B != 0) {
                    intent.putExtra("android.opa.extra.TRIGGERED_BY", 151);
                }
                String c = m180295c();
                if (c != null) {
                    intent.putExtra("ved", c);
                }
                this.f301684c.mo65089a(intent);
            }
        } else {
            throw null;
        }
    }
}
