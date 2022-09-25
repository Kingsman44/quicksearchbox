package androidx.media3.common.p135a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import androidx.media3.common.C2667k;
import androidx.media3.common.C2668l;

/* renamed from: androidx.media3.common.a.a */
/* compiled from: PG */
public final /* synthetic */ class C2565a implements C2667k {

    /* renamed from: a */
    public static final /* synthetic */ C2565a f7064a = new C2565a();

    private /* synthetic */ C2565a() {
    }

    /* renamed from: a */
    public final C2668l mo6075a(Bundle bundle) {
        C2566b bVar = new C2566b();
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        if (charSequence != null) {
            bVar.f7065a = charSequence;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        if (alignment != null) {
            bVar.f7067c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        if (alignment2 != null) {
            bVar.f7068d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        if (bitmap != null) {
            bVar.f7066b = bitmap;
        }
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            float f = bundle.getFloat(Integer.toString(4, 36));
            int i = bundle.getInt(Integer.toString(5, 36));
            bVar.f7069e = f;
            bVar.f7070f = i;
        }
        if (bundle.containsKey(Integer.toString(6, 36))) {
            bVar.f7071g = bundle.getInt(Integer.toString(6, 36));
        }
        if (bundle.containsKey(Integer.toString(7, 36))) {
            bVar.f7072h = bundle.getFloat(Integer.toString(7, 36));
        }
        if (bundle.containsKey(Integer.toString(8, 36))) {
            bVar.f7073i = bundle.getInt(Integer.toString(8, 36));
        }
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            float f2 = bundle.getFloat(Integer.toString(10, 36));
            int i2 = bundle.getInt(Integer.toString(9, 36));
            bVar.f7075k = f2;
            bVar.f7074j = i2;
        }
        if (bundle.containsKey(Integer.toString(11, 36))) {
            bVar.f7076l = bundle.getFloat(Integer.toString(11, 36));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            bVar.f7077m = bundle.getFloat(Integer.toString(12, 36));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            bVar.mo6077b(bundle.getInt(Integer.toString(13, 36)));
        }
        if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
            bVar.f7078n = false;
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            bVar.f7079o = bundle.getInt(Integer.toString(15, 36));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            bVar.f7080p = bundle.getFloat(Integer.toString(16, 36));
        }
        return bVar.mo6076a();
    }
}
