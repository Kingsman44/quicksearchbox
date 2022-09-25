package com.google.android.apps.gsa.search.core;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6662co.C85167c;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.webview.C87254a;
import com.google.android.apps.gsa.search.core.webview.C87256b;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h.C116498a;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116572aj;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.search.core.co */
/* compiled from: PG */
public final class C85751co extends C87256b {

    /* renamed from: a */
    public final C86610af f231857a;

    /* renamed from: b */
    private final C91097g f231858b;

    /* renamed from: c */
    private final C85167c f231859c;

    /* renamed from: d */
    private final C22871g f231860d;

    /* renamed from: e */
    private final C87254a f231861e;

    public C85751co(C91097g gVar, C86610af afVar, C85167c cVar, C22871g gVar2, C87254a aVar) {
        this.f231858b = gVar;
        this.f231857a = afVar;
        this.f231859c = cVar;
        this.f231860d = gVar2;
        this.f231861e = aVar;
    }

    /* renamed from: a */
    public final void mo79402a() {
        this.f231860d.mo28212l("go back", new C85750cn(this));
    }

    /* renamed from: b */
    public final void mo79403b(Uri uri, boolean z, boolean z2) {
        List<String> pathSegments = uri.getPathSegments();
        if (!pathSegments.isEmpty() && pathSegments.get(0).equals("save")) {
            if (pathSegments.size() == 1) {
                C85167c cVar = this.f231859c;
                C58836b bVar = C58836b.f156633a;
                cVar.mo78753h(3, bVar, bVar);
                return;
            } else if (pathSegments.size() == 3 && pathSegments.get(1).equals("list")) {
                Uri.Builder builder = new Uri.Builder();
                Stream stream = Collection.EL.stream(pathSegments.subList(1, pathSegments.size()));
                Objects.requireNonNull(builder);
                stream.forEach(new C85749cm(builder));
                this.f231859c.mo78753h(3, C58833ax.m90833j(builder.build().getPath()), C58836b.f156633a);
                return;
            }
        }
        Intent a = C87574a.f236603a.mo83277a(new Intent("android.intent.action.VIEW", uri));
        a.putExtra("full_screen", z);
        if (z2) {
            a.putExtra("handover-session-id", ((C116572aj) ((C116498a) this.f231861e).f322994a).f323290a);
        }
        this.f231858b.mo65089a(a);
    }
}
