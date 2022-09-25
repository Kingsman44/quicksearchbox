package androidx.media3.exoplayer.dash.p141a;

import android.net.Uri;
import androidx.media3.common.C2680x;
import androidx.media3.exoplayer.dash.C2947p;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.dash.a.l */
/* compiled from: PG */
public final class C2921l extends C2922m {

    /* renamed from: a */
    private final C2919j f8364a;

    /* renamed from: g */
    private final C2930u f8365g;

    public C2921l(C2680x xVar, List list, C2927r rVar, List list2) {
        super(xVar, list, rVar, list2);
        C2919j jVar;
        Uri.parse(((C2911b) list.get(0)).f8312a);
        long j = rVar.f8384b;
        C2930u uVar = null;
        if (j <= 0) {
            jVar = null;
        } else {
            jVar = new C2919j((String) null, rVar.f8383a, j);
        }
        this.f8364a = jVar;
        this.f8365g = jVar == null ? new C2930u(new C2919j((String) null, 0, -1)) : uVar;
    }

    /* renamed from: k */
    public final C2947p mo6789k() {
        return this.f8365g;
    }

    /* renamed from: l */
    public final C2919j mo6790l() {
        return this.f8364a;
    }

    /* renamed from: m */
    public final String mo6791m() {
        return null;
    }
}
