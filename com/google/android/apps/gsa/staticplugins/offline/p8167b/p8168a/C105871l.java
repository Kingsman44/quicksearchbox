package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.protostore.C42876ab;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.l */
/* compiled from: PG */
public final class C105871l {

    /* renamed from: a */
    public final C29409fd f295496a;

    /* renamed from: b */
    public final C86124t f295497b;

    /* renamed from: c */
    public final C42876ab f295498c;

    /* renamed from: d */
    private final Context f295499d;

    public C105871l(C29409fd fdVar, Context context, C86124t tVar, C42876ab abVar) {
        this.f295496a = fdVar;
        this.f295499d = context;
        this.f295497b = tVar;
        this.f295498c = abVar;
    }

    /* renamed from: a */
    public final File mo95122a(String str) {
        ArrayList arrayList = new ArrayList(Uri.parse(str).getPathSegments());
        return new File(this.f295499d.getFilesDir(), TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
    }
}
