package com.google.android.apps.gsa.shared.p7148ui.p7155g.p7156a;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.a.d */
/* compiled from: PG */
public final class C90682d {

    /* renamed from: a */
    public static final C59071e f253584a = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.g.a.d");

    /* renamed from: b */
    public final C22871g f253585b;

    /* renamed from: c */
    public final C91183ao f253586c;

    public C90682d(C91183ao aoVar, C22871g gVar) {
        this.f253586c = aoVar;
        this.f253585b = gVar;
    }

    /* renamed from: a */
    public static boolean m148049a(String str) {
        Uri parse = Uri.parse(str);
        return "http".equals(parse.getScheme()) || "https".equals(parse.getScheme()) || "content".equals(parse.getScheme()) || "file".equals(parse.getScheme()) || "android.resource".equals(parse.getScheme());
    }

    /* renamed from: b */
    public static final void m148050b(ImageView imageView, Drawable drawable) {
        try {
            imageView.setImageDrawable(drawable);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f253584a.mo56225c()).mo56382g(e)).mo56372aa(11303)).mo56386p("Failed when setting default image.");
        }
    }
}
