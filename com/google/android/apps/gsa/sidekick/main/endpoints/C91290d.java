package com.google.android.apps.gsa.sidekick.main.endpoints;

import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.endpoints.d */
/* compiled from: PG */
final class C91290d extends C90945k {

    /* renamed from: a */
    final /* synthetic */ GoogleServiceWebviewWrapper f254785a;

    /* renamed from: b */
    private final Uri f254786b;

    /* renamed from: c */
    private final String f254787c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91290d(GoogleServiceWebviewWrapper googleServiceWebviewWrapper, C90929bz bzVar, Uri uri, String str) {
        super("LoadServiceUrl", bzVar, 2, 16);
        this.f254785a = googleServiceWebviewWrapper;
        this.f254786b = uri;
        this.f254787c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        C59071e eVar = GoogleServiceWebviewWrapper.f254773a;
        C58976aa aaVar = C58975e.f156826a;
        Uri b = this.f254785a.f254776d.mo79669b(this.f254786b, this.f254787c);
        if (b != null) {
            this.f254785a.f254778f = b;
        }
        if (this.f254785a.f254778f != null) {
            return this.f254785a.f254778f.toString();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ void mo77937b(Object obj) {
        String str = (String) obj;
        if (!this.f254785a.f254780h) {
            if (str != null) {
                C58976aa aaVar = C58975e.f156826a;
                this.f254785a.f254779g.loadUrl(str);
                return;
            }
            C59104x c = GoogleServiceWebviewWrapper.f254773a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GoogleServiceWebviewWra");
            ((C59052c) ((C59052c) c).mo56372aa(11529)).mo56354G("Failed to get login link for %s:%s", this.f254787c, this.f254786b);
            Toast.makeText(this.f254785a.getApplicationContext(), R.string.failed_to_open_webview, 0).show();
            this.f254785a.finish();
        }
    }
}
