package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import android.content.pm.ShortcutInfo;
import android.text.TextUtils;
import com.google.android.apps.gsa.contacts.ci;
import com.google.android.apps.gsa.nga.shared.p6345h.C81298cb;
import com.google.android.apps.gsa.nga.shared.p6345h.C81299cc;
import com.google.android.libraries.assistant.p1481f.p1483b.C17949d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.fc */
/* compiled from: PG */
public final /* synthetic */ class C81208fc implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C81213fh f222348a;

    /* renamed from: b */
    public final /* synthetic */ ci f222349b;

    public /* synthetic */ C81208fc(C81213fh fhVar, ci ciVar) {
        this.f222348a = fhVar;
        this.f222349b = ciVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar;
        C81213fh fhVar = this.f222348a;
        ci ciVar = this.f222349b;
        C58485gu guVar2 = (C58485gu) obj;
        ArrayList arrayList = new ArrayList();
        if (ciVar == ci.a || ciVar == ci.c) {
            C58485gu b = fhVar.f222352a.mo23501b("com.whatsapp");
            if (b.isEmpty()) {
                guVar = C58485gu.m89845m();
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    ShortcutInfo shortcutInfo = (ShortcutInfo) b.get(i);
                    String c = C17949d.m35136c(shortcutInfo);
                    if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(shortcutInfo.getId()) && !shortcutInfo.getId().endsWith("@g.us")) {
                        C81298cb cbVar = (C81298cb) C81299cc.f222543e.createBuilder();
                        String id = shortcutInfo.getId();
                        cbVar.copyOnWrite();
                        C81299cc ccVar = (C81299cc) cbVar.instance;
                        id.getClass();
                        ccVar.f222545a |= 1;
                        ccVar.f222546b = id;
                        cbVar.copyOnWrite();
                        C81299cc ccVar2 = (C81299cc) cbVar.instance;
                        c.getClass();
                        ccVar2.f222545a |= 2;
                        ccVar2.f222547c = c;
                        cbVar.copyOnWrite();
                        C81299cc ccVar3 = (C81299cc) cbVar.instance;
                        ccVar3.f222545a |= 4;
                        ccVar3.f222548d = 1.0d;
                        arrayList2.add((C81299cc) cbVar.build());
                    }
                }
                guVar = C58485gu.m89842j(arrayList2);
            }
            arrayList.addAll(guVar);
            C58976aa aaVar = C58975e.f156826a;
        }
        arrayList.addAll(guVar2);
        return C60856cj.m92900i(C58485gu.m89842j(arrayList));
    }
}
