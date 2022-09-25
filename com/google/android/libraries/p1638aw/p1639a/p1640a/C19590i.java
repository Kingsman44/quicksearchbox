package com.google.android.libraries.p1638aw.p1639a.p1640a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.libraries.p1638aw.p1639a.C19591b;
import com.google.android.libraries.p1638aw.p1639a.C19594c;
import com.google.android.libraries.p1638aw.p1639a.C19596e;
import com.google.android.libraries.social.p3266b.C41913a;

/* renamed from: com.google.android.libraries.aw.a.a.i */
/* compiled from: PG */
public final class C19590i implements C19594c {

    /* renamed from: b */
    private static final C41913a f54523b = new C41913a();

    /* renamed from: c */
    private static final Rect f54524c = new Rect();

    /* renamed from: a */
    public int f54525a = C19584c.m37342b((String) null);

    /* renamed from: d */
    private CharSequence f54526d;

    /* renamed from: e */
    private final C19584c f54527e;

    public C19590i(C19584c cVar) {
        this.f54527e = cVar;
        this.f54526d = cVar.mo24845a((C19596e) null);
        C19591b bVar = cVar.f54511a;
    }

    /* renamed from: a */
    public final void mo24848a(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        C41913a aVar = f54523b;
        Paint paint = (Paint) aVar.mo44377a();
        synchronized (aVar) {
            paint.setColor(this.f54525a);
            int height2 = canvas.getHeight();
            int width2 = canvas.getWidth();
            canvas.drawCircle((float) (width2 / 2), (float) (height2 / 2), (float) (Math.min(width2, height2) / 2), paint);
            if (this.f54526d != null) {
                paint.setColor(-1);
                paint.setTextSize(((float) Math.min(height, width)) * 0.47f);
                String obj = this.f54526d.toString();
                int length = this.f54526d.length();
                Rect rect = f54524c;
                paint.getTextBounds(obj, 0, length, rect);
                CharSequence charSequence = this.f54526d;
                canvas.drawText(charSequence, 0, charSequence.length(), (float) (width / 2), ((float) (height / 2)) - rect.exactCenterY(), paint);
            }
        }
    }

    /* renamed from: b */
    public final void mo24849b(String str) {
        this.f54525a = C19584c.m37342b(str);
    }

    /* renamed from: c */
    public final void mo24850c(C19596e eVar) {
        this.f54526d = this.f54527e.mo24845a(eVar);
    }
}
