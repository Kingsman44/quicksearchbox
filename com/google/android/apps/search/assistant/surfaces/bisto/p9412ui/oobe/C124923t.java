package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124659by;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124674cm;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124675cn;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62912at;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.t */
/* compiled from: PG */
public final /* synthetic */ class C124923t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124924u f344669a;

    /* renamed from: b */
    public final /* synthetic */ String f344670b;

    public /* synthetic */ C124923t(C124924u uVar, String str) {
        this.f344669a = uVar;
        this.f344670b = str;
    }

    public final C60870cx apply(Object obj) {
        C124924u uVar = this.f344669a;
        String str = this.f344670b;
        C62912at atVar = (C62912at) obj;
        C124659by byVar = uVar.f344671a;
        C124674cm cmVar = (C124674cm) C124675cn.f343946e.createBuilder();
        cmVar.copyOnWrite();
        C124675cn cnVar = (C124675cn) cmVar.instance;
        str.getClass();
        cnVar.f343948a |= 1;
        cnVar.f343949b = str;
        String g = C124525f.m203991g(Locale.getDefault());
        cmVar.copyOnWrite();
        C124675cn cnVar2 = (C124675cn) cmVar.instance;
        cnVar2.f343948a |= 2;
        cnVar2.f343950c = g;
        return byVar.mo106576b((C124675cn) cmVar.build());
    }
}
