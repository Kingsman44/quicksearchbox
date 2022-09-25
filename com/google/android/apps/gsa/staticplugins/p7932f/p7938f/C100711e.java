package com.google.android.apps.gsa.staticplugins.p7932f.p7938f;

import android.util.Log;
import com.google.android.apps.gsa.shared.p7066m.C90140s;
import com.google.android.libraries.assistant.ampactions.C11030c;
import com.google.android.libraries.assistant.ampactions.C11031d;
import com.google.android.libraries.assistant.ampactions.C11049v;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3921j.acy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.f.e */
/* compiled from: PG */
public final /* synthetic */ class C100711e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100715i f281589a;

    /* renamed from: b */
    public final /* synthetic */ List f281590b;

    public /* synthetic */ C100711e(C100715i iVar, List list) {
        this.f281589a = iVar;
        this.f281590b = list;
    }

    public final void run() {
        C100715i iVar = this.f281589a;
        List list = this.f281590b;
        C11031d dVar = iVar.f281596a;
        if (!dVar.f36244b.f281574a.mo79746e(C90140s.f251871d)) {
            Log.d("AmpActions", "Skipping AMP Actions prerendering");
            return;
        }
        Log.d("AmpActions", "Starting AMP Actions prerendering");
        dVar.f36243a.mo19517c();
        for (int i = 0; i < list.size() && dVar.f36243a.f36289b.size() < 2; i++) {
            acy acy = (acy) list.get(i);
            String str = acy.f134863b;
            C11049v vVar = dVar.f36243a;
            Log.d("WebViewFactoryManager", "isPrerendered");
            if (!vVar.f36289b.containsKey(str)) {
                C60856cj.m92911t(dVar.f36243a.mo19515a(str), new C11030c(dVar, acy, str), C60826bg.f164896a);
            }
        }
    }
}
