package com.google.android.libraries.lens.view.infopanel;

import android.net.Uri;
import android.view.View;
import com.google.android.libraries.lens.view.imageviewer.C26956s;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27081h;
import com.google.android.libraries.lens.view.p2078at.C25511aq;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.libraries.lens.view.infopanel.p */
/* compiled from: PG */
final class C27198p implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27195m f74365a;

    public C27198p(C27195m mVar) {
        this.f74365a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C60214n a;
        C27081h hVar = (C27081h) bVar;
        C27195m mVar = this.f74365a;
        Uri data = hVar.f73817a.getData();
        if (data == null || !C26956s.m49938a(data)) {
            mVar.f74353q.mo30556f(hVar.f73817a);
            return C47392e.f123115a;
        }
        View view = hVar.f73818b;
        if (!mVar.f74359w && (a = mVar.f74343g.mo33851a(C28485y.m53234a(view))) != null) {
            String c = C28294l.m52913c(a);
            if (!c.isEmpty()) {
                data = data.buildUpon().appendQueryParameter("ved", c).build();
                hVar.f73817a.setData(data);
            }
        }
        return C47392e.m84229a(new C25511aq(data, hVar.f73818b));
    }
}
