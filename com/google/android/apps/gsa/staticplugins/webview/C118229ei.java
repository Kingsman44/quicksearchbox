package com.google.android.apps.gsa.staticplugins.webview;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ei */
/* compiled from: PG */
public final /* synthetic */ class C118229ei implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328223a;

    /* renamed from: b */
    public final /* synthetic */ C85452b f328224b;

    /* renamed from: c */
    public final /* synthetic */ boolean f328225c;

    public /* synthetic */ C118229ei(C118248fa faVar, C85452b bVar, boolean z) {
        this.f328223a = faVar;
        this.f328224b = bVar;
        this.f328225c = z;
    }

    public final void run() {
        C118248fa faVar = this.f328223a;
        C85452b bVar = this.f328224b;
        boolean z = this.f328225c;
        try {
            C118152bo boVar = faVar.f328278g;
            if (!boVar.f327932k || !z) {
                boVar.mo103560b(bVar);
                return;
            }
            C118119ai b = boVar.mo103560b(bVar);
            String x = boVar.f327924c.mo79758x(C90120fr.f250841h);
            if (!TextUtils.isEmpty(x)) {
                b.mo103546t(((C85929cw) boVar.f327925d.mo27525b()).mo79581z(((C85929cw) boVar.f327925d.mo27525b()).mo79564d((Uri) null, x).toString()));
            }
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C118248fa.f328274a.mo56226d()).mo56382g(th)).mo56372aa(33892)).mo56386p("Failed to prewarm webview.");
        }
    }
}
