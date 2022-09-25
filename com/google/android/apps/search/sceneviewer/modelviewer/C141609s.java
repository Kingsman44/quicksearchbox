package com.google.android.apps.search.sceneviewer.modelviewer;

import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.sceneviewer.p10648c.C141537b;
import com.google.android.apps.search.sceneviewer.p10648c.C141539d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.s */
/* compiled from: PG */
public final /* synthetic */ class C141609s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384398a;

    public /* synthetic */ C141609s(C141584am amVar) {
        this.f384398a = amVar;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        C141584am amVar = this.f384398a;
        amVar.f384275C.dismissOverflowMenu();
        View sceneView = amVar.f384353v.getSceneView();
        if (sceneView instanceof SurfaceView) {
            C46439e eVar = amVar.f384345n;
            C141539d dVar = amVar.f384343l;
            SurfaceView surfaceView = (SurfaceView) sceneView;
            SurfaceHolder holder = surfaceView.getHolder();
            if (holder == null || holder.getSurface() == null) {
                cxVar = C60856cj.m92899h(new RuntimeException("Error getting screenshot, no surface found for surface view"));
            } else if (!holder.getSurface().isValid()) {
                cxVar = C60856cj.m92899h(new RuntimeException("Error getting screenshot, surface is not valid"));
            } else {
                cxVar = C2169h.m6027a(new C141537b(dVar, surfaceView, Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888)));
            }
            C46438d dVar2 = new C46438d(cxVar);
            eVar.mo50428h(dVar2.f121541a, (Object) null, amVar.f384348q);
            return;
        }
        amVar.mo116577k((Bitmap) null);
    }
}
