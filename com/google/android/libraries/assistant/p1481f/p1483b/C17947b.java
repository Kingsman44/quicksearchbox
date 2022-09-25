package com.google.android.libraries.assistant.p1481f.p1483b;

import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.common.p4526f.C59052c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.f.b.b */
/* compiled from: PG */
public final /* synthetic */ class C17947b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C17949d f51397a;

    /* renamed from: b */
    public final /* synthetic */ ShortcutInfo f51398b;

    public /* synthetic */ C17947b(C17949d dVar, ShortcutInfo shortcutInfo) {
        this.f51397a = dVar;
        this.f51398b = shortcutInfo;
    }

    public final Object call() {
        Bitmap bitmap;
        C17949d dVar = this.f51397a;
        ShortcutInfo shortcutInfo = this.f51398b;
        Drawable shortcutIconDrawable = ((LauncherApps) dVar.f51405c.mo27525b()).getShortcutIconDrawable(shortcutInfo, 0);
        if (shortcutIconDrawable == null) {
            return Optional.empty();
        }
        if (shortcutIconDrawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) shortcutIconDrawable).getBitmap();
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(shortcutIconDrawable.getIntrinsicWidth(), shortcutIconDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            shortcutIconDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            shortcutIconDrawable.draw(canvas);
            bitmap = createBitmap;
        }
        File file = new File(dVar.f51404b.getCacheDir(), "shortcut_icon");
        if (file.exists() || file.mkdirs() || file.exists()) {
            File file2 = new File(file, String.valueOf(shortcutInfo.getId()).concat(".jpg"));
            if (!file2.exists()) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
                    fileOutputStream.close();
                } catch (IOException unused) {
                    ((C59052c) ((C59052c) C17949d.f51403a.mo56226d()).mo56372aa(46929)).mo56386p("[NGA] Cannot cache shortcut icon.");
                    return Optional.empty();
                }
            }
            return Optional.m71637of(Uri.fromFile(file2).toString());
        }
        ((C59052c) ((C59052c) C17949d.f51403a.mo56226d()).mo56372aa(46930)).mo56386p("[NGA] Cannot cache shortcut icon.");
        return Optional.empty();
    }
}
