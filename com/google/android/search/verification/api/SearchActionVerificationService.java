package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class SearchActionVerificationService extends C89286c {

    /* renamed from: a */
    private static final C59071e f118030a = C59071e.m91332i("com.google.android.search.verification.api.SearchActionVerificationService");

    /* renamed from: b */
    private final C45234b f118031b = new C45236d(this);

    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE")) {
            C58976aa aaVar = C58975e.f156826a;
            return this.f118031b;
        }
        C59104x c = f118030a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SAVerificationService");
        ((C59052c) ((C59052c) c).mo56372aa(54337)).mo56389s("Invalid bind intent: %s", intent);
        return null;
    }
}
