package com.google.android.libraries.elements.p1728g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p299c.p300a.C5857f;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.ContentMode;
import java.security.MessageDigest;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.libraries.elements.g.a */
/* compiled from: PG */
public final class C21173a extends C5857f {

    /* renamed from: b */
    private final Context f59390b;

    /* renamed from: c */
    private final C21319z f59391c;

    /* renamed from: d */
    private final ContentMode f59392d;

    /* renamed from: e */
    private final float f59393e;

    /* renamed from: f */
    private final C21259bb f59394f;

    public C21173a(Context context, C21319z zVar, C21259bb bbVar, ContentMode contentMode, float f) {
        this.f59390b = context.getApplicationContext();
        this.f59391c = zVar;
        this.f59394f = bbVar;
        this.f59392d = contentMode;
        this.f59393e = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.renderscript.Allocation] */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.renderscript.Allocation] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m39763d(android.graphics.Bitmap r7, float r8) {
        /*
            r6 = this;
            r0 = 0
            android.content.Context r1 = r6.f59390b     // Catch:{ RSRuntimeException -> 0x004b, all -> 0x0047 }
            android.renderscript.RenderScript r1 = android.renderscript.RenderScript.create(r1)     // Catch:{ RSRuntimeException -> 0x004b, all -> 0x0047 }
            android.renderscript.Element r2 = android.renderscript.Element.U8_4(r1)     // Catch:{ RSRuntimeException -> 0x004b, all -> 0x0047 }
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r1, r2)     // Catch:{ RSRuntimeException -> 0x004b, all -> 0x0047 }
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r1, r7)     // Catch:{ RSRuntimeException -> 0x0042, all -> 0x003d }
            android.renderscript.Type r4 = r3.getType()     // Catch:{ RSRuntimeException -> 0x003a, all -> 0x0037 }
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createTyped(r1, r4)     // Catch:{ RSRuntimeException -> 0x003a, all -> 0x0037 }
            r2.setRadius(r8)     // Catch:{ RSRuntimeException -> 0x003a, all -> 0x0037 }
            r2.setInput(r3)     // Catch:{ RSRuntimeException -> 0x003a, all -> 0x0037 }
            r2.forEach(r0)     // Catch:{ RSRuntimeException -> 0x003a, all -> 0x0037 }
            r0.copyTo(r7)     // Catch:{ RSRuntimeException -> 0x003a, all -> 0x0037 }
            if (r2 == 0) goto L_0x002c
            r2.destroy()
        L_0x002c:
            if (r3 == 0) goto L_0x0031
            r3.destroy()
        L_0x0031:
            if (r0 == 0) goto L_0x0068
            r0.destroy()
            return
        L_0x0037:
            r7 = move-exception
            r8 = r0
            goto L_0x0040
        L_0x003a:
            r7 = move-exception
            r8 = r0
            goto L_0x0045
        L_0x003d:
            r7 = move-exception
            r8 = r0
            r3 = r8
        L_0x0040:
            r0 = r2
            goto L_0x006a
        L_0x0042:
            r7 = move-exception
            r8 = r0
            r3 = r8
        L_0x0045:
            r0 = r2
            goto L_0x004e
        L_0x0047:
            r7 = move-exception
            r8 = r0
            r3 = r8
            goto L_0x006a
        L_0x004b:
            r7 = move-exception
            r8 = r0
            r3 = r8
        L_0x004e:
            com.google.android.libraries.elements.interfaces.bb r1 = r6.f59394f     // Catch:{ all -> 0x0069 }
            com.google.protos.youtube.elements.r r2 = com.google.protos.youtube.elements.C66260r.LOG_LEVEL_WARN     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = "Failed to blur image"
            com.google.android.libraries.elements.interfaces.z r5 = r6.f59391c     // Catch:{ all -> 0x0069 }
            r1.mo25782a(r2, r4, r5, r7)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005e
            r0.destroy()
        L_0x005e:
            if (r3 == 0) goto L_0x0063
            r3.destroy()
        L_0x0063:
            if (r8 == 0) goto L_0x0068
            r8.destroy()
        L_0x0068:
            return
        L_0x0069:
            r7 = move-exception
        L_0x006a:
            if (r0 == 0) goto L_0x006f
            r0.destroy()
        L_0x006f:
            if (r3 == 0) goto L_0x0074
            r3.destroy()
        L_0x0074:
            if (r8 == 0) goto L_0x0079
            r8.destroy()
        L_0x0079:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1728g.C21173a.m39763d(android.graphics.Bitmap, float):void");
    }

    /* renamed from: e */
    private static final void m39764e(Bitmap bitmap, Bitmap bitmap2) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        new Canvas(bitmap2).drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), paint);
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        float f = this.f59393e;
        messageDigest.update(("blur:" + f).getBytes(StandardCharsets.UTF_8));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo12296c(C5642d dVar, Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        float f;
        float f2 = this.f59393e;
        if (f2 < 0.01f) {
            return bitmap;
        }
        if (f2 > 25.0f) {
            float f3 = 25.0f / f2;
            bitmap2 = dVar.mo12113a(Math.round(((float) bitmap.getWidth()) * f3), Math.round(((float) bitmap.getHeight()) * f3), Bitmap.Config.ARGB_8888);
            m39764e(bitmap, bitmap2);
            f = 25.0f;
        } else {
            f = f2;
            bitmap2 = bitmap;
        }
        m39763d(bitmap2, f);
        if (this.f59392d != ContentMode.CONTENT_MODE_CENTER || this.f59393e <= 25.0f) {
            return bitmap2;
        }
        m39764e(bitmap2, bitmap);
        dVar.mo12116d(bitmap2);
        return bitmap;
    }
}
