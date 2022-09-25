package com.google.android.libraries.abuse.reporting;

import java.util.List;
import org.chromium.net.CronetException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.abuse.reporting.w */
/* compiled from: PG */
final class C146754w implements C146733b {

    /* renamed from: a */
    final /* synthetic */ ReportAbuseActivity f396280a;

    public C146754w(ReportAbuseActivity reportAbuseActivity) {
        this.f396280a = reportAbuseActivity;
    }

    /* renamed from: a */
    public final void mo123570a(CronetException cronetException) {
        this.f396280a.mo123512k(cronetException, 1003);
    }

    /* renamed from: b */
    public final void mo123571b(String str) {
        this.f396280a.mo123518p(new C146753v(this));
        if (this.f396280a.f396171w) {
            try {
                if (new JSONObject(str).has("error")) {
                    throw new JSONException("Error response from server.");
                }
            } catch (JSONException unused) {
                this.f396280a.mo123512k(new JSONException("Undo was unsuccessful."), 1003);
                return;
            }
        }
        this.f396280a.mo123516o(false, -1, -1, (String) null, (List) null);
    }
}
