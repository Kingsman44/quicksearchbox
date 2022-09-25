package com.google.android.apps.gsa.nga.shared.p6321am.p6323b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.google.android.apps.gsa.shared.util.C90736at;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.b.f */
/* compiled from: PG */
public final class C80936f {

    /* renamed from: a */
    public static final C58974d f221911a = C58974d.m91136j();

    /* renamed from: a */
    public final void mo74719a(View view, C90736at atVar, Handler handler) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            handler.post(new C80931a(atVar));
        } else if (view.getContext() instanceof Activity) {
            C80932b bVar = new C80932b(atVar, view, handler);
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Window window = ((Activity) view.getContext()).getWindow();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            try {
                PixelCopy.request(window, new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()), createBitmap, new C80935e(bVar, createBitmap), handler);
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) f221911a.mo56225c()).mo56382g(e)).mo56372aa(6535)).mo56386p("Unable to convert bitmap");
                bVar.mo17700a((Object) null);
            }
        } else {
            C80934d.m128787a(view, atVar, handler);
        }
    }
}
