package androidx.media3.exoplayer.dash;

import android.net.Uri;
import androidx.media3.common.p136b.C2610ai;
import androidx.media3.exoplayer.dash.p141a.C2911b;
import androidx.media3.exoplayer.dash.p141a.C2919j;
import androidx.media3.exoplayer.dash.p141a.C2922m;
import androidx.media3.p132b.C2509m;
import androidx.media3.p132b.C2510n;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.dash.q */
/* compiled from: PG */
public final class C2948q {
    /* renamed from: a */
    public static C2510n m8337a(C2922m mVar, String str, C2919j jVar, int i) {
        String str2;
        Map emptyMap = Collections.emptyMap();
        Uri parse = Uri.parse(C2610ai.m6915a(str, jVar.f8361c));
        long j = jVar.f8359a;
        long j2 = jVar.f8360b;
        String m = mVar.mo6791m();
        if (m != null) {
            str2 = m;
        } else {
            str2 = Uri.parse(C2610ai.m6915a(((C2911b) mVar.f8367c.get(0)).f8312a, jVar.f8361c)).toString();
        }
        return C2509m.m6615a(parse, 0, emptyMap, j, j2, str2, i);
    }
}
