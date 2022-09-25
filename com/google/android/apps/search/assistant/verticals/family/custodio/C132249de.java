package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.de */
/* compiled from: PG */
public final /* synthetic */ class C132249de implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132251dg f360968a;

    public /* synthetic */ C132249de(C132251dg dgVar) {
        this.f360968a = dgVar;
    }

    public final void onClick(View view) {
        C132251dg dgVar = this.f360968a;
        C46496q c = dgVar.f360974e.mo50482c(dgVar.f360972c);
        Bundle bundle = dgVar.f360973d;
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"account_name", "entry_point_id", "device_id"}));
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            if (!hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        Bundle a = C132361w.m215129a(bundle);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a.remove((String) arrayList.get(i));
        }
        c.mo50508d(R.id.assistant_custodio_setup_summary_fragment_add, a);
    }
}
