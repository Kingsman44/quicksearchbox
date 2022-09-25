package com.google.android.apps.gsa.staticplugins.searchwidget.p8757d;

import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60826bg;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.d.f */
/* compiled from: PG */
public final /* synthetic */ class C117269f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117271h f325521a;

    /* renamed from: b */
    public final /* synthetic */ Uri f325522b;

    /* renamed from: c */
    public final /* synthetic */ int f325523c;

    public /* synthetic */ C117269f(C117271h hVar, Uri uri, int i) {
        this.f325521a = hVar;
        this.f325522b = uri;
        this.f325523c = i;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C117271h hVar = this.f325521a;
        Uri uri = this.f325522b;
        int i = this.f325523c;
        C63088z A = C63088z.m96139A((byte[]) obj);
        String uri2 = uri.toString();
        if (i - 1 != 1) {
            return hVar.f325530d.mo46039a(new C117267d(hVar, i, A, uri2), C60826bg.f164896a);
        }
        return hVar.f325531e.mo46039a(new C117266c(hVar, i, A, uri2), C60826bg.f164896a);
    }
}
