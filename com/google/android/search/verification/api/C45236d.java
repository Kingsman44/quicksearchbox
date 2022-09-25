package com.google.android.search.verification.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Binder;
import com.google.android.apps.gsa.shared.util.p7183s.C91088a;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.search.verification.api.d */
/* compiled from: PG */
final class C45236d extends C45234b {

    /* renamed from: a */
    final /* synthetic */ SearchActionVerificationService f118032a;

    public C45236d(SearchActionVerificationService searchActionVerificationService) {
        this.f118032a = searchActionVerificationService;
    }

    /* renamed from: a */
    public final int mo49096a() {
        return 1;
    }

    /* renamed from: b */
    public final boolean mo49097b(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        SearchActionVerificationService searchActionVerificationService = this.f118032a;
        int callingUid = Binder.getCallingUid();
        if (intent == null || !intent.hasExtra("search_action_token")) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("search_action_token");
        PendingIntent b = C91088a.m148809b(searchActionVerificationService, intent, callingUid);
        PendingIntent broadcast = PendingIntent.getBroadcast(searchActionVerificationService, 0, C147798a.m240896b(C91088a.m148810c(searchActionVerificationService, C91088a.m148808a(intent), callingUid), 1140850688, 0), 1140850688);
        if (pendingIntent.equals(b) || pendingIntent.equals(broadcast)) {
            return true;
        }
        return false;
    }
}
