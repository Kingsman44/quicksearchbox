package com.google.android.apps.gsa.staticplugins.webview;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85424a;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.el */
/* compiled from: PG */
public final /* synthetic */ class C118232el implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328232a;

    /* renamed from: b */
    public final /* synthetic */ C85452b f328233b;

    public /* synthetic */ C118232el(C118248fa faVar, C85452b bVar) {
        this.f328232a = faVar;
        this.f328233b = bVar;
    }

    public final void run() {
        C118248fa faVar = this.f328232a;
        C85452b bVar = this.f328233b;
        C118119ai c = faVar.f328278g.mo103561c(((C85424a) bVar).f231230a);
        if (c == null) {
            try {
                faVar.f328278g.mo103560b(bVar).mo103546t(new UriRequest(Uri.parse("https://www.google.com/search?warmUpSW=true"), (Map) null, (Map) null, (byte[]) null));
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) C118248fa.f328274a.mo56226d()).mo56382g(th)).mo56372aa(33891)).mo56386p("Failed to prewarm webview.");
            }
        } else {
            c.f327788G.mo80923b("(function() {\n  var iFrame = document.createElement('iframe');\n  iFrame.src = 'https://www.google.com/search?warmUpSW=true';\n  iFrame.style.display = 'none';\n  document.body.append(iFrame);\n})()", C118269z.f328331a);
        }
    }
}
