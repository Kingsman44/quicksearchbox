package com.google.android.apps.gsa.staticplugins.opa.worker.p8607b;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.shared.appactions.e.a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87692aa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49845bc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.ajy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.b.e */
/* compiled from: PG */
public final /* synthetic */ class C114268e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114274k f316860a;

    /* renamed from: b */
    public final /* synthetic */ C87693ab f316861b;

    public /* synthetic */ C114268e(C114274k kVar, C87693ab abVar) {
        this.f316860a = kVar;
        this.f316861b = abVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114274k kVar = this.f316860a;
        C87693ab abVar = this.f316861b;
        if (!((Boolean) obj).booleanValue()) {
            return C118826c.f331423b;
        }
        try {
            kVar.f316872c.getPackageManager().getPackageInfo(abVar.f237120d, 128);
            boolean e = kVar.f316871b.mo79746e(C90019by.f248075i);
            C85005h hVar = kVar.f316875h;
            Resources resources = kVar.f316872c.getResources();
            C49826ak akVar = abVar.f237119c;
            if (akVar == null) {
                akVar = C49826ak.f129462q;
            }
            String str = abVar.f237120d;
            C87692aa aaVar = abVar.f237118b;
            if (aaVar == null) {
                aaVar = C87692aa.f237046e;
            }
            C49845bc bcVar = abVar.f237125i;
            if (bcVar == null) {
                bcVar = C49845bc.f129538c;
            }
            hVar.mo78617M(92, 213, a.d(resources, akVar, str, aaVar, bcVar, e, kVar.f316871b.mo79746e(C90019by.f248076j)), ajy.CLIENT_GENERATED);
            if (e) {
                return C118826c.f331423b;
            }
            return kVar.f316873f.d(abVar.f237120d);
        } catch (PackageManager.NameNotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) C114274k.f316869a.mo56226d()).mo56382g(e2)).mo56372aa(28899)).mo56386p("Invalid Package Name");
            return C118826c.f331423b;
        }
    }
}
