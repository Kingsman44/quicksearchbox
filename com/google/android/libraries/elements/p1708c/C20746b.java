package com.google.android.libraries.elements.p1708c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.core.content.p091b.C1874w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.protos.youtube.elements.C66260r;

/* renamed from: com.google.android.libraries.elements.c.b */
/* compiled from: PG */
public final class C20746b implements C21296cl {

    /* renamed from: a */
    private final C21259bb f58068a;

    public C20746b(C21259bb bbVar) {
        this.f58068a = bbVar;
    }

    /* renamed from: c */
    private final Typeface m38946c(Context context, String str) {
        int i;
        try {
            if (str.startsWith("google-sans-text-medium")) {
                i = R.font.google_sans_text_medium;
            } else if (str.startsWith("google-sans-text")) {
                i = R.font.google_sans_text;
            } else {
                i = str.startsWith("google-sans-medium") ? R.font.google_sans_medium : R.font.google_sans;
            }
            return C1874w.m5107d(context, i);
        } catch (Resources.NotFoundException e) {
            this.f58068a.mo25782a(C66260r.LOG_LEVEL_INFO_DEPRECATED, String.format("Font not found: %s. For steps to resolve this error, please refer to go/elements-android-fonts#heading=h.n4awqg1rbygf.", new Object[]{str}), C21319z.f59680u, e);
            return null;
        } catch (RuntimeException e2) {
            this.f58068a.mo25782a(C66260r.LOG_LEVEL_INFO_DEPRECATED, "Failed to load font: ".concat(String.valueOf(str)), C21319z.f59680u, e2);
            return null;
        }
    }

    /* renamed from: a */
    public final Typeface mo25819a(Context context, String str) {
        Typeface c;
        int i;
        if (!str.startsWith("google-sans") || (c = m38946c(context, str)) == null) {
            return null;
        }
        if (str.endsWith("-bold")) {
            i = 1;
        } else if (str.endsWith("-italic")) {
            i = 2;
        } else {
            i = str.endsWith("-bold-italic") ? 3 : 0;
        }
        return Typeface.create(c, i);
    }

    /* renamed from: b */
    public final Typeface mo25820b(Context context, String str, int i, boolean z) {
        Typeface c;
        if (str.startsWith("google-sans") && (c = m38946c(context, str)) != null) {
            return Typeface.create(c, i, z);
        }
        return null;
    }
}
