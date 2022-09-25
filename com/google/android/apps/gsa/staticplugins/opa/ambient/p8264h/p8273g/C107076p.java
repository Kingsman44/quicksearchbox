package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.p */
/* compiled from: PG */
public final class C107076p {

    /* renamed from: a */
    public final C58974d f298127a;

    /* renamed from: b */
    public final C68214a f298128b;

    /* renamed from: c */
    public final C60888db f298129c;

    public C107076p(C68214a aVar, C60888db dbVar, C83564a aVar2) {
        this.f298128b = aVar;
        this.f298129c = dbVar;
        this.f298127a = aVar2.mo76900a("SSImageLoader");
    }

    /* renamed from: a */
    public final C47633f mo95773a(Uri uri) {
        ((C58970a) ((C58970a) this.f298127a.mo56224b()).mo56372aa(23477)).mo56389s("#loadImageFromHttpUri: %s", uri);
        try {
            new URL(uri.toString());
            return C47633f.m84733g(((C91189au) this.f298128b.mo27525b()).mo85425m(uri, C58833ax.m90834k(Bitmap.CompressFormat.PNG), 7)).mo51515h(new C107073m(this), this.f298129c);
        } catch (MalformedURLException unused) {
            ((C58970a) ((C58970a) this.f298127a.mo56224b()).mo56372aa(23478)).mo56389s("#loadImageFromHttpUri: Failed to convert string to URL: %s", uri);
            return C47633f.m84733g(C60856cj.m92900i(C63088z.f170246b));
        }
    }
}
