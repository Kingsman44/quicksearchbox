package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.p9874a;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.p3926e.C52008hg;
import com.google.assistant.p3897e.p3921j.p3926e.C52009hh;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130191a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130192b f356945a;

    public /* synthetic */ C130191a(C130192b bVar) {
        this.f356945a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130192b bVar = this.f356945a;
        C52009hh hhVar = (C52009hh) obj;
        int i = 1;
        if ((hhVar.f136495a & 1) == 0 || hhVar.f136496b.isEmpty()) {
            ((C59052c) ((C59052c) C130192b.f356946a.mo56225c()).mo56372aa(38768)).mo56386p("showToast missing toast text");
            return C127406c.m208360b(C52235kf.INVALID_ARGUMENT, "ShowToastArgs missing toast text.");
        }
        Context context = bVar.f356947b;
        String str = hhVar.f136496b;
        int a = C52008hg.m86467a(hhVar.f136497c);
        if (a == 0 || a == 1) {
            i = 0;
        }
        Toast.makeText(context, str, i).show();
        return C127406c.f350821b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
