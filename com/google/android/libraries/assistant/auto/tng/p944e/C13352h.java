package com.google.android.libraries.assistant.auto.tng.p944e;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.gmm.p996d.C13587a;
import com.google.android.libraries.componentview.services.application.C20609ci;
import com.google.android.libraries.componentview.services.application.NavigationParams;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.e.h */
/* compiled from: PG */
public final class C13352h implements C20609ci {

    /* renamed from: a */
    private static final C59071e f41081a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.e.h");

    /* renamed from: b */
    private final Context f41082b;

    /* renamed from: c */
    private final C86124t f41083c;

    public C13352h(Context context, C86124t tVar) {
        this.f41082b = context;
        this.f41083c = tVar;
    }

    /* renamed from: a */
    public final void mo21039a(String str, NavigationParams navigationParams) {
        try {
            Intent component = Intent.parseUri(str, 1).addCategory("android.intent.category.BROWSABLE").setComponent((ComponentName) null);
            component.setFlags(268435456);
            this.f41082b.startActivity(component);
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f41081a.mo56225c()).mo56382g(e)).mo56372aa(44693)).mo56389s("Failed to execute action: %s", str);
        }
    }

    /* renamed from: b */
    public final boolean mo21040b(Intent intent) {
        Uri data;
        try {
            if (this.f41083c.mo79746e(C90051dc.f248857bL) && (data = intent.getData()) != null && "google.navigation".equals(data.getScheme())) {
                String b = C13587a.m29864b(intent, this.f41082b.getPackageManager());
                if (b == null) {
                    ((C59052c) ((C59052c) f41081a.mo56224b()).mo56372aa(44695)).mo56389s("GMM Package not found for [%s]", intent);
                } else {
                    intent.setPackage(b);
                }
            }
            intent.setFlags(intent.getFlags() | 268435456);
            this.f41082b.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f41081a.mo56225c()).mo56382g(e)).mo56372aa(44694)).mo56389s("Failed to fire intent: %s", intent);
            return false;
        }
    }
}
