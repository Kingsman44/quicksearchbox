package com.google.android.apps.gsa.assistant.settings.p526e;

import android.support.p031v4.app.C0167am;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import androidx.core.content.C1882h;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.l */
/* compiled from: PG */
final class C9760l extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C9761m f33677a;

    public C9760l(C9761m mVar) {
        this.f33677a = mVar;
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String host;
        C0167am activity = this.f33677a.f33687j.f33732a.getActivity();
        if (activity != null && (host = permissionRequest.getOrigin().getHost()) != null) {
            if (host.endsWith(".google.com") || host.endsWith(".googleprod.com")) {
                for (String equals : permissionRequest.getResources()) {
                    if (equals.equals("android.webkit.resource.AUDIO_CAPTURE") && C1882h.m5137c(activity, "android.permission.RECORD_AUDIO") == 0) {
                        permissionRequest.grant(new String[]{"android.webkit.resource.AUDIO_CAPTURE"});
                    }
                }
            }
        }
    }
}
