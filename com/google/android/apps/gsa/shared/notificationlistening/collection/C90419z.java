package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.content.Context;
import androidx.core.app.C1787ad;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.z */
/* compiled from: PG */
public final class C90419z extends C90406m {

    /* renamed from: d */
    private static final String f252520d = new String(Character.toChars(128204));

    /* renamed from: e */
    private static final String f252521e = new String(Character.toChars(128100));

    /* renamed from: f */
    private static final String f252522f = new String(Character.toChars(128247));

    /* renamed from: g */
    private static final String f252523g = new String(Character.toChars(128126));

    /* renamed from: h */
    private static final String f252524h = new String(Character.toChars(127909));

    /* renamed from: i */
    private static final String f252525i = new String(Character.toChars(127925));

    /* renamed from: j */
    private static final String f252526j = new String(Character.toChars(128196));

    /* renamed from: k */
    private static final String f252527k = new String(Character.toChars(127908));

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C90389w mo84107a(Context context, C1787ad adVar) {
        if (adVar == null) {
            return null;
        }
        String obj = adVar.f5568a.toString();
        if (obj.startsWith(f252520d)) {
            return new C90389w(context.getString(R.string.shared_location), "image");
        }
        if (obj.startsWith(f252521e)) {
            return new C90389w(context.getString(R.string.shared_contact), "text/plain");
        }
        if (obj.startsWith(f252522f) || obj.startsWith(f252523g)) {
            return new C90389w(context.getString(R.string.shared_photo), "image");
        }
        if (obj.startsWith(f252524h)) {
            return new C90389w(context.getString(R.string.shared_video), "video");
        }
        if (obj.startsWith(f252525i) || obj.startsWith(f252527k)) {
            return new C90389w(context.getString(R.string.shared_audio), "audio");
        }
        return obj.startsWith(f252526j) ? new C90389w(context.getString(R.string.shared_document), "text/plain") : new C90389w(adVar.f5568a, "text/plain");
    }
}
