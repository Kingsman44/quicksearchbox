package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.assistant.p3861at.C50305sd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ey */
/* compiled from: PG */
public final class C108679ey {

    /* renamed from: a */
    public final C50305sd f302272a;

    /* renamed from: b */
    public final boolean f302273b;

    /* renamed from: c */
    public boolean f302274c = false;

    /* renamed from: d */
    public boolean f302275d = false;

    /* renamed from: e */
    private final byte[] f302276e;

    public C108679ey(C50305sd sdVar, byte[] bArr, boolean z) {
        this.f302272a = sdVar;
        this.f302276e = bArr;
        this.f302273b = z;
    }

    /* renamed from: a */
    public final Drawable mo97057a(Resources resources) {
        byte[] bArr = this.f302276e;
        Bitmap decodeByteArray = bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null;
        if (decodeByteArray == null) {
            return null;
        }
        return new BitmapDrawable(resources, decodeByteArray);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = com.google.assistant.p3861at.C50298rx.m85804a(r2.f302272a.f130925f);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97058b() {
        /*
            r2 = this;
            boolean r0 = r2.f302274c
            r1 = 1
            if (r0 != 0) goto L_0x0015
            com.google.assistant.at.sd r0 = r2.f302272a
            int r0 = r0.f130925f
            int r0 = com.google.assistant.p3861at.C50298rx.m85804a(r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            if (r0 == r1) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            return r0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108679ey.mo97058b():boolean");
    }
}
