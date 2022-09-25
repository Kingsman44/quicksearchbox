package com.google.android.apps.gsa.staticplugins.bubble.p7577d.p7579b;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.bubble.p7577d.p7578a.C96956b;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.d.b.c */
/* compiled from: PG */
public final class C96960c implements C23113i {

    /* renamed from: a */
    private final C96958a f270988a;

    public C96960c(C96958a aVar) {
        this.f270988a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("BubblePermissionEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onCancelClicked")) {
                ((C96956b) this.f270988a).f270983c.mo80935a();
            } else if (str.equals("onOpenSettingsClicked")) {
                C96956b bVar = (C96956b) this.f270988a;
                bVar.f270982b.mo81040h(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.fromParts("package", bVar.f270981a.getPackageName(), (String) null)), 1);
            }
        }
    }
}
