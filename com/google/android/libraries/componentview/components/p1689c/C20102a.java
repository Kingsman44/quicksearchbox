package com.google.android.libraries.componentview.components.p1689c;

import android.net.Uri;
import android.view.View;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20130b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.componentview.components.c.a */
/* compiled from: PG */
final class C20102a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C20234c f56341a;

    public C20102a(C20234c cVar) {
        this.f56341a = cVar;
    }

    public final void onClick(View view) {
        C20234c cVar = this.f56341a;
        C20130b bVar = cVar.f56831k;
        if ((bVar.f56429a & 2) != 0) {
            C19983f fVar = bVar.f56431c;
            if (fVar == null) {
                fVar = C19983f.f56002g;
            }
            C60870cx c = cVar.f56827b.mo25518c(Uri.parse(fVar.f56005b), (Map) null, false);
            C60856cj.m92911t(C60856cj.m92908q(c, (long) cVar.f56831k.f56433e, TimeUnit.MILLISECONDS, cVar.f56829d), new C20207b(cVar), cVar.f56828c);
        }
    }
}
