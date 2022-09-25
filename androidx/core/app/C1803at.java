package androidx.core.app;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.at */
/* compiled from: PG */
public final class C1803at {

    /* renamed from: a */
    public final CharSequence f5630a;

    /* renamed from: b */
    public final IconCompat f5631b;

    /* renamed from: c */
    public final String f5632c;

    /* renamed from: d */
    public final String f5633d;

    /* renamed from: e */
    public final boolean f5634e;

    /* renamed from: f */
    public final boolean f5635f;

    public C1803at(C1802as asVar) {
        this.f5630a = asVar.f5624a;
        this.f5631b = asVar.f5625b;
        this.f5632c = asVar.f5626c;
        this.f5633d = asVar.f5627d;
        this.f5634e = asVar.f5628e;
        this.f5635f = asVar.f5629f;
    }

    /* renamed from: a */
    public static C1803at m4957a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        C1802as asVar = new C1802as();
        asVar.f5624a = bundle.getCharSequence("name");
        IconCompat iconCompat = null;
        if (bundle2 != null) {
            int i = bundle2.getInt("type");
            IconCompat iconCompat2 = new IconCompat(i);
            iconCompat2.f5830f = bundle2.getInt("int1");
            iconCompat2.f5831g = bundle2.getInt("int2");
            iconCompat2.f5835k = bundle2.getString("string1");
            if (bundle2.containsKey("tint_list")) {
                iconCompat2.f5832h = (ColorStateList) bundle2.getParcelable("tint_list");
            }
            if (bundle2.containsKey("tint_mode")) {
                iconCompat2.f5833i = PorterDuff.Mode.valueOf(bundle2.getString("tint_mode"));
            }
            switch (i) {
                case -1:
                case 1:
                case 5:
                    iconCompat2.f5827c = bundle2.getParcelable("obj");
                    break;
                case 2:
                case 4:
                case 6:
                    iconCompat2.f5827c = bundle2.getString("obj");
                    break;
                case 3:
                    iconCompat2.f5827c = bundle2.getByteArray("obj");
                    break;
                default:
                    Log.w("IconCompat", "Unknown type " + i);
                    break;
            }
            iconCompat = iconCompat2;
        }
        asVar.f5625b = iconCompat;
        asVar.f5626c = bundle.getString("uri");
        asVar.f5627d = bundle.getString("key");
        asVar.f5628e = bundle.getBoolean("isBot");
        asVar.f5629f = bundle.getBoolean("isImportant");
        return new C1803at(asVar);
    }
}
