package com.google.android.apps.search.lens.p10548b;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4711m.C62632i;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.C68214a;

/* renamed from: com.google.android.apps.search.lens.b.a */
/* compiled from: PG */
public final class C139925a {

    /* renamed from: a */
    private static final C58974d f380377a = C58974d.m91135i("ExportedActivityHandler");

    /* renamed from: b */
    private final C143701ac f380378b;

    /* renamed from: c */
    private final C68214a f380379c;

    /* renamed from: d */
    private final boolean f380380d;

    /* renamed from: e */
    private final C65603f f380381e;

    public C139925a(C143701ac acVar, C68214a aVar, boolean z, C65603f fVar) {
        this.f380378b = acVar;
        this.f380379c = aVar;
        this.f380380d = z;
        this.f380381e = fVar;
    }

    /* renamed from: a */
    public final int mo115342a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((C58970a) ((C58970a) f380377a.mo56226d()).mo56372aa(41486)).mo56386p("Caller package cannot be empty. LensExportedActivity must be started for result.");
            return 3;
        }
        if (this.f380380d) {
            try {
                C143701ac acVar = this.f380378b;
                try {
                    acVar.mo119086e(str).mo119529e();
                } catch (SecurityException e) {
                    acVar.mo119086e(str).mo119529e();
                    Log.e("GoogleSignatureVerifier", "flaky result", e);
                }
            } catch (Exception e2) {
                ((C58970a) ((C58970a) ((C58970a) f380377a.mo56225c()).mo56382g(e2)).mo56372aa(41489)).mo56389s("verifyPackageIsGoogleSigned failed for package: %s", str);
                return 4;
            }
        }
        if (!this.f380381e.f178307a.contains(str)) {
            ((C58970a) ((C58970a) f380377a.mo56226d()).mo56372aa(41488)).mo56389s("Package %s not on direct_intent_package_allowlist.", str);
            return 5;
        }
        int c = ((C27683a) this.f380379c.mo27525b()).mo33176c(str);
        if (c == 4) {
            return 6;
        }
        if (c == 5) {
            return C62632i.m94817b(C58833ax.m90833j(str)) ? -1 : 7;
        }
        if (c != 2) {
            ((C58970a) ((C58970a) f380377a.mo56225c()).mo56372aa(41487)).mo56387q("Lens eligibility error: %s", c - 2);
            return 1;
        }
    }
}
