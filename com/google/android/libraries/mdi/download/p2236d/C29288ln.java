package com.google.android.libraries.mdi.download.p2236d;

import android.content.SharedPreferences;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ln */
/* compiled from: PG */
public final /* synthetic */ class C29288ln implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79380a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f79381b;

    public /* synthetic */ C29288ln(C29290lp lpVar, C29398ev evVar) {
        this.f79380a = lpVar;
        this.f79381b = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79380a;
        C29398ev evVar = this.f79381b;
        if (((C29402ez) obj) != null) {
            return C60856cj.m92900i(true);
        }
        SharedPreferences a = C29111y.m54038a(lpVar.f79385a, "gms_icing_mdd_shared_file_manager_metadata", lpVar.f79394j);
        long j = a.getLong("next_file_name_v2", System.currentTimeMillis());
        if (!a.edit().putLong("next_file_name_v2", 1 + j).commit()) {
            C29045l.m53936h("%s: Unable to update file name %s", "SharedFileManager", evVar);
            return C60856cj.m92900i(false);
        }
        String str = "datadownloadfile_" + j;
        C29401ey eyVar = (C29401ey) C29402ez.f79711h.createBuilder();
        C29390en enVar = C29390en.SUBSCRIBED;
        eyVar.copyOnWrite();
        C29402ez ezVar = (C29402ez) eyVar.instance;
        ezVar.f79715c = enVar.f79678h;
        ezVar.f79713a |= 2;
        eyVar.copyOnWrite();
        C29402ez ezVar2 = (C29402ez) eyVar.instance;
        ezVar2.f79713a = 1 | ezVar2.f79713a;
        ezVar2.f79714b = str;
        return C60922j.m93045h(lpVar.f79387c.mo34622g(evVar, (C29402ez) eyVar.build()), C47810es.m84966f(new C29276lb(evVar)), lpVar.f79395k);
    }
}
