package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.media3.common.C2646bh;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16980d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16982f;
import com.google.android.p10890h.p10891a.p10892a.C146556k;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.q */
/* compiled from: PG */
final class C16967q extends C146556k {
    public C16967q(MediaSessionCompat mediaSessionCompat) {
        super(mediaSessionCompat);
    }

    /* renamed from: b */
    public final MediaDescriptionCompat mo23162b(C2646bh bhVar, int i) {
        Uri uri;
        String str;
        String str2;
        C16980d a = C16973w.m34074a(bhVar.mo6257ab(i));
        if (a == null) {
            return new MediaDescriptionCompat((String) null, (CharSequence) null, (CharSequence) null, (CharSequence) null, (Bitmap) null, (Uri) null, (Bundle) null, (Uri) null);
        }
        Uri parse = Uri.parse(a.f49603a);
        C16982f fVar = a.f49604b;
        if (fVar != null) {
            String str3 = fVar.f49610a;
            String str4 = fVar.f49612c;
            C51012dc dcVar = fVar.f49613d;
            uri = dcVar != null ? Uri.parse(dcVar.f132817c) : null;
            str2 = str3;
            str = str4;
        } else {
            str2 = null;
            str = null;
            uri = null;
        }
        return new MediaDescriptionCompat((String) null, str2, (CharSequence) null, str, (Bitmap) null, uri, (Bundle) null, parse);
    }
}
