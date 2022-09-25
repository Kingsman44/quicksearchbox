package com.google.android.apps.gsa.shared.logger.p7061g;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60761r;

/* renamed from: com.google.android.apps.gsa.shared.logger.g.a */
/* compiled from: PG */
public final class C89917a {

    /* renamed from: a */
    private static final C59071e f246351a = C59071e.m91332i("com.google.android.apps.gsa.shared.logger.g.a");

    /* renamed from: a */
    public static C58833ax m146440a(Intent intent) {
        return intent.hasExtra("com.google.android.apps.gsa.shared.logger.RESULT_CLICK_ID") ? C58833ax.m90834k(Long.valueOf(intent.getLongExtra("com.google.android.apps.gsa.shared.logger.RESULT_CLICK_ID", -1))) : C58836b.f156633a;
    }

    /* renamed from: b */
    public static C58833ax m146441b(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("agsac");
            if (queryParameter != null) {
                return C58833ax.m90834k(Long.valueOf(C60761r.m92757c(Base64.decode(queryParameter, 11))));
            }
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f246351a.mo56226d()).mo56382g(e)).mo56372aa(10709)).mo56386p("Could not retrieve result click ID from the uri");
        }
        return C58836b.f156633a;
    }
}
