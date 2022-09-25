package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3994s.p3995a.C53082as;
import com.google.assistant.p3994s.p3995a.C53198f;
import com.google.assistant.p3994s.p3995a.C53309jc;
import com.google.assistant.p3994s.p3995a.C53310jd;
import com.google.common.p4541l.C59326i;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.ar */
/* compiled from: PG */
public final class C114919ar {

    /* renamed from: a */
    public final Context f318856a;

    public C114919ar(Context context) {
        this.f318856a = context;
    }

    /* renamed from: a */
    public static final C28293k m190496a(View view, int i, C28293k kVar) {
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
        C28257a aVar = (C28257a) kVar;
        ArrayList arrayList = new ArrayList(aVar.f76909b);
        arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
        return C28293k.m52907d(aVar.f76908a, arrayList);
    }

    /* renamed from: b */
    public static final Intent m190497b(C53082as asVar, C53198f fVar) {
        C53309jc jcVar = (C53309jc) C53310jd.f139802c.createBuilder();
        jcVar.copyOnWrite();
        C53310jd jdVar = (C53310jd) jcVar.instance;
        asVar.getClass();
        jdVar.f139805b = asVar;
        jdVar.f139804a = 10;
        Intent intent = new Intent();
        intent.putExtra("zero_state_action_name", "AsyncUpdateAction");
        C59326i iVar = C59326i.f157517e;
        byte[] byteArray = ((C53310jd) jcVar.build()).toByteArray();
        intent.putExtra("async_update_data", iVar.mo56837l(byteArray, byteArray.length));
        if (fVar != null) {
            C59326i iVar2 = C59326i.f157517e;
            byte[] byteArray2 = fVar.toByteArray();
            intent.putExtra("card_operation_data", iVar2.mo56837l(byteArray2, byteArray2.length));
        }
        return intent;
    }
}
