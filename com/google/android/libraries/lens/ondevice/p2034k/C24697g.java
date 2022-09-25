package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: com.google.android.libraries.lens.ondevice.k.g */
/* compiled from: PG */
public final /* synthetic */ class C24697g {

    /* renamed from: a */
    public static final /* synthetic */ C24697g f67542a = new C24697g();

    private /* synthetic */ C24697g() {
    }

    /* renamed from: a */
    public final Bitmap mo29984a(Context context, Bitmap bitmap) {
        C24670f fVar = C24724h.f67585b;
        RenderScript create = RenderScript.create(context);
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, copy);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(2.0f);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(copy);
        create2.destroy();
        createFromBitmap.destroy();
        createTyped.destroy();
        return copy;
    }
}
