package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.en */
/* compiled from: PG */
public final /* synthetic */ class C35718en implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35718en f93621a = new C35718en();

    private /* synthetic */ C35718en() {
    }

    public final Object apply(Object obj) {
        if (((Exception) obj).getClass().getSimpleName().equals("CancellationException")) {
            return C36180b.m64578b(C52235kf.CANCELLED);
        }
        return C36180b.m64578b(C52235kf.INTERNAL);
    }
}
