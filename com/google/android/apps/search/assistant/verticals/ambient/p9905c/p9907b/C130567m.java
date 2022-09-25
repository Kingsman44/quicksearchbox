package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83736ah;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.b.m */
/* compiled from: PG */
public final /* synthetic */ class C130567m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C130573s f357625a;

    /* renamed from: b */
    public final /* synthetic */ C83736ah f357626b;

    public /* synthetic */ C130567m(C130573s sVar, C83736ah ahVar) {
        this.f357625a = sVar;
        this.f357626b = ahVar;
    }

    public final Object call() {
        Bitmap bitmap;
        C130573s sVar = this.f357625a;
        C83736ah ahVar = this.f357626b;
        try {
            Drawable applicationIcon = sVar.f357634c.getPackageManager().getApplicationIcon(ahVar.f228224a == 2 ? (String) ahVar.f228225b : BuildConfig.FLAVOR);
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
