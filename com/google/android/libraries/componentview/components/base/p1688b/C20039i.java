package com.google.android.libraries.componentview.components.base.p1688b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.libraries.componentview.components.base.p1687a.C19935bi;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.componentview.components.base.b.i */
/* compiled from: PG */
final class C20039i implements Callable {

    /* renamed from: a */
    final /* synthetic */ Bitmap f56176a;

    /* renamed from: b */
    final /* synthetic */ C20041k f56177b;

    public C20039i(C20041k kVar, Bitmap bitmap) {
        this.f56177b = kVar;
        this.f56176a = bitmap;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Resources resources = this.f56177b.f56180a.getResources();
        C20041k kVar = this.f56177b;
        Bitmap bitmap = this.f56176a;
        C19935bi biVar = kVar.f56185f;
        float f = biVar.f55788a;
        float f2 = biVar.f55789b;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * f), Math.round(((float) bitmap.getHeight()) * f), false);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
        RenderScript create = RenderScript.create(kVar.getContext());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setRadius(f2);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        create.destroy();
        create2.destroy();
        createFromBitmap.destroy();
        createFromBitmap2.destroy();
        return new BitmapDrawable(resources, createBitmap);
    }
}
