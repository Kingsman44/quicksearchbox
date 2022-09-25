package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.p337aa.C6617d;
import com.google.p337aa.p338a.C6610l;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.c */
/* compiled from: PG */
public final /* synthetic */ class C117257c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117275f f325504a;

    public /* synthetic */ C117257c(C117275f fVar) {
        this.f325504a = fVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C117275f fVar = this.f325504a;
        C6617d dVar = (C6617d) obj;
        C6610l lVar = dVar.f19672v;
        if (lVar == null) {
            lVar = C6610l.f19630i;
        }
        if ((lVar.f19632a & 1) == 0) {
            return fVar.mo103227a();
        }
        String str = null;
        String string = fVar.f325550a.getString("search_widget_doodle_url", (String) null);
        C6610l lVar2 = dVar.f19672v;
        if (lVar2 == null) {
            lVar2 = C6610l.f19630i;
        }
        String str2 = lVar2.f19633b;
        Uri parse = Uri.parse(str2);
        if (!parse.isAbsolute()) {
            Uri uri = fVar.f325554e;
            if (uri != null) {
                String authority = uri.getAuthority();
                if (!TextUtils.isEmpty(authority)) {
                    Uri.Builder scheme = parse.buildUpon().scheme(fVar.f325554e.getScheme());
                    scheme.authority(authority);
                    str = scheme.build().toString();
                }
            }
        } else {
            str = str2;
        }
        if (str == null) {
            return fVar.mo103227a();
        }
        if (str.equals(string)) {
            return C118826c.f331423b;
        }
        return fVar.mo103229c(str, dVar.f19653c);
    }
}
