package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.er */
/* compiled from: PG */
public final /* synthetic */ class C35722er implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35723es f93625a;

    public /* synthetic */ C35722er(C35723es esVar) {
        this.f93625a = esVar;
    }

    public final Object apply(Object obj) {
        C35723es esVar = this.f93625a;
        ((C59052c) ((C59052c) C35723es.f93626a.mo56225c()).mo56372aa(51706)).mo56354G("Could not startActivityForResult (%s) or unsupported intent: %s", esVar.f93628c.getClass().getName(), (Intent) obj);
        return C36180b.m64578b(C52235kf.UNAVAILABLE);
    }
}
