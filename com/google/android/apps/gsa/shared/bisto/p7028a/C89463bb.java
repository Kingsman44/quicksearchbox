package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bb */
/* compiled from: PG */
public final /* synthetic */ class C89463bb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C89464bc f242483a;

    /* renamed from: b */
    public final /* synthetic */ Intent f242484b;

    public /* synthetic */ C89463bb(C89464bc bcVar, Intent intent) {
        this.f242483a = bcVar;
        this.f242484b = intent;
    }

    public final void run() {
        int length;
        C89464bc bcVar = this.f242483a;
        Intent intent = this.f242484b;
        C89474bm bmVar = bcVar.f242485a;
        String stringExtra = intent.getStringExtra("key_device_id");
        if (stringExtra == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        long longExtra = intent.getLongExtra("BistoDeviceDatabase.timestamp", -1);
        if (longExtra < 0) {
            C58976aa aaVar2 = C58975e.f156826a;
            return;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("BistoDeviceDatabase.what");
        if (intArrayExtra == null || (length = intArrayExtra.length) == 0) {
            C58976aa aaVar3 = C58975e.f156826a;
            return;
        }
        HashSet hashSet = new HashSet(length);
        for (int i : intArrayExtra) {
            if (i < 0) {
                C58976aa aaVar4 = C58975e.f156826a;
            } else {
                hashSet.add(Integer.valueOf(i));
            }
        }
        C124709g c = bmVar.f242496c.mo83429c(stringExtra);
        if (c == null) {
            C58976aa aaVar5 = C58975e.f156826a;
        } else {
            bmVar.f242497d.execute(new C89569f(bmVar, stringExtra, hashSet, longExtra, c));
        }
    }
}
