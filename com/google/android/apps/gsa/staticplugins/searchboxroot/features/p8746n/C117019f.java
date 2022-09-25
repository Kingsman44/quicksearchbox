package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6944c.C88547ac;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88595k;
import com.google.android.apps.gsa.shared.p6990an.C89230u;
import com.google.android.apps.gsa.shared.p6990an.C89231v;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7157a.C90716a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;
import dagger.C68214a;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.f */
/* compiled from: PG */
public final class C117019f extends C88595k implements C89200e {

    /* renamed from: b */
    private final Context f324863b;

    /* renamed from: c */
    private final C117025g f324864c;

    /* renamed from: d */
    private final C68214a f324865d;

    /* renamed from: e */
    private final C117022i f324866e;

    /* renamed from: f */
    private C88547ac f324867f;

    public C117019f(Context context, C117025g gVar, C68214a aVar, C117022i iVar) {
        this.f324863b = context;
        this.f324864c = gVar;
        this.f324865d = aVar;
        this.f324866e = iVar;
    }

    /* renamed from: a */
    public final int mo82257a() {
        return 3;
    }

    /* renamed from: b */
    public final C89234y mo82258b(Query query, Suggestion suggestion, String str, C60456qs qsVar) {
        Intent intent;
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null) {
            long j = query.f252749G;
            if (parse.getScheme().equals("http") || parse.getScheme().equals("https") || parse.getScheme().equals("sms")) {
                intent = new Intent("android.intent.action.VIEW", parse);
            } else if (parse.getScheme().equals("tel")) {
                intent = new Intent("android.intent.action.CALL", parse);
            } else if (parse.getScheme().equals("mailto")) {
                intent = new Intent("android.intent.action.SENDTO", parse);
            } else if (C90716a.m148159d(parse)) {
                intent = C90716a.m148157b(parse, (Uri) null, this.f324863b);
            } else if (parse.getScheme().equals("search")) {
                return new C89230u(this.f324867f.mo82212a(query, suggestion.mo44269v(), suggestion, BuildConfig.FLAVOR, "ICING", 775, qsVar));
            } else if (parse.getScheme().equals("intent")) {
                try {
                    intent = Intent.parseUri(str, 1);
                } catch (URISyntaxException unused) {
                    C58976aa aaVar = C58975e.f156826a;
                }
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                intent = null;
            }
            if (intent != null) {
                C58976aa aaVar3 = C58975e.f156826a;
                C117022i iVar = this.f324866e;
                int i = suggestion.f108910k;
                iVar.mo103102a(suggestion, j, i == 85 ? 1 : (i == 84 || i == 89) ? 2 : i == 97 ? 3 : i == 86 ? 4 : 5, qsVar, query.mo84474eb());
                intent.addFlags(32768);
                C89429a.m145468z(this.f324863b, intent, true, this.f324864c.mo103107c());
                try {
                    ((C91097g) this.f324865d.mo27525b()).mo65089a(intent);
                } catch (ActivityNotFoundException unused2) {
                }
            }
            return new C89231v();
        }
        C58976aa aaVar4 = C58975e.f156826a;
        return new C89231v();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324867f = ((C88614r) obj).f239534e;
    }
}
