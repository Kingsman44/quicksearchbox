package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.u */
/* compiled from: PG */
public final class C15347u {
    /* renamed from: a */
    public static Optional m31943a(Bitmap bitmap, ImageView imageView, ContextThemeWrapper contextThemeWrapper) {
        C58976aa aaVar = C58975e.f156826a;
        if (bitmap == null || imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            return Optional.empty();
        }
        int max = Math.max(imageView.getWidth(), imageView.getHeight()) / 10;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, max, max, false);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        RenderScript create = RenderScript.create(contextThemeWrapper.getApplicationContext());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setInput(createFromBitmap);
        create2.setRadius(25.0f);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        create2.destroy();
        create.destroy();
        createFromBitmap.destroy();
        createFromBitmap2.destroy();
        return Optional.m71637of(createBitmap);
    }
}
