package com.google.android.libraries.search.assistant.notification.p2711b;

import android.content.Context;
import androidx.core.app.C1787ad;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.b */
/* compiled from: PG */
public abstract class C34854b {

    /* renamed from: a */
    private static final String f92429a = new String(Character.toChars(128204));

    /* renamed from: b */
    private static final String f92430b = new String(Character.toChars(128100));

    /* renamed from: c */
    private static final String f92431c = new String(Character.toChars(128247));

    /* renamed from: d */
    private static final String f92432d = new String(Character.toChars(128126));

    /* renamed from: e */
    private static final String f92433e = new String(Character.toChars(127909));

    /* renamed from: f */
    private static final String f92434f = new String(Character.toChars(127925));

    /* renamed from: g */
    private static final String f92435g = new String(Character.toChars(128196));

    /* renamed from: h */
    private static final String f92436h = new String(Character.toChars(127908));

    /* renamed from: c */
    public static C34854b m63617c(Context context, C1787ad adVar) {
        CharSequence charSequence = adVar.f5568a;
        charSequence.getClass();
        String obj = charSequence.toString();
        if (obj.startsWith(f92429a)) {
            return new C34853a(context.getString(R.string.tng_shared_location), "image");
        }
        if (obj.startsWith(f92430b)) {
            return new C34853a(context.getString(R.string.tng_shared_contact), "text/plain");
        }
        if (obj.startsWith(f92431c) || obj.startsWith(f92432d)) {
            return new C34853a(context.getString(R.string.tng_shared_photo), "image");
        }
        if (obj.startsWith(f92433e)) {
            return new C34853a(context.getString(R.string.tng_shared_video), "video");
        }
        if (obj.startsWith(f92434f) || obj.startsWith(f92436h)) {
            return new C34853a(context.getString(R.string.tng_shared_audio), "audio");
        }
        if (obj.startsWith(f92435g)) {
            return new C34853a(context.getString(R.string.tng_shared_document), "text/plain");
        }
        return new C34853a(adVar.f5568a, "text/plain");
    }

    /* renamed from: d */
    public static C34854b m63618d(C1787ad adVar) {
        CharSequence charSequence = adVar.f5568a;
        charSequence.getClass();
        String str = adVar.f5571d;
        if (str == null) {
            str = "text/plain";
        }
        return new C34853a(charSequence, str);
    }

    /* renamed from: a */
    public abstract CharSequence mo39530a();

    /* renamed from: b */
    public abstract String mo39531b();
}
