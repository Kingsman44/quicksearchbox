package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.dash.p141a.C2911b;
import java.util.Comparator;

/* renamed from: androidx.media3.exoplayer.dash.a */
/* compiled from: PG */
public final /* synthetic */ class C2909a implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C2909a f8305a = new C2909a();

    private /* synthetic */ C2909a() {
    }

    public final int compare(Object obj, Object obj2) {
        C2911b bVar = (C2911b) obj;
        C2911b bVar2 = (C2911b) obj2;
        int i = bVar.f8314c;
        int i2 = bVar2.f8314c;
        int i3 = i == i2 ? 0 : i < i2 ? -1 : 1;
        if (i3 != 0) {
            return i3;
        }
        return bVar.f8313b.compareTo(bVar2.f8313b);
    }
}
