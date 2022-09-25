package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.p9387a.C124520a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124706dr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.x */
/* compiled from: PG */
public final /* synthetic */ class C124596x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C124571aq f343710a;

    /* renamed from: b */
    public final /* synthetic */ String f343711b;

    /* renamed from: c */
    public final /* synthetic */ C124706dr f343712c;

    public /* synthetic */ C124596x(C124571aq aqVar, String str, C124706dr drVar) {
        this.f343710a = aqVar;
        this.f343711b = str;
        this.f343712c = drVar;
    }

    public final Object apply(Object obj) {
        C124571aq aqVar = this.f343710a;
        String str = this.f343711b;
        C124706dr drVar = this.f343712c;
        C124570ap apVar = (C124570ap) obj;
        C124520a aVar = aqVar.f343669k;
        C124719q k = apVar.mo106534a().mo106513k();
        Intent putExtra = new Intent("action_set_hotword_setting_state").putExtra("key_device_id", str).putExtra("extra_hotword_setting_state", drVar.f344043c);
        if (k == C124719q.GACS_DEVICE) {
            C124520a.m203976b(putExtra);
        }
        C124519a.m203974a(aVar.f343589a, putExtra);
        return apVar;
    }
}
