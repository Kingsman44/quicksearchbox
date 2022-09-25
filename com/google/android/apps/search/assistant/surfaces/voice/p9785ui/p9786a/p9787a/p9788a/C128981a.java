package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9786a.p9787a.p9788a;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C128981a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C128981a f354398a = new C128981a();

    private /* synthetic */ C128981a() {
    }

    public final Object apply(Object obj) {
        UserRecoverableAuthException userRecoverableAuthException = (UserRecoverableAuthException) obj;
        if (userRecoverableAuthException != null) {
            Intent a = userRecoverableAuthException.mo117772a();
            if (a != null) {
                return a;
            }
            throw new C128983c("Failed to catch the UserRecoverableAuthException.");
        }
        throw new C128983c("Failed to catch the UserRecoverableAuthException.");
    }
}
