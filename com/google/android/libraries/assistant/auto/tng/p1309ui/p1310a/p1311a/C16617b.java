package com.google.android.libraries.assistant.auto.tng.p1309ui.p1310a.p1311a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.support.p033v7.widget.LinearLayoutManager;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p293a.C5731x;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1310a.C16621b;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C16617b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C16618c f48701a;

    /* renamed from: b */
    public final /* synthetic */ Icon f48702b;

    /* renamed from: c */
    public final /* synthetic */ Context f48703c;

    public /* synthetic */ C16617b(C16618c cVar, Icon icon, Context context) {
        this.f48701a = cVar;
        this.f48702b = icon;
        this.f48703c = context;
    }

    public final Object call() {
        Bitmap bitmap;
        Bitmap bitmap2;
        C16618c cVar = this.f48701a;
        Drawable loadDrawable = this.f48702b.loadDrawable(this.f48703c);
        if (loadDrawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) loadDrawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmap = bitmapDrawable.getBitmap();
                String concat = "autoimage:".concat(UUID.randomUUID().toString());
                C16621b bVar = new C16621b(concat);
                cVar.f48705b.f48709a.put(bVar, bitmap);
                ((C6007z) cVar.f48704a.mo51286a().mo11872j(bVar).mo11989z(C5731x.f17284c)).mo12456t(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
                return concat;
            }
        }
        if (loadDrawable.getIntrinsicWidth() <= 0 || loadDrawable.getIntrinsicHeight() <= 0) {
            bitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            bitmap2 = Bitmap.createBitmap(loadDrawable.getIntrinsicWidth(), loadDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap2);
        loadDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        loadDrawable.draw(canvas);
        bitmap = bitmap2;
        String concat2 = "autoimage:".concat(UUID.randomUUID().toString());
        C16621b bVar2 = new C16621b(concat2);
        cVar.f48705b.f48709a.put(bVar2, bitmap);
        ((C6007z) cVar.f48704a.mo51286a().mo11872j(bVar2).mo11989z(C5731x.f17284c)).mo12456t(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        return concat2;
    }
}
