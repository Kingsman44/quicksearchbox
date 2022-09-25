package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import android.text.TextUtils;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.r */
/* compiled from: PG */
public final /* synthetic */ class C35964r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35981t f94140a;

    /* renamed from: b */
    public final /* synthetic */ Intent f94141b;

    public /* synthetic */ C35964r(C35981t tVar, Intent intent) {
        this.f94140a = tVar;
        this.f94141b = intent;
    }

    public final Object apply(Object obj) {
        C35981t tVar = this.f94140a;
        Intent intent = this.f94141b;
        String str = (String) obj;
        if (TextUtils.isEmpty(str) || !tVar.mo39916d(str)) {
            ((C59052c) ((C59052c) C35981t.f94162a.mo56224b()).mo56372aa(51805)).mo56386p("Stick app is not set or not found on the device.");
            return false;
        }
        intent.setPackage(str);
        return true;
    }
}
