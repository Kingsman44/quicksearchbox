package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1156b.p1157a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.speech.p5218j.p5219a.C66698ab;
import com.google.speech.p5218j.p5219a.C66699ac;
import com.google.speech.p5218j.p5219a.C66700ad;
import com.google.speech.p5218j.p5219a.C66701ae;
import com.google.speech.p5218j.p5219a.C66702af;
import com.google.speech.p5218j.p5219a.C66707ak;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C15686b implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C15686b f46816a = new C15686b();

    private /* synthetic */ C15686b() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        int i = C15687c.f46817a;
        C66699ac acVar = (C66699ac) C66700ad.f181439d.createBuilder();
        acVar.copyOnWrite();
        C66700ad adVar = (C66700ad) acVar.instance;
        adVar.f181441a |= 1;
        adVar.f181442b = "$CONTACTS";
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            if (!TextUtils.isEmpty(string)) {
                C66701ae aeVar = (C66701ae) C66702af.f181445c.createBuilder();
                aeVar.copyOnWrite();
                C66702af afVar = (C66702af) aeVar.instance;
                string.getClass();
                afVar.f181447a |= 1;
                afVar.f181448b = string;
                acVar.mo59707a(aeVar);
            }
        }
        C66698ab abVar = (C66698ab) C66707ak.f181458e.createBuilder();
        abVar.copyOnWrite();
        C66707ak akVar = (C66707ak) abVar.instance;
        akVar.f181460a |= 1;
        akVar.f181463d = "device-contacts";
        abVar.copyOnWrite();
        C66707ak akVar2 = (C66707ak) abVar.instance;
        C66700ad adVar2 = (C66700ad) acVar.build();
        adVar2.getClass();
        akVar2.f181462c = adVar2;
        akVar2.f181461b = 3;
        return (C66707ak) abVar.build();
    }
}
