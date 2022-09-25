package com.google.android.apps.search.googleapp.p10535w;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.googleapp.w.b */
/* compiled from: PG */
public final class C139856b {

    /* renamed from: a */
    public static final C59071e f380159a = C59071e.m91332i("com.google.android.apps.search.googleapp.w.b");

    /* renamed from: b */
    public final C60887da f380160b;

    public C139856b(C60887da daVar) {
        this.f380160b = daVar;
    }

    /* renamed from: a */
    public static Bitmap m227400a(Fragment fragment) {
        try {
            View view = fragment.getView();
            view.getClass();
            View rootView = view.getRootView();
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
            rootView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Error | Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f380159a.mo56226d()).mo56382g(e)).mo56372aa(40964)).mo56386p("Get screenshot failed.");
            return null;
        }
    }
}
