package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.au */
/* compiled from: PG */
public final /* synthetic */ class C35892au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f94022a;

    public /* synthetic */ C35892au(Intent intent) {
        this.f94022a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f94022a;
        if (((Boolean) obj).booleanValue()) {
            return C36180b.f94544a;
        }
        String format = String.format("Failed to start voice activity for %s", new Object[]{intent.getAction()});
        ((C59052c) ((C59052c) C35894aw.f94025a.mo56226d()).mo56372aa(51839)).mo56389s("%s", format);
        return C36180b.m64579c(C52235kf.FAILED_PRECONDITION, format);
    }
}
