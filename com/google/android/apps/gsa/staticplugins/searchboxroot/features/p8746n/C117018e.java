package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.shared.p6990an.C89231v;
import com.google.android.apps.gsa.shared.p6990an.C89232w;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.e */
/* compiled from: PG */
public final class C117018e extends C88596l {

    /* renamed from: c */
    private static final C59071e f324858c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.e");

    /* renamed from: b */
    public final Context f324859b;

    /* renamed from: d */
    private final C117025g f324860d;

    /* renamed from: e */
    private final C117022i f324861e;

    /* renamed from: f */
    private final C22871g f324862f;

    public C117018e(Context context, C117025g gVar, C117022i iVar, C22871g gVar2) {
        this.f324859b = context;
        this.f324860d = gVar;
        this.f324861e = iVar;
        this.f324862f = gVar2;
    }

    /* renamed from: e */
    private static Intent m194494e(Suggestion suggestion) {
        if ("internal.3p:MobileApplication".equals(C89235z.m145139k(suggestion))) {
            try {
                String g = C41670aj.m73074g(suggestion);
                if (!TextUtils.isEmpty(g)) {
                    return Intent.parseUri(g, 3).setFlags(270532609);
                }
                C59104x c = f324858c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "sb.r.OnDevAppSugClkHdlr");
                ((C59052c) ((C59052c) c).mo56372aa(32554)).mo56386p("Empty data string in the suggestion");
                return null;
            } catch (Exception e) {
                C59104x c2 = f324858c.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "sb.r.OnDevAppSugClkHdlr");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(32553)).mo56389s("Unable to build an intent for the 3p suggestion click: %s", suggestion);
                return null;
            }
        } else if (suggestion.f108925z.contains(223)) {
            try {
                return Intent.parseUri(C89235z.m73094N(suggestion), 0).setFlags(270565377);
            } catch (URISyntaxException e2) {
                C59104x c3 = f324858c.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "sb.r.OnDevAppSugClkHdlr");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(32552)).mo56389s("Unable to build an intent for the suggestion click: %s", suggestion);
                return null;
            }
        } else if (!"android.intent.action.MAIN".equals(C89235z.m73091K(suggestion))) {
            C59104x c4 = f324858c.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "sb.r.OnDevAppSugClkHdlr");
            ((C59052c) ((C59052c) c4).mo56372aa(32551)).mo56354G("intent action %s instead of %s", C89235z.m73091K(suggestion), "android.intent.action.MAIN");
            return null;
        } else {
            String L = C89235z.m73092L(suggestion);
            if (TextUtils.isEmpty(L)) {
                C59104x c5 = f324858c.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "sb.r.OnDevAppSugClkHdlr");
                ((C59052c) ((C59052c) c5).mo56372aa(32550)).mo56386p("Empty data string in the suggestion");
                return null;
            }
            ComponentName b = C89235z.m145130b(Uri.parse(L));
            if (b == null) {
                C59104x c6 = f324858c.mo56225c();
                c6.mo56378ag(C58975e.f156826a, "sb.r.OnDevAppSugClkHdlr");
                ((C59052c) ((C59052c) c6).mo56372aa(32549)).mo56386p("Component name was null");
                return null;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(270532609);
            intent.setComponent(b);
            return intent;
        }
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 84;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        C89231v vVar = new C89231v();
        this.f324861e.mo103102a(suggestion, query.f252749G, 2, qrVar != null ? (C60456qs) qrVar.build() : null, query.mo84474eb());
        Intent e = m194494e(suggestion);
        if (e != null) {
            Rect rect = (Rect) bundle.getParcelable("extra_suggestion_bounds");
            Bundle bundle2 = bundle.getBundle("extra_activity_options");
            if (rect == null || bundle2 == null) {
                C89429a.m145468z(this.f324859b, e, true, this.f324860d.mo103107c());
                return new C89232w(e);
            }
            e.setSourceBounds(rect);
            try {
                this.f324859b.startActivity(e, bundle2);
                return vVar;
            } catch (Exception unused) {
                C59104x c = f324858c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "sb.r.OnDevAppSugClkHdlr");
                ((C59052c) ((C59052c) c).mo56372aa(32556)).mo56389s("fail to start activity when click on suggestion: %s", suggestion);
                this.f324862f.mo28212l("ShowToast", new C117017d(this));
                return vVar;
            }
        } else {
            C59104x c2 = f324858c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "sb.r.OnDevAppSugClkHdlr");
            ((C59052c) ((C59052c) c2).mo56372aa(32555)).mo56389s("Unable to build an intent for the suggestion click: %s", suggestion);
            return vVar;
        }
    }
}
