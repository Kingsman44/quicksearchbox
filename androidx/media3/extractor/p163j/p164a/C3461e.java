package androidx.media3.extractor.p163j.p164a;

import android.text.Layout;
import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p135a.C2567c;
import java.util.Comparator;

/* renamed from: androidx.media3.extractor.j.a.e */
/* compiled from: PG */
final class C3461e {

    /* renamed from: a */
    public static final Comparator f10718a = C3460d.f10717a;

    /* renamed from: b */
    public final C2567c f10719b;

    /* renamed from: c */
    public final int f10720c;

    public C3461e(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        C2566b bVar = new C2566b();
        bVar.f7065a = charSequence;
        bVar.f7067c = alignment;
        bVar.f7069e = f;
        bVar.f7070f = 0;
        bVar.f7071g = i;
        bVar.f7072h = f2;
        bVar.f7073i = i2;
        bVar.f7076l = -3.4028235E38f;
        if (z) {
            bVar.mo6077b(i3);
        }
        this.f10719b = bVar.mo6076a();
        this.f10720c = i4;
    }
}
