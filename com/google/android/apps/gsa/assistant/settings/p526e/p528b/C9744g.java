package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.net.p4726a.p4728b.C62723a;
import com.google.net.p4726a.p4728b.C62724b;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.g */
/* compiled from: PG */
public final /* synthetic */ class C9744g implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C9745h f33645a;

    public /* synthetic */ C9744g(C9745h hVar) {
        this.f33645a = hVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C9745h hVar = this.f33645a;
        C62723a aVar = (C62723a) C62724b.f169416g.createBuilder();
        if (i == -1) {
            aVar.copyOnWrite();
            C62724b bVar = (C62724b) aVar.instance;
            bVar.f169418a |= 1;
            bVar.f169419b = 0;
        } else {
            int intExtra = intent.getIntExtra("extra_error_type", 0);
            aVar.copyOnWrite();
            C62724b bVar2 = (C62724b) aVar.instance;
            bVar2.f169418a |= 1;
            bVar2.f169419b = intExtra;
            aVar.copyOnWrite();
            C62724b bVar3 = (C62724b) aVar.instance;
            bVar3.f169418a |= 2;
            bVar3.f169420c = "galandroidsdkv2";
            aVar.copyOnWrite();
            C62724b bVar4 = (C62724b) aVar.instance;
            bVar4.f169418a |= 4;
            bVar4.f169421d = "Android GAL v2 returned an error";
        }
        hVar.mo18009c((C62724b) aVar.build());
        return true;
    }
}
