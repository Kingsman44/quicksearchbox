package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83736ah;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.n */
/* compiled from: PG */
public final /* synthetic */ class C110839n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C110927t f308806a;

    /* renamed from: b */
    public final /* synthetic */ C83739ak f308807b;

    public /* synthetic */ C110839n(C110927t tVar, C83739ak akVar) {
        this.f308806a = tVar;
        this.f308807b = akVar;
    }

    public final Object call() {
        Bitmap bitmap;
        C110927t tVar = this.f308806a;
        C83736ah ahVar = this.f308807b.f228247p;
        if (ahVar == null) {
            ahVar = C83736ah.f228222c;
        }
        try {
            Drawable applicationIcon = tVar.f309016c.getPackageManager().getApplicationIcon(ahVar.f228224a == 2 ? (String) ahVar.f228225b : BuildConfig.FLAVOR);
            if (applicationIcon == null) {
                return Optional.empty();
            }
            if (applicationIcon instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) applicationIcon).getBitmap();
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                bitmap = createBitmap;
            }
            C63087y v = C63088z.m96150v();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
            return Optional.m71637of(v.mo59165b());
        } catch (PackageManager.NameNotFoundException unused) {
            return Optional.empty();
        }
    }
}
