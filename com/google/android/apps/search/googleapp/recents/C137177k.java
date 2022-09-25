package com.google.android.apps.search.googleapp.recents;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8867w.p8879i.C118814o;
import com.google.android.apps.search.googleapp.p10535w.C139856b;
import com.google.android.apps.search.googleapp.recents.p10382a.C137162d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.recents.k */
/* compiled from: PG */
public final class C137177k {

    /* renamed from: a */
    public static final C58974d f373267a = C58974d.m91135i("RecentsRecorder");

    /* renamed from: b */
    public final C137162d f373268b;

    /* renamed from: c */
    public final C139856b f373269c;

    /* renamed from: d */
    public final boolean f373270d;

    /* renamed from: e */
    public final Context f373271e;

    /* renamed from: f */
    public final C60887da f373272f;

    /* renamed from: g */
    public final ContentResolver f373273g;

    /* renamed from: h */
    public final C118814o f373274h;

    /* renamed from: i */
    private final AccountId f373275i;

    /* renamed from: j */
    private final C46128f f373276j;

    public C137177k(C137162d dVar, C139856b bVar, boolean z, Context context, AccountId accountId, C46128f fVar, C118814o oVar, ContentResolver contentResolver, C60887da daVar) {
        this.f373268b = dVar;
        this.f373269c = bVar;
        this.f373270d = z;
        this.f373271e = context;
        this.f373275i = accountId;
        this.f373276j = fVar;
        this.f373274h = oVar;
        this.f373273g = contentResolver;
        this.f373272f = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo113580a(String str, String str2, C137176j jVar, C60494rz rzVar) {
        if (!this.f373270d || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return C60866ct.f164955a;
        }
        Uri parse = Uri.parse((String) C137179m.m222964a(str2).orElse(str2));
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            return C60866ct.f164955a;
        }
        C60870cx a = this.f373274h.mo103980a();
        C137175i iVar = new C137175i(this, jVar, parse, str, host, rzVar);
        return C60922j.m93045h(a, C47810es.m84966f(iVar), this.f373272f);
    }

    /* renamed from: b */
    public final C60870cx mo113581b(long j, Bitmap bitmap) {
        if (bitmap == null) {
            return C60856cj.m92900i(false);
        }
        C60870cx b = this.f373276j.mo50215b(this.f373275i);
        C137174h hVar = new C137174h(this, j);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(hVar), this.f373272f);
        C137165b bVar = new C137165b(this, bitmap);
        return C60922j.m93045h(h, C47810es.m84966f(bVar), this.f373272f);
    }
}
