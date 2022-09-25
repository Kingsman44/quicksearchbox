package androidx.media3.exoplayer.p150j;

import com.google.common.p4522b.C58393dj;
import com.google.common.p4522b.C58710pc;
import java.util.Comparator;

/* renamed from: androidx.media3.exoplayer.j.z */
/* compiled from: PG */
public final /* synthetic */ class C3230z implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C3230z f9709a = new C3230z();

    private /* synthetic */ C3230z() {
    }

    public final int compare(Object obj, Object obj2) {
        C58710pc pcVar;
        C3194aa aaVar = (C3194aa) obj;
        C3194aa aaVar2 = (C3194aa) obj2;
        if (!aaVar.f9583e || !aaVar.f9586h) {
            pcVar = C3195ab.f9596a.mo55783c();
        } else {
            pcVar = C3195ab.f9596a;
        }
        C58393dj djVar = C58393dj.f155989b;
        Integer valueOf = Integer.valueOf(aaVar.f9587i);
        Integer valueOf2 = Integer.valueOf(aaVar2.f9587i);
        boolean z = aaVar.f9584f.f7397w;
        return djVar.mo55137d(valueOf, valueOf2, C3195ab.f9597b).mo55137d(Integer.valueOf(aaVar.f9588j), Integer.valueOf(aaVar2.f9588j), pcVar).mo55137d(Integer.valueOf(aaVar.f9587i), Integer.valueOf(aaVar2.f9587i), pcVar).mo55134a();
    }
}
