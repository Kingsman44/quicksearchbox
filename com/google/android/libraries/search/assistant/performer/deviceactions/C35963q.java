package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.q */
/* compiled from: PG */
public final /* synthetic */ class C35963q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35981t f94138a;

    /* renamed from: b */
    public final /* synthetic */ Intent f94139b;

    public /* synthetic */ C35963q(C35981t tVar, Intent intent) {
        this.f94138a = tVar;
        this.f94139b = intent;
    }

    public final C60870cx apply(Object obj) {
        C35981t tVar = this.f94138a;
        Intent intent = this.f94139b;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(C36180b.f94544a);
        }
        ((C59052c) ((C59052c) C35981t.f94162a.mo56226d()).mo56372aa(51785)).mo56386p("use intent starter to start camera, some feature are not available.");
        return tVar.mo39914b(intent);
    }
}
